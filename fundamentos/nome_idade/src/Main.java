import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nome;
        int  idade;

        System.out.print("Digite o seu nome: ");
        nome = sc.nextLine();
        System.out.print("Digite sua idade: ");
        idade = sc.nextInt();

        System.out.print("Olá " + nome + ", você tem " + idade + " anos.");
    }
}
