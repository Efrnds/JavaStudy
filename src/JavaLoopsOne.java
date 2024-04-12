import java.util.*;

public class JavaLoopsOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringOne = scanner.next();
        int intOne = scanner.nextInt();
        scanner.nextLine();
        String stringTwo = scanner.next();
        int intTwo = scanner.nextInt();
        scanner.nextLine();
        String stringThree = scanner.next();
        int intThree = scanner.nextInt();
        scanner.close();
        System.out.printf("%-15s%03d\n", stringOne, intOne);
        System.out.printf("%-15s%03d\n", stringTwo, intTwo);
        System.out.printf("%-15s%03d\n", stringThree, intThree);
    }
}