import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.SQLException;
import java.util.ArrayList;

public class GymDatabaseTest {

    @Test
    public void testAddMember()throws ClassNotFoundException, SQLException {

        GymDatabase gym = new GymDatabase();

        Member pero = new Member("Pero", "Peric", 1985);
        gym.addMember(pero);

        Member marko = new Member("Marko", "Markovic", 1982);
        gym.addMember(marko);
    }

    @Test
    public void testGetMembers()throws ClassNotFoundException, SQLException{

        GymDatabase gym = new GymDatabase();

        ArrayList<Member> members = gym.getMembers();

        Assert.assertEquals(4,members.size());
    }

    @Test
    public void testAddEquipment()throws ClassNotFoundException, SQLException {

        GymDatabase gym = new GymDatabase();

        Equipment banch = new Equipment(10, "Banch");
        gym.addEquipment(banch);

        Equipment trademill = new Equipment(20, "Trademill");
        gym.addEquipment(trademill);

        Equipment dumbell = new Equipment(30, "Dumbell");
        gym.addEquipment(dumbell);

        Equipment banchPress = new Equipment(40, "BanchPress");
        gym.addEquipment(banchPress);

    }

    @Test
    public void testGetEquipment()throws ClassNotFoundException, SQLException{

        GymDatabase gym = new GymDatabase();

        ArrayList<Equipment> equipment = gym.getEquipment();

        Assert.assertEquals(4,equipment.size());
    }

}

