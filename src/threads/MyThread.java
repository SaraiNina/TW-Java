package threads;

import java.beans.IntrospectionException;

public class MyThread extends Thread {

    @Override
    public void run() {
        int i;
        for (i = 0; i < 10; i++) ;
        System.out.println(i);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}



