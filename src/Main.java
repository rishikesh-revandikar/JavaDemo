import NewCodes.Screwdriver;
import NewCodes2.Computer;
import NewCodes2.Desktop;
import NewCodes2.Devloper;
import NewCodes2.Laptop;

public class Main {
    public static void main(String[] args) {

        Screwdriver s = new Screwdriver();

        s.useTools();

        //interface

//        Computer c = new Laptop();
        Computer c = new Desktop();
        Devloper d = new Devloper();

        d.devApp(c);


    }
}