import java.util.Scanner;
public class BDay_Graph{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i,j;
        int N = input.nextInt();
        String[] month = new String[12];
        for(int n = 0; n < 12; n++) {
        	month[n] = "";
        }
        int[] bDay = new int[3];
        for(i = 0; i < N; i++){
            for(j = 0; j < 3; j++)
                bDay[j] = input.nextInt();
            month[bDay[1] - 1] += "*";
        }
        System.out.println("Jan:" + month[0]);
        System.out.println("Feb:" + month[1]);
        System.out.println("Mar:" + month[2]);
        System.out.println("Apr:" + month[3]);
        System.out.println("May:" + month[4]);
        System.out.println("Jun:" + month[5]);
        System.out.println("Jul:" + month[6]);
        System.out.println("Aug:" + month[7]);
        System.out.println("Sep:" + month[8]);
        System.out.println("Oct:" + month[9]);
        System.out.println("Nov:" + month[10]);
        System.out.println("Dec:" + month[11]);
    }
}