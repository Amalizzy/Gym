import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;

public class GymDatabase {

    private Connection con;

    private String host;
    private String port;
    private String databaseName;
    private String user;
    private String password;

    public GymDatabase()throws ClassNotFoundException, SQLException {

        loadProperties();

        Class.forName("com.mysql.jdbc.Driver");
        String connectionUrl = "jdbc:mysql://"+ host + ":" + port + "/" + databaseName + "?useUnicode=true&characterEncoding=UTF-8&user=" + user + "&password=" + password;
        this.con  = DriverManager.getConnection(connectionUrl);
    }


    public void addMember(Member newMember) throws ClassNotFoundException, SQLException{

        Statement st = con.createStatement();

        st.executeUpdate("INSERT INTO gym_member (name, surname, birth_year) "
                +"VALUES ('" + newMember.name + "','" + newMember.surname + "', " + newMember.birthYear + ")");
    }

    public ArrayList<Member> getMembers()throws ClassNotFoundException, SQLException {

        ArrayList<Member> members = new ArrayList<Member>();

        Statement st = con.createStatement();

        ResultSet rset = st.executeQuery("SELECT * FROM gym_member");

        while (rset.next()) {
            String name = rset.getString("name");
            String surname = rset.getString("surname");
            int birthYear = rset.getInt("birth_year");
            System.out.println(name + ", " + surname + ", " + birthYear);

            Member member = new Member(name, surname, birthYear);

            members.add(member);
        }

        return members;
    }

    public void addEquipment(Equipment newEquipment) throws ClassNotFoundException, SQLException{

        Statement st = con.createStatement();

        st.executeUpdate("INSERT INTO equipment (name, price) "
                +"VALUES ('" + newEquipment.name + "'," + newEquipment.price + ")");
    }

    public ArrayList<Equipment> getEquipment()throws ClassNotFoundException, SQLException {

        ArrayList<Equipment> equipments = new ArrayList<Equipment>();

        Statement st = con.createStatement();

        ResultSet rset = st.executeQuery("SELECT * FROM equipment");

        while (rset.next()) {
            String name = rset.getString("name");
            int price = rset.getInt("price");
            System.out.println(name + ", " + price + ", " );

            Equipment equipment = new Equipment(price, name);

            equipments.add(equipment);
        }

        return equipments;
    }

    private void loadProperties(){

        try (InputStream input = GymDatabase.class.getClassLoader().getResourceAsStream("config.properties")) {

            Properties prop = new Properties();

            // load a properties file
            prop.load(input);

            // get the property value and print it out

            host = prop.getProperty("db.host");
            port = prop.getProperty("db.port");
            databaseName = prop.getProperty("db.databaseName");
            user = prop.getProperty("db.user");
            password = prop.getProperty("db.password");

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
