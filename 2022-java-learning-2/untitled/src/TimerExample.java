import java.util.Timer;
import java.util.TimerTask;

class MyTimerTask extends TimerTask {

    @Override
    public void run() {
        System.out.println("Running");
    }
}
public class TimerExample {

    public static void main(String[] args) {
        Timer timer = new Timer("MyTimer");
        timer.scheduleAtFixedRate(new MyTimerTask(), 0, 1000);
    }
}
