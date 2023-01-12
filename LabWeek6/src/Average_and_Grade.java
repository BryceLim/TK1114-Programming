import java.util.Scanner;

public class Average_and_Grade{
    
    public static int[] calcAverage(int[][] mark, int N) {
        int[] average = new int[N];
        int sum;
        for(int i = 0; i < N; i++){
            sum = 0;
            for(int j = 0; j < 3; j++){
                sum += mark[i][j];
            }
            average[i] = sum/3;
        }
        return (average);
    }

    public static void determineGrade(int[] average, int N){
        char grade;
        for(int i = 0; i < N; i++){
            if(average[i] < 60)
                grade = 'F';
            else if(average[i] <= 69)
                grade = 'D';
            else if(average[i] <= 79)
                grade = 'C';
            else if(average[i] <= 89)
                grade = 'B';
            else
                grade = 'A';
            System.out.println("Grade: " + grade);
        }
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[][] mark= new int[N][3];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < 3; j++)
                mark[i][j] = input.nextInt();
        }
        determineGrade(calcAverage(mark,N), N);
    }
}