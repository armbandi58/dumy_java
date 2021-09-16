//import javax.swing.JFrame;
import javax.swing.*;
//import javax.swing.GroupLayout;
import java.awt.GridBagLayout;
import java.awt.*;


public class MainWindow extends JFrame{
    private String title;
    private int seize_x;
    private int seize_y;
    private boolean resize;
    private JPanel p = new JPanel();    //maga a frame
    //private GridBagLayout gbl = new GridBagLayout();
  
    public MainWindow(String tit, int sx, int sy, boolean v_res){
        super();
        setTitle(tit);
        setSize(sx,sy);
        setResizable(v_res);

        this.title = tit;
        this.seize_x = sx;
        this.seize_y = sy;
        this.resize = v_res;
    }

    public void printVars(){
        if(this.resize == true){
            System.out.printf("MW properties: %s, %d, %d, resizeable.\n",
            this.title, this.seize_x, this.seize_y);
        }else{
            System.out.printf("MW properties: %s, %d, %d, unresizeable.\n",
            this.title, this.seize_x, this.seize_y); 
        }
    }

    public String get_title(){
        return this.title;
    }

    public int get_seizex(){
        return this.seize_x;
    }

    public int get_seizey(){
        return this.seize_y;
    }

    public boolean get_resize(){
        return this.resize;
    }

    public void add_Label(String name_label){
        JLabel label_00 = new JLabel(name_label);
        this.p.add(label_00);
        this.add(this.p);
    }

    public void add_gbl(double gbl_cw, double gbl_rw){
        GridBagLayout gbl = new GridBagLayout();
        gbl.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0};
        gbl.rowWeights = new double[]{1.0, 0.0};
        this.p.setLayout(gbl);
    }

}
