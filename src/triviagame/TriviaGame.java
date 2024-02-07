package triviagame;

import java.util.Scanner;

public class TriviaGame {

    public static void main(String[] args) {
        
        System.out.println("Welcome to Random Trivia!! Please answers all questions beginning with Capital letter.");
        System.out.println("If answer is misspelt or not in correct format, it will be wrong!");
        System.out.println(triviagamePlay());
    }
    
    
    private static String triviagamePlay(){
        int score = 0;
        String gameover = ""; 
        String[] questions = {"Which planet is known as the Red Planet?", "How many continents are there on Earth? Don't put in number form!", "What is the largest ocean on Earth? - Don't put \"THE (OCEAN NAME) OCEAN. Just the OCEAN NAME\""};
        String[] answers = {"Mars", "Seven", "Pacific"};
            for(int i = 0; i < questions.length; ++i){
                System.out.println(questions[i]);
                Scanner input = new Scanner(System.in);
                String playerAnswer = input.next();
                if(answers[i].matches(playerAnswer)){
                    System.out.println("You got it right!");
                    score++;
                }
                
                gameover = "The game is over! Your final score was: " + score;
        }        
        return gameover;
    }
}
