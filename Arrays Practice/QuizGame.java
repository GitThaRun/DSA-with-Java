import java.util.Scanner;
public class QuizGame {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String[] Question = {"1. What does HTML stand for?",
                             "2. Which of the following is a programming language?",
                            "3. Who is known as the father of the C programming language?",
                            "4. What symbol is used to start a single-line comment in Python?",
                            "5. Which company developed the Java programming language?"};

        String[][] Options = {{"A. Hyperlinks and Text Markup Language","B. Home Tool Markup Language","C. Hyper Text Markup Language",
                                "D. High Tech Markup Language"},
                                {"A. HTTP","B. Python","C. WWW","D. FTP"},
                                {"A. James Gosling","B. Dennis Ritchie","C. Bjarne Stroustrup","D. Guido van Rossum"},
                                {"A. //","B. <!--","C. #","D. /**"},
                                {"A. Google","B. Microsoft","C. Sun Microsystems","D. Apple"}};
        
        char[] Answers = {'C','B','B','C','C'};
        int score = 0;
        char guess;
         
        System.out.println("Welcome TO Quiz Game!!!");

        // Question Loop
        for(int i = 0;i < Question.length;i++){
            System.out.println(Question[i]);

            for(String option : Options[i]){
              System.out.println(option);
            }

            System.out.print("Enter Your Answer : ");
            guess = Character.toUpperCase(sc.next().charAt(0));

            if(guess == Answers[i]){
                System.out.println("Correct Answer!");
                score++;
            }
            else{
                System.out.println("Wrong Answer");
            }
        }
        System.out.println("You Scored : " + score + " Out Of " + Question.length);
        sc.close();
    }
}
