
package com.mycompany.estruturadedados;

public class ListaSequencial {
    private int quantidade;
    private Integer [] dados; //fazendo isso, eu posso receber NULL, principalmente quando tem valores negativos. Esse NULL entra no lugar do return -1.
    
    public ListaSequencial(int tam){
        dados = new Integer [tam];
    }
        
    public boolean vazia(){
        return this.quantidade == 0;
    }            
       
    public int getTamanho(){
    return  this.dados.length;
    }
    
public void redimensionar (int max){
    
    Integer temp[] = new Integer[max];
    for (int i = 0; i < this.quantidade; i++){
        temp[i] = this.dados[i];
    }
    
    this.dados = temp;
}
    
//QUANDO ESTIVER LOTADO EU VOU REDIMENSIONAR
    public void insere(int n){
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
     
    public Integer removeInicio(){
        if (this.quantidade > 0){
            int n = dados[0];
            this.quantidade--;
            
            for (int i = 1; i <= quantidade; i++){
                dados[i-1] = dados[i];                
            }        
            return n;
        }
        return null;
    }
     
      public Integer remove(){
        if (this.quantidade > 0){
            int n = dados[quantidade - 1];
            this.quantidade--;        
            if (this.quantidade > 0 && this.quantidade == this.dados.length/4){ //tem a proteção pra não zerar o VETOR
            redimensionar(dados.length/2);
            }
        return n;
        
        }
        return null;
    }
      
          public Integer removeFixo(){
        if (this.quantidade > 0){
            int n = dados[0];
            this.quantidade--;
            
            for (int i = 1; i <= quantidade; i++){
                dados[i-1] = dados[i];                
            }        
            return n;
        }
        return null;
    }
}

