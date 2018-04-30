package pl.coderslab.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class FileCustomerLogger implements CustomerLogger {

    private String filename;

    @Autowired
    private FileWriter fw;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public FileCustomerLogger(String filename) {
        this.filename = filename;
    }

    @Override
    public void log() {

        try {
            fw.append(LocalDateTime.now().toString()+" : customer operation\n");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
