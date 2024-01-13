/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

public class MiLista<T> {
    private Nodo<T> inicio;
    private int tamaño;

    private static class Nodo<T> {
        private T elemento;
        private Nodo<T> siguiente;

        public Nodo(T elemento) {
            this.elemento = elemento;
            this.siguiente = null;
        }
    }

    public MiLista() {
        this.inicio = null;
        this.tamaño = 0;
    }

    public void agregar(T elemento) {
        Nodo<T> nuevoNodo = new Nodo<>(elemento);
        if (inicio == null) {
            inicio = nuevoNodo;
        } else {
            Nodo<T> actual = inicio;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
        tamaño++;
    }

    public int tamaño() {
        return tamaño;
    }

public T obtener(int indice) {
    if (indice < 0 || indice >= tamaño) {
        System.out.println("Índice fuera de rango");
        return null;
    }
    Nodo<T> actual = inicio;
    for (int i = 0; i < indice; i++) {
        actual = actual.siguiente;
    }
    return actual.elemento;
}

    public void imprimirLista() {
    Nodo<T> actual = inicio;
    while (actual != null) {
        System.out.println(actual.elemento);
        actual = actual.siguiente;
    }
}

    public Nodo<T> getInicio() {
        return inicio;
    }

    public void setInicio(Nodo<T> inicio) {
        this.inicio = inicio;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    
}

