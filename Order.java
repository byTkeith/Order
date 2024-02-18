import java.io.*;
import java.util.*;

public class Order {
    /*
     * method to separate the line into strings and check if the words are in sequence
     */
    public static void Processor(String eachLine){
        String[] splitBySpace=eachLine.split(" ");
        int comparator=0;
        int conditionFactor=1;
        int i;
        for(i=0; i<(splitBySpace.length)-1;i++){
            if(splitBySpace[i].compareTo(splitBySpace[i+1])<0){
                comparator++;
            }else{conditionFactor++;}
            
        }
        //System.out.println("the following has a condition factor of "+conditionFactor);
        if(conditionFactor==comparator){
            System.out.println("Multiple solutions length "+comparator+".");
        }
        else if(conditionFactor==1){
            System.out.println("Longest is "+conditionFactor+".");
        }
        else{System.out.println("Longest is "+comparator+".");}


        //return comparator;

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
            
            Processor(sepLines);
           
        }
        System.out.println("Done");
    }
    
}
