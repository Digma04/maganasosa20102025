/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maganasosa20102025;

/**
 *
 * @author UFG
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pila miPila = new Pila(6);
        
        System.out.println("¿La pila esta vacia?   "+miPila.estaVacia());
        System.out.println();
        
         System.out.println("AGREGANDO VALORES CON METODO PUSH()");
         miPila.push(10);
         miPila.push(20);
         miPila.push(30);
         miPila.push(40);
         miPila.push(50);
         
         System.out.println();
         
         miPila.mostrar();
         System.out.println("Tamaño actual de la pila "+miPila.tamano()+" elementos");
         System.out.println();
         
         System.out.println("AGREGAR ELEMENTO NUEVO CON LA PILA LLENA");
         System.out.println(60);
         System.out.println();
         
         System.out.println("VERIFICACION DEL ULTIMO VALOR AGREGADO");
         System.out.println("El elemento de la cima es: "+miPila.peek());
         System.out.println();
         
         System.out.println("EXTRAER VALORES DE LA PILA");
         System.out.println("Se ha extraido el valor de: "+miPila.pop());
         System.out.println("Se ha extraido el valor de: "+miPila.pop());
         System.out.println();
         
         System.out.println("MOSTRANDO VALORES DE LA PILA");
         miPila.mostrar();
         System.out.println("Tamaño actual de la pila "+miPila.pop());
         System.out.println();
         
         System.out.println("SE EXTRAEN TODOS LOS ELEMENTOSDE LA PULA");
         while(!miPila.estaVacia()){
             System.out.println("se ha extraido el valor de: "+miPila.pop());
         }
         System.out.println();
         
         miPila.pop();
         System.out.println();
         
         System.out.println("VERIFICACION DEL ULTIMO VALOR AGREGADO");
         System.out.println("El elemento de la cima es: "+miPila.peek());
         System.out.println();
    }
    
    
    
}
