/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Iterator;

/**
 *
 * @author bilan
 */
public class MyArrayList implements Iterable<String> {

    private String[] elementsArr = new String[1];
    private int size = 0;

    public void add(String element) {
        increaseCapacity();
        elementsArr[size++] = element;
    }

    public void increaseCapacity() {
        if (elementsArr.length == size) {
            String[] tempElementArr = new String[elementsArr.length + 1];
            for (int i = 0; i < elementsArr.length; i++) {
                tempElementArr[i] = elementsArr[i];
            }
            elementsArr = tempElementArr;
        }
    }

    public String get(int i) {
        return elementsArr[i];
    }

    public int size() {
        return size;
    }

    private Iterator<String> iterator = new Iterator() {
        int i = 0;

        @Override
        public boolean hasNext() {
            return (i < size && elementsArr[i] != null);
        }

        @Override
        public Object next() {
            return elementsArr[i++];
        }
    };

    @Override
    public Iterator<String> iterator() {

        return this.iterator;
    }
}
