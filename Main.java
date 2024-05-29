public class Main {
    public static void main(String[] args) {
        Logger.enableFileMode(); 
        Logger.log(LogLevel.DEBUG, "Isso é uma mensagem de Debug."); // LogLevel.DEBUG PÕE O RESULTADO DEBUG ANTES DA FRASE
        Logger.log(LogLevel.WARNING, "Isso é uma mensagem de Aviso.");
        Logger.log(LogLevel.ERROR, "Isso é uma mensagem de Erro.");

        Logger.disableFileMode(); 
    }
}

