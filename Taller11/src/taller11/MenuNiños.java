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
       
    }
}
