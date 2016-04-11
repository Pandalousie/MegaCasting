package megacasting;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author AJOURD
 */
public class Bdd {
    
     
    public static Connection open() throws ClassNotFoundException, SQLException{
        // Etape 1 : Chargement du driver
        Class.forName("com.mysql.jdbc.Driver");
            
        return (Connection) DriverManager.getConnection("jdbc:mysql://localhost/megacasting", "root", "");
            
    }
    
    public static void close(Connection cn) throws SQLException{
        cn.close();
    }
    
}
