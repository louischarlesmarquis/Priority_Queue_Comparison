/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.comp352_a2;

public abstract class MyPQ<K extends Comparable, V>
{
    protected MyContainer<Pairs<K, V>> container;

    public void insert(K key, V val)
   {
        container.insert(new Pairs(key, val));
    }


    public Pairs<K, V> min()
   {
        return container.min();
    }


    public Pairs<K, V> removeMin()
   {
        return container.removeMin();
    }

    public int size()
   {
        return container.getSize();
    }

    public boolean isEmpty()
   {
        return container.isEmpty();
    }
}
