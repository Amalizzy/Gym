import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.text.ParseException;
import java.util.Date;

import static org.apache.commons.lang3.time.DateUtils.parseDate;

public class UtilTest {

    Util util;


    @BeforeTest
    public void before(){

        util = new Util();
    }



    @Test
    public void testGetSubstring(){

        String result = util.getSubstringForLastTwoCharachters("SomeString");

        Assert.assertEquals(result, "ng");

    }

    @Test
    @Description("get substring for provided number")
    public void testgetSubstringForProvidedNumber(){

        String result = util.getSubstringForProvidedNumber("SomeString", 4);

        Assert.assertEquals(result, "ring");
    }


    @Test
    @Description("increase data")
    public void testIncreaseDate() throws ParseException {

        Date date = parseDate("2019-13-08");

        Date result = util.increaseDate(date, 3);

//        Assert.assertEquals();



    }
}
