import java.io.*;
import java.util.*;

public class SecCQ1{
    public static void main(String[] args){

        try{
            Scanner input = new Scanner(new File("C:\\Users\\bryce\\Desktop\\TK1114 Programming\\Java program\\Tutorial10\\src\\inMarks.txt"));
            FileWriter fw = new FileWriter("C:\\Users\\bryce\\Desktop\\TK1114 Programming\\Java program\\Tutorial10\\src\\outMarks.txt");
            PrintWriter pw = new PrintWriter(fw);

            while(input.hasNext()){
                String name = input.next();
                String matric = input.next();
                String marks = input.next();
                int mark = Integer.parseInt(marks);
                char grade;
                if(mark < 50)
                    grade = 'E';
                else if(mark < 60)
                    grade = 'D';
                else if(mark < 70)
                    grade = 'C';
                else if(mark < 80)
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

        catch(IOException e){
            System.out.println("An error occurred");
        }
    }
}