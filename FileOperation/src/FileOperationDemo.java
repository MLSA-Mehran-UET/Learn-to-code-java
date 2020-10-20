import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileOperationDemo {

    public static void main(String[] args) {
        File profileFile = createAndWrite();
        if (profileFile == null) {
            return;
        }
        List<String> dataList = readFile(profileFile);
        if (dataList == null) {
            return;
        }
        for (String data : dataList) {
            System.out.printf(data);
        }
        //first comment below line (deletefile) , u can see profile.txt is creating in project directory.
        deleteFile(profileFile);
    }

    /**
     * Reading file and getting data as string array.
     *
     * @param file - send file which u want to read
     * @return - file content as string
     */
    private static List<String> readFile(File file) {
        try {
            List<String> data = new ArrayList();
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                data.add(scanner.nextLine());
            }
            scanner.close();
            return data;
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return null;
    }

    /**
     * creating file and writing string to file
     *
     * @return
     */
    private static File createAndWrite() {
        try {
            //Creating file
            File file = new File("profile.txt");

            //adding string data file
            FileWriter fileWriter = new FileWriter("profile.txt");
            fileWriter.write("My Name is Bingo.\n");
            fileWriter.write("My Age is 20.");
            fileWriter.close();
            return file;
        } catch (IOException ioException) {
            System.out.printf(ioException.getMessage());
            ioException.printStackTrace();
        }
        return null;
    }

    /**
     * delete the file
     * @param file - send file which u want to delete
     */
    private static void deleteFile(File file) {
        if (file.delete()) {
            System.out.println("Deleted the file: " + file.getName() + " successfully.");
        } else {
            System.out.println("Failed to delete the file: " + file.getName());
        }
    }
}
