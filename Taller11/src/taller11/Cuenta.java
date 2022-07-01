/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author M S I
 */
public class Cuenta {

    private String nombreCliente;
    private int listadoCartas;
    private double subtotal;
    private double valorTotal;
    private double iva;

    public Cuenta(String a, int b) {
        nombreCliente = a;
        listadoCartas = b;
        iva = 14;
    }

    public void establecerNombreCliente(String a) {
        nombreCliente = a;
    }

    public void establecerListadoCartas(int a) {
        listadoCartas = a;
    }

    public void establecerSubtotal(double a) {

    }

    public void establecerValorTotal() {

    }

    public void establecerIva(double a) {
        iva = a;
    }

    public String obtenerNombreCliente() {
        return nombreCliente;
    }

    public int obtenerListadoCartas() {
        return listadoCartas;
    }

    public double obtenerSubtotal() {
        return subtotal;
    }

    public double obtenerValorTotal() {
        return valorTotal;
    }

    public double obtenerIva() {
        return iva;
    }

}
