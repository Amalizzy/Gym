import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class BaseApp {

    protected Connection con;

   protected String host;
   protected String port;
   protected String databaseName;
   protected String user;
   protected String password;



    protected void loadProperties(){

        try (InputStream input = GymDatabase.class.getClassLoader().getResourceAsStream("config.properties")) {

            Properties prop = new Properties();

            // load a properties file
            prop.load(input);

            // get the property value and print it out

            host = prop.getProperty("db.host");
            port = prop.getProperty("db.port");
            user = prop.getProperty("db.user");
            password = prop.getProperty("db.password");

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    protected void createConnection(){
        try {

            Class.forName("com.mysql.jdbc.Driver");
            String connectionUrl = "jdbc:mysql://" + host + ":" + port + "/" + databaseName + "?useUnicode=true&characterEncoding=UTF-8&user=" + user + "&password=" + password;
            this.con = DriverManager.getConnection(connectionUrl);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }catch(ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }

}
