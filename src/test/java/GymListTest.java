//import org.junit.Assert;
//import org.junit.Test;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class GymListTest {

    @Test
    @Description("add and get members")
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
    @Description("get members of age")
    public void testGetMembersOfAge(){

        GymList gymList = new GymList();

        Member pero = new Member("Pero", "Peric", 1985);
        gymList.addMember(pero);

        Member marko = new Member("Marko", "Markovic", 2012);
        gymList.addMember(marko);

        List<Member> membersOfAge = gymList.getMembersOfAge();

        Assert.assertEquals(1, membersOfAge.size() );

    }


}
