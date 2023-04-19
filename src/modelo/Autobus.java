/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Jairo F
 */
public class Autobus extends Vehiculo {

    public Autobus(String placa, String marca, int modelo) {
        super(placa, marca, modelo);
    }

    @Override
    public String getLinea() {
        return "Autobus";
    }
    
    
    
}
