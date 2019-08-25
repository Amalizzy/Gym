import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileExperiment {

        public void writeToFile(){

            FileOutputStream out = null;
            try {
                try {
                    out = new FileOutputStream("C:/Users/danij/output.txt");
                    out.write(2);

                } finally {
                    if (out != null) {
                        out.close();
                    }
                }
            }catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        public void writeTextToFile(String text, String path) {

            File file = new File(path);

            try {
                file.createNewFile();

                FileWriter writer = new FileWriter(file);

                writer.write(text);
                writer.flush();
                writer.close();

            }catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        public void writeTextToFileAnother(String fileContent, String absolutePath){

            try(FileWriter fileWriter = new FileWriter(absolutePath)) {
                fileWriter.write(fileContent);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void readTextFromFileAnother(){

            String absolutePath = "C:/Users/danij/output.txt";

            try(FileReader fileReader = new FileReader(absolutePath)) {
                int ch = fileReader.read();
                while(ch != -1) {
                    System.out.print((char)ch);
                    ch = fileReader.read();
                }
            } catch (FileNotFoundException e) {
                // exception handling
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        public void writeTextToFileWithBuffer(){

            String absolutePath = "C:/Users/danij/output.txt";

            try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(absolutePath))) {
                String fileContent = "This is a sample text again.";
                bufferedWriter.write(fileContent);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public ArrayList<String> getListOfLinesFromFileBuffer(String absolutePath){

//            String absolutePath = "C:/Users/danij/output.txt";

            ArrayList<String> fileLines = new ArrayList<String>();

            try(BufferedReader bufferedReader = new BufferedReader(new FileReader(absolutePath))) {
                String line = bufferedReader.readLine();
                while(line != null) {
                    fileLines.add(line);
                    line = bufferedReader.readLine();
                }
            } catch (FileNotFoundException e) {
                // exception handling
            } catch (IOException e) {
                // exception handling
            }

            return fileLines;
        }

        public List<String> getFileLines(String directory, String fileName){

            Path path = Paths.get(directory, fileName);
            List<String> list = null;
            try {
                list = Files.readAllLines(path);
            } catch (IOException e) {
                // exception handling
            }

            return list;
        }


}
