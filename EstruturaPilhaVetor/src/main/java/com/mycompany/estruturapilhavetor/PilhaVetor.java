
package com.mycompany.estruturapilhavetor;

public class PilhaVetor { //classe
    private Integer[] dados; //vetor para armazenar os elementos na pilha
    private int qt; //quantidade de elementos na pilha 

public PilhaVetor(int tamanho){ //método de uma classe de pilha
 this.dados = new Integer[tamanho]; //criação de uma pilha vazia
 this.qt = 0;
}

boolean ehVazia(){
    if (qt == 0)
        return true;
    return false;
}

void empilha(int valor){//método inserir um elemento no topo (PUSH / EMPILHA)
 if (this.qt != this.dados.length){
    this.dados[qt] = valor;
    this.qt++;
 }
}

Integer desempilha(){//método remover um elemento do topo (POP / DESEMPILHA)
  if (!ehVazia()){
    int valor = this.dados[qt - 1];
    this.qt--;
    return valor;
 }
    return null;
}

void imprimePilha(){
    for (int i = 0; i < this.qt; i++)
        System.out.println(this.dados[i] + " ");
        System.out.println();
}

}
