import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = null;
        try{
             bf = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter a number :: ");

            int num = Integer.parseInt(bf.readLine());
            System.out.println(num);
        }
        finally {
            bf.close();
        }

    }
}