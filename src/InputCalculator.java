import java.util.Scanner;
public class InputCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Find the average of any set of integers! Use any character " +
                "to exit the programme.");

        int sum = 0;
        int loopCount = 0;
        long average = 0;
        do {
            System.out.println("Enter a number!");
            String inputNumber = scanner.nextLine();

            try {
                int number = Integer.parseInt(inputNumber);
                sum += number;
                loopCount++;

            } catch (NumberFormatException nfe) {
                System.out.println("Exiting programme.");
                break;
            }

        } while (true);

        if (loopCount > 0) {
            average = Math.round((double) sum / loopCount);
            //long finalAvg = Math.round(average);
        }

        System.out.println("SUM = " + sum + " AVG = " + average);


    }

}
