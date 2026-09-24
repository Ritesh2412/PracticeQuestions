package org.example.collectionFramework.listInterface.arraylists.questions;

import java.util.ArrayList;
import java.util.List;

public class LargestElement {
    public static void main(String[] args) {


        List<Integer> numbers= new ArrayList<>();
        numbers.add(2);
        numbers.add(-11);
        numbers.add(7);
        numbers.add(-19);
        numbers.add(1);

        int largest=numbers.get(0);
        for(int number: numbers){
            if(number>largest){
                largest=number;
            }
        }
        System.out.println(largest);
    }
}
