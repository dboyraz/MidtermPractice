public class Main {

    public static void main(String[] args){

        RunnableExample runnableExample = new RunnableExample();
        ThreadExample threadExample = new ThreadExample();

        Thread t1 = new Thread(runnableExample);

        threadExample.start();
        t1.start();


    }
}
