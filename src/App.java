import java.util.Scanner;
public class App {
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
            switch (operacao) {
                case "+":
                        int total = 0;
                        total = numero1 + numero2;
                        System.out.println("A soma de " + numero1 + " + " + numero2 + " é: " + total);
                    break;
                case "-":
                    int total2 = 0;
                    total2 = numero1 - numero2;
                    System.out.println("A subtração de " + numero1 + " - " + numero2 + " é: " + total2);
                    break;

                case "*":
                    int total3 = 0;
                    total3 = numero1 + numero2;
                    System.out.println("A multiplicação de " + numero1 + " * " + numero2 + " é: " + total3);
                    break;

                case "/":
                        int total4 = 0;
                        total4 = numero1 + numero2;
                        System.out.println("A divisão de " + numero1 + " / " + numero2 + " é: " + total4);
                    break;
            
                default:
                System.out.println("Operação inválida.");
                    break;
            }
        }
    }
}
