
package com.mycompany.estruturapilhavetor;

public class PilhaVetorGenerica<Item> { //classe
    private Item[] dados; //vetor para armazenar os elementos na pilha
    private int qt; //quantidade de elementos na pilha 

public PilhaVetorGenerica(int tamanho){ //método de uma classe de pilha
 this.dados = (Item[]) new Object[tamanho]; //
 this.qt = 0;
}

boolean ehVazia(){
    if (qt == 0)
        return true;
    return false;
}

void empilha(Item valor){//método inserir um elemento no topo (PUSH / EMPILHA)
 if (this.qt != this.dados.length){
    this.dados[qt] = valor;
    this.qt++;
 }
}

Item desempilha(){//método remover um elemento do topo (POP / DESEMPILHA)
  if (!ehVazia()){
    Item valor = this.dados[qt - 1];
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
