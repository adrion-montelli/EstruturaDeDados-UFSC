package com.mycompany.estruturapilhavetor;

public class TestePilha {
   
    public static void main(String[] args) {
     
       PilhaVetor pilha = new PilhaVetor(5);
       System.out.println("Pilha vazia" + pilha.ehVazia());
       
       pilha.empilha(10);
       pilha.empilha(15);
       pilha.empilha(20);
       pilha.empilha(25);
       pilha.empilha(30);
       
       pilha.imprimePilha();
       
              
      System.out.println("Foi retirado: " + pilha.desempilha());
      System.out.println("Foi retirado: " + pilha.desempilha());
      System.out.println(" ");
      
       System.out.println("Pilha atualizada: ");
       pilha.imprimePilha();
       
       
       
       PilhaVetorGenerica<Integer> pilhaGen = new PilhaVetorGenerica<Integer>(5);
       System.out.println("Pilha vazia " + pilha.ehVazia());
       
       pilhaGen.empilha(110);
       pilhaGen.empilha(115);
       pilhaGen.empilha(120);
       pilhaGen.empilha(125);
       pilhaGen.empilha(130);
       
       pilhaGen.imprimePilha();
       
              
      System.out.println("Foi retirado: " + pilhaGen.desempilha());
      System.out.println(" ");
      
       System.out.println("Pilha atualizada: ");
       pilhaGen.imprimePilha();
      
    }
 
}
