/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author M S I
 */
public abstract class Menu {

    protected String nombrePlato;
    protected double valMenu;
    protected double valorInicial;
    protected double valorTotal;

    public Menu(String nomP, double valorI) {
        nombrePlato = nomP;
        valorInicial = valorI;

    }

    public void establecerNombrePlato(String a) {
        nombrePlato = a;
    }

    public void establecerValorInicial(double a) {
        valorInicial = a;
    }

    public void establecerValMenu(double a) {
        valMenu = a;
    }
    

    public String obtenerNombrePlato() {
        return nombrePlato;
    }

    public double obtenerValorInicial() {
        return valorInicial;
    }

    public double obtenerValMenu() {
        return valMenu;
    }
    

    public abstract void valorTotal();

    @Override
    public String toString() {
        String cadena;
        cadena = String.format("Plato: %s\n"
                + "Valor Inicial del Menu: %.2f\n",
                obtenerNombrePlato(),
                obtenerValorInicial());
        return cadena;
    }

}
