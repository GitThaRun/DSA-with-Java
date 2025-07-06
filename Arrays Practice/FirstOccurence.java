import java.util.Scanner;
public class FirstOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements");
        for(int i = 0;i < size;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter a element to search in Array: ");
        int key = sc.nextInt();

        int index = -1;
        for (int i = 0;i < size;i++) {
            if(arr[i] == key){
                index = i;
                break;
            }
        }
        if(index != -1){
            System.out.println("First Occurrence of element " + key + " is found at " + index);
        }
        else{
            System.out.println(key + " Not Found !");
        }
        sc.close();
    }
}
