package Modelo;

public class dbData {

    private static String driver = "";
    private static String user = "root";
    private static String password = "";
    private static String url = "jdbc:mysql://localhost:3306/pedidos";

    public String getDriver() {
        return driver;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public String getUrl() {
        return url;
    }

}
