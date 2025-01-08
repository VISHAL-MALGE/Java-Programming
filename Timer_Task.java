//   task that can be scheduled to run at a specific time

//   Timer : A utility class that schedules and executes a task.

//   TimerTask : a task that will be executed by the Timer.


import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Timer_Task {
    public static void main(String[] args){

        Timer timer = new Timer();


        TimerTask task = new TimerTask() {
            int counter = 10; // Counter initialized to 10
            @Override
            public void run() {

                if( counter > 0){
                    System.out.println(counter + " Sec");
                    counter--;
                }
                else {
                    System.out.println("Happy New Year..! :)");
                    timer.cancel();   // Cancels all scheduled tasks once the countdown ends
                }
            }

        };
//        timer.schedule(task, 3000);


        Calendar date = Calendar.getInstance();
        date.set(Calendar. YEAR, 2024);
        date.set(Calendar. MONTH, Calendar.DECEMBER);
        date.set(Calendar. DAY_OF_MONTH, 31);
        date.set(Calendar. HOUR_OF_DAY, 23);
        date.set(Calendar. MINUTE, 59);
        date.set(Calendar. SECOND, 50);
        date.set(Calendar. MILLISECOND, 0);


//        timer.schedule(task,0);
//        timer.schedule(task, date.getTime());
//        timer.scheduleAtFixedRate(task,0,1000);
        timer.scheduleAtFixedRate(task,date.getTime(),1000);

    }
}
