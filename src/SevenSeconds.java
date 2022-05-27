import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class SevenSeconds extends Thread{

    private final Timer timer;
    public SevenSeconds(Timer timer) {
        this.timer = timer;
    }

    @Override
    public void run() {


        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                var currentTime = new Date();
                var time = currentTime.getHours() + ":"
                        + currentTime.getMinutes() + ":"
                        + currentTime.getSeconds();
                System.out.println("Обновление времени каждые 7 секунд - " + time);
            }
        }, 0, 7000);
    }
}
