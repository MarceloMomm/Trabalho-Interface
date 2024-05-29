import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileLogger implements LoggerInterface {
    private boolean fileMode = false;
    private PrintWriter fileWriter;

    public void enableFileMode() {
        fileMode = true;
        try {
            fileWriter = new PrintWriter(new FileWriter("log.txt", true)); 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void disableFileMode() {
        fileMode = false;
        if (fileWriter != null) {
            fileWriter.close();
        }
    }

    @Override
    public void log(LogLevel level, String message) {
        if (fileMode && fileWriter != null) {
            fileWriter.println(message);
            fileWriter.flush();
        }
    }
}
