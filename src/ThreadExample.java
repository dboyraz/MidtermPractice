public class ThreadExample extends Thread{

    @Override
    public void run() {

        while (true) {
            try {
                Thread.sleep(1000);
                System.out.println("Thread Example");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }


}
