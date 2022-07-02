/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete01;

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
    public void establecerValorTotal() {
        valorTotal = valorInicial + postre + bebida;
    }


    @Override
    public String toString() {
        String cadena;
        cadena = String.format("%s", super.toString());
        cadena = String.format("%s"
                + "\tPostre: %.2f\n"
                + "\tBebida: %.2f\n"
                + "\tValor del Menu: %.2f\n",
                cadena,
                postre,
                bebida,
                obtenerValorTotal());
        return cadena;
    }

}
