package ThreadsExample;

public class RunnableThreadTwo implements Runnable {
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
