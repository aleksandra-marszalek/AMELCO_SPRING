package pl.coderslab.beans;


public class DBConn {

    private String dbHost;
    private String dbName;
    private String dbUser;
    private String dbPass;

    public DBConn(String dbHost, String dbName, String dbUser, String dbPass) {
        this.dbHost = dbHost;
        this.dbName = dbName;
        this.dbUser = dbUser;
        this.dbPass = dbPass;


    }
}
