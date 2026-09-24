package org.example.collectionFramework.listInterface.arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Comparators {

    public static void main(String[] args) {

        List<String> words= Arrays.asList("Banana","Apple","Date");

        //ascending by size
        words.sort((a,b)-> a.length()-b.length());
        System.out.println(words);

        //Descending by size
        words.sort((a,b)-> b.length()-a.length());
        System.out.println(words);


        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);

        //ascending
        list.sort(null);
        System.out.println(list);

        //descending
        list.sort((a,b)-> b-a);
        System.out.println(list);
    }
}
