import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

public class SecCQ2{
    public static void main(String[] args){

        try{
            DecimalFormat df2 = new DecimalFormat("0.00");
            Scanner input = new Scanner(new File("inBMI.txt"));
            FileWriter fw = new FileWriter("outBMI.txt");
            PrintWriter pw = new PrintWriter(fw);

            while(input.hasNext()){
                String name = input.next();
                Double height = input.nextDouble();
                Double weight = input.nextDouble();
                Double BMI = BMI_Calculator(weight, height);
                String status;
                if(BMI <= 18.5)
                    status = "Underweight";
                else if(BMI <= 25)
                    status = "Normal";
                else if(BMI <= 30)
                    status = "Overweight";
                else
                    status = "Obese";

                pw.println("Name : " + name);
                pw.println("Height : " + height);
                pw.println("Weight : " + weight);
                pw.println("BMI : " + df2.format(BMI));
                pw.println("Status : " + status);
                pw.println();
            }
            pw.close();
            System.out.println("Output File Completed");
        }

        catch(IOException error){
            System.out.println("An error occurred");
        }
    }

    public static double BMI_Calculator(Double weight, Double height){
        Double BMI = weight / (height * height);
        return BMI;
    }
}