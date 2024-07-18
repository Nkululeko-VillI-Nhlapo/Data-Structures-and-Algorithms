//Nhlapo Nkululeko Villicent
//4129962

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Practical12{

    public static void main(String[] args) throws IOException {

        File file = new File("C:/CompSci/VS JAVA PRO/3rd Year DS.A/Practical 1/Rhyme.txt");
        Scanner fread = new Scanner(file);

        String newFile = "Nhlapo Nkululeko  Villicent\n4129962\n";

        while(fread.hasNextLine()){
            //System.out.println(fread.nextLine());
            newFile = newFile.concat(fread.nextLine() + "\n");
        }
        //newFile = newFile.concat(fread.nextLine() + "\n");
         
        FileWriter fileEdit = new FileWriter("C:/CompSci/VS JAVA PRO/3rd Year DS.A/Practical 1/Rhyme2.txt");
        fileEdit.write(newFile);      
       fileEdit.close();

       System.out.println(newFile);
       


    }
}