import java.util.Scanner;
public class StopAtFive {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    int num = 0;
    while (true) {
        System.out.println("Give a number: ");
        int number = Integer.valueOf(scanner.nextLine());
        if (number >= 5) {
            break;
        }  
    } 
    System.out.println("\n" + "Process finished with exit code " + num );
    scanner.close();
}
}
