
package todolist;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


//DataBase connection
public class Dbcon 
{
         Connection cnn = null;
         java.sql.PreparedStatement pst;
    
    public static Connection dbconnect()
    {
        
        try {
        
            Class.forName("com.mysql.jdbc.Driver");//jdbcDriver
            
            String connectionUrl = "jdbc:mysql://localhost:3306/todolist";//Database path
            
            Connection con = DriverManager.getConnection(connectionUrl,"root","");//Conncetion function
       
            return con; // result connetion
        } 
        catch (ClassNotFoundException | SQLException ex) //Exception
        {
            System.out.println(ex);
            return null;
        }
    
        
        
    }
    
}
