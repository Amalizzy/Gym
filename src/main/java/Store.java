import java.sql.SQLException;
import java.sql.Statement;

public class Store extends BaseApp{

    public Store() {

        this.databaseName = "Store";
        loadProperties();
        createConnection();
    }


    public void addEmploye(Employe newEmploye){
        try {
            Statement st = con.createStatement();

            String query = "INSERT INTO employe (name, surname, position) "
                    + "VALUES ('" + newEmploye.name + "','" + newEmploye.surname + "', '" + newEmploye.position + "')";

            st.executeUpdate(query);
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
    }





}
