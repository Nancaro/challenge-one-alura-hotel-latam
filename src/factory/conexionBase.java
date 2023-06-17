package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class conexionBase {
    private ComboPooledDataSource dataSource;

    public conexionBase() {
        try {
            dataSource = new ComboPooledDataSource();
            dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
            dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/nombre_de_la_base_de_datos?serverTimezone=UTC&useLegacyDatetimeCode=false");
            dataSource.setUser("root");
            dataSource.setPassword("admin");
        } catch (Exception e) {
            throw new RuntimeException("Error al configurar el pool de conexiones", e);
        }
    }

    public Connection recuperarConexion() {
        try {
            return dataSource.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException("Error al obtener la conexión", e);
        }
    }

    public static void main(String[] args) {
        connect();
    }

    public static void connect() {
        String url = "jdbc:mysql://localhost:3306/nombre_de_la_base_de_datos?serverTimezone=UTC&useLegacyDatetimeCode=false";
        String username = "root";
        String password = "admin";

        try {
            Connection connect = DriverManager.getConnection(url, username, password);
            System.out.println("Conexión exitosa a la base de datos MySQL");
            connect.close();
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos MySQL: " + e.getMessage());
        }
    }
}

