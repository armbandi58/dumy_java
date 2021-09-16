import java.io.*;
import java.util.Scanner;

public class filestream {
    //variables
    //private File file_pr = new File("");

    public filestream(){
        System.out.println("[+] filestream constructor called.");
        
    }

    public void printFile(String path){
        File fl = new File(path);
        try{
            Scanner asd = new Scanner(fl);
            while(asd.hasNextLine()){
                String tmp0 = asd.nextLine();
                System.out.println(tmp0);
            }
            asd.close();
        }catch(Exception e){
            System.out.println(e);
        }
        /*
        try{
            FileInputStream file_in = new FileInputStream(path);
            int i = file_in.read();
            System.out.print((char)i);
            file_in.close();
        }catch(Exception e){
            System.out.println(e);
        }*/

    }
}
