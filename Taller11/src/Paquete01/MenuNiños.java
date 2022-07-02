/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete01;

/**
 *
 * @author M S I
 */
public class MenuNiños extends Menu {

    private double helado;
    private double pastel;

    public MenuNiños(String nomP, double valorI, double hel, double pas) {
        super(nomP, valorI);
        helado = hel;
        pastel = pas;
    }

    public void establecerPostre(double a) {
        helado = a;
    }

    public void establecerPastel(double a) {
        pastel = a;
    }

    public double obtenerPostre() {
        return helado;
    }

    public double obtenerPastel() {
        return pastel;
    }

    @Override
    public void establecerValorTotal() {
        valorTotal = valorInicial + helado + pastel;
    }

    @Override
    public String toString() {

        String cadena;
        cadena = String.format("Menu del niños:\n \t%s", super.toString());
        cadena = String.format("%s"
                + "\tHelado: %.2f\n"
                + "\tPastel: %.2f\n"
                + "\tValor del Menu: %.2f\n",
                cadena,
                helado,
                pastel,
                obtenerValorTotal());
        return cadena;
    }
}
