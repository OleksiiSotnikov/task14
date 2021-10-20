package task14;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>();
        input.add(5);
        input.add(9);
        input.add(13);
        Runnable first = new Reader(input);
        Runnable second = new Writer(input);
        Thread threadFirst = new Thread(first);
        Thread threadSecond = new Thread(second);
        threadFirst.start();
        threadSecond.start();
    }
}
