/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete01;

import java.util.ArrayList;

/**
 *
 * @author M S I
 */
public class Cuenta {

    private String nombreCliente;
    private ArrayList<Menu> listadoCartas;
    private double subtotal;
    private double valorTotal;
    private double iva;

    /*public Cuenta(String a, int b) {
        nombreCliente = a;
        listadoCartas = b;
        iva = 0.14;
    }*/
    public Cuenta() {
        iva = 14;
    }

    public Cuenta(String nomClient, ArrayList<Menu> listCar, double ivaR) {
        nombreCliente = nomClient;
        listadoCartas = listCar;
        iva = ivaR;
    }

    public void establecerNombreCliente(String a) {
        nombreCliente = a;
    }

    public void establecerListadoCartas(ArrayList<Menu> a) {
        listadoCartas = a;
    }

    public void establecerSubtotal() {
        for (int i = 0; i < listadoCartas.size(); i++) {
            subtotal = subtotal + listadoCartas.get(i).obtenerValorTotal();
        }

    }

    public void establecerValorTotal() {

        valorTotal = subtotal + (subtotal * (iva / 100));
    }

    public void establecerIva(double a) {
        iva = a;
    }

    public String obtenerNombreCliente() {
        return nombreCliente;
    }

    public ArrayList<Menu> obtenerListadoCartas() {
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

    @Override
    public String toString() {
        String cadena = String.format("Datos Del Usuario\n"
                + "Nombre del cliente: %s\n",
                obtenerNombreCliente());
        for (int i = 0; i < listadoCartas.size(); i++) {
            cadena = String.format("%s %s\n", cadena,
                    obtenerListadoCartas().get(i));
        }
        cadena = String.format("%s\n"
                + "Iva: %.2f %%\n"
                + "Subtotal: %.2f\n"
                + "Total: %.2f\n", cadena,
                iva,
                subtotal,
                obtenerValorTotal());

        return cadena;
    }
}
