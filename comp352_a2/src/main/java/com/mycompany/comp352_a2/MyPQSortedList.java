/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.comp352_a2;

public class MyPQSortedList<K extends Comparable, V> extends MyPQ<K, V>
{
    public MyPQSortedList()
   {
        container = new SortedLinkedList<Pairs<K, V>>();
    }
}
