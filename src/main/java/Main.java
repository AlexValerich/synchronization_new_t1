public class Main {
    public static void main(String[] args) {
        final CarShowroom carShowroom = new CarShowroom();
        // ���� �� ���������
        Runnable shopping = carShowroom::buySomething;
        new Thread(null, shopping, "���������� 1").start();
        new Thread(null, shopping, "���������� 2").start();
        new Thread(null, shopping, "���������� 3").start();
    }
}
