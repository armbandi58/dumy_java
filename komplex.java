/*import java.lang.FdLibm.Pow;

import org.graalvm.compiler.core.common.type.ArithmeticOpTable.UnaryOp.Sqrt;
*/
import java.lang.Math;

public class komplex {
    //variables
    private double Im, Re;

    public komplex(double asd0, double asd1){
        this.Re = asd0;
        this.Im = asd1;
        System.out.println("[+] Komplex constructor called.");
    }

    public double getIm(){
        return Im;
    }

    public double getRe(){
        return Re;
    }

    public void setVar(double Re, double Im){
        this.Re = Re;
        this.Im = Im;
    }

    public void printVar(){
        System.out.println("Value of real and imaginar is: "+this.Re+", "+this.Im);
    }

    public void printAbs(){
        double value_abs = Math.sqrt(Math.pow(this.Im,2)+Math.pow(this.Re,2));
        System.out.printf("Abs. value: %.2f",value_abs);
    }

    public void printDegree(){
        double var_lol = this.Im/this.Re;
        double var_degre = Math.atan(var_lol)*(180/Math.PI);
        //System.out.println("Szog: "+var_degre);
        System.out.printf("Szog: %.2f\n",var_degre);
    }
}
