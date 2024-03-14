import NewCodes.Tools;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;

class Calculator {

    private int a;
    private  int b;

   public  Calculator(){
       System.out.println("Hello default");
   }

   public  Calculator(int a, int b){
       this.a = a;
       this.b  = b;
       System.out.println("Hello parameterized");
   }

}

class AdvancedCalc extends Calculator {

    public AdvancedCalc(){
        super(1,2);
        System.out.println("In advanced calc");
    }
}

public class Main {
    public static void main(String[] args) {

        AdvancedCalc a = new AdvancedCalc();

        Tools t = new Tools();


    }
}