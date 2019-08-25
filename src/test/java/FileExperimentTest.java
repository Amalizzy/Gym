import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileExperimentTest {

    FileExperiment fileExperiment;

    @BeforeTest
    public void before(){

        fileExperiment = new FileExperiment();
    }

    @Test
    public void testWriteToFile() {

        fileExperiment.writeToFile();
    }

    @Test
    public void testWriteTextToFile(){

        fileExperiment.writeTextToFile("Lorem Ipsum", "C:/Users/danij/Hello World.txt" );

    }

    @Test
    public void testWriteTextToFileAnother(){

        fileExperiment.writeTextToFileAnother("Lorem Ipsum", "C:/Users/danij/output.txt");

    }

    @Test
    public void testWriteTextToFileWithBuffer(){

        fileExperiment.writeTextToFileWithBuffer();

    }

    @Test
    public void testGetListOfLinesFromFile(){

        String text = "Lorem ipsum";

        fileExperiment.writeTextToFileAnother(text, "C:/Users/danij/output.txt");

        ArrayList<String> fileLines = fileExperiment.getListOfLinesFromFileBuffer("C:/Users/danij/output.txt");

        Assert.assertEquals(fileLines.size(),1);
        Assert.assertEquals(fileLines.get(0), text);
    }

    @Test
    public void testgetFileLines(){

        List<String> list = fileExperiment.getFileLines("C:/Users/danij/","output.txt");

        Assert.assertEquals(list.size(), 1);
    }
}
