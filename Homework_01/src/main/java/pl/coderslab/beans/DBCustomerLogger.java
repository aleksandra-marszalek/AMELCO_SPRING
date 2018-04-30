package pl.coderslab.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class DBCustomerLogger implements CustomerLogger {

    String filename;

    @Autowired
    @Qualifier("dbLogConn")
    private DBConn db;

    public void DbCustomerLogger() {

    }

    @Override
    public void log() {

    }
}
