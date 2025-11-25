//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.sql.*;
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String url = "jdbc:postgresql://localhost:5432/Demo";
        String uname = "postgres";
        String pass = "1234";
//        String sql = "delete from student where s_id = 7";

        int s_id = 102;
        String s_name = "jasmine";
        int marks = 52;
//        String sql = "insert into student values (" + s_id + ", '" + s_name +" ', " + marks + "  )";
        String sql = "insert into student values(?,?,?)";
        //Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
//        Statement st = con.createStatement();

        PreparedStatement st = con.prepareStatement(sql);
        st.setInt(1, s_id);
        st.setString(2, s_name);
        st.setInt(3, marks);

        st.execute();

        con.close();







    }
}