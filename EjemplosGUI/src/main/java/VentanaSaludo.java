import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaSaludo {

    public VentanaSaludo(){

        JFrame marco = new JFrame("Ventana que saluda");

        JLabel lblSaludo = new JLabel("Pincha el botón y te saludo");
        JButton btnSaludar = new JButton("Saluda!");
        JButton btnDespedir = new JButton("Despedir");

        marco.setSize(300, 500);
        marco.setResizable(false);

        lblSaludo.setSize(200,100);
        lblSaludo.setLocation(50, 50);
        btnSaludar.setSize(200, 100);
        btnSaludar.setLocation(50, 200);
        btnDespedir.setBounds(50, 350, 200, 100);

        btnSaludar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblSaludo.setText("Hola que divertido es swing");
            }
        });

        btnDespedir.addActionListener((ActionEvent e)->{
            lblSaludo.setText("Adios muy buenas!");
            JOptionPane.showMessageDialog(marco, "Impresionante!");
        });

        marco.setLayout(null);

        marco.add(lblSaludo);
        marco.add(btnSaludar);
        marco.add(btnDespedir);

        marco.setVisible(true);

    }
}
