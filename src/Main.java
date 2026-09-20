import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        LucasNumber lucasNumber = new LucasNumber();
        int result = lucasNumber.calculate(n);

        System.out.println("Lucas number at position " + n + " is " + result);

        scanner.close();
    }
}
