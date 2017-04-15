/*THIS CODE IS DESIGNED TO HELP YOU COMPLETE
 * UNIT 4 LAB 3 IN PREPARATION FOR USE IN YOUR FINAL PROJECT */


// import input output so we can use "File" objects
import java.io.*;
import java.util.Scanner;

public class CodeToHelpYou {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String pathToTextFiles = "YOUR_PATH_GOES_HERE";

        // 1. Call getFiles with your path

        // 2. Call display files


        // 3. Ask the user what file they want

        // 4. Save user input

        // 5. Look at your path what do we need to add besides the file name?

        // 6. Should the user have to type .txt?

        // 7. call "readFile" with a complete path to the user requested file

    }

    private static File[] getFiles(String directoryPath) {
        /* THIS METHOD TAKES IN A DIRECTORY PATH AND RETURNS AN ARRAY OF FILE OBJECTS
          * USE "displayFiles" TO PRINT OUT ALL OF THE AVAILABLE FILES FOR THE USER */
        File folder = new File(directoryPath);
        File[] listOfFiles = folder.listFiles();

        return listOfFiles;
    }
    
    private static void displayFiles(File [] files) {
        /* THE FILE CLASS AS A METHOD CALLED "getName()" CALL THIS METHOD
         * ON EACH INDIVIDUAL FILE TO GET IT'S NAME AND PRINT IT OUT
          * THIS METHOD DOES NOT RETURN ANYTHING */
        for (File f: files) {
            System.out.println("File " + f.getName());
        }
    }


    private static void readFile(String filepath) {
        // you do not need to alter this method!

        String line;

        File fileToRead = new File(filepath);
        if (fileToRead.exists()) {
            try {
                // FileReader to read text files in default encoding
                FileReader fileReader = new FileReader(filepath);

                // wrap FileReader in BufferedReader
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println(line);
                }

                bufferedReader.close();
            }
            catch (IOException ex) {
                System.out.println("Unable to open file " + filepath);
            }
        }
        else {
            System.out.println("File does not exist");
        }
    }

}
