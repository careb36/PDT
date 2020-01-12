package com.cliente;

import java.awt.EventQueue;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.services.FenomenosBeanRemote;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.naming.InitialContext;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.KeyAdapter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.util.ArrayList;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.entities.Fenomeno;
//import com.entities.Fenomeno;
//import com.entities.Usuario;
import com.exception.ServiciosException;
import com.services.FenomenosBeanRemote;

public class frmFenomenos extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtCodigo;
	private JTextField txtTelefono;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmFenomenos frame = new frmFenomenos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//****************** Creacion de formulario ***************************
	
	public frmFenomenos() {
		setResizable(false);
		setTitle("Alta de Fenomeno");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 401, 353);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 11, 113, 14);
		contentPane.add(lblNombre);
		
		JLabel lblCodigo = new JLabel("Codigo:");
		lblCodigo.setBounds(10, 36, 113, 14);
		contentPane.add(lblCodigo);
		
		JLabel lblTelefono = new JLabel("Telefono de emergencia:");
		lblTelefono.setBounds(10, 188, 145, 14);
		contentPane.add(lblTelefono);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(165, 8, 209, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(165, 33, 209, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		JTextArea txaDescripcion = new JTextArea();
		txaDescripcion.setBounds(10, 86, 364, 88);
		contentPane.add(txaDescripcion);
		
		JLabel lblDescripcion = new JLabel("Descripcion:");
		lblDescripcion.setBounds(10, 61, 133, 14);
		contentPane.add(lblDescripcion);
		
		JLabel lblCriticidad = new JLabel("Criticidad:");
		lblCriticidad.setBounds(10, 214, 133, 14);
		contentPane.add(lblCriticidad);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(165, 185, 209, 20);
		contentPane.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		JComboBox cmbCriticidad = new JComboBox();
		cmbCriticidad.setModel(new DefaultComboBoxModel(new String[] {"Leve", "Moderada", "Intensa", "Muy intensa", "Maxima"}));
		cmbCriticidad.setToolTipText("");
		cmbCriticidad.setBounds(165, 211, 209, 20);
		contentPane.add(cmbCriticidad);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.setBounds(285, 267, 89, 23);
		contentPane.add(btnIngresar);
		
		//****************** FIN Creacion de formulario ***************************
		
		
		
		//****************** Comportamiento ***************************
		
		// limitamos cantidad de caracteres del Descripcion
		txaDescripcion.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (txaDescripcion.getText().length()== 500)
					  
					  e.consume(); 
			}
		});
		
		// limitamos cantidad de caracteres del Nombre
		txtNombre.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (txaDescripcion.getText().length()== 60)
					  
					  e.consume(); 
			}
		});
		
		// limitamos cantidad de caracteres del Telefono
				txtTelefono.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent e) {
						if (txaDescripcion.getText().length()== 30)
							  
							  e.consume(); 
					}
				});
				
		// limitamos cantidad de caracteres del Codigo
				txtCodigo.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent e) {
						if (txaDescripcion.getText().length()== 30)
							  
							  e.consume(); 
					}
				});
		
				//Boton Ingresar Fenomeno
				
				btnIngresar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Fenomeno fenomeno = new Fenomeno();
						fenomeno.setCodigo(Integer.parseInt(txtCodigo.getText()));
						fenomeno.setCriticidad(cmbCriticidad.getSelectedItem().toString());
						fenomeno.setDescripcion(txaDescripcion.getText());
						fenomeno.setNombre(txtNombre.getText());
						fenomeno.setTel_emergencia(txtTelefono.getText());
						
						try {
							FenomenosBeanRemote fenomenosBean = (FenomenosBeanRemote) InitialContext
									.doLookup("PDT/FenomenosBean!com.services.FenomenosBeanRemote");
							fenomenosBean.crear(fenomeno);
							System.out.println("Se creó exitosamente el fenómeno");
						} catch (ServiciosException | NamingException f) {
							System.out.println(f.getMessage());
						}

					
					
						System.out.println("Fenomeno ingresado");
					}
				});
		//****************** FIN Comportamiento ***************************
		 	 
	}
}
