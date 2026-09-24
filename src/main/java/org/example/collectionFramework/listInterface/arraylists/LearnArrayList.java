package org.example.collectionFramework.listInterface.arraylists;

import java.util.ArrayList;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {

        //syntax
        ArrayList<Integer> lists = new ArrayList<>();
        List<Integer> lis = new ArrayList<>();

        //add
        lists.add(1);
        lists.add(5);
        lists.add(80);

        System.out.println(lists);  //[1,5,80]

        //get
        System.out.println(lists.get(0)); //1
        System.out.println(lists.get(1)); //5

        //size
        System.out.println(lists.size()); //3

        //get all elements of arraylist
        for (int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i));  //1,5,80
        }

        for(int list: lists){
            System.out.println(list);  //1,5,80
        }

        //present or contain
        System.out.println(lists.contains(5));  //true
        System.out.println(lists.contains(50));  //false



        //remove
        lists.remove(2);
        for(int list: lists){
            System.out.println(list);  //1,5
        }


        //insert between elements
        lists.add(2,50);
        for(int list: lists){
            System.out.println(list);  //1,5,50,80
        }


        //replace an element
        lists.set(2,55);
        for(int list: lists){
            System.out.println(list);  //1,5,55
        }

    }
}
