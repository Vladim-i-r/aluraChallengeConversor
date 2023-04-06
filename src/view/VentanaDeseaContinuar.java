package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;

public class VentanaDeseaContinuar extends JFrame implements ActionListener{

	private JPanel contentPane;
	JButton btnSi, btnNo;
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public VentanaDeseaContinuar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 268, 135);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		iniciarComponentes();
		setTitle("Aplicacion Conversor");
		setResizable(false);
		setLocationRelativeTo(null);
	}

	private void iniciarComponentes() {
		JLabel lblContinuar = new JLabel("¿Desea continuar?");
		lblContinuar.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblContinuar.setBounds(27, 23, 128, 14);
		contentPane.add(lblContinuar);
		
		btnSi = new JButton("Si");
		btnSi.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnSi.setBounds(27, 48, 89, 23);
		btnSi.addActionListener(this);
		contentPane.add(btnSi);
		
		btnNo = new JButton("No");
		btnNo.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNo.setBounds(137, 48, 89, 23);
		btnNo.addActionListener(this);
		contentPane.add(btnNo);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (btnSi==e.getSource()) {
			this.dispose();
		}
		
		if (btnNo==e.getSource()) {
			JOptionPane.showMessageDialog(null, "Aplicación Terminada");	
			System.exit(0);
			
		}
		
	}

}
