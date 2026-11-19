import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator();

        int choice;

        do {

            System.out.println("\n===== JAVA CALCULATOR =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Power");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Calculator Closed!");
                break;
            }

            if (choice < 1 || choice > 6) {
                System.out.println("Invalid Choice!");
                continue;
            }

            System.out.print("Enter first number: ");
            double a = sc.nextDouble();

            System.out.print("Enter second number: ");
            double b = sc.nextDouble();

            double result = 0;

            switch (choice) {

                case 1:
                    result = cal.add(a, b);
                    break;

                case 2:
                    result = cal.subtract(a, b);
                    break;

                case 3:
                    result = cal.multiply(a, b);
                    break;

                case 4:
                    result = cal.divide(a, b);
                    break;

                case 5:
                    result = cal.modulus(a, b);
                    break;

                case 6:
                    result = cal.power(a, b);
                    break;
            }

            System.out.println("Result: " + result);

        } while (choice != 0);

        sc.close();
    }
}