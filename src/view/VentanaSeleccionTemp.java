package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import proyecto.ConversorMoneda;
import proyecto.ConversorTemperatura;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class VentanaSeleccionTemp extends JFrame implements ActionListener {

	private JPanel contentPane;
	String input;
	JButton btnConvertir, btnCancelar;
	JComboBox boxOpciones;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public VentanaSeleccionTemp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 142);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		iniciarComponentes();
		setLocationRelativeTo(null);
		setResizable(false);
		setTitle("Conversor de Temperatura");
	}

	private void iniciarComponentes() {
		JLabel lbltipo = new JLabel("Seleccione el tipo de conversion:");
		lbltipo.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lbltipo.setBounds(20, 25, 199, 14);
		contentPane.add(lbltipo);
		
		boxOpciones = new JComboBox();
		boxOpciones.setModel(new DefaultComboBoxModel(new String[] {"Celsius a Fahrenheit", "Fahrenheit a Celsius"}));
		boxOpciones.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		boxOpciones.setBounds(20, 51, 154, 22);
		contentPane.add(boxOpciones);
		
		btnConvertir = new JButton("Convertir");
		btnConvertir.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnConvertir.setBounds(197, 50, 89, 23);
		btnConvertir.addActionListener(this);
		contentPane.add(btnConvertir);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnCancelar.setBounds(296, 50, 89, 23);
		btnCancelar.addActionListener(this);
		
		contentPane.add(btnCancelar);
		
	}

	public void asignarinput(String text) {
		this.input=text;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (btnCancelar == e.getSource()) {
			this.dispose();
			VentanaPrincipal main = new VentanaPrincipal();
			main.setVisible(true);
		}
		
		if (btnConvertir == e.getSource()) {
			double cantidad = Double.parseDouble(input);
			ConversorTemperatura temp = new ConversorTemperatura();
			switch (boxOpciones.getSelectedIndex()) {
			case 0:
				JOptionPane.showMessageDialog(null, "La conversión de " + cantidad + " Celsius a Fahrenheit son: " + temp.CelciusFahrenheit(cantidad) + " °F grados Fahrenheit." );
				break;
			case 1:
				JOptionPane.showMessageDialog(null, "La conversión de " + cantidad + " Fahrenheit a Celsius son: " + temp.FahrenheitCelcius(cantidad) + " °C grados Celsius." );
				break;
			}
		
			VentanaDeseaContinuar continua = new VentanaDeseaContinuar();
			continua.setVisible(true);
		
	}
}
}
