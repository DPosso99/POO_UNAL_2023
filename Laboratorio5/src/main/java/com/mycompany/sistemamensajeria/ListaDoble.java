/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemamensajeria;

/**
 *
 * @author David
 */
public class ListaDoble {
    NodoDoble head;
    NodoDoble tail;
    private int size;

    public ListaDoble() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public NodoDoble getHead() {
        return head;
    }

    public void addFirst(Usuario data) {
        NodoDoble newNode = new NodoDoble(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        }
        size++;
    }

    public void addLast(Usuario data) {
        NodoDoble newNode = new NodoDoble(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
        }
        size++;
    }

    public void addAfter(NodoDoble node, Usuario data) {
        if (node != null) {
            NodoDoble newNode = new NodoDoble(data);
            NodoDoble nextNode = node.getNext();
            node.setNext(newNode);
            newNode.setPrev(node);
            if (nextNode != null) {
                newNode.setNext(nextNode);
                nextNode.setPrev(newNode);
            } else {
                tail = newNode;
            }
            size++;
        }
    }

    public void printList() {
        NodoDoble temp = head;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }
}
