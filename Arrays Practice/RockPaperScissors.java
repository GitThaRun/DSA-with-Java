import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String[] Choices = {"rock","paper","scissors"};
        String PlayerChoice;
        String ComputerChoice;
        String PlayAgain = "yes";

        do{
            System.out.print("Enter Your Move(rock/paper/scissors) : ");
            PlayerChoice = sc.nextLine().toLowerCase();

            if(!PlayerChoice.equals("rock") && !PlayerChoice.equals("paper") && !PlayerChoice.equals("scissors")){
                System.out.println("INVALID MOVE");
                continue;
            }

            ComputerChoice = Choices[rand.nextInt(3)];
            System.out.println("Computer Choice : " + ComputerChoice);

            if(PlayerChoice.equals(ComputerChoice)){
                System.out.println("It's A Tie");
            }

            else if((PlayerChoice.equals("rock") && ComputerChoice.equals("scissors")) ||
                     (PlayerChoice.equals("paper") && ComputerChoice.equals("rock")) ||
                     PlayerChoice.equals("scissors") && ComputerChoice.equals("paper")){
                     
                        System.out.println("You Win!");
                     }
            else{
                System.out.println("You Lose!");
            }

            System.out.print("WANT TO PLAY AGAIN? (yes/no) : ");
            PlayAgain = sc.nextLine().toLowerCase();

        }while(PlayAgain.equals("yes"));

        System.out.println("ThankYou For Playing");

        sc.close();
    }
}
