import java.io.*;

public class CreateFile{
    public static void main(String[] args) throws IOException{

            File file = new File("test.txt");
            if(file.createNewFile())
                System.out.println("Output File Completed");
            else
                System.out.println("File already exist");
    }
}