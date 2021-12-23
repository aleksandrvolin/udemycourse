package com.another_excercice;

import java.util.*;

public class First {



    public static void add(){
        List<String> groceryList = new ArrayList<String>();
        groceryList.add("Red");
        groceryList.add("Green");
        groceryList.add("Orange");
        groceryList.add("White");
        groceryList.add("Black");
        System.out.println(groceryList);

        groceryList.add(0, "Pink");
        groceryList.add(5, "Purple");
        System.out.println(groceryList);
        System.out.println(groceryList.get(0));
        System.out.println(groceryList.get(6));

        groceryList.set(0, "Yellow");
        System.out.println(groceryList);
        groceryList.remove(2);
        System.out.println(groceryList);

        int position = 0;
        String findValue = "Purple";
        for(int i = 0; i < groceryList.size();i++){
            if(groceryList.contains(findValue)){
                position = i;
            }
        }
        System.out.println(position);

        Collections.sort(groceryList);
        System.out.println(groceryList);

        Collections.shuffle(groceryList);
        System.out.println(groceryList);

        Collections.reverse(groceryList);
        System.out.println(groceryList);

        List<String> subList = groceryList.subList(0,3);
        System.out.println(subList);

        ArrayList<String> connect = new ArrayList<>();
        for(String e: groceryList){
            connect.add(subList.contains(e) ? "Yes" : "No");
        }
        System.out.println(connect);

        Collections.swap(groceryList, 0, 3);
        System.out.println(groceryList);

    }
}
