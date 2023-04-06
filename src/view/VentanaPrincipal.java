package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

import proyecto.ConversorMoneda;
import proyecto.ConversorTemperatura;
import java.awt.Color;

public class VentanaPrincipal extends JFrame implements ActionListener{

	private JPanel contentPane;
	JButton btnPrincipal;
	JComboBox boxOpciones;
	private JButton btnSalir;
	ConversorMoneda moneda;
	ConversorTemperatura temp;
	
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 424, 156);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 240, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// nuevo
		iniciarComponentes();
		setTitle("Aplicacion Alura Conversor");
		setResizable(false);
		setLocationRelativeTo(null);
		
	}

	private void iniciarComponentes() {

		JLabel lblOpcion = new JLabel("¿Qué tipo de conversor desea utilizar?");
		lblOpcion.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblOpcion.setBounds(20, 26, 255, 14);
		contentPane.add(lblOpcion);
		
		boxOpciones = new JComboBox();
		boxOpciones.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		boxOpciones.setModel(new DefaultComboBoxModel(new String[] {"Conversor de divisas", "Conversor de Temperatura"}));
		boxOpciones.setBounds(20, 51, 173, 22);
		contentPane.add(boxOpciones);
		boxOpciones.addActionListener(this);
		
		btnPrincipal = new JButton("Siguiente");
		btnPrincipal.setForeground(new Color(0, 0, 0));
		btnPrincipal.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnPrincipal.setBounds(203, 51, 89, 23);
		btnPrincipal.addActionListener(this);
		contentPane.add(btnPrincipal);
		
		btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnSalir.setBounds(302, 51, 89, 23);
		btnSalir.addActionListener(this);
		contentPane.add(btnSalir);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(btnPrincipal==e.getSource()) {
			if(boxOpciones.getSelectedItem()=="Conversor de divisas") {
				this.dispose();
				VentanaDivInput divisas = new VentanaDivInput();
				divisas.setVisible(true);
			}else {
				this.dispose();
				VentanaConversorTemperaturaInput tempV = new VentanaConversorTemperaturaInput();
				tempV.setVisible(true);
			}
		}
		
		if (btnSalir==e.getSource()) {
			this.dispose();
			JOptionPane.showMessageDialog(null, "Aplicación Terminada");	
		}
		
	}

	public void asignarDivisas(ConversorMoneda moneda) {
		this.moneda=moneda;
		
	}

	public void asignarTemp(ConversorTemperatura temp) {
		this.temp=temp;
	}


	

}
