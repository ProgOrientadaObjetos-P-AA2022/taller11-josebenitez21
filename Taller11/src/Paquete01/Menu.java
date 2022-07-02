/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete01;

/**
 *
 * @author M S I
 */
public abstract class Menu {

    protected String nombrePlato;
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

    public abstract void establecerValorTotal();

    public String obtenerNombrePlato() {
        return nombrePlato;
    }

    public double obtenerValorInicial() {
        return valorInicial;
    }

    public double obtenerValorTotal() {
        return valorTotal;
    }
    @Override
    public String toString() {
        String cadena;
        cadena = String.format("Plato: %s\n"
                + "\tValor Inicial: %.2f\n",
                obtenerNombrePlato(),
                obtenerValorInicial());
        return cadena;
    }

}
