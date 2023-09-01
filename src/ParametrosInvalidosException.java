
public class ParametrosInvalidosException extends Exception {
    private final String mensagem;

    public ParametrosInvalidosException(String mensagem) {
        this.mensagem = mensagem;
    }

    // método para retorno uma mensagem indicando o tipo de excessão
    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
