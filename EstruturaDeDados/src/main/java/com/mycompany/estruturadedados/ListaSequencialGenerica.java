
package com.mycompany.estruturadedados;

public class ListaSequencialGenerica<Item> {
    private int quantidade;
    private Item [] dados; //fazendo isso, eu posso receber NULL, principalmente quando tem valores negativos. Esse NULL entra no lugar do return -1.
    
    public ListaSequencialGenerica(int tam){
        dados = (Item[])new Object[tam];
    }
        
    public boolean vazia(){
        return this.quantidade == 0;
    }            
       
    public int getTamanho(){
    return  this.dados.length;
    }
    
public void redimensionar (int max){
    
    Item temp[] = (Item[])new Object[max];
    for (int i = 0; i < this.quantidade; i++){
        temp[i] = this.dados[i];
    }
    
    this.dados = temp;
}
    
//QUANDO ESTIVER LOTADO EU VOU REDIMENSIONAR
    public void insere(Item n){
        if (dados.length == quantidade){//SE O VETOR ESTÁ CHEIO, REDIMENSIONA x2
           redimensionar(dados.length * 2);
        }
        dados[quantidade] = n;
        quantidade++;
    }
      
    
    public void imprime(){
        for (int i= 0; i < this.quantidade; i++)
            System.out.print(dados[i] + " -> ");
        System.out.println();
    }
     
    public Item removeInicio(){
        if (this.quantidade > 0){
            Item n = dados[0];
            this.quantidade--;
            
            for (int i = 1; i <= quantidade; i++){
                dados[i-1] = dados[i];                
            }        
            return n;
        }
        return null;
    }
     
      public Item remove(){
        if (this.quantidade > 0){
            Item n = dados[quantidade - 1];
            this.quantidade--;        
            if (this.quantidade > 0 && this.quantidade == this.dados.length/4){ //tem a proteção pra não zerar o VETOR
            redimensionar(dados.length/2);
            }
        return n;
        
        }
        return null;
    }
      
          public Item removeFixo(){
        if (this.quantidade > 0){
            Item n = dados[0];
            this.quantidade--;
            
            for (int i = 1; i <= quantidade; i++){
                dados[i-1] = dados[i];                
            }        
            return n;
        }
        return null;
    }
}

