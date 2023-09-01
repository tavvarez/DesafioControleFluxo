import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        try (Scanner terminal = new Scanner(System.in)) {
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();
            
            try {
            	//chamando o método contendo a lógica de contagem
            	contar(parametroUm, parametroDois);
                
            }catch (ParametrosInvalidosException exception) {
            	System.out.println("O parametro 1 deve ser maior que o 2. " + exception.getMessage());
            }
        }
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        // int contagem;
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException ("O segundo parametro deve ser maior que o primeiro");
        }
		
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
        for (int i = 1; i < contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
	}
}
