package task14_2;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        LocalDateTime startFirst = LocalDateTime.now();
        java.lang.Thread oneTread = new java.lang.Thread(new Thread());
        oneTread.start();
        oneTread.join();
        LocalDateTime endFirst = LocalDateTime.now();
        Duration durationOne = Duration.between(startFirst, endFirst);
        System.out.println("Next");

        int amountThread = 6;
        LocalDateTime startSecond = LocalDateTime.now();
        List<java.lang.Thread> thread = new ArrayList<>();
        int begin = 0;
        int iterator = 1000000;

        for (int i = 0; i < amountThread; i++) {
            thread.add(new java.lang.Thread(new Threads(begin, begin += iterator)));
            thread.get(i).start();
        }

        for (int i = 0; i < amountThread; i++) {
            thread.get(i).join();
        }

        LocalDateTime endSecond = LocalDateTime.now();
        Duration durationMany = Duration.between(startSecond, endSecond);
        long result = durationOne.toMillis() - durationMany.toMillis();

        System.out.printf("Один поток закончил работу за %d миллисекунд%n",
                durationOne.toMillis());
        System.out.printf("Много потоков закончили работу за %d миллисекунд%n",
                durationMany.toMillis());
        System.out.printf("Много потоков справились на %d миллисекунд быстрее%n",
                result);
    }

    static void inputMass(String[] mass, int i) {
        if (i % 5 == 0 && i % 3 == 0) {
            mass[i] = "FizzBuzz";
        } else if (i % 3 == 0) {
            mass[i] = "Fizz";
        } else if (i % 5 == 0) {
            mass[i] = "Buzz";
        } else {
            mass[i] = String.valueOf(i);
        }
    }
}