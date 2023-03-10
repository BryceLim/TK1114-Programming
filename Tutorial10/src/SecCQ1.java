import java.io.*;
import java.util.*;

public class SecCQ1{
    public static void main(String[] args){

        try{
            Scanner input = new Scanner(new File("inMarks.txt"));
            FileWriter fw = new FileWriter("outMarks.txt");
            PrintWriter pw = new PrintWriter(fw);

            while(input.hasNext()){
                String name = input.next();
                String matric = input.next();
                int marks = input.nextInt();
                char grade;
                if(marks < 50)
                    grade = 'E';
                else if(marks < 60)
                    grade = 'D';
                else if(marks < 70)
                    grade = 'C';
                else if(marks < 80)
                    grade = 'B';
                else
                    grade = 'A';

                pw.println("Name : " + name);
                pw.println("Matric : " + matric);
                pw.println("Mark : " + marks);
                pw.println("Grade : " + grade);
                pw.println();
            }
            pw.close();
            System.out.println("Output File Completed");
        }

        catch(IOException error){
            System.out.println("An error occurred");
        }
    }
}