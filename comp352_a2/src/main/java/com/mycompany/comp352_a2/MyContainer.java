/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.comp352_a2;

public interface MyContainer<T> extends Comparable
{

    public void insert(T obj);


    public int getSize();


    public boolean isEmpty();


    public T remove(int remIdx);


    public T get(int idx);


    public int find(T obj);


    public T min();


    public T removeMin();
}
