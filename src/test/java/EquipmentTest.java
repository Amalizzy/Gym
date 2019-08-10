import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class EquipmentTest {

    @Test
    public void testSummiriseEquipments(){

        GymList gymList = new GymList();

        Equipment banch = new Equipment(20, "Banch");
        gymList.addEquipment(banch);

        Equipment trademil = new Equipment(10, "trademil");
        gymList.addEquipment(trademil);

        int summarise = gymList.summariseEquipment();

        Assert.assertEquals(30, summarise );

    }
}
