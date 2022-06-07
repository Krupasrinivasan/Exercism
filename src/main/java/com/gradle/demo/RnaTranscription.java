package com.gradle.demo;

import java.util.HashMap;
import java.util.Map;
public class RnaTranscription {

    String transcribe(String dnaStrand) {

        Map<Character, Character> mapping = new HashMap<>();

        mapping.put('C', 'G');
        mapping.put('G', 'C');
        mapping.put('A', 'U');
        mapping.put('T', 'A');

        StringBuilder res = new StringBuilder();

        for (Character i : dnaStrand.toCharArray()) {
            res.append(mapping.get(i));
        }
        return res.toString();
    }
    public static void main(String args[])
    {
        RnaTranscription rnaTranscription = new RnaTranscription();
        System.out.println(rnaTranscription.transcribe("A"));
    }
}
