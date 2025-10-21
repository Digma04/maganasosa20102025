/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author UFG
 */
public class Pila {
    
    private int[] elementos;
    private int cima;
    private int capacidad;
    
    public Pila (int tamano){
        
        this.capacidad = tamano;
        this.elementos = new int [this.capacidad];
        this.cima = -1;
        
    }
    
    
    public boolean estaVacia(){
        
        if(this.cima == -1){
            return true;
        }else{
            return false;
        }
        
    }
    
    
    public boolean estaLlena(){
        
        if (this.cima == (this.capacidad -1) ){
            return true;
        }else{
            return false;
        }
    }
    
    public int tamano(){
        return this.cima + 1;  
    }
    
    
    public void push(int elemento){
        if (estaLlena()){
            System.out.println("La pila esta llena, no puede agregar el valor: "+elemento);
            //return;
        }else{
            this.cima++;
            this.elementos[this.cima] = elemento;
            System.out.println("El valor: "+elemento+" fue agregado a la pila");
        }
        
    }
    
    public int pop(){
        
        if(estaVacia()){
            System.out.println("La pila esta vacia, no puede hacer la extracion del elemento");
            return -1;    
        }else{
            int elementoExtraido = this.elementos[this.cima];
            this.cima--;
            return elementoExtraido;
        }
    }
    
    public int peek(){
        if(estaVacia()){
            System.out.println("La pila esta vacia");
            return -1;
        }else{
            return this.elementos[this.cima];
        }
    }
    
    public void mostrar(){
        if(estaVacia()){
            System.out.println("La pila esta vacia");
            
        }else{
            System.out.print("Contenido de la pila (desde la cima, hasta la base de la pila");
            System.out.print("[");
            
            for(int i = this.cima; i >=0; i--){
                System.out.print(this.elementos[i]);
                if(i > 0){
                    System.out.print(",");
                }
            }
            
            System.out.print("]");
                    
        }
        
    }
    
}
