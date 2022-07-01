/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author M S I
 */
public class MenuEconomico extends Menu {

    private double descuento;

    public void establecerDescuento(double a) {
        descuento = a;
    }

    public double obtenerDescuento() {
        return descuento;
    }

    @Override
    public void valorTotal() {

    }
}
