import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args){

        Timer timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {
             @Override
             public void run() {
                  var currentTime = new Date();
                  var time = currentTime.getHours() + ":"
                               + currentTime.getMinutes() + ":"
                               + currentTime.getSeconds();
                  System.out.println("Обновление времени каждую секунду - " + time);
             }
        }, 0, 1000);

        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                var currentTime = new Date();
                var time = currentTime.getHours() + ":"
                        + currentTime.getMinutes() + ":"
                        + currentTime.getSeconds();
                System.out.println("Обновление времени каждые 5 секунд - " + time);
            }
        }, 0, 5000);


        SevenSeconds sevenSeconds = new SevenSeconds(timer);

        sevenSeconds.start();

    }
}

