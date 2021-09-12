import java.util.*;
//import java.util.Date;

class first0{
    public static void main(String[] args) {
        try{
            System.out.println("[+] Main fgv inditas...");
            Thread.sleep(1000);
        
            System.out.println("1s eddig");
            Thread.sleep(2000);
            System.out.println("Ez mar 2s");
        }
        catch(InterruptedException ex){
            ex.printStackTrace();
        }
        blabla("Had menjen.");

        Scanner scanner_in = new Scanner(System.in);
        System.out.println(scanner_in.nextLine());

        scanner_in.close();
    }

    public static void blabla(String str_in){
        System.out.println(str_in);
        System.out.println("Ez is onnan van.");
    }
}