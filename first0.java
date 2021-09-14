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
        System.out.println("Irj be valamit.");
        String had = scanner_in.nextLine();

        //System.out.println("");
        System.out.println(had);

        scanner_in.close();

        komplex asd = new komplex(23.4,34.5);

        asd.printVar();

        asd.setVar(45.6, 78.921);
        asd.printVar();

        double tmp0 = asd.getIm(), tmp1 = asd.getRe();

        System.out.println("Ez: "+tmp0+", "+tmp1);
        asd.printAbs();
        asd.printDegree();

        cenzor Cenz = new cenzor("bla", "ez mar az");
        String csere = "bla bla, mehetne mar bla, z bla, blabla";

        csere = Cenz.cenzura(csere);
        System.out.println(csere);

    }

    public static void blabla(String str_in){
        System.out.println(str_in);
        System.out.println("Ez is onnan van.");
    }
}