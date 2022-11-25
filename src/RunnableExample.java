public class RunnableExample implements Runnable{


    @Override
    public void run() {

        while (true) {
            try {
                Thread.sleep(1000);
                System.out.println("Runnable Example");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
