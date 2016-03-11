/* 11/03/2016 Colin MacMillan
 * Original program was supposed to find a file, retrieve it and then read it 
 * back to the user. Then the user picks a words to search for and replace with
 * another word. This program instead searches for a file, get two variables from
 * the user and adds one of them to the txt document.
 */

package findandreplace;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author comac2452
 */
public class FindAndReplace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double countLine;
        String lineOfText, userLook, userReplace;
        
        // Initalized Variables
        
        System.out.println("Please Input a txt File Name to search for inside of My Documents(doc1)");
        
        String userFile = input.nextLine(); //Retrieves userFile from user input
        String fileName = "Y:\\Documents\\" + userFile + ".txt"; //Sets file name to search for
        
        System.out.println("Enter a colour"); // Sets string to search 
        userLook =input.nextLine();
        
        System.out.println("Now enter a word you would like to add."); // Sets string to add
        userReplace = input.nextLine();
        
        
        try {
            FileWriter out = new FileWriter(fileName,true);
            FileReader readFile= new FileReader(fileName);
        
            BufferedWriter write = new BufferedWriter(out);
            BufferedReader read = new BufferedReader(readFile);
            
            while((lineOfText = read.readLine()) != null) { // Reads file but doesn't accomplish original goal.
                System.out.println(lineOfText); // prints out file contents
            }   
            
            write.write("\n" + userReplace);
            
            
            write.close();
            out.close();
            readFile.close(); // closing everything
            read.close();
        }
        catch(IOException e) {
            System.out.println("Problem Reading File");
            System.err.println("IOException" + e.getMessage()); 
        }
       
    }
    0
}
