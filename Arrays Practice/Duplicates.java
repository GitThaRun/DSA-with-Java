import java.util.Scanner;
public class Duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First Array

        System.out.print("Enter Size of First Array : ");
        int size = sc.nextInt();

        int[] arr1 = new int[size];
        System.out.print("Enter " + size + " Elements : ");
        for(int i = 0;i < size;i++){
            arr1[i] = sc.nextInt();
        }

        // Second Array
        System.out.println("Enter Size of Second Array : ");
        int size2 = sc.nextInt();

        int[] arr2 = new int[size2];
        System.out.println("Enter " + size2 + " Elements : ");
        for(int i = 0;i < size2;i++){
            arr2[i] = sc.nextInt();
        }

        System.out.println("Intersection Elements");
        
        for(int i = 0;i < size;i++){
            boolean isCommon = false;
            for(int j = 0;j < size2;j++){
                if(arr1[i] == arr2[j]){
                    isCommon = true;
                    break;
                }
            }

            if(isCommon){
                boolean alreadyPrinted = false;
                for(int k = 0;k < i;k++){
                    if(arr1[i] == arr1[k]){
                        alreadyPrinted = true;
                        break;
                    }
                }
            
            if(!alreadyPrinted){
                System.out.print(arr1[i] + " ");
            }
        }
    }
        sc.close();
    }
}
