package com.gradle.demo;


public class BirdWatcher {
    private final int[] birdsPerDay;

    public  BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int a[]={0,2,5,3,7,8,4};
        return a;
    }

    public int getToday() {
        try {
            return this.birdsPerDay[this.birdsPerDay.length - 1];
        } catch (Exception e) {
            return 0;
        }
    }

    public int incrementTodaysCount() {
        int count=++this.birdsPerDay[this.birdsPerDay.length - 1];
        return count;
    }

    public boolean hasDayWithoutBirds() {
        int i;
        for(i=0;i<this.birdsPerDay.length;i++)
        {
            if(this.birdsPerDay[i]==0)
            {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int i,sum=0;
        for(i=0;i<this.birdsPerDay.length;i++)
        {
            sum=sum+this.birdsPerDay[i];
            if(i==numberOfDays-1)
            {
                break;
            }
        }
        return sum;
    }

    public int getBusyDays() {
        int i,no=0;
        for(i=0;i<this.birdsPerDay.length;i++)
        {
            if(this.birdsPerDay[i]>=5)
            {
                no++;
            }
        }
        return no;
    }
    public static void main(String args[])
    {
        int[] birdsPerDay = { 1, 2, 5, 3, 7, 8, 4 };
        BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
        //System.out.println(birdCount.getLastWeek());
        int a[]=birdCount.getLastWeek();
        int i;
        for(i=0;i<a.length-1;i++) {
            System.out.print(a[i]+",");
        }
        System.out.println(a[i]);
        System.out.println(birdCount.getToday());
        System.out.println(birdCount.incrementTodaysCount());
        System.out.println(birdCount.hasDayWithoutBirds());
        System.out.println(birdCount.getCountForFirstDays(4));
        System.out.println(birdCount.getBusyDays());
    }
}

