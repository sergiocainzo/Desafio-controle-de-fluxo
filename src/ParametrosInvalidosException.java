public class ParametrosInvalidosException extends Exception{

    // Mensagem
    public ParametrosInvalidosException(String message){
        super(message);
    }

    // Mensagem e Causa
    public ParametrosInvalidosException(String message, Throwable causa){
        super(message, causa);
    }
}
