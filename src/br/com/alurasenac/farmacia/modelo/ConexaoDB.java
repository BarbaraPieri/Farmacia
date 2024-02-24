package br.com.alurasenac.farmacia.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {

    public static void main(String... x) {

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/farmacia?user=root&password=root");

            System.out.println("Conexão recuperada.");

            connection.close();

        } catch (SQLException e){
            System.out.println(e);
        }
    }
}