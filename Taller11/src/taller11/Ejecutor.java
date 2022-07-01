/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller11;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        MenuCarta mc1 = new MenuCarta("Estofado", 5.75, 2.50, 1.50);
        MenuCarta mc2 = new MenuCarta("Milanesa", 6, 2.50, 1.50);
//        mc1.establecerValorInicial();
//        mc1.establecerCargoAdicional(10);
//        mc2.establecerCargoAdicional(5);

        MenuDia md1 = new MenuDia("Almuerzo", 5.30, 2.50, 1.50);
        MenuDia md2 = new MenuDia("Almuerzo 2", 5.60, 2.50, 1.50);

        MenuEconomico me1 = new MenuEconomico("Plato 1", 3.10, 10);
        MenuEconomico me2 = new MenuEconomico("Plato 2", 2.60, 10);

        me1.establecerDescuento();
        me2.establecerDescuento();

        MenuNiños mn1 = new MenuNiños("Hamburguesa", 2.60, 1.80, 2.60);
        MenuNiños mn2 = new MenuNiños("Nachos", 2.30, 1.80, 2.30);
        ArrayList<Menu> listaCartas = new ArrayList<>();
        Cuenta cuen = new Cuenta();

        cuen.establecerListadoCartas(listaCartas);
        cuen.establecerNombreCliente("Jose");
        cuen.establecerSubtotal();
        cuen.establecerIva(14);
        cuen.establecerValorTotal();
        listaCartas.add(me1);
        listaCartas.add(me2);
        listaCartas.add(mc1);
        listaCartas.add(mc2);
        listaCartas.add(md1);
        listaCartas.add(md2);
        listaCartas.add(mn1);
        listaCartas.add(mn2);

        for (int i = 0; i < listaCartas.size(); i++) {
            listaCartas.get(i).valorTotal();
        }

        System.out.println(cuen);
    }

}
