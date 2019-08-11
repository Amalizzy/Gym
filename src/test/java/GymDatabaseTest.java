import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.SQLException;
import java.util.ArrayList;

public class GymDatabaseTest {

    @Test
    public void testAddMember(){

        GymDatabase gym = new GymDatabase();

        Member pero = new Member("Pero", "Peric", 2012);
        gym.addMember(pero);

        Member marko = new Member("Marko", "Markovic", 2012);
        gym.addMember(marko);
    }

    @Test
    public void testGetMembers(){

        GymDatabase gym = new GymDatabase();

        ArrayList<Member> members = gym.getMembers();

        Assert.assertEquals(members.size(),10);
    }

    @Test
    public void testGetMembersOfAge(){

        GymDatabase gym = new GymDatabase();

        ArrayList<Member> membersOfAge = gym.getMembersOfAge();

        Assert.assertEquals(membersOfAge.size(),10);
    }

    @Test
    public void testAddEquipment(){

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
    public void testGetEquipment(){

        GymDatabase gym = new GymDatabase();

        ArrayList<Equipment> equipment = gym.getEquipment();

        Assert.assertEquals(4,equipment.size());
    }

}

