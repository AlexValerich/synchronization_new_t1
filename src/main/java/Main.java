public class Main {
    public static void main(String[] args) {
        final CarShowroom carShowroom = new CarShowroom();
        // Идем за покупками
        Runnable shopping = carShowroom::buySomething;
        new Thread(null, shopping, "Покупатель 1").start();
        new Thread(null, shopping, "Покупатель 2").start();
        new Thread(null, shopping, "Покупатель 3").start();
    }
}
