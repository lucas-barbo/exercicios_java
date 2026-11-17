import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome para a pessoa 1: ");
        String pessoa1 = sc.nextLine();
        System.out.print("Digite a idade da pessoa 1: ");
        int idade1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o nome para a pessoa 2: ");
        String pessoa2 = sc.nextLine();
        System.out.print("Digite a idade da pessoa 2: ");
        int idade2 = sc.nextInt();

        int diferencaIdade;

        if (idade1 >= idade2) {
            diferencaIdade = (idade1 - idade2);
        } else {
            diferencaIdade = (idade2 - idade1);
        }

        System.out.print("A diferença de idade é: " + diferencaIdade);
    }
}
