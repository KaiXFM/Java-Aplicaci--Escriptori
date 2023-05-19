
package uf5.pkg6.projecte.basedades;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
 /**
  * ConexioBDSingleton serveix per a crear un connexió a BD local a partir de lest teves dades en les variables privades
  * @author AX
  */
public class ConexioBDSingleton{
    
    private static Connection conn = null;
    
    private static String url = "jdbc:mysql://localhost:3306/";
    private static String bbdd = "filmflow";
    private static String user = "root";
    private static String pwd = "root";
    
    /**
     * 
     * @return Crea la conexió a la base de dades
     */
    public static Connection getConnection(){
        
        try{
            if (conn == null) {
               Class.forName("com.mysql.cj.jbdc.Driver");
                conn = DriverManager.getConnection(url + bbdd, user,pwd); 
            }
        }catch(ClassNotFoundException a){
            a.printStackTrace();
        } catch (SQLException ex) {
            Logger.getLogger(ConexioBDSingleton.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
    
//    public static Connection getConnection(){
//        if(conn == null){
//            new ConexioBDSingleton();
//        }
//        return conn;
//    }
}


