package com.gradle.demo;

import java.util.*;
class TwelveDays {

    public static String verse(int verseNumber) {
        HashMap<Integer,String> value = new HashMap<>();
        value.put(1,"On the first day of Christmas my true love gave to me:"+" a Partridge in a Pear Tree.\n");
        value.put(2,"On the second day of Christmas my true love gave to me:"+" two Turtle Doves, and a Partridge in a Pear Tree.\n");
        value.put(3,"On the third day of Christmas my true love gave to me:"+" three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
        value.put(4,"On the fourth day of Christmas my true love gave to me:"+" four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
        value.put(5,"On the fifth day of Christmas my true love gave to me:"+" five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
        value.put(6,"On the sixth day of Christmas my true love gave to me:"+" six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
        value.put(7,"On the seventh day of Christmas my true love gave to me:"+" seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
        value.put(8,"On the eighth day of Christmas my true love gave to me:"+" eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
        value.put(9,"On the ninth day of Christmas my true love gave to me:"+" nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
        value.put(10,"On the tenth day of Christmas my true love gave to me:"+" ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
        value.put(11,"On the eleventh day of Christmas my true love gave to me:"+" eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
        value.put(12,"On the twelfth day of Christmas my true love gave to me:"+" twelve Drummers Drumming, eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
        return value.get(verseNumber);
    }

    String verses(int startVerse, int endVerse) {
        StringBuilder sb = new StringBuilder();
        for (int i = startVerse; i < endVerse; i++) {
            sb.append(String.format("%s\n", this.verse(i)));
        }
        sb.append(String.format("%s", this.verse(endVerse)));
        return sb.toString();
    }
    String sing() {
        return this.verses(1, 12);
    }
    public static void main(String args[])
    {
        TwelveDays obj=new TwelveDays();
        System.out.println(obj.verse(3));
        System.out.println(obj.verses(1,3));
        System.out.println(obj.sing());
    }
}

