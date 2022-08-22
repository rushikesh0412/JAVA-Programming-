/**
 *
 * @author Rushikehs
 */
import java.sql.*;

public class JDBCDemo {

    public static void main(String[] args) {
        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");//Instantiation of the driver

            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "Rushi@0412"); //creation of statement for execution

            Statement st = con.createStatement();       //opening the connection with db
            ResultSet rs0 = st.executeQuery("Drop table studjdbcdemo");    //drop studjdbcdemo table
            ResultSet rs = st.executeQuery("create table studjdbcdemo(name varchar(25), roll int ,marks int)"); // create table

            ResultSet rs1 = st.executeQuery("insert into studjdbcdemo values('Rushikesh',2,21)"); //inserted to table
            ResultSet rs2 = st.executeQuery("insert into studjdbcdemo values('abc',3,25)");
            ResultSet rs3 = st.executeQuery("insert into studjdbcdemo values('xyz',4,22)");
            ResultSet rs4 = st.executeQuery("insert into studjdbcdemo values('def',5,27)");

            ResultSet rs5 = st.executeQuery("select * from studjdbcdemo"); //fetching data

            while (rs5.next()) {
                System.out.println(rs5.getString("name") + " " + rs5.getInt("roll") + " " + rs5.getInt(3));
            }
            
            int rs6 = st.executeUpdate("update studjdbcdemo set name='tina' where roll=3");

            //ResultSet rs7 = st.executeQuery("drop table studjdbcdemo"); //Deleting the database table view

            ResultSet rs14 = st.executeQuery("Drop view viewJDBCNamee");  //drop viewJDBCName table

            ResultSet rs8 = st.executeQuery("create view viewJDBCNamee as select name from studjdbcdemo"); //creating view
            ResultSet rs9 = st.executeQuery("select * from viewJDBCNamee");
            while (rs9.next()) {
                System.out.println("" + rs9.getString(1));
            }
            
            ResultSet rs10 = st.executeQuery("alter table studjdbcdemo add admissionDate Date"); //alter table structure
            
            ResultSet rs11 = st.executeQuery("alter table studjdbcdemo drop column admissionDate");
            ResultSet rs12 = st.executeQuery("drop table studjdbcdemo"); //Deleting the database table view
            ResultSet rs13 = st.executeQuery("drop view viewJDBCNamee"); //Deleting the database table view
            rs.close();
            st.close();
            con.close();
            
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }

    }

}