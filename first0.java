import java.util.*;
import javax.swing.JFrame;

//import java.util.Date;

class first0 extends JFrame{
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
/*
        Scanner scanner_in = new Scanner(System.in);
        System.out.println("Irj be valamit.");
        String had = scanner_in.nextLine();

        //System.out.println("");
        System.out.println(had);

        scanner_in.close();
*/
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
/*
        String asd00 = "Hanlo hanlo";
        String asd02 = "Hanlo Sadasdasd";
        double asd01 = 89.2213124;
        System.out.printf("%s\n\tEz mar az%s\n\t %.2f", asd00, asd02,asd01);
        */
        user_character Char_0 = new user_character("Bela", "man", "wizzard", 178.9, 79.4);
        Char_0.printChar();

        Char_0.printPoz();
        Char_0.setPoz(23.4, 456.81, 12.5672);
        Char_0.printPoz();

        Char_0.setChar("Ez masik nev", "woman", "Warrior", 198.2, 81.0);
        Char_0.printChar();
        
        ///Users/andrasbors/Documents/vscode/java/filek/test.txt
        String txt_path = "/Users/andrasbors/Documents/vscode/java/filek/test.txt";
        filestream fs = new filestream();
        fs.printFile(txt_path);

        double res = 0.0;
        calculator calc = new calculator(45.6,23.4);
        calc.printVars();
        res = calc.plus(45.6, 23.4);
        res = calc.minus(45.6, 23.4);
        res = calc.division(45.6, 3.5);
        res = calc.multi(45.6, 23.4);
        res = calc.pow(17.8, 3);

        String mw0_title = "Elso";
        int asdx = 600;
        int asdy = 600;
        MainWindow mw = new MainWindow(mw0_title, asdx, asdy);
        mw.setVisible(true);
    }

    public static void blabla(String str_in){
        System.out.println(str_in);
        System.out.println("Ez is onnan van.");
    }
}