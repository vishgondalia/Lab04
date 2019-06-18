import java.util.Scanner;
import java.lang.Math;

public class SciCalculator {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        //Defining integers
        double sum = 0;
        int calcnumber = 0;
        double result = 0;
        double avgcal = 0;
        int input = 1;
        double operand2 = 0.0;
        double operand1 = 0.0;
        System.out.println("Current Result: " + sum);
        //Displaying Menu Options at start
        //Loop starts
        while (input != 0) {

            if (input > 0 && input < 7) {
                System.out.println("\nCalculator Menu\n" +
                        "---------------\n" +
                        "0. Exit Program\n" +
                        "1. Addition\n" +
                        "2. Subtraction\n" +
                        "3. Multiplication\n" +
                        "4. Division\n" +
                        "5. Exponentiation\n" +
                        "6. Logarithm\n" +
                        "7. Display Average");
            }
            //Asking for user input
            System.out.print("\nEnter Menu Selection: ");

            input = scnr.nextInt();
            if (input == 0) {
                System.out.println("\nThanks for using this calculator. Goodbye!");
                System.exit(0);
            } else if (input < 0) {
                System.out.println("\nError: Invalid selection!");
                continue;
            }
            if (input > 0 && input < 7) {
                System.out.print("Enter first operand: ");
                String op1 = scnr.next();
                System.out.print("Enter second operand: ");
                String op2 = scnr.next();
                if (op1.equals("RESULT")) {
                    operand1 = result;
                } else {
                    operand1 = Double.parseDouble(op1);
                }
                if (op2.equals("RESULT")) {
                    operand2 = result;
                } else {
                    operand2 = Double.parseDouble(op2);
                }
                calcnumber++;

            }
            //Setting up Calculation options
            switch (input) {
                case 0:
                    System.exit(0);
                    System.out.println("Thanks for using this calculator. Goodbye!");
                    break;
                case 1:
                    result = operand1 + operand2;
                    System.out.println("\nCurrent Result: " + result);
                    sum += result;
                    break;
                case 2:
                    result = operand1 - operand2;
                    sum += result;
                    System.out.println("\nCurrent Result: " + result);
                    break;
                case 3:
                    result = operand1 * operand2;
                    System.out.println("\nCurrent Result: " + result);
                    sum += result;
                    break;
                case 4:
                    result = operand1 / operand2;
                    System.out.println("\nCurrent Result: " + result);
                    sum += result;
                    break;
                case 5:
                    result = Math.pow(operand1, operand2);
                    System.out.println("\nCurrent Result: " + result);
                    sum += result;
                    break;
                case 6:
                    result = Math.log(operand2) / Math.log(operand1);
                    System.out.println("\nCurrent Result: " + result);
                    sum += result;
                    break;
                case 7:
                    if (calcnumber == 0) {
                        System.out.println("\nError: No calculations yet to average!");
                    } else {
                        avgcal = sum / calcnumber;
                        System.out.println("\nSum of calculations: " + sum);
                        System.out.println("Number of calculations: " + calcnumber);
                        avgcal *= 100;
                        int m = Math.round((float) (avgcal));
                        avgcal = (double) m / 100;
                        System.out.println("Average of calculations: " + avgcal);
                    }
                    break;
                default:
                    System.out.println("Error: Invalid selection!");
            }
        }
        //Rayan, Josh, Vishlesh (Group members)
    }
}
