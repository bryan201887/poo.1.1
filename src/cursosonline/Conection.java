/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursosonline;

import cursosonline.util.Util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author DELL
 */
public class Conection {
    static Connection conn = null;
    public static Connection conector() {
        
         
            
            try {
                Class.forName("org.postgresql.Driver");
                conn = DriverManager.getConnection(Util.url,Util.usuario, Util.password);
            } catch (Exception e) {
                System.out.println("Ocurrio un error : "+e.getMessage());
            }
            System.out.println("La conexión se realizo sin problemas! => " + "Angelo silva ");
          return conn;  
    }
  public static void cerrar() throws SQLException {
      if (conn != null) {
         conn.close();
      }
   }
    
}
