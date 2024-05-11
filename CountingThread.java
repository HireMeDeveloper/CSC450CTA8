public class CountingThread extends Thread{
    private boolean isCountingUp = false;
    public CountingThread(boolean isCountingUp) {
        this.isCountingUp = isCountingUp;
    }

    public void run(){
        if (isCountingUp){
            for (int i = 1; i <= 20; i++) {
                System.out.println("Thread: " + Thread.currentThread().threadId() + ":"  + i);
            }
        } else {
            for (int i = 20; i >= 1; i--) {
                System.out.println("Thread: " + Thread.currentThread().threadId() + ":" + i);
            }
        }
    }
}
