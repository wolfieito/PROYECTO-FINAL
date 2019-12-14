

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author martin
 */
public class Lista<T> {

    private Nodo inicio;
    private Nodo fin;

    public Lista() {//asegurarse que inicio sea siempre nulo
        this.inicio = null;
        this.fin = null;
    }

    //devuelve true si la lista esta vacia
    public boolean isEmpty() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    //Agregar nodo al final de la lista
    public void add(Nodo nuevo) {//lo que recibe es el tipo de dato que queremos ordenar
        //primero verificar si la lista esta vacia
        if (isEmpty()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            /*Nodo Temp=inicio;
             while(Temp.getSiguiente() != null){
             Temp=Temp.getSiguiente();
             }
             Temp.setSiguiente(nuevo);*/
            fin.setSiguiente(nuevo);//agregar el nodo al ultimo
            fin = nuevo;
        }
    }

    //imprimir lista
    public void print() {
        Nodo temp = inicio;
        while (temp != null) {//imprimir todos los valores de la lista
            System.out.print(temp.getValor() + " - ");
            temp = temp.getSiguiente();
        }
        System.out.println("");
    }

    //Contar numero de nodos
    public int size() {
        int iCont = 0;
        Nodo temp = inicio;
        while (temp != null) {
            iCont++;
            temp = temp.getSiguiente();
        }
        return iCont;
    }

    //Agregar al incio
    public void addBegin(Nodo nuevo) {
        if (isEmpty()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            nuevo.setSiguiente(inicio);//apunta el nuevo al primero
            inicio = nuevo;//el inicio apunta al nuevo
        }
    }

    public void insertAt(int pos, Nodo nuevo) throws Exception /*quien use el metodo insertAt es responsable de la excepcion*/ {
        int iTama = size();
        if ((pos < 0) || (pos >= iTama)) {
            throw new Exception("La posicion es invalida");//poner una excepcion, estudiar excepciones
        } else {
            if (pos == 0) {
                addBegin(nuevo);
            } else {
                Nodo temp = inicio;
                int iCont = 0;
                while (iCont != pos - 1) {
                    iCont++;
                    temp = temp.getSiguiente();
                }
                nuevo.setSiguiente(temp.getSiguiente());
                temp.setSiguiente(nuevo);
            }
        }
    }

    public void clear() {
        inicio = null;
        fin = null;
    }

    public void deleteAt(int pos) throws Exception {
        int iTama = size();
        //lista vacia
        if (isEmpty()) {
            throw new Exception("La lista esta vacia");
        }
        //posicion incorrecta
        if ((pos < 0) || (pos >= iTama)) {
            throw new Exception("La posicion es invalida");//poner una excepcion, estudiar excepciones
        } else {
            if (iTama == 1)//solo un nodo
            {
                clear();
            } else {//mas de un nodo
                if (pos == 0) {//revisar si quiere borrar el primero
                    inicio = inicio.getSiguiente();
                } else {
                    Nodo temp = inicio;
                    int iCont = 0;
                    while (iCont != pos - 1) {
                        iCont++;
                        temp = temp.getSiguiente();
                    }
                    temp.setSiguiente(temp.getSiguiente().getSiguiente());
                    if (pos == (iTama - 1)) {
                        fin = temp;
                    }
                }
            }
        }
    }

    public T /*almacena enteros entonces regresa enteros*/ getAt(int pos) {
        //implementar las verificaciones, lista vacia, posicion invalida, etc, la de delete
        Nodo temp = inicio;
        int iCont = 0;
        while (iCont != pos) {
            iCont++;
            temp = temp.getSiguiente();
        }
        return (T) temp.getValor();
    }
    public String print2(){
        String t = null;
            for (int i = 0; i < size(); i++) {
                t = t + "\n" + getAt(i);
            }
            String tt = t.substring(5);
            return tt;
    }

}
