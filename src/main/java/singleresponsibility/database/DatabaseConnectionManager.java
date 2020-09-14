package main.java.singleresponsibility.database;

public class DatabaseConnectionManager {
    private DatabaseConnectionManager singleDatabaseManager = new DatabaseConnectionManager();

    private DatabaseConnectionManager(){};

    public DatabaseConnectionManager getManagerInstance(){
        return this.singleDatabaseManager;
    }

    public void connect(){
        System.out.println("manager connect to database.");
    }

    public String getConnectionObject(){
        System.out.println("get the connection object");
        return "connection object";
    }

    public void disconnect(){
        System.out.println("manager disconnect to database");
    }
}
