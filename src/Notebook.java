import java.util.*;

public class Notebook {
    public void WelcomeToJava() {
        System.out.println("Hello, World.");
        System.out.println("Hello, Java.");
    }
    public void JavaOutputFormatting() {
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
        System.out.println("================================");
        System.out.printf("%-15s%03d\n", stringOne, intOne);
        System.out.printf("%-15s%03d\n", stringTwo, intTwo);
        System.out.printf("%-15s%03d\n", stringThree, intThree);
        System.out.println("================================");
    }

    public void JavaStdInOne() {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        scanner.close();
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }

    public void JavaLoopsOne() {
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

    public void JavaIfElse() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();
        if (N % 2 == 1) {
            System.out.println("Weird");
        }
        if (N >= 2 && N <= 5 && N % 2 == 0) {
            System.out.println("Not Weird");
        }
        if (N >= 6 && N <= 20 && N % 2 == 0) {
            System.out.println("Weird");
        }
        if (N > 20 && N % 2 == 0) {
            System.out.println("Not Weird");
        }
    }

    public void JavaStdInTwo() {
        Scanner scanner = new Scanner(System.in);
        int myInt = scanner.nextInt();
        double myDouble = scanner.nextDouble();
        scanner.nextLine();
        String myString = scanner.nextLine();
        System.out.println("String: " + myString);
        System.out.println("Double: " + myDouble);
        System.out.println("Int: " + myInt);
        scanner.close();
    }

    public void JavaLoopsTwo() {
        Scanner scanner = new Scanner(System.in);
        // pegando o valor de q
        System.out.println("Digite o valor de q: ");
        int q = scanner.nextInt();
        scanner.nextLine();
        // pegando o valor de a,b e n
        System.out.println("Digite o valor de a: ");
        int a = scanner.nextInt();
        System.out.println("Digite o valor de b: ");
        int b = scanner.nextInt();
        System.out.println("Digite o valor de n: ");
        int n = scanner.nextInt();
        scanner.close();
        if (q < 0 || q > 500) {
            System.out.println("O valor de q deve ser entre 0 e 500");
            return;
        }
        if (a < 0 || a > 50) {
            System.out.println("O valor de a deve ser entre 0 e 50");
            return;
        }
        if (b < 0 || b > 50) {
            System.out.println("O valor de b deve ser entre 0 e 50");
            return;
        }
        if (n < 1 || n > 15) {
            System.out.println("O valor de n deve ser entre 1 e 15");
            return;
        }
        for(int i = 0; i < q ; i++){
            int sum = a;
            for(int j = 0; j < n; j++){
                sum += Math.pow(2, j) * b;
                System.out.printf("%-10s ",sum);
            }
            System.out.println();
        }
    }

    public void JavaDataTypes() {

    }
}
