//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.sql.*;
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String url = "jdbc:postgresql://localhost:5432/Demo";
        String uname = "postgres";
        String pass = "1234";
        String sql = "select * from student";


        //Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connection Established");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
//        rs.next();
//        String name = rs.getString("s_name");
//        rs.getString("s_name");
//        System.out.println(name);

        while(rs.next()){
            System.out.print(rs.getInt(1) + " ");
            System.out.print(rs.getString(2) + " ");
            System.out.println(rs.getInt(3) );


        }
        con.close();
        System.out.println("Connection closed");






    }
}