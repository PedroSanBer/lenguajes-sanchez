/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nominas1;

/**
 *
 * @author T-102
 */
public class AplicationNomina {
    public static void main(String[] args) {
        int x=2;
        Trabajador worker=new Trabajador();//constructor
        worker.nombre="Pedro";//con el punto accedemos a sus atributos.
        worker.paterno="Lopez";
        worker.numeroSeguro=90;
        if(worker.numeroSeguro<=90)worker.numeroSeguro=100;
        
        System.out.println("El nombre es"+worker.nombre);
        System.out.println("El seguro es"+worker.numeroSeguro);
        
    }
    
}
