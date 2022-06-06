/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.comp352_a2;


public class Pairs<K extends Comparable, V> implements Comparable
{
    public K first;
    public V second;


    public Pairs(K keySet, V valSet)
   {
        first = keySet;
        second = valSet;
    }

    public Pairs()
   {
        this(null, null);
    }


    public int compareTo(Object that)
   {
        if(that == null || that.getClass() != Pairs.class)
       {
            // put negative
            return -1;
        }

        Pairs<K, V> thatObj = (Pairs<K, V>)that;
        return first.compareTo(thatObj.first);
    }


    public String toString()
   {
        return "(" + first.toString() + ", " + second.toString() + ")";
    }


    public boolean equals(Object that)
   {
        if(that.getClass() != Pairs.class)
       {
            return false;
        }

        Pairs<K, V> thatPair = (Pairs)that;
        return first.equals(thatPair.first) && second.equals(thatPair.second);
    }
}
