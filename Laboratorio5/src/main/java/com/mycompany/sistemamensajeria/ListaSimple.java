/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemamensajeria;

/**
 *
 * @author David
 */
public class ListaSimple {
    private NodoSimple head;
    private int size;

    public ListaSimple() {
        this.head = null;
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Usuario data) {
        NodoSimple newNode = new NodoSimple(data);
        newNode.setNext(head);
        head = newNode;
        size++;
    }

    public void addLast(Usuario data) {
        NodoSimple newNode = new NodoSimple(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            NodoSimple temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(newNode);
        }
        size++;
    }

    public void printList() {
        NodoSimple temp = head;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }
}


