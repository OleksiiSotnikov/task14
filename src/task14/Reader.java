package task14;

import java.time.LocalDate;
import java.util.List;

public class Reader implements Runnable {
    List<Integer> list;

    public Reader(List<Integer> input) {
        list = input;
    }

    @Override
    public void run() {
        while (true) {
            if (list.isEmpty()) {
                LocalDate localDate = LocalDate.now();
                System.out.println("The list is empty " + localDate);
            } else {
                System.out.println(list);
                list.clear();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }
    }
}
