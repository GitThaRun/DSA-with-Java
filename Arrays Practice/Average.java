import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of Array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        int sum = 0;

        System.out.println("Enter " + size + " elements : ");
        for (int i : arr) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        double Average = (double) sum / size;
        System.out.println("Average : " + Average); 

        sc.close();
    }
}
