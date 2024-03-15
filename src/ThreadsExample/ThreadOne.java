package ThreadsExample;

public class ThreadOne extends Thread {
    public void run(){
        for(int i = 0; i < 100; i++){
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
