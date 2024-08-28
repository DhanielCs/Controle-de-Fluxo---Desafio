import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

        Scanner Ler = new Scanner(System.in);

            System.out.println("Por favor, passe o primeiro número inteiro como parâmetro:");
            int primeiroNumero = Ler.nextInt();
            System.out.println("Por favor, passe o segundo número inteiro como parâmetro:");
            int segundoNumero = Ler.nextInt();

            try {

                // Verifica se o primeiro número é maior que o segundo
                if (primeiroNumero >= segundoNumero) {
                    throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro ");
                }

                // Calcula o número de interações
                int quantidadeInteracoes = segundoNumero - primeiroNumero;

                // Imprime os números incrementados
                for (int i = 1; i <= quantidadeInteracoes; i++) {
                    System.out.println("Imprimindo o número " + i);
                }

            } catch (NumberFormatException e) {
                // Trata erros de conversão de número
                System.out.println("Por favor, forneça apenas números inteiros válidos.");
            } catch (ParametrosInvalidosException e) {
                // Trata a exceção customizada
                System.out.println(e.getMessage());
            }
        }

}

class ParametrosInvalidosException extends Exception {

    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}
