/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author martin
 */
public class Nodo<T>{
    private T valor;//valor que guarda
    private Nodo siguiente;//referencia a otro nodo

    public Nodo() {//constructor que pone el nodo en null
        siguiente = null;
    }

    public Nodo(T valor) {//hace que el valor se guarde y el siguiente se vuelve null
        this.valor = valor;
        siguiente = null;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
