import java.sql.*;
import javax.sql.rowset.*;

public class Program4 {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/rrbca", "root", "");

        String sql = "SELECT * FROM students";
        PreparedStatement ps = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = ps.executeQuery();

        System.out.println("Scrollable and Updatable ResultSet:");
        System.out.println("Roll\tName\tSemester");
        if (rs.next()) {
            System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));
            rs.updateString(3, "Fifth");
            rs.updateRow();
            System.out.println("Updated Address: " + rs.getString(3));
        }
        if (rs.last()) {
            System.out.println("Last Row: " + rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));
        }

        if (rs.previous()) {
            System.out.println("Previous Row: " + rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));
        }

        System.out.println("\nUsing CachedRowSet:");

       
        CachedRowSet crs = RowSetProvider.newFactory().createCachedRowSet();
        crs.setUrl("jdbc:mysql://localhost:3307/rrbca");
        crs.setUsername("root");
        crs.setPassword("");
        crs.setCommand("SELECT * FROM students");
        crs.execute();

       
        while (crs.next()) {
            System.out.println(crs.getInt(1) + "\t" + crs.getString(2) + "\t" + crs.getString(3));
        }
        rs.close();
        ps.close();
        con.close();
        crs.close();
    }
}