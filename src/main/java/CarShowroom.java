import java.util.ArrayList;
import java.util.List;

public class CarShowroom {
    Seller seller = new Seller(this);
    List<Auto> auto = new ArrayList<>(10);

    public void buySomething() {
        // Критическая секция
        synchronized (seller) {
            System.out.println(Thread.currentThread().getName() + " покупает");
            // Процесс покупки. Эмулируем, приостанавливая поток
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " пошел домой");
        }
    }
}
