public class user_character{
    //Variables
    private String name;
    private String sex;
    private double height;
    private double width;
    private String var_class;
    private double poz_x;
    private double poz_y;
    private double poz_z;

    public user_character(String n, String s, String cl, double h, double w ){
        this.name = n;
        this.sex = s;
        this.height = h;
        this.width = w;
        this.var_class = cl;
        this.poz_x = 0.0;
        this.poz_y = 0.0;
        this.poz_z = 0.0;
        System.out.println("[+] Character class constructor called.");
    }

    public void printChar(){
        System.out.printf("Your character:\n\tName: %s,\n\tSex: %s,\n\tHeight: %.2f,\n\tWidth: %.2f,\n\tClass: %s.\n", 
        this.name, this.sex, this.height, this.width, this.var_class);
    }

    public void setPoz(double tmp_x, double tmp_y, double tmp_z){
        this.poz_x = tmp_x;
        this.poz_y = tmp_y;
        this.poz_z = tmp_z;
        System.out.println("[+] Poz updated.");
    }

    public void printPoz(){
        System.out.printf("%s char actual poz:\n\tX: %.3f,\n\tY: %.3f,\n\tZ: %.3f.\n", 
        this.name, this.poz_x, this.poz_y, this.poz_z);
    }

    public void setChar(String n1, String s1, String cl1, double h1, double w1){
        this.name = n1;
        this.sex = s1;
        this.height = h1;
        this.width = w1;
        this.var_class = cl1;
        System.out.println("[+] Character property setted.");
    }

}