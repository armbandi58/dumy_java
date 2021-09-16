import javax.swing.JFrame;

public class MainWindow extends JFrame{
    private String title;
    private int seize_x;
    private int seize_y;

    public MainWindow(String tit, int sx, int sy){
        super();
        setTitle(tit);
        setSize(sx,sy);
    }
}
