import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileExperiment {


        public void writeLineToFile(String directory, String fileName, String fileContent){

            try(FileWriter fileWriter = new FileWriter(directory + fileName, true)) {
                fileWriter.write(fileContent + System.lineSeparator());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public List<String> getFileLines(String directory, String fileName){

            Path path = Paths.get(directory, fileName);
            List<String> list = null;
            try {
                list = Files.readAllLines(path);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return list;
        }


}
