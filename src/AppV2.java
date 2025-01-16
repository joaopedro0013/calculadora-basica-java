import java.util.Scanner;
public class App {
    public static void soma(int numero1, int numero2) {
        int total = numero1 + numero2;
        System.out.println("A soma de " + numero1 + " + " + numero2 + " é: " + total);
    }
    public static void subtracao(int numero1, int numero2) {
        int total2 = numero1 - numero2;
        System.out.println("A subtração de " + numero1 + " - " + numero2 + " é: " + total2);
    }
    public static void divisao(int numero1, int numero2) {
        if (numero2 != 0) {
            int total4 = numero1 / numero2;
            System.out.println("A divisão de " + numero1 + " / " + numero2 + " é: " + total4);
        } else {
            System.out.println("Divisão por zero não é permitida.");
        }
    }
    public static void multiplicacao(int numero1, int numero2) {
        int total3 = numero1 * numero2;
        System.out.println("A multiplicação de " + numero1 + " * " + numero2 + " é: " + total3);
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Seja bem vindo na minha calculadora!");
        Scanner scanner = new Scanner(System.in);

        int numero1 = 0;
        System.out.println("Digite um numero:");
        numero1 = scanner.nextInt();

        String operacao = "";
        System.out.println("Digite uma operação (operação: +,-,/,*)");
        operacao = scanner.next();
        
        int numero2 = 0;
        System.out.println("Digite mais um numero:");
        numero2 = scanner.nextInt();
        if (numero1 <= 0 && numero2 <= 0) {
            System.out.println("Um dos numeros é menor ou igual a zero");
        } else {
            switch (operacao) {
                case "+":
                    soma(numero1, numero2);
                    break;
                case "-":
                    subtracao(numero1, numero2);
                    break;
                case "*":
                    multiplicacao(numero1, numero2);
                    break;
                case "/":
                    divisao(numero1, numero2);
                    break;
                default:
                    System.out.println("Operação inválida.");
                    break;
            }
        }
        scanner.close(); // Fechar o scanner
    }
}
