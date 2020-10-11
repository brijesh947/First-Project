public class ThreadProject extends Thread{
    @Override
    public void run() {
        System.out.println("Hello I'm thread");
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
     ThreadProject threadProject = new ThreadProject();
     Thread thread = new Thread(threadProject);
     thread.start();
     Thread thread1 = new Thread(() -> {
         System.out.println("Hello i'm Anonymous Thread bsdk");
         System.out.println(Thread.currentThread().getName());
     });
     thread1.start();
    }
}
