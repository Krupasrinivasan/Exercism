package com.gradle.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
class PythagoreanTripletCalculator {
    public List<PythagoreanTriplet> list;
    public List<Integer> integers = new ArrayList<>();

    public PythagoreanTripletCalculator(List<PythagoreanTriplet> list) {
        this.list = list;
    }

    public PythagoreanTripletCalculator withFactorsLessThanOrEqualTo(int i) {
        int num = 1;
        while (num < i) {
            integers.add(num);
            num += 1;
        }
        return this;
    }

    private boolean checkTriplet(int a, int b, int c) {
        return (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) ||
                Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2) ||
                Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2));
    }

    public PythagoreanTripletCalculator thatSumTo(int i) {
        HashSet<Integer> intSet = new HashSet<>(integers);
        for (int e = 0; e < integers.size() - 1; e++) {
            for (int f = e + 1; f < integers.size(); f++) {
                int e_val = integers.get(e);
                int f_val = integers.get(f);
                int needed = i - (e_val + f_val);
                if (intSet.contains(needed) && needed > f_val && f_val > e_val && checkTriplet(e_val, f_val, needed)) {
                    list.add(new PythagoreanTriplet(e_val, f_val, needed));
                }
            }
        }
        return this;
    }

    public List<PythagoreanTriplet> build() {
        List<PythagoreanTriplet> l = this.list.size() == 1 ? Collections.singletonList(this.list.get(0))
                : this.list.size() == 0 ? Collections.emptyList() : this.list;
        return l;
    }
}

public class PythagoreanTriplet {
    private int i, j, k;

    public PythagoreanTriplet(int i, int j, int k) {
        this.i = i;
        this.j = j;
        this.k = k;
    }

    public PythagoreanTriplet() {
    }

    public static PythagoreanTripletCalculator makeTripletsList() {
        return new PythagoreanTripletCalculator(new ArrayList<PythagoreanTriplet>());
    }

    @Override
    public String toString() {
        return this.i + " " + this.j + " " + this.k;
    }

    @Override
    public int hashCode() {
        return (this.i + "-" + this.j + "-" + this.k).hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        PythagoreanTriplet o = (PythagoreanTriplet) obj;
        return this.i == o.i && this.j == o.j && this.k == o.k;
    }
    public static void main(String args[])
    {
        int n=1000;
        List<PythagoreanTriplet> actual = PythagoreanTriplet.makeTripletsList().withFactorsLessThanOrEqualTo(n).thatSumTo(n).build();
        System.out.println(actual);
    }
}
