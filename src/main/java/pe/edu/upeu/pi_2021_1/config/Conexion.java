package pe.edu.upeu.pi_2021_1.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static final String URL = "jdbc:oracle:thin:@3.238.144.21:1521:ORCL";
    //private static final String URL = "jdbc:oracle:thin:@localhost:49162:XE";
    private static final String USER = "ADRA_ACTIVATE";
    private static final String PASS = "123456";
    private static final String DRIVER = "oracle.jdbc.OracleDriver";
    private static Connection cx = null;

    public static Connection getConexion() {
        try {
            Class.forName(DRIVER);
            if (cx == null) {
                cx = DriverManager.getConnection(URL, USER, PASS);
            }
        } catch (ClassNotFoundException | SQLException e) {
            // TODO: handle exception
            System.out.println("Error: " + e);
        }

        return cx;
    }

    public void desconectar() {
        try {

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
