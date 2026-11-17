import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num1 = sc.nextInt();

        System.out.println("O código ira parar quando o resto for diferente de zero");
        int resto = 0;

        do {
            System.out.print("Digite outro número: ");
            int num2 = sc.nextInt();

            if (num2 < num1) {
                System.out.println("O número precisa ser maior que o primeiro");
                continue;
            }

            resto = num2 % num1;
        } while(resto == 0);
    }
}
