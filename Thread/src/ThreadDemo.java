public class ThreadDemo {

    public static void main(String[] args) {
        FirstThread firstThread = new FirstThread();
        firstThread.start();

        SecondThread secondThread = new SecondThread();
        Thread thread = new Thread(secondThread);
        thread.start();
    }

}
