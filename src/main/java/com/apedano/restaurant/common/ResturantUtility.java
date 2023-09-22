package com.apedano.restaurant.common;

import java.util.Random;

public class ResturantUtility {

    private static final Random RANDOM = new Random();
    public static void sleepRandomSeconds(int minDuration, int maxDuration) {
        long randomDurationSeconds = minDuration + RANDOM.nextInt(maxDuration - minDuration + 1);
        try {
            Thread.sleep(randomDurationSeconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}
