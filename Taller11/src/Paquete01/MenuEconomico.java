/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete01;

/**
 *
 * @author M S I
 */
public class MenuEconomico extends Menu {

    private double descuento;

    public MenuEconomico(String nomP, double valorI, double desc) {
        super(nomP, valorI);
        descuento = desc;
    }

    public void establecerDescuento(double a) {
        descuento = a;
    }

    public double obtenerDescuento() {
        return descuento;
    }

    @Override
    public void establecerValorTotal() {
        valorTotal = valorInicial - ((descuento * valorInicial) / 100);
    }

    @Override
    public String toString() {

        String cadena;
        cadena = String.format("%s", super.toString());
        cadena = String.format("%s"
                + "\tDescuento: %.2f\n"
                + "\tValor del Menu: %.2f\n",
                cadena,
                descuento,
                obtenerValorTotal());
        return cadena;
    }

}
