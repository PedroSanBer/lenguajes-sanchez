/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread3;

/**
 *
 * @author T-102
 * TERCER FORMA DE CREAR THREADS, ES LA MEJOR Y ES LA QUE ME VAN A PREGUNTAR EN EL EXAMEN 
 * 
 */
public class LaMejor {
    public static void main(String[] args) {
        
        Thread t1=new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println("Soy el mejor");
            }
            
        });
        t1.start();
    }
 
}
