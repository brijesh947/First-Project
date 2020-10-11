public class javaSynchronization extends Thread {
    int amount = 1000;

    synchronized public void Withdraw(int amount) {
        System.out.println("Withdraw process is started");
        if (this.amount < amount) {
            System.out.println("not Enough balance ");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("After Deposit");
        this.amount -= amount;
        System.out.println("Transaction Completed , remaining Balance " + this.amount);
    }

    synchronized public void Deposit(int amount) {
        System.out.println("Deposit Process is started");
        this.amount += amount;
        System.out.println("updated balance is " + this.amount);
        notify();
    }

    public static void main(String[] args) {
        javaSynchronization javasynchronization = new javaSynchronization();
        Thread thread = new Thread(() -> javasynchronization.Withdraw(1100));
        thread.start();
        Thread thread1 = new Thread(() -> javasynchronization.Deposit(500));
        thread1.start();
    }
}
