import java.util.Arrays;
import java.util.Scanner;
public class MiniMumAndMax {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter size of Array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " Elements");
        for(int i = 0;i < size;i++){
            arr[i] = sc.nextInt();
        }

        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();

        System.out.println("Smallest Element : " + min);
        System.out.println("Largest Element : " + max);

        sc.close();
    }
}
