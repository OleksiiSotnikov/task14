package task14_2;

import java.util.Arrays;

public class Thread implements Runnable {
    String[] mass = new String[20000000];

    @Override
    public void run() {
        for (int i = 0; i < mass.length; i++) {
            Main.inputMass(mass, i);
        }
//        System.out.println(Arrays.toString(mass));
        System.out.println(mass);
    }
}