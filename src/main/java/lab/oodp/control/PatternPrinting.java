package lab.oodp.control;

public class PatternPrinting {
      /**
     * Exercise: Using a "for loop", complete the printRowOfStarsWithFor() and printRowOfStarsWithWhile methods so that it prints a row of
     * stars (*).     
     * The number of stars it should print is passed via the int parameter, howMany.
     * The loop must be stoped if the number of starts is more than 5.
     * For example, when called by: printRowofStars(3);
     * The method prints: ***
     * 
     * when called by: printRowofStars(11);
     * The method prints: *****
     *
     * @param howMany the number of ampersands to print.
     */
    public static void printRowOfStarsWithFor(int howMany ){
        // TODO: Use a for loop to print asterisks (*), but break if the count reaches 5.
        for (int i = 0; i < howMany; i++) {
            if (i == 5) {
                break; // Exit the loop when i is 5
            }
            System.out.print("*");
        }
        System.out.println("");

    }

    public static void printRowOfStarsWithWhile(int howMany ){
        // TODO: Use a for loop to print asterisks (*), but break if the count reaches 5.
        int i = 0;
        while (i < howMany) {
        if (i == 5) {
            break; // Exit the loop when i is 5
        }
            System.out.print("*");
            i++;
        }
        System.out.println("");

    }

    public static void main(String[] args) {
        printRowOfStarsWithFor(3);
        printRowOfStarsWithFor(10);

        printRowOfStarsWithWhile(5);
        printRowOfStarsWithWhile(6);


    }

}
