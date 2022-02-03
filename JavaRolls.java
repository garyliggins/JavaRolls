import java.util.Scanner;

public class JavaRolls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("let's play rolling java. type anything to start.");
        String startValue = scan.nextLine();


        System.out.println("Great, here are the rules:\n - If you roll a ^ the game stops. \n - If you roll a 4 nothing happens \n - Otherwise you get 1 point. \n You must collect at least 3 points to win. Enter anything to roll:");

       int score = 0;

       while (1 > 0) {
         int userRoll = rollDice();
         System.out.println("you Rolled a " + userRoll);
         if (userRoll == 6) {
           System.out.println("End of Game");
           break;
         } else if (userRoll == 6) {
           System.out.println("print: Zero points. Keep rolling.");
         } else {
           score++;
           System.out.println("One point. Keep rolling.");
         }
       }
           
       System.out.println("\nYour score is: " + score);
        
       if (score >= 3) {
         System.out.println("wow thats lucky you win!");
       } else {
         System.out.println("Tough luck, you lose :( ");
       }
      
      scan.close();
    }
  
  
  public static int rollDice() {
          double randomNumber = Math.random() * 6;
          randomNumber += 1;
          return (int)randomNumber;
  }
  
}
