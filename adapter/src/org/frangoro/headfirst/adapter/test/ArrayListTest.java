package org.frangoro.headfirst.adapter.test;

import org.frangoro.headfirst.adapter.bean.*;
import org.frangoro.headfirst.adapter.client.ArrayListEnumerator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Enumeration;

public class ArrayListTest {
    public static void main (String[] args) {
        ArrayList<Duck> arrayList = new ArrayList();
        arrayList.add(new MallardDuck());
        ArrayListEnumerator list = new ArrayListEnumerator(arrayList);
        Enumeration<Duck> enumerator = list.enumerator();

        while (enumerator.hasMoreElements()) {
            enumerator.nextElement().quack();
        }
    }
}
