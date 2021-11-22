package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConexBD {
    
    Connection conectar = null;
    
    public Connection Conectar(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/control_entrada_salida","root","santiago009");
            //JOptionPane.showMessageDialog(null, "Conexion Exitosa", "Conexion", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Conexión Éxitosa");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Sin Conexion "+e,  "Conexion", JOptionPane.ERROR_MESSAGE);
        }
        return conectar;
    }     
}

