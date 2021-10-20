package task14;

import java.util.List;
import java.util.Random;

public class Writer implements Runnable {
    Random random = new Random();
    List<Integer> list;

    public Writer(List<Integer> input) {
        list = input;
    }

    @Override
    public void run() {
        while (true) {
            int numRandom = random.nextInt();
            list.add(numRandom);
            try {
                Thread.sleep(2500);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }
    }
}