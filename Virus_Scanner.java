package virus_scanner;
/*
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
*/

/**
 *
 * @author Abhimanyu Agarwal
 */
public class Virus_Scanner 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception
    {
        /*
        MessageDigest md = MessageDigest.getInstance("MD5");
        FileInputStream fis;
        fis = new FileInputStream(path);

        byte[] dataBytes = new byte[1024];

        int nread = 0;
        while ((nread = fis.read(dataBytes)) != -1) 
        {
            md.update(dataBytes, 0, nread);
        }
        byte[] mdbytes = md.digest();

        //convert the byte to hex format method 1
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < mdbytes.length; i++) 
        {
            sb.append(Integer.toString((mdbytes[i] & 0xff) + 0x100, 16).substring(1));
        }

        System.out.println("Digest(in hex format):: " + sb.toString());

        //String hash = "781770fda3bd3236d0ab8274577dddde";
        String hash = sb.toString();
        
        System.out.println("Digest(in hex format):: " + hash);
        
        //System.out.println("Digest(in hex format):: " + hash1);
        
        String sql = "SELECT * FROM hashing WHERE hash = ?";
        
        try
        {
            Connection con;
            con = null;
            ResultSet rs = null;
            PreparedStatement pst = null;
            
            Class.forName("com.mysql.jdbc.Driver");
            
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:8080/virus","root","Gmail@123");
            pst = (PreparedStatement) con.prepareStatement(sql);
            pst.setString(1, hash);
            rs = (ResultSet) pst.executeQuery();
            
            if ( rs.next())
            {
                JOptionPane.showMessageDialog(null, "File Contains Virus");        
            }
        }
        catch (ClassNotFoundException | SQLException ex) 
        {
            Logger.getLogger(Virus_Scanner.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        
        
        /*Connection con;
        con = null;
        PreparedStatement pst = null;
        Class.forName("com.mysql.jdbc.Driver");

        con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:8080/virus","root","Gmail@123");
        pst = (PreparedStatement) con.prepareStatement("SELECT * FROM hashing WHERE hash = ?;");
        pst.setString(1, hash);
        */
        
        /*
        //convert the byte to hex format method 2
        StringBuffer hexString = new StringBuffer();
    	for (int i = 0; i < mdbytes.length;i++) {
    		String hex=Integer.toHexString(0xff & mdbytes[i]);
   	     	if(hex.length()==1) hexString.append('0');
   	     	hexString.append(hex);
    	}
    	System.out.println("Digest(in hex format):: " + hexString.toString());
        // TODO code application logic here
        */
        
        /*
        Browse_Panal bp;
        //System.out.println("1");
        bp = null;
        //System.out.println("2");
        bp = new Browse_Panal();
        //System.out.println("3");
        bp.setVisible(true);
        //System.out.println("4");
        */
        MD5 md;
        md = null;
        md = new MD5();
        md.setVisible(true);
            
    }    
}

      