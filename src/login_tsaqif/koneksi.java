package login_tsaqif;

import java.sql.*;
import javax.swing.JOptionPane;

public class koneksi {
    private static Connection KoneksiDatabase;
    public static Connection KoneksiDB() throws
            SQLException {
    try {
    String DB = "jdbc:mysql://localhost/login";
    String user = "root";
    String pass = "";
    KoneksiDatabase = (Connection) DriverManager.
            getConnection(DB,  user, pass);
    } catch (Exception e){
    JOptionPane.showMessageDialog(null, "Tidak ada koneksi", 
            "Erorr",JOptionPane.INFORMATION_MESSAGE);
    System.err.println(e.getMessage());
    System.exit(0);
    }
        return KoneksiDatabase;
    }
}