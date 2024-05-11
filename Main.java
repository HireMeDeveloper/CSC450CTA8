// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        var t1 = new CountingThread(true);
        t1.start();
        t1.join();

        var t2 = new CountingThread(false);
        t2.start();
        t2.join();
    }
}