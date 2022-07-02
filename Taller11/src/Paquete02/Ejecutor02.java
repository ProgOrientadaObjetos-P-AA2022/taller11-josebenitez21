/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete02;

import Paquete01.*;
import java.util.ArrayList;

/**
 *
 * @author M S I
 */
public class Ejecutor02 {

    public static void main(String[] args) {
        String[][] datos001 = {{"Niños 01", "2.00", "1", "1.5"},
        {"Niños 02", "3.00", "1", "1.5"},
        {"Niños 03", "2.00", "2", "0.5"}};

        String[][] datos002 = {{"Econo 001", "4", "25"},
        {"Econo 002", "4", "15"},
        {"Econo 003", "4", "35"}
        };

        String[][] datos003 = {{"Dia 001", "5", "1", "1"},
        {"Dia 002", "6", "2", "2"},
        {"Dia 003", "5.5", "3", "1"},};

        String[][] datos004 = {{"Carta 001", "6", "1.5", "2", "10"},
        {"Carta 002", "7", "1.7", "2.1", "5"},
        {"Carta 003", "8", "1.9", "2.2", "5"},
        {"Carta 004", "9", "2.5", "2.9", "5"}};

        // Lista de Menus
        ArrayList <Menu>lista = new ArrayList<>();

 
        for (int i = 0; i < datos001.length; i++) {
            String nombrePlato = datos001[i][0];
            double valIni = Double.parseDouble(datos001[i][1]);
            double valHelado = Double.parseDouble(datos001[i][2]);
            double valPastel = Double.parseDouble(datos001[i][3]);
            MenuNiños n1 = new MenuNiños(nombrePlato, valIni, valHelado, valPastel);
            lista.add(n1);
        }
        for (int i = 0; i < datos002.length; i++) {
            String nombrePlato = datos002[i][0];
            double valIni = Double.parseDouble(datos002[i][1]);
            double valDesc = Double.parseDouble(datos002[i][2]);
            MenuEconomico n2 = new MenuEconomico(nombrePlato, valIni, valDesc);
            lista.add(n2);
        }
        for (int i = 0; i < datos003.length; i++) {
            String nombrePlato = datos003[i][0];
            double valIni = Double.parseDouble(datos003[i][1]);
            double valPostre = Double.parseDouble(datos003[i][2]);
            double valBebida = Double.parseDouble(datos003[i][3]);
            MenuDia n3 = new MenuDia(nombrePlato, valIni, valPostre, valBebida);
            lista.add(n3);
        }

        for (int i = 0; i < datos004.length; i++) {
            String nombrePlato = datos004[i][0];
            double valIni = Double.parseDouble(datos004[i][1]);
            double valGuarnicion = Double.parseDouble(datos004[i][2]);
            double valBebida = Double.parseDouble(datos004[i][3]);
            double cargoAdicional = Double.parseDouble(datos004[i][4]);
            MenuCarta n4 = new MenuCarta(nombrePlato, valIni, valGuarnicion, valBebida, cargoAdicional);
            lista.add(n4);
        }

        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).establecerValorTotal();
        }

        // Un objeto de tipo Cuenta
        Cuenta miCuenta = new Cuenta("Luis Andrade", lista, 10);
        miCuenta.establecerSubtotal();
        miCuenta.establecerValorTotal();
        System.out.printf("%s\n", miCuenta);

    }

}
