/* Testing program for ODYSSEY gambling game
* Name: Anthony Chen
* Date: June 5, 2022
*/

import java.util.*;

public class Odyssey_Testing {
   public static void main(String[] args) {
      double money = 500;
      Scanner sc = new Scanner(System.in);
      String input = "";
      String gameInput = "";
      String[] split = new String[3];
      double earnedAmount;
      int[] betChoices = new int[3];
      double mercury = 1.5;
      double venus = 1.5;
      double earth = 1.5;
      int[] mars = new int[] { 0, 3 };
      int[] jupiter = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 5, 5, 5, 5, 10, 10, 10, 15, 15, 20 };
      int[] saturn = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 5, 5, 5, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
      int[] uranus = new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 3, 5, 10 };
      int[] neptune = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 22 };
      
      Random rand = new Random();
      int randomMoon;
      boolean stopTrigger = false;
      
      while (money >= 5 && !stopTrigger) {
         earnedAmount = 0;
         System.out.println("Play ODYSSEY game? Entry fee: $5.00");
         System.out.print("Your balance: $" + money + "\n>");
         input = sc.nextLine();
         if (input.equals("y") || input.equals("yes") || input.equals("Y")) {
            money -= 5;
            System.out.println("PLANETS");
            System.out.println("1: Mercury - Value: $1.50 - Moons: 0");
            System.out.println("2: Venus - Value: $1.50 - Moons: 0");
            System.out.println("3: Earth - Value: $1.50 - Moons: 1");
            System.out.println("4: Mars - Value: $0 - Moons: 2");
            System.out.println("5: Jupiter - Value: $0 - Moons: 79");
            System.out.println("6: Saturn - Value: $0 - Moons: 82");
            System.out.println("7: Uranus - Value: $0 - Moons: 27");
            System.out.println("8: Neptune - Value: $0 - Moons: 14\n");
            System.out.println("Enter the # of three planets you'd like to bet on, separated by spaces.");
            System.out.print("e.g. '1 2 3' would be a bet on Mercury, Venus, and Earth\n>");
            // Obtaining user input
            gameInput = sc.nextLine();
            
            split = gameInput.split(" ", 3);
            for (int h = 0; h < 3; h++) {
               betChoices[h] = Integer.parseInt(split[h]);
            }
            
            // NOTe: ADD CHECK FOR REPEAT PLANETS
            
            // Allowing user to select planets to bet on and outputting outcome
            System.out.println("Expedition Results\n");
            for (int i = 0; i < 3; i++) {
               switch (betChoices[i]) {
                  case 1: 
                     System.out.println("Mercury: +$1.50");
                     earnedAmount += 1.5;
                     break;
                  case 2:
                     System.out.println("Venus: +$1.50");
                     earnedAmount += 1.5;
                     break;
                  case 3:
                     System.out.println("Earth: +$1.50");
                     earnedAmount += 1.5;
                     break;
                  case 4:
                     randomMoon = rand.nextInt(2);
                     if (mars[randomMoon] == 0) {
                        System.out.println("Mars: +$" + mars[randomMoon]);
                     }
                     else {
                        System.out.println("Mars: +$" + mars[randomMoon] + ".00");
                     }
                     earnedAmount += mars[randomMoon];
                     break;
                  case 5: 
                     randomMoon = rand.nextInt(79);
                     if (jupiter[randomMoon] == 0) {
                        System.out.println("Jupiter: +$" + jupiter[randomMoon]);
                     }
                     else {
                        System.out.println("Jupiter: +$" + jupiter[randomMoon] + ".00");
                     }
                     earnedAmount += jupiter[randomMoon];
                     break;
                  case 6: 
                     randomMoon = rand.nextInt(82);
                     if (saturn[randomMoon] == 0) {
                        System.out.println("Saturn: +$" + saturn[randomMoon]);
                     }
                     else {
                        System.out.println("Saturn: +$" + saturn[randomMoon] + ".00");
                     }
                     earnedAmount += saturn[randomMoon];
                     break;
                  case 7:
                     randomMoon = rand.nextInt(27);
                     System.out.println("Uranus: +$" + uranus[randomMoon] + ".00");
                     earnedAmount += uranus[randomMoon];
                     break;
                  case 8:
                     randomMoon = rand.nextInt(14);
                     if (neptune[randomMoon] == 0) {
                        System.out.println("Neptune: +$" + neptune[randomMoon]);
                     }
                     else {
                        System.out.println("Neptune: +$" + neptune[randomMoon] + ".00");
                     }
                     earnedAmount += neptune[randomMoon];
                     break;
               }
            } 
            System.out.println("-------------------------");
            System.out.printf("Total earned: $%.2f%n%n%n", earnedAmount);
            money += earnedAmount; 
            
            if (money < 5) {
               System.out.println("Not enough money. Game over!\n");
            }
         }
         else if (input.equals("n") || input.equals("N") || input.equals("no")) {
            stopTrigger = true;
            System.out.println("Thanks for playing! :)");
         }
      }
   }
}