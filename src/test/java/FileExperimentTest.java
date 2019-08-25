import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class FileExperimentTest {

    FileExperiment fileExperiment;

    @BeforeTest
    public void before(){

        fileExperiment = new FileExperiment();
    }

    @Test
    public void testWriteAndReadFromFile(){

        String inputDirectory = "C:/Users/danij/";
        String inputFileName = "Names.txt";
        String outputDirectory = "C:/Users/danij/";
        String outputFileName = "TestFile.txt";

        List<String> names = fileExperiment.getFileLines(inputDirectory, inputFileName);

        for (String name : names) {

            fileExperiment.writeLineToFile(outputDirectory, outputFileName, name);
        }

        List<String> outputFileLines = fileExperiment.getFileLines(outputDirectory, outputFileName);

        Assert.assertEquals(outputFileLines.size(), names.size());



    }
}
