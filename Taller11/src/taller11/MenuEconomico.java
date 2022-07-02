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

    public MenuEconomico(String nomP, double valorI, double desc) {
        super(nomP, valorI);
        descuento = desc;
    }

    public void establecerDescuento() {
        descuento = (descuento*valorInicial)/100;
    }

    public double obtenerDescuento() {
        return descuento;
    }

    @Override
    public void valorTotalMenu() {
        valorTotal = valorInicial - descuento;
    }

    public double obtenerValorTotal() {
        return valorTotal;
    }
    

    @Override
    public String toString() {

        String cadena;
        cadena = String.format("%s", super.toString());
        cadena = String.format("%s"
                + "Descuento: %.2f\n"
                + "Valor del Menu: %.2f\n",
                cadena,
                descuento,
                obtenerValorTotal());
        return cadena;
    }

}
