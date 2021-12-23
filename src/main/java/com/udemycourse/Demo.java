package com.udemycourse;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        placesToVisit.add("Sydney");
        addInOrder(placesToVisit, "Melbourne");
        addInOrder(placesToVisit, "Brisbane");
        addInOrder(placesToVisit,"Perth");
        addInOrder(placesToVisit,"Canberra");
        addInOrder(placesToVisit, "Darwin");
        addInOrder(placesToVisit,"Adelaide");
        printList(placesToVisit);

        addInOrder(placesToVisit, "Alice Spring");
        addInOrder(placesToVisit, "Darwin");
        printList(placesToVisit);


    }

    private static void printList(LinkedList<String> placesToVisit) {
        Iterator<String> i =placesToVisit.iterator();
        while ((i.hasNext())){
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("==================");

    }

    private static  boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison ==0){
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if(comparison>0){
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if(comparison<0){
                //move on next city
            }
        }
        stringListIterator.add(newCity);
        return true;

    }
}
