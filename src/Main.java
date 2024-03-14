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

public class Main {
    public static void main(String[] args) {

        Calculator c = new Calculator(1,2);
        Calculator c1 = new Calculator(2,2);


    }
}