import NewCodes.Status;

public class Main {
    public static void main(String[] args) {

        Status []s = Status.values();

        for(Status x:s){
            System.out.println(x.ordinal());
        }


    }
}