import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num1 = sc.nextInt();

        int num2 = 0;
        boolean bool = true;

        while (bool) {
            System.out.print("Digite outro número: ");
            num2 = sc.nextInt();

            if (num2 < num1) {
                System.out.println("Digite um número maior que " + num1);
                continue;
            }

            bool = false;
        }

        System.out.print("Listar par(1) ou impar(2): ");
        int escolha = sc.nextInt();

        for (int i = num2; i >= num1; i--) {
            boolean par = i % 2 == 0;

            if (escolha == 1 && par) {
                System.out.println(i);
            } else if (escolha == 2 && !par) {
                System.out.println(i);
            }
        }
    }
}
