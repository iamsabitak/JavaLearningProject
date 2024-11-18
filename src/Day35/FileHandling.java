package Day35;

import java.io.File;
// import java.io.IOException;
// import java.io.FileNotFoundException;
// import java.util.Scanner;

public class FileHandling{
    public static void main(String[] args) {
//       File myFile = new File("File.txt");
// try {
//     myFile.createNewFile();
// } catch (IOException e) {
//     System.out.println("Unable to create this File");
//     e.printStackTrace();
// }
    // File myFile = new File("CWH_file1.txt");
    //     try {
    //         FileWriter fileWriter = new FileWriter("CWH_file1.txt");
    //         fileWriter.write("one step solution for your all programming problems.\nKeep learning, Keep coding!");
    //         fileWriter.close();
    //     } catch (IOException e) {
    //         e.printStackTrace();
    //     }

// File myFile = new File("CWH_file1.txt");
//         try {
//             Scanner sc = new Scanner(myFile);
//             while(sc.hasNextLine()){
//                 String line = sc.nextLine();
//                 System.out.println(line);
//             }
//             sc.close();
//         } catch (FileNotFoundException e) {
//             e.printStackTrace();
        // }
    
    File myFile = new File("CWH_file1.txt");
    if(myFile.delete()){
        System.out.println("I have deleted: " + myFile.getName());
    }
    else{
        System.out.println("Some problem occurred while deleting the file");
    }

}
}


