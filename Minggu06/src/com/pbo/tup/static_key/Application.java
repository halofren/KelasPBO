package com.pbo.tup.static_key;

public class Application {

    public final static String APP_NAME = "Belajar Java Application";

    public final static int PROCESSORS;

    static {
        PROCESSORS = Runtime.getRuntime().availableProcessors();
    }

    public static int sum(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

}
