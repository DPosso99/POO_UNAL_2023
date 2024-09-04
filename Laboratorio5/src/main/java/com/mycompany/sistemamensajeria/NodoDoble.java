/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemamensajeria;



/**
 *
 * @author David
 */
public class NodoDoble {
    private Usuario data;
    private NodoDoble next;
    private NodoDoble prev;

    public NodoDoble(Usuario data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public Usuario getData() {
        return data;
    }

    public void setData(Usuario data) {
        this.data = data;
    }

    public NodoDoble getNext() {
        return next;
    }

    public void setNext(NodoDoble next) {
        this.next = next;
    }

    public NodoDoble getPrev() {
        return prev;
    }

    public void setPrev(NodoDoble prev) {
        this.prev = prev;
    }
}
