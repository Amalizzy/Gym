import org.junit.Test;

public class GymTest {

    @Test
    public void testAddAndPrintMembers(){

        GymArray gymArray = new GymArray(10);

        Member pero = new Member("Pero", "Peric", 1985);
        gymArray.addMember(pero);

        Member marko = new Member("Marko", "Markovic", 1982);
        gymArray.addMember(marko);

        gymArray.printMembers();

    }

    @Test
    public void testPrintAgeOfMember(){

        GymArray gymArray = new GymArray(10);

        Member pero = new Member("Pero", "Peric", 1985);
        gymArray.addMember(pero);

        Member marko = new Member("Marko", "Markovic", 2012);
        gymArray.addMember(marko);

        gymArray.printMembersOfAge();

    }



}
