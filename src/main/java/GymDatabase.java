
import java.sql.*;
import java.util.ArrayList;

public class GymDatabase extends BaseApp {


    public GymDatabase() {

        this.databaseName = "Gym";
        loadProperties();
        createConnection();
    }


    public void addMember(Member newMember){
        try {
            Statement st = con.createStatement();

            st.executeUpdate("INSERT INTO gym_member (name, surname, birth_year) "
                    + "VALUES ('" + newMember.name + "','" + newMember.surname + "', " + newMember.birthYear + ")");
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<Member> getMembers(){

        ArrayList<Member> members = new ArrayList<Member>();

            try {
                Statement st = con.createStatement();

                ResultSet rset = st.executeQuery("SELECT * FROM gym_member");

                while (rset.next()) {
                    String name = rset.getString("name");
                    String surname = rset.getString("surname");
                    int birthYear = rset.getInt("birth_year");
//                    System.out.println(name + ", " + surname + ", " + birthYear);

                    Member member = new Member(name, surname, birthYear);

                    members.add(member);
                }
            }catch (SQLException ex) {
                ex.printStackTrace();
            }

        return members;
    }

    public ArrayList<Member> getMembersOfAge(){

        ArrayList<Member> allMembers = getMembers();
        ArrayList<Member> membersOfAge = new ArrayList<Member>();

        for (Member member: allMembers) {
            if(member.IsOfAge()){

                membersOfAge.add(member);
            }
        }
        return membersOfAge;
    }

    public void addEquipment(Equipment newEquipment){
        try {
            Statement st = con.createStatement();

            st.executeUpdate("INSERT INTO equipment (name, price) "
                    + "VALUES ('" + newEquipment.name + "'," + newEquipment.price + ")");
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
    }


    public ArrayList<Equipment> getEquipment(){

        ArrayList<Equipment> equipments = new ArrayList<Equipment>();

        try {
            Statement st = con.createStatement();

            ResultSet rset = st.executeQuery("SELECT * FROM equipment");

            while (rset.next()) {
                String name = rset.getString("name");
                int price = rset.getInt("price");
                System.out.println(name + ", " + price + ", ");

                Equipment equipment = new Equipment(price, name);

                equipments.add(equipment);
            }
        }catch (SQLException ex) {
            ex.printStackTrace();
        }

        return equipments;
    }







}
