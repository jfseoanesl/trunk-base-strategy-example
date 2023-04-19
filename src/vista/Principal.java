/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import java.util.ArrayList;
import java.util.List;
import modelo.Vehiculo;

/**
 *
 * @author Jairo F
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<Vehiculo> listVehiculos = new ArrayList();
        
        printListVehiculo(listVehiculos);
    }
    
    public static void infoVehiculo(Vehiculo v){
        
        System.out.println(v);
        System.out.println("-------------------------------");
    
    }
    
    public static void printListVehiculo(List<Vehiculo> list){
        System.out.println("** LISTA DE VEHICULOS REGISTRADOS ** ");
        System.out.println("-------------------------------------");
        for(Vehiculo v: list){
            infoVehiculo(v);
        }
    
    }
    
}
