/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread2;

/**
 *
 * @author T-102
 * SEGUNDA FORMA DE CREAR THREADS IMPLEMENTANDO LA 
 * INTERFACE RUNNABLE
 */ 

public class TareaMejor implements Runnable{
     public static void main(String[] args) {
        //Crear el Thread
        Runnable r=new TareaMejor();
        Thread t1=new Thread(r);
        //Iniciarlo
        t1.start();
    }

    @Override
    public void run() {
        System.out.println("soy un thread mejor");
    }
    
}
