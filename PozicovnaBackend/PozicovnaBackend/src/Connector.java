import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;



public record Connector() {
    static String url = "jdbc:mysql://localhost:3306/poz";
    static String username = "root";
    static String password = "asdfghjkl";
    


    public Connector() {   
        
    }

    public void pridajZamestnanca(String meno,String priezvisko,String datum_narodenia,String sex) {
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement stmt = connection.createStatement();
            System.out.println(LocalDate.now());

            String sql = "insert into poz.zamestnanec values ("+getDalsieId()+",'"+meno+"','"+priezvisko+"','"+datum_narodenia+"','"+sex+"','"+LocalDate.now()+"');";
            stmt.executeUpdate(sql);
            
            System.out.println("pripojene");
            
        } catch (SQLException e) {
            System.out.println("error, nepripojene");
            e.printStackTrace();
        }

    }

    public int getDalsieId() {

        int count = 1;
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement stmt = connection.createStatement();

            ResultSet resultSet = stmt.executeQuery("select * from poz.zamestnanec;");
            
            while (resultSet.next()) {
                count++;
            }
            return count;
            
            
            
            
        } catch (SQLException e) {
            System.out.println("error, nepripojene");
            e.printStackTrace();
        }
        return count;
        
    }




    
}
