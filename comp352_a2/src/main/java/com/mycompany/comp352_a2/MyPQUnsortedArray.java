/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.comp352_a2;

public class MyPQUnsortedArray<K extends Comparable, V> extends MyPQ<K, V>
{
    // Simple - just substitute in for the container an Array

    public MyPQUnsortedArray(int initSize)
   {
        container = new array<Pairs<K, V>>(initSize);
    }

    public MyPQUnsortedArray()
   {
        this(0);
    }
}
