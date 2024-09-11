
package com.mycompany.estruturadedados;

public class TesteLista {
    
    public static void main(String[] args) {
     
       ListaSequencial lista = new ListaSequencial(5);
       System.out.println("Lista vazia " + lista.vazia());
       
       lista.insere(7);
       lista.insere(10);
       lista.insere(15);
       lista.insere(20);
       lista.insere(25);
       
       lista.insere(6);
       lista.insere(88);
       
       lista.imprime();
       
       //int x = lista.removeInicio();
       //System.out.println("Removeu " + x);
       
       System.out.println("Tamanho" + " " + lista.getTamanho());
       
       lista.remove();
       lista.remove();
       lista.remove();
       lista.remove();
       lista.remove();
       
       //lista.redimensionar(10);
       
       //lista.insere(40);
       
       lista.imprime();
       System.out.println("Tamanho" + " " + lista.getTamanho());
       
       //=============================
        ListaSequencialGenerica<Integer> listaGen = new ListaSequencialGenerica<Integer>(5);
       System.out.println("Lista Generica vazia " + lista.vazia());
       
       listaGen.insere(117);
       listaGen.insere(1110);
       listaGen.insere(1115);
       listaGen.insere(1120);
       listaGen.insere(1125);
       
       listaGen.insere(116);
       listaGen.insere(1188);
       
       listaGen.imprime();
       
       //int x = lista.removeInicio();
       //System.out.println("Removeu " + x);
       
       System.out.println("Tamanho " + " " + lista.getTamanho());
       
       listaGen.remove();
       listaGen.remove();
       listaGen.remove();
       listaGen.remove();
       listaGen.remove();
       
       //lista.redimensionar(10);
       
       //lista.insere(40);
       
       listaGen.imprime();
       System.out.println("Tamanho" + " " + lista.getTamanho());
       
       
    }
}
