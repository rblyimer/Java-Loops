import java.util.Scanner;
public class PositiveNumbers {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
while (true) {
    System.out.println("Enter a number:");
    int number = Integer.valueOf(scanner.nextLine());
    if (number == 0) {
        break;
    }
    if (number < 0) {
        System.out.println( "Number must be a positive number");
        continue;
    }
    System.out.println("Number is " + number);
}
scanner.close();
}
}
