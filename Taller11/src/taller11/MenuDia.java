/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author M S I
 */
public class MenuDia extends Menu {

    private double postre;
    private double bebida;

    public MenuDia(String nomP, double valorI, double post, double beb) {
        super(nomP, valorI);
        postre = post;
        bebida = beb;
    }

    public void establecerPostre(double a) {
        postre = a;
    }

    public void establecerPastel(double a) {
        bebida = a;
    }

    public double obtenerPostre() {
        return postre;
    }

    public double obtenerPastel() {
        return bebida;
    }

    @Override
    public void valorTotalMenu() {
        valorTotal = valorInicial + postre + bebida;
    }

    public double obtenerValorTotal() {
        return valorTotal;
    }

    @Override
    public String toString() {
        String cadena;
        cadena = String.format("%s", super.toString());
        cadena = String.format("%s"
                + "Postre: %.2f\n"
                + "Bebida: %.2f\n"
                + "Valor del Menu: %.2f\n",
                cadena,
                postre,
                bebida,
                obtenerValorTotal());
        return cadena;
    }

}
