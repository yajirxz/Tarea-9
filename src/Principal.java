package IntGrafica.IU;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Principal extends Frame {
    private Label lblNombre;
    private TextField txtNombre;
    private Button btnBoton1;

    public Principal(String title) throws HeadlessException {
        super(title);
        this.setLayout(new FlowLayout());
        lblNombre = new Label("Nombre: ");
        lblNombre.setSize(200,100);
        this.add(lblNombre);
        txtNombre = new TextField(30);
        this.add(txtNombre);
        btnBoton1 = new Button("Saludar");
       // btnBoton1.addMouseListener(new EventosRaton());
        btnBoton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println( txtNombre.getText());
                JOptionPane.showMessageDialog(null, "Hola" + txtNombre.getText());
            }
        });
        this.add(btnBoton1);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                System.exit(0);
            }
        });
        this.setVisible(true);
    }
}
