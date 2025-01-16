import java.util.Scanner;
public class App {
    public static void calculadora(int numero1, int numero2, String operacao){
        int total = 0;
        switch (operacao) {
            case "+":
                total = numero1 + numero2;
                System.out.println("A soma de " + numero1 + " + " + numero2 + " é: " + total);
            break;
            case "-":
                total = numero1 - numero2;
                System.out.println("A subtração de " + numero1 + " - " + numero2 + " é: " + total);
            break;

            case "*":
                total = numero1 + numero2;
                System.out.println("A multiplicação de " + numero1 + " * " + numero2 + " é: " + total);
            break;

            case "/":
                total = numero1 / numero2;
                System.out.println("A divisão de " + numero1 + " / " + numero2 + " é: " + total); 
            break;
        
            default:
            System.out.println("Operação inválida.");
                break;
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Seja bem vindo na minha calculcadora!");
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

        if(numero1 <= 0 && numero2 <= 0){
            System.out.println(" Um dos numeros é menor ou igual a zero");
        }else{
            calculadora(numero1,numero2,operacao);
        }
    }
}

