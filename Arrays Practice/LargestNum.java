import java.util.Scanner;
public class LargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Elements : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter " + size + " Elements : ");

        for(int i = 0;i < size;i++){
            arr[i] = sc.nextInt();
        }

        int largest = FindLargest(arr);
        System.out.println("The Largest Element in the Array is : " + largest);
        sc.close();
    }

    public static int FindLargest(int[] arr){
        int max = arr[0];

        for(int i = 1;i < arr.length;i++){
            if(arr[i] > max){
                max = arr[i]; 
            }
        }
        return max;
    } 
}
