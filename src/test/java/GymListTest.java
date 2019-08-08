//import org.junit.Assert;
//import org.junit.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class GymListTest {

    @Test
    public void testAddAndGetMembers(){

        GymList gymList = new GymList();

        Member pero = new Member("Pero", "Peric", 1985);
        gymList.addMember(pero);

        Member marko = new Member("Marko", "Markovic", 1982);
        gymList.addMember(marko);

       ArrayList<Member> members = gymList.getMembers();

        Assert.assertEquals(2,members.size());

    }

    @Test
    public void testGetMembersOfAge(){

        GymList gymList = new GymList();

        Member pero = new Member("Pero", "Peric", 1985);
        gymList.addMember(pero);

        Member marko = new Member("Marko", "Markovic", 2012);
        gymList.addMember(marko);

        ArrayList<Member> membersOfAge = gymList.getMembersOfAge();

        Assert.assertEquals(1, membersOfAge.size() );

    }


}
