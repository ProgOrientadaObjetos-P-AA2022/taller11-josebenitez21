/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author M S I
 */
public class MenuCarta extends Menu {

    private double guarnicion;
    private double bebida;
    private double cargoAdicional;

    public MenuCarta(String nomP, double valorI, double guar, double beb) {
        super(nomP, valorI);
        guarnicion = guar;
        bebida = beb;
        
    }

    public void establecerGuarnicion(double a) {
        guarnicion = a;
    }

    public void establecerBebida(double a) {
        bebida = a;
    }

    public void establecerCargoAdicional() {
        cargoAdicional = (cargoAdicional * valorTotal) / 100;
    }

    public double obtenerGuarnicion() {
        return guarnicion;
    }

    public double obtenerBebida() {
        return bebida;
    }

    public double obtenerCargoAdicional() {
        return cargoAdicional;
    }

    @Override
    public void valorTotal() {
        valorTotal = valorTotal + bebida + guarnicion + cargoAdicional;
    }

    public double obtenerValorTotal() {
        return valorTotal;
    }

    @Override
    public String toString() {
        String cadena;
        cadena = String.format("%s", super.toString());
        cadena = String.format("%s"
                + "Guarnicion: %.2f\n"
                + "Bebida: %.2f\n"
                + "Cargo Adicional: %.2f\n"
                + "Valor del Menu: %.2f",
                cadena,
                guarnicion,
                bebida,
                cargoAdicional,
                obtenerValorTotal());
        return cadena;
    }

}
