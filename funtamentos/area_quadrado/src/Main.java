import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lado;
        int area;

        System.out.print("Digite o lado do quadrado: ");
        lado = sc.nextInt();
        area = lado * lado;

        System.out.print("O quadrado de lado " + lado + " tem a área igual a " + area);
    }
}
