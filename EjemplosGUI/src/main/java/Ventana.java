import javax.swing.*;
import java.awt.*;

public class Ventana {

    public Ventana() {

        JFrame marco = new JFrame("Hola mundo");
        JLabel lblSaludo = new JLabel("Hola gente de DAW 1!");
        JButton boton = new JButton("Pinchame DAW1!");
        JLabel lblSaludo2 = new JLabel("Hola gente de DAW 2!");
        JButton boton2 = new JButton("PinchameDAW2!");

       // marco.setLayout(new FlowLayout());
        marco.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        boton.addActionListener(new Escuchador());
        boton2.addActionListener(new Escuchador());

        marco.add(lblSaludo, BorderLayout.NORTH);
        marco.add(boton);
        marco.add(lblSaludo2, BorderLayout.EAST);
        marco.add(boton2, BorderLayout.SOUTH);
        marco.setSize(400,200);
        marco.setVisible(true);

    }
}
