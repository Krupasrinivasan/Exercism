package com.gradle.demo;

public class Lasagna {
    static int expected=40;
    public int expectedMinutesInOven()
    {
        return Lasagna.expected;
    }
    public int remainingMinutesInOven(int min)
    {
        return Lasagna.expected-min;
    }
    public int preparationTimeInMinutes(int min)
    {
        return min*2;
    }
    public int totalTimeInMinutes(int layer, int min)
    {
        int result=(layer*2)+min;
        return result;
    }
    public static void main(String rgs[])
    {
        Lasagna lasagna = new Lasagna();
        System.out.println(lasagna.expectedMinutesInOven());
        System.out.println(lasagna.remainingMinutesInOven(30));
        System.out.println(lasagna.preparationTimeInMinutes(2));
        System.out.println(lasagna.totalTimeInMinutes(3, 20));
    }
}

