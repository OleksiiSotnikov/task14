package task14_2;

import java.util.Arrays;

public class Threads implements Runnable {
    String[] mass = new String[20000000];
    int max, min;

    public Threads(int max, int min) {
        this.max = max;
        this.min = min;
    }

    @Override
    public void run() {
        for (int i = min; i < max; i++) {
            Main.inputMass(mass, i);
        }
//        System.out.println(Arrays.toString(mass));
        System.out.println(mass);
    }
}