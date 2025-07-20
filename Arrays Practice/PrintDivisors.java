import java.util.*;
public class PrintDivisors {
    public static ArrayList<Integer> Divisors(int n){

        ArrayList<Integer> div = new ArrayList<>();

        for(int i = 1; i <= Math.sqrt(n); i++){
    if(n % i == 0){
        div.add(i);
        if(n / i != i){
            div.add(n / i);
        }
    }
}
        return div;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        int n = sc.nextInt();

        Divisors(n);

        ArrayList<Integer> divisors = Divisors(n);
        Collections.sort(divisors);

        for(int i : divisors){
            System.out.print(i + " ");
        }
    }
}
