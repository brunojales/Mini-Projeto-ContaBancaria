package br.com.atividade;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		// declaração de variavel
		String valor;
		Object escolha; //
		
		Object[] opcoes = {"Consultar saldo", "Fazer deposito","Fazer saque","Sair"};

		// Instancia os objetos
		Conta usuario = new Conta();

		// Input de dados
		usuario.setCpfTitular(JOptionPane.showInputDialog("Informe o seu CPF: "));
		usuario.setAgencia("1234-5");
		usuario.setNumeroConta("67890-1");
		usuario.setSaldo(0);
		

		//Laço de repetição
		do {
			//escolha = JOptionPane.showInputDialog(null,usuario,valor, null, opçoes, valor);
			//Como era antes de editar
			escolha = JOptionPane.showInputDialog(null, "CPF titular: "+usuario.getCpfTitular()+
					"\n Agencia: " +usuario.getAgencia()+
					"\n Numero Conta: "+usuario.getNumeroConta()+
					"\n Saldo: "+usuario.getSaldo()+".","OPERAÇÕES", JOptionPane.QUESTION_MESSAGE, 
					null, opcoes, opcoes[3]);//0 dentro do array deixa fixo a 1° opção do array
		if(escolha == "Consultar saldo") {
			JOptionPane.showMessageDialog(null, "Saldo R$: " +usuario.getSaldo());
			
		}
		else if(escolha == "Fazer deposito") {
			valor  = JOptionPane.showInputDialog("Informe o valor a ser depositado: R$ ");
			usuario.fazerDeposito(Double.parseDouble(valor));
			JOptionPane.showMessageDialog(null, "Deposito realizado com sucesso!");
		}else if(escolha == "Fazer saque") {
			valor = JOptionPane.showInputDialog("Informe o valor a ser sacado: R$ ");
			if(Double.parseDouble(valor) <= usuario.getSaldo()) {
				usuario.fazerSaque(Double.parseDouble(valor));
				JOptionPane.showMessageDialog(null, "Saque de R$ "+valor+ " efetuado com sucesso!");
			}
			else {
				JOptionPane.showMessageDialog(null, "Saldo insulficiente!");
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "Opereção Finalizada. Obrigado!");
		}
		
			
		} while (escolha != "Sair");
		
		System.exit(0);	
	}
}
