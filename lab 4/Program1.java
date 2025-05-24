/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author oct10
 */
public class Program1 {
    
    public static void main(String [] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        String mode = "";
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/rrbca", "root", "");


        
        
        while(!mode.equals("e"))
        {
        System.out.println("CRUD Project");
        System.out.println("a> Select All");
        System.out.println("b> Insert");
        System.out.println("c> Update");
        System.out.println("d> Delete");
        System.out.println("e> Exit");
        
        mode = sc.nextLine();
            switch(mode)
            {
                case "a":
                    System.out.println("Select All");
                    selectAll(con);
                    break;
                case "b":
                    System.out.println("Insert ");
                    System.out.println("Enter name : ");
                    String name = sc.nextLine();
                    
                    System.out.println("Enter semester : ");
                    String address = sc.nextLine();
                    insert(con, name, address);
                    break;
                case "c":
                    System.out.println("Update ");
                    System.out.println("Enter id : ");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter name : ");
                    String uname = sc.nextLine();
                    System.out.println("Enter semester : ");
                    String uaddress = sc.nextLine();
                    update(con,id, uname, uaddress);
                    break;
                case "d":
                    System.out.println("DELETEbb"
                            + "b"
                            + ""
                            + "");
                    System.out.println("Enter id : ");
                    int did = Integer.parseInt(sc.nextLine());
                    delete(con,did);
                    break;
                default:
                    break;                    
            }
        }
    }
    
    public static void selectAll(Connection con) throws Exception
    {
        String query = "SELECT * FROM students";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        
        System.out.println("Roll \t Name \t Semester");
        while(rs.next())
        {
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
        } 
    }
    
        public static void insert(Connection con, String name, String semester) throws Exception
    {
        String query = "INSERT into `students`(`name`, `semester`) VALUES ('"+name+"','"+semester+"')";
        Statement st = con.createStatement();
        int rows = st.executeUpdate(query);
        
        System.out.println(rows+" rows inserted");
    }
            
        public static void update(Connection con,int id, String name, String semester) throws Exception
    {
        String query = "update students set name='"+name+"', semester='"+semester+"' where id='"+id+"'";
        Statement st = con.createStatement();
        int rows = st.executeUpdate(query);
        
        System.out.println(rows+" rows updated");
    }
        
    public static void delete(Connection con,int id) throws Exception
    {
        String query = "DELETE from students where id="+id+"";
        Statement st = con.createStatement();
        int rows = st.executeUpdate(query);
        
        System.out.println(rows+" rows deleted");
    }
    
}
