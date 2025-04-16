package br.dev.geovanna.tabuada.gui;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.net.Authenticator.RequestorType;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import br.dev.geovanna.tabuada.model.Tabuada;

public class TelaTabuada {

      private JLabel labelMultiplicando;
      private JLabel labelMinMultiplicador;
      private JLabel labelMaxMultiplicador;
      private JTextField textMultiplicando;
      private JTextField textMinMultiplicador;
      private JTextField textMaxMultiplicador;
      private JButton buttonCalcular;
      private JButton buttonLimpar;
	  private JScrollPane ScrollTabuada;
	  private JList ListTabuada;
	  
	  private void exibirTabuada() {
		  
	  }
	  
	  private void limparTabuada() {
		  
	  }
	  
	  public void criarTelaTabuada() {
		  
		  JFrame tela = new JFrame();
		  tela.setTitle("Tabuada");
		  tela.setSize(270, 700);
		  tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  tela.setLayout(null);
		  tela.setResizable(false);
		  
		  // Vamos criar os componentes da tela
		  labelMultiplicando = new JLabel();
		  labelMultiplicando.setText("Multiplicando: ");
		  labelMultiplicando.setBounds(20, 20, 150, 30);
		  textMultiplicando = new JTextField();
		  textMultiplicando.setBounds(180, 20, 50, 30);
		  
		  labelMinMultiplicador = new JLabel();
		  labelMinMultiplicador.setText("Min.multiplicador: ");
		  labelMinMultiplicador.setBounds(20, 55, 150, 30);
		  textMinMultiplicador = new JTextField();
		  textMinMultiplicador.setBounds(180, 55, 50, 30);
		  
		  labelMaxMultiplicador = new JLabel();
		  labelMaxMultiplicador.setText("Max.multiplicador: ");
		  labelMaxMultiplicador.setBounds(20, 95, 150, 30);
		  textMaxMultiplicador = new JTextField();
		  textMaxMultiplicador.setBounds(180, 95, 50, 30);
		  
		  //Botões da tela
		  buttonCalcular = new JButton();
		  buttonCalcular.setText("Calcular");
		  buttonCalcular.setBounds(20, 155, 105, 30);
		  
		  buttonLimpar = new JButton();
		  buttonLimpar.setText("Limpar");
		  buttonLimpar.setBounds(135, 155, 100, 30);
		  
		  //Criar o objeto scroll
		  
		   ListTabuada = new JList();
		   
		   ScrollTabuada = new JScrollPane(ListTabuada); 
		   ScrollTabuada.setBounds(20, 205, 210, 435);
		  
		  // Obtemos o painel de conteúdo e adicionamos o labelMultiplicando nesse painel
		  tela.getContentPane().add(labelMultiplicando);
		  tela.getContentPane().add(textMultiplicando);
		  
		  tela.getContentPane().add(labelMinMultiplicador);
		  tela.getContentPane().add(textMinMultiplicador);
		  
		  tela.getContentPane().add(labelMaxMultiplicador);
		  tela.getContentPane().add(textMaxMultiplicador);
		  
		  tela.getContentPane().add(buttonCalcular);
		  tela.getContentPane().add(buttonLimpar);
		  
		  tela.getContentPane().add(ScrollTabuada);
		  
		  
		  //Adicionar ouvintes de evento aos botões
		  buttonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Tabuada tabuada = new Tabuada();
				String multiplicando = textMultiplicando.getText();
				double multiplicandoDouble = Double.valueOf(multiplicando);
				tabuada.setMultiplicando(multiplicandoDouble);
				
				String min = textMinMultiplicador.getText();
				double minDouble = Double.parseDouble(min);
				tabuada.setMinimoMultiplicador(minDouble);
				
				
				String max = textMaxMultiplicador.getText();
				double maxDouble = Double.valueOf(max);
				tabuada.setMaximoMultiplicador(maxDouble);
				
				
				tabuada.mostrarTabuada();
				
				
			}
		});
		  
		  
		  buttonLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textMultiplicando.setText(null);
				textMinMultiplicador.setText(null);
				textMaxMultiplicador.setText(null);
				textMultiplicando.requestFocus();
				
		
			}
		});
		  
		  // Essa linha deve ser a última linha deste método
		  tela.setVisible(true);
		  
	  }
	  
	  

}
