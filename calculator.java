public class calculator {
    //variables
    private double var_0;
    private double var_1;

    public calculator(double in_0, double in_1){
        this.var_0 = in_0;
        this.var_1 = in_1;
        System.out.println("[+] calculator constructor called.");
    }

    public double get_var_0(){
        return this.var_0;
    }

    public double get_var_1(){
        return this.var_1;
    }

    public void setVars(double qwe0, double qwe1){
        this.var_0 = qwe0;
        this.var_1 = qwe1;
    }

    public void printVars(){
        System.out.printf("The variables of calculator: %.2f, %.2f.\n",this.var_0, this.var_1);
    }

    public double plus(double p0, double p1){
        double res_p = p0+p1;
        System.out.printf("+ -> = %.3f\n",res_p);
        return res_p;
    }

    public double minus(double m0, double m1){
        double res_m = m0 - m1;
        System.out.printf("- -> = %.3f\n",res_m);
        return res_m;        
    }

    public double division(double d0, double d1){
        double res_d = d0/d1;
        System.out.printf("/ -> = %.3f\n",res_d);
        return res_d;
    }

    public double multi(double mu0, double mu1){
        double res_mu = mu0*mu1;
        System.out.printf("* -> = %.3f\n",res_mu);
        return res_mu;
    }

    public double pow(double p0, int p1){
        double res_p = p0;
        while(p1 > 1){
            res_p = res_p*p0;
            p1--;
        }

        System.out.printf("** -> %.3f\n",res_p);
        return res_p;
    }

    
}
