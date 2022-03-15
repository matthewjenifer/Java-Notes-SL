package notespackage2;

import java.io.File; // The java.io package includes a File class that allows you to work with files. To start, create a File object and specify the path file in the constructor.
import java.io.FileNotFoundException;
import java.util.Formatter; // Formatter, another useful class in the java.util package, is used to create content and write it to files.
import java.util.Scanner;

public class FileManipulation {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\Matthew\\Desktop\\demo.txt");

        if(file.exists()) { // With the exists() method, you can determine whether a file exists.
            System.out.println(file.getName()+ " exists."); // The getName() method returns the name of the file. Note that we used double backslashes in the path, as one backslash should be escaped in the path String.
        } else {
            System.out.println("Provided file does not exist in a given path.");
        }
        System.out.println("-----------------------------");
        try {
            File file2 = new File("C:\\Users\\Matthew\\Desktop\\demo.txt"); // Files are useful for storing and retrieving data, and there are a number of ways to read from a file. One of the simplest ways is to use the Scanner class from the java.util package.
            Scanner scan = new Scanner(file2); // The constructor of the Scanner class can take a File object as input.
            while(scan.hasNext()) { // The Scanner class inherits from the Iterator, so it behaves like one. We can use the Scanner object's next() method to read the file's contents.
            System.out.println(scan.next()); // The file's contents are output word by word, because the next() method returns each word separately.
        }
        scan.close(); // It is always good practice to close a file when finished working with it. One way to do this is to use the Scanner's close() method.
    } catch (FileNotFoundException e) {
        System.out.println("Error. File not found");
    }
        System.out.println("-----------------------------");

        try {
            Formatter file3 = new Formatter("C:\\Users\\Matthew\\Desktop\\auto_file.txt"); // This creates an empty file at the specified path. If the file already exists, this will overwrite it. Once the file is created, you can write content to it using the same Formatter object's format() method.
            file3.format("%s %s %s", "1", "John", "Smith \r\n"); // The format() method formats its parameters according to its first parameter.%s mean a string and get's replaced by the first parameter after the format. The second %s get's replaced by the next one, and so on. So, the format %s %s %s denotes three strings that are separated with spaces. Note: \r\n is the newline symbol in Windows. The code above creates a file with the following content: 1 John Smith    2 Amy Brown
            file3.format("%s %s %s", "2", "Amy", "Brown");
            file3.close(); 
            System.out.println("File Created");
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }

    }
    
}
