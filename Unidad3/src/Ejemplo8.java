/*
Ejemplo8: Una empresa de autobuses quiere informatizar su servicio de reservas para un evento.
De momento se conforman con guardar el número de teléfono del que ha reservado y el número de
viajeros que transporta. Eso sí, un mismo contacto no puede hacer varias reservas;
sólo una con todos los pasajeros. Implementa una solución.
 */

import javax.swing.*;
import java.util.Collection;
import java.util.HashMap;

public class Ejemplo8 {

    static HashMap<String, Integer> reservas = new HashMap<String, Integer>();
    static int totalReservas = 0;

    public static void main(String[] args) {

        //cargarDatosPrueba();

        introducirDatosReserva();
        introducirDatosReserva();

        // Esto debería ir a un método

        JOptionPane.showMessageDialog(null, "Se han reservado " + getNumReservas() + " plazas");
    }

    public static void addReserva(String telefono, int numViajeros) {

        reservas.put(telefono, numViajeros);

    }

    public static void introducirDatosReserva() {

        String telefono;
        int numViajeros;

        telefono = JOptionPane.showInputDialog("Introduce el teléfono de la reserva");

        numViajeros = Integer.parseInt(JOptionPane.showInputDialog("Número de viajeros?"));

        addReserva(telefono, numViajeros);
    }

    public static int getNumReservas() {

        int numReservas = 0;

        Collection<Integer> valores = reservas.values();

        for (int n : valores) {
            numReservas += n;
        }

        return numReservas;
    }

    public static void cargarDatosPrueba() {
        addReserva("123", 34);
        addReserva("234", 21);
    }
}