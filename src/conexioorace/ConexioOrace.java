/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexioorace;

import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author alumno04
 */
public class ConexioOrace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (conexion.conectar() ==null) {
            System.out.println("la conexion fallo!!!.");
        }else{
            System.out.println("la conexion fue exitosa!!!.");
            
            try{
                  Statement st= conexion.conectar().createStatement();
                  ResultSet rs = st.executeQuery("Select * from persona");
                  while (rs.next()) {                    
                      System.out.println("ID:"+rs.getInt("idpersona") +rs.getString ("NOMBRE") +rs.getString ("APELLIDO_PAT") +rs.getString ("APELLIDO_MAT"));
                    
                }
            }catch (Exception e){
            }
            
            
        }
    }
    
}
