
import java.util.Scanner;

public class CallClasses {

    public static void main(String[] args) {
        Notebook notebook = new Notebook();
        int choice;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.printf("Escolha qual executar :\n1 - WelcomeToJava\n2 - JavaStdInOne\n3 - JavaIfElse\n4 - JavaStdInTwo\n5 - JavaOutputFormatting\n6 - JavaLoopsOne\n7 - JavaLoopsTwo\n8 - JavaDataTypes\n9 - Sair\n");
            choice = scanner.nextInt();
            switch (choice) {
            case 1 :
                notebook.WelcomeToJava();
                break;
            case 2:
                notebook.JavaStdInOne();
                break;
            case 3:
                notebook.JavaIfElse();
                break;
            case 4:
                notebook.JavaStdInTwo();
                break;
            case 5:
                notebook.JavaOutputFormatting();
                break;
            case 6:
                notebook.JavaLoopsOne();
                break;
            case 7:
                notebook.JavaLoopsTwo();
                break;
            case 8:
                notebook.JavaDataTypes();
                break;
            case 9:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida");
            }
        } while (choice != 9);
    }
}

