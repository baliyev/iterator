/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

/**
 *
 * @author bilan
 */
public class Main {

    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<String>();
//        Vector<String> list3 = new Vector<String>();
//        Collection<String> test = Collections.synchronizedCollection(new ArrayList<String>());
//        LinkedList<String> list2 = new LinkedList<String>();

        MyArrayList list = new MyArrayList();
        list.add("test");
        list.add("test2");
        list.add("test2");
        list.add("test2");
        list.add("test2");
        
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
        
        Iterator iter = list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

//        LinkedList<String> list2 = new LinkedList<>();
//        list2.add("test3");
//        list2.add("test3");
//        list2.add("test3");
//        list2.add("test3");
//
//        for (String element : list2) {
//            System.out.println(element);
//        }
    }
}
