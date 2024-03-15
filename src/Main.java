


public class Main {
    public static void main(String[] args) {

        try{
            int i = 2;
            int j = 20;
            int x = i/j;
            System.out.println(x);
            if(x==0)
                throw new ArithmeticException();
        }catch (ArithmeticException e){
            System.out.println("Making default o/p");
        }

        System.out.println("Bye");

    }
}