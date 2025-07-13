

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;

public class Conn {
    Connection c;
    Statement s;
    public Conn()
    {
        try{
            c= DriverManager.getConnection("jdbc:mysql://localhost:3306/Bankmanagementsystem","root","root");
            s=c.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
