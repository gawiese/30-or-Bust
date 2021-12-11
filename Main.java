////////////////////////////////////////////////////////////////////////////////////

// Garrett Wiese

// Professor Lundin

// CSC 160 Computer Science I

// December 10th, 2021

// ***FINAL PROJECT***

////////////////////////////////////////////////////////////////////////////////////

// imports java utility Scanner.
import java.util.Scanner;
// Establishes a class named Main
class Main {

    // Creates the main method where the majority of the code lies.
    public static void main(String[] args) {

        // Initializes int variables for min and max which is for the dice values as well as both of the dice and our player one score and player two scores.
        int min=1, max=6;
        int playerOneScore = 0;
        int playerTwoScore = 0;
        int dice1, dice2;

        // Brings in the scanner from java.util.Scanner
        Scanner input = new Scanner(System.in);

        // Prompts the user to enter the username of the first player.
        System.out.println("Player One, Enter your Username below: ");

        // Stores the input in a string called playerOne.
        String playerOne = input.nextLine();

        // Displays dialogue to the user and issues them a ticket. Found in the unicode-table to provide a more immersive experience.
        System.out.println("Hello " + playerOne + " here is your Ticket to access the game." );
        System.out.println("\uD83C\uDFAB" + "\n");

        // Prompts the user to enter the username of the second player.
        System.out.println("Player Two, Enter your Username below: ");

        // Stores that input into a String called playerTwo.
        String playerTwo = input.nextLine();

        // Displays dialogue to the user and issues them a ticket. Found in the unicode-table to provide a more immersive experience.
        System.out.println("Hey " + playerTwo + " here is your Ticket to access the game." );
        System.out.println("\uD83C\uDFAB" + "\n");

        // Formats a message board using print lines and some more unicode-table characters then prints the rules.
        System.out.println("------------------------------------------------------------");
        System.out.println("----------------  \uD83D\uDD85 MESSAGE BOARD \uD83D\uDD85  ---------------------");
        System.out.println("------------------------------------------------------------");
        System.out.println(" ♠ WELCOME PLAYERS " + "* " + playerOne + " *" + " & " + "* "+ playerTwo + " *" + " TO 30 OR BUST! ♠ ");
        System.out.println(" \uD83C\uDFAB PRESENT YOUR TICKETS AT THIS TIME \uD83C\uDFAB ");
        System.out.println(" ♣ THE RULES ARE SIMPLE... ♣ ");
        System.out.println(" ♥ THE FIRST TO 30 WINS! " + "IF YOU ARENT THE FIRST ONE THERE THEN YOU LOSE! ♥ ");
        System.out.println(" ♦ YOU MAY PICK EITHER THE SUM OF THE FIRST DIE, THE SUM OF THE SECOND DIE OR THE SUM OF BOTH! ♦ ");
        System.out.println(" ♠ THAT WILL THEN ADD THE SUM TO YOUR SCORE BUT BE CAREFUL! ♠ ");
        System.out.println(" ♣ DONT GO OVER 30 OR YOUR SCORE RESETS TO 0! ♣ ");
        System.out.println(" ♥ BEST OF LUCK" + " & " + "CHOOSE WISELY ♥ ");
        System.out.println(" ♦ THE GAME IS STARTING IN 3..." + "2.." + "1. ♦ ");
        System.out.println("---------------------------------------------------------------" + "\n");

        while (true) {

            // Player One's turn STARTS HERE
            System.out.println("-------------------");

            // Lets player one know that it's indeed their turn to roll using a print statement.
            System.out.println(playerOne + " its your turn!");

            // Displays the current score of Player one.
            System.out.println(playerOne + " currently has a score of: " + playerOneScore);

            // Lines 79 - 81 format the dice rolling using print statements.
            System.out.println("-------------------");
            System.out.println("\uD83C\uDFB2 Dice rolling... \uD83C\uDFB2");
            System.out.println("-------------------");

            // Lines 84 & 85 roll the dice using the int max and min values and store the result in dice1 and dic2 variables.
            dice1 = min + (int)(Math.random() * ((max - min) + 1));
            dice2 = min + (int)(Math.random() * ((max - min) + 1));

            // Initializes int DiceSum variable which has a value of the sum of Dice1 + Dice2.
            int diceSum = dice1 + dice2;

            // Prints out basic dialogue along with the result of the first die being rolled.
            System.out.println("rolled a " + dice1 + " for the first die.");

            // Prints out dialogue along with the result of the second die being rolled.
            System.out.println("rolled a " + dice2 + " for the second die.");

            // Prints out dialogue along with the result of the sum from both dice being rolled.
            System.out.println("rolled a total of " + diceSum);
            System.out.println("-------------------");

            // Prompts Player One to enter 1 if they want to keep the value of the first die and add it to their score.
            System.out.println("Enter: 1");
            System.out.println("If you wish to keep the first die and add " + dice1 + " to your score");
            System.out.println("-------------------");

            // Prompts Player One to enter 2 if they want to keep the value of the second die and add it to their score.
            System.out.println("Enter: 2");
            System.out.println("If you wish to keep the second die and add " + dice2 + " to your score.");
            System.out.println("-------------------");

            // Prompts Player One to enter 3 if they want to keep the value of both dice and add it to their score.
            System.out.println("Enter: 3");
            System.out.println("If you wish to keep both dice and add " + diceSum  + " to your score.");
            System.out.println("-------------------");

            // Stores the input from the user into a String variable called dieSelection.
            String dieSelection = input.nextLine();

            // Converts the string into an integer value.
            int i = Integer.parseInt(dieSelection);

            // If Player One enters 1 and selects the first die's value then this if statements adds it to their score and displays their running score.
            if (i == 1) {
                playerOneScore += dice1;
                System.out.println(playerOne + " now has a score of: " + playerOneScore + "\n");
            }

            // If Player One enters 2 and selects the second die's value then this if statements adds it to their score and displays their running score.
            else if (i == 2) {
                playerOneScore += dice2;
                System.out.println(playerOne + " now has a score of: " + playerOneScore + "\n");
            }

            // If Player One enters 3 and selects both of the dices value's then this if statements adds it to their score and displays their running score.
            else if (i == 3) {
                playerOneScore += diceSum;
                System.out.println(playerOne + " now has a score of: " + playerOneScore + "\n");
            }

            // This is a fail-safe measure so if Player One inputs anything other than 1, 2 or 3 then it skips them, and displays dialogue.
            else if (i != 1 || i != 2 || i != 3) {
                System.out.println(playerOne + " has failed to select accurately and has been skipped. ⏭ ");
                System.out.println("Their score has not been affected.");
                System.out.println("Please enter one of the three choices available next time around.");
            }

            // If Player One goes over a score of 30 then their score is reset to zero.
            if (playerOneScore > 30) {
                System.out.println("OOPS! " + playerOne + " BUSTED!");
                System.out.println(playerOne + " HAS HAD THEIR SCORE RESET TO 0!" + "\uD83D\uDE2D" + "\n");
                playerOneScore = 0;
            }

            // If Player One achieves a score of exactly 30 then they win the game and the loop is broken.
            else if (playerOneScore == 30) {
                System.out.println("-----------------------------");
                System.out.println(playerOne + " HAS WON!!!");
                System.out.println(playerOne + " HAS REACHED EXACTLY 30");
                System.out.println(playerOne + " has earned this Trophy! \uD83C\uDFC6");
                System.out.println("-----------------------------");
                break;
            }

            // Player Two's turn STARTS HERE!
            System.out.println("-------------------");
            // Prints out that its Player Two's turn to roll the dice!
            System.out.println(playerTwo + " its your turn!");

            // Prints out Player Two's current score.
            System.out.println(playerTwo + " currently has a score of: " + playerTwoScore);

            // Formats and displays that the dice are rolling...
            System.out.println("-------------------");
            System.out.println("\uD83C\uDFB2 Dice rolling... \uD83C\uDFB2");
            System.out.println("-------------------");

            // Rolls the dice between max and min int values and stores the results in dice1 and dice2.
            dice1 = min + (int)(Math.random() * ((max - min) + 1));
            dice2 = min + (int)(Math.random() * ((max - min) + 1));

            // Stores the sum of both dice in diceSum variable.
            diceSum = dice1 + dice2;

            // Prints out the results of each dice as well as both of them.
            System.out.println("rolled a " + dice1 + " for the first die.");
            System.out.println("rolled a " + dice2 + " for the second die.");
            System.out.println("rolled a total of " + diceSum);
            System.out.println("-------------------");

            // Prompts Player Two to enter 1 if they wish to keep the value of the first die and add it to their current score.
            System.out.println("Enter: 1");
            System.out.println("If you wish to keep the first die and add " + dice1 + " to your score");
            System.out.println("-------------------");

            // Prompts Player Two to enter 2 if they wish to keep the value of the second die and add it to their current score.
            System.out.println("Enter: 2");
            System.out.println("If you wish to keep the second die and add " + dice2 + " to your score.");
            System.out.println("-------------------");

            // Prompts Player Two to enter 3 if they want to keep the sum of both dice and add it to their score.
            System.out.println("Enter: 3");
            System.out.println("If you wish to keep both dice and add " + diceSum  + " to your score.");
            System.out.println("-------------------");

            // Stores their selection into a variable named dieSelection
            dieSelection = input.nextLine();

            // Converts the String into an Int.
            i = Integer.parseInt(dieSelection);

            // If Player Two selected to keep the value of the first die, it adds that value to their score and displays current score.
            if (i == 1) {
                playerTwoScore += dice1;
                System.out.println(playerTwo + " now has a score of: " + playerTwoScore + "\n");
            }

            // If Player Two selected to keep the value of the second die, it adds that value to their score and displays current score.
            else if (i == 2) {
                playerTwoScore += dice2;
                System.out.println(playerTwo + " now has a score of: " + playerTwoScore + "\n");
            }

            // If Player Two selected to keep the value of both dice, it adds that value to their score and displays current score.
            else if (i == 3) {
                playerTwoScore += diceSum;
                System.out.println(playerTwo + " now has a score of: " + playerTwoScore + "\n");
            }

            // This is a fail-safe measure so if Player Two inputs anything other than 1, 2 or 3 then it skips them, and displays dialogue.
            else if (i != 1 || i != 2 || i != 3) {
                System.out.println(playerTwo + " has failed to select accurately and has been skipped. ⏭ ");
                System.out.println("Their score has not been affected.");
                System.out.println("Please enter one of the three choices available next time around.");
            }

            // If Player Two goes over a score of 30 then their score is reset to zero.
            if (playerTwoScore > 30) {
                System.out.println("OOPS! " + playerTwo + " HAS BUSTED!");
                System.out.println(playerTwo + " HAS HAD THEIR SCORE RESET TO 0!" + "\uD83D\uDE2D" + "\n");
                playerTwoScore = 0;
            }

            // If Player Two achieves a score of exactly 30 then they win the game and the loop is broken.
            else if (playerTwoScore == 30) {
                System.out.println("-----------------------------");
                System.out.println(playerTwo + " IS THE WINNER!!!");
                System.out.println(playerTwo + " HAS REACHED EXACTLY 30!!!");
                System.out.println(playerTwo + " has earned this Trophy! \uD83C\uDFC6");
                System.out.println("-----------------------------");
                break;
            }

            // Creates leaderboard object
            Leaderboard leaderboard = new Leaderboard();

            // Sets Player One's score to the result in the round.
            leaderboard.setPlayerOneScore(playerOneScore);

            // Sets Player Two's score to the result in the round.
            leaderboard.setPlayerTwoScore(playerTwoScore);

            // Formats the Leaderboard Header.
            System.out.println("----------------------------------------");
            System.out.println("CURRENT LEADERBOARD GOING INTO THE NEXT ROUND");
            System.out.println("----------------------------------------");

            // If Player One has a higher score than Player Two it displays dialogue showing who is in the lead!
            if (leaderboard.getPlayerOneScore() > leaderboard.getPlayerTwoScore()) {
                System.out.println(playerOne + " is currently in the lead with a score of: " + leaderboard.getPlayerOneScore());
                System.out.println("While " + playerTwo + " is trailing behind with a score of: " + leaderboard.getPlayerTwoScore());
            }

            // If Player Two has a higher score than Player One it displays dialogue showing who is in the lead!
            if (leaderboard.getPlayerTwoScore() > leaderboard.getPlayerOneScore()) {
                System.out.println(playerTwo + " is currently in the lead with a score of: " + leaderboard.getPlayerTwoScore() + "\n");
                System.out.println("While " + playerOne + " is trailing behind with a score of: " + leaderboard.getPlayerOneScore());
            }

            // If both Players scores are equal then this displays dialogue confirming that.
            if ( leaderboard.getPlayerOneScore() == leaderboard.getPlayerTwoScore()) {
                System.out.println("You are both tied with a score of: " + leaderboard.getPlayerOneScore());
            }
            System.out.println("----------------------------------------" + "\n");
        }
    }
}