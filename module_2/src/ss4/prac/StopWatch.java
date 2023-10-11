package ss4.prac;

import java.util.Arrays;

public class StopWatch {
    private long startTime;
    private long endTime;

    StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public long getEndTime() {
        return endTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void end() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }

    public static void main(String[] args) {
        int[] random = new int[100_000];
        for (int i = 0; i < random.length; i++) {
            random[i] = (int) Math.floor(Math.random() * 100_000);
        }
        StopWatch stopWatch = new StopWatch();

        int min;
        int min_index;
        int temp;

        stopWatch.start();
        for (int i = 0; i < random.length; i++) {
            min_index = i;
            min = random[i];
            for (int j = i + 1; j < random.length; j++) {
                if (min > random[j]) {
                    min = random[j];
                    min_index = j;
                }
            }
            temp = random[i];
            random[i] = random[min_index];
            random[min_index] = temp;
        }
        stopWatch.end();
//        System.out.println(Arrays.toString(random));
        System.out.println("Selection sorting takes: " + stopWatch.getElapsedTime() + " ms");
    }
}
