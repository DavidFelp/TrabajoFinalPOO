/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class DIGITAL {
    private double NUM;
    private double NUM1;
     private String Signo;

   

    public DIGITAL(double NUM, double NUM1, String Signo) {
        this.NUM = NUM;
        this.NUM1 = NUM1;
        this.Signo = Signo;
    }
     
    

    public DIGITAL(double NUM) {
        this.NUM = NUM;
       
    }

    public DIGITAL(String Signo) {
        this.Signo = Signo;
    }

    public double getNUM() {
        return NUM;
    }

    public void setNUM(double NUM) {
        this.NUM = NUM;
    }

    public double getNUM1() {
        return NUM1;
    }

    public void setNUM1(double NUM1) {
        this.NUM1 = NUM1;
    }

    public String getSigno() {
        return Signo;
    }

    public void setSigno(String Signo) {
        this.Signo = Signo;
    }
    
    
    
   
    
    public double operacion()
    {
        double operacion= 0.0;
    switch(Signo)
    {
        case "+" :  operacion= NUM+NUM1;
     break;
        case "-" : operacion = NUM-NUM1;
        break;
        case "*" : operacion = NUM*NUM1;
        break;
        case "/" : operacion = NUM/NUM1;
        break;
    
    }
    
    
    return operacion;
    }
   
    
    
   
    
}
