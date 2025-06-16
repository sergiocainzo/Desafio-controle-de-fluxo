import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        // Atributos do Terminal
        Scanner terminal = new Scanner(System.in);
        
        // Campo para solicitação dos INPUTS no terminal.
        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();

        System.out.print("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        // Close Terminal
        terminal.close();

        // Lógica do projeto com as exceções.
        try {
            // Executando o método Contar.
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException ex) {
            // exibindo a mensagem de erro do exception.
            System.out.println(ex.getMessage());
        }

    }

    // Metodo personalizado 
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validação se o primeiro parâmetro é maior que o segundo com mensagem de erro personalizada
        if (parametroUm > parametroDois) {
            // Mensagem de Erro.
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        } else {
            // Mensagem de Sucesso.
            System.out.println("Parâmetros passados com sucesso.");
        }

        // Realizando o FOR para imprimir os números com base na variável contagem.
        int contagem = parametroDois - parametroUm;

        // For funcional para a variável primária menor que a secundária
        for (int i = 0; i < contagem; i++) {
            System.out.printf("imprimindo o número: %d.\n", i+1);
        }

    }

}
