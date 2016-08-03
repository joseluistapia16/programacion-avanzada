package base_de_datos;

import java.sql.Connection;
import java.sql.DriverManager;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author JOSE LUIS
 */
public class Conectar {

    Connection Conect = null;

  public Connection Conexion(String base) {
          try {
            Class.forName("com.mysql.jdbc.Driver");
            String str = "jdbc:mysql://localhost:3306/" + base + "?zeroDateTimeBehavior=convertToNull";
            Conect = DriverManager.getConnection(str, "root", "");
        } catch (Exception ex) {
          System.out.println("No hay Conexión !!");
        }
        return Conect;
    }

    

}
