import java.util.Scanner;

public class Mini_Zoo{
    public static int i;
    public static Scanner input = new Scanner(System.in);
    
    public static void animalType(int N){
        String[] types =  new String[N];
        for(i = 0; i < N; i++){
            types[i] = input.next();
        }
    }
    
    public static int[] legsAnimal(int N){
        int[] legs = new int[N];
        for(i = 0; i < N; i++)
            legs[i] = input.nextInt();
        return legs;
    }
    
    public static int[] numberAnimal(int N){
        int[] num = new int[N];
        for(i = 0; i < N; i++)
            num[i] = input.nextInt();
        return num;
    }
    
    public static int calcLegs(int[] legs, int[] num){
        int N = legs.length;
        int total = 0;
        for(int i = 0; i < N; i++){
            total += (legs[i] * num[i]);
        }
        return (total);
    }
    public static void main(String[] args){
        int N = input.nextInt();
        int total;
        animalType(N);
        total = calcLegs(legsAnimal(N),numberAnimal(N));
        System.out.println("Mini Zoo");
        System.out.println("How many types of animals are in your Mini Zoo: " + N);
        System.out.println("Total legs: " + total);
    }
}