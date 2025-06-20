class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable 실행 중");

        for(int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(5000);

                System.out.println(i);
            } catch(InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());

        thread.setName("고장없이 잘 돌아가는 최슨 쓰레드");


        thread.start();

        System.out.println(thread.getName());
    }
}