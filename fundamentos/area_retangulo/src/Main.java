import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base;
        int altura;
        int area;

        System.out.print("Digite o base do retângulo: ");
        base = sc.nextInt();
        System.out.print("Digite a altura do retângulo: ");
        altura = sc.nextInt();

        area = base * altura;

        System.out.print("Um retângulo com base de " + base + " e altura de " + altura + " tem a área de " + area);
    }
}
