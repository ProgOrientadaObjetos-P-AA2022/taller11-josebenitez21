/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

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
    public void valorTotal() {
        valorTotal = valorTotal + helado + pastel;
    }

    public double obtenerValorTotal() {
        return valorTotal;
    }

    @Override
    public String toString() {

        String cadena;
        cadena = String.format("%s",super.toString());
        cadena = String.format("%s"
                + "Helado: %.2f\n"
                + "Pastel: %.2f\n"
                + "Valor del Menu: %.2f\n",
                cadena,
                helado,
                pastel,
                obtenerValorTotal());
        return cadena;
    }
}
