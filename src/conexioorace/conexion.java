/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexioorace;

import java.sql.Connection;
 import java.sql.DriverManager;
/**
 *
 * @author alumno04
 */
public class conexion {
    public static Connection conectar()
    {
        Connection conexion = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","prueba1","jhony1234");
        }
        catch (Exception e)
        {
           e.printStackTrace();
        }
        return conexion;
    }
}
