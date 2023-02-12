import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to Rock, Paper, Scissors Game!");

        String playersThrow = getPlayersThrow();
        String computersThrow = getComputersThrow();
        displayCountDownAndWinner(playersThrow, computersThrow);
    }


    private static String getPlayersThrow() {
        //TO DO THIS
        //Math.random()
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your throw!");
        String playersThrow = keyboard.nextLine();
        return playersThrow;


    }




    private static String getComputersThrow(){
        int number1to3 = (int)(Math.random() * 3 ) +1;
        if(number1to3 == 1){
            return "Rock";
        } else if (number1to3 == 2) {
            return "Paper";
        }else {
            return "Scissors";
        }

    }

    private static void displayCountDownAndWinner(String playersThrow, String computersThrow ){
        System.out.println("Rock");
        System.out.println("Paper");
        System.out.println("Scissors");
        System.out.println("Shoot!");

        System.out.println("Computer chose " + computersThrow);

        while (!playersThrow.equalsIgnoreCase("rock") && !playersThrow.equalsIgnoreCase("paper") && !playersThrow.equalsIgnoreCase("scissors")){
            System.out.println("invalid input! Please input either rock, scissors, or paper!");
            playersThrow = getComputersThrow();
        }



        if( playersThrow.equalsIgnoreCase("Rock") && computersThrow.equalsIgnoreCase("paper")){
            System.out.println("Player Wins!");
        } else if (playersThrow.equalsIgnoreCase("PAPER") && computersThrow.equalsIgnoreCase("Scissors")) {
            System.out.println("Computer Wins!");
        } else if (playersThrow == "Scissors" && computersThrow.equalsIgnoreCase("paper")) {
            System.out.println("Player Wins!");
        } else if (playersThrow.equalsIgnoreCase("paper") && computersThrow.equalsIgnoreCase("paper")) {
            System.out.println("It's a tie!");
        } else if (playersThrow.equalsIgnoreCase("rock") && computersThrow.equalsIgnoreCase("rock")) {
            System.out.println("It's a tie!");
        } else if (playersThrow.equalsIgnoreCase("Scissors") && computersThrow.equalsIgnoreCase("Scissors")) {
            System.out.println("It's a tie!");
        }


    }
}
