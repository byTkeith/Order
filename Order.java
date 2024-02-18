import java.io.*;
import java.util.*;

public class Order {
    public static String Processor(String eachLine){
        return eachLine;

    }
    public static void main(String[] args) {
        ArrayList<String> fileContents= new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the name of the word lists text file:");
        String filename= scanner.nextLine();
        try{
            File file =new File(filename);
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                fileContents.add(scanner.nextLine());
                
            }

        }catch(FileNotFoundException e){
            System.out.println("File not found askies");
        }finally{
            if(scanner!=null){
                scanner.close();
            }
        }
        for(String sepLines: fileContents){
            String toBeProcessed=Processor(sepLines);

        }
    }
    
}
