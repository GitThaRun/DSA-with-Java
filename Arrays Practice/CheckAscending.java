import java.util.Scanner;

public class CheckAscending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Size of Array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements : ");
        
        for(int i = 0;i < size;i++){
            arr[i] = sc.nextInt();
        }

        boolean isSorted = true;
        for(int i = 0;i < size - 1;i++){
            if(arr[i] > arr[i + 1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("Array is in Ascending Order");
        }
        else{
            System.out.println("Array is not in Ascending Order");
        }
        sc.close();
    }
}
