import java.util.Scanner;
public class CountToEleven {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number less than 11");
    int number = Integer.valueOf(scanner.nextLine());
    int end = 12;
    for (int i = number; i < end; i++) {
            System.out.println(i);
    }
        scanner.close();
}
}
