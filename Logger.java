import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private static final ConsoleLogger consoleLogger = new ConsoleLogger();
    private static final FileLogger fileLogger = new FileLogger();

    public static void enableFileMode() {
        fileLogger.enableFileMode();
    }

    public static void disableFileMode() {
        fileLogger.disableFileMode();
    }

    public static void log(LogLevel level, String message) {
        String formattedMessage = "[" + getCurrentTime() + "] " + "[" + level + "] " + message;
        consoleLogger.log(level, formattedMessage);
        fileLogger.log(level, formattedMessage);
    }

    private static String getCurrentTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return dateFormat.format(new Date());
    }
}
