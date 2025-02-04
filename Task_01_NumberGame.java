import java.util.Scanner;
public class Task_01_NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int attempts = 10;  //it is the number of attempts user will get to finish the game
        int total_score = 0; //it will be the final score of the user after the game
        boolean playAgain = true;

        System.out.println("*** NUMBER'S GAME CREATED BY SHUBHRANSHU SHEKHAR DAS ***");
        System.out.println("*** A RANDOM NUMBER HAS BEEN GENERATED BETWEEN 1 TO 100 ***");
        System.out.println("*** YOU ONLY HAVE 10 ATTEMPTS TO GUESS THE NUMBER *** ");

        while (playAgain) {
            int rand = getrandN(1, 100);
            boolean guess = false;
            for (int i = 0; i < attempts; i++) {
                System.out.print("\nAttempt " + (i + 1) + "---> enter your guess: ");
                int user = sc.nextInt();

                if (user == rand) {
                    guess = true;
                    total_score = i+1; // no. of chances user takes will be the total score
                    //if the user win the game then this will be printed
                    System.out.println("*** CONGRATULATIONS!! YOU HAVE WON THE GAME ***");
                    System.out.println("*** YOUR TOTAL SCORE IS :" +total_score+ " ATTEMPTS ***");
                    break; // here we have use the break statement so that the game will stop after you won

                } else if (user > rand) {
                    System.out.println("TOO HIGH"); //if your number is more than the generated number then this will be shown
                } else {
                    System.out.println("TOO LOW"); //if your number is less than the generated number then this will be shown
                }
            }
            if (guess == false) {
                System.out.println("*** OOPS!! SORRY YOU LOOSE, THE NUMBER WAS :" + rand + " ***");
            }
            System.out.println("\nDO YOU WANNA PLAY AGAIN ? (yes/no)");
            String response = sc.next();
            /*here we have used "equalIgnoreCase" so that it compares two strings based on their content,
             but without considering the case of the characters */
            playAgain = response.equalsIgnoreCase("yes");
        }
        /* so if the user says yes then the game will continue otherwise it will print these */
        System.out.println("THANKS , HOPE YOU ENJOYED THE GAME");

    }
        public static int getrandN(int min, int max){
            return(int)(Math.random()*(max-min+1)+min);

        }


}
