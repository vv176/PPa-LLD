package logframework;

import java.io.FileWriter;
import java.io.IOException;

public class FileSubscriber implements Subscriber{

    private final FileWriter fileWriter;

    public FileSubscriber(String filePath) throws IOException {
        this.fileWriter = new FileWriter(filePath);
    }

    @Override
    public void update(String message) {
        try {
            this.fileWriter.write(message + "\n");
            this.fileWriter.flush();
        }catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

    }
}
