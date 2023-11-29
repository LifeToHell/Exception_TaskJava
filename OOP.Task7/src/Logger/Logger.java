package Logger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

public class Logger {
    public static final java.util.logging.Logger ii = java.util.logging.Logger.getLogger(Logger.class.getName());
    private static final String logsPath = "log.txt";

    static {
        try {
            FileHandler fh = new FileHandler(logsPath, false);
            ii.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}