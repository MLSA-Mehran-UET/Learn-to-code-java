public class ConcurrencyHandlingDemo extends Thread{

    private static int sharedResource = 0;

    public static void main(String[] args) {
        ConcurrencyHandlingDemo thread = new ConcurrencyHandlingDemo();
        thread.start();
        while(thread.isAlive()) {
            System.out.println("Thread is not finished yet");
        }
        System.out.println(sharedResource);
        sharedResource++;
        System.out.println(sharedResource);
    }

    public void run() {
        sharedResource++;
    }

}
