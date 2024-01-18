package br.com.banco;

public class testeConta {
	
	public static void main (String [] args) {
		/*
				
		contaCorrente cc = new contaCorrente();
		
		cc.cliente = new Cliente();
		cc.cliente.setCpf(789);
		cc.cliente.setName("Enio");
		cc.setNumero(4578450);
		
		contaCorrente cp = new contaCorrente();	
		cc.setDepositar(1000.0);
		
		System.out.println(cc.getSaldo());		
		System.out.println(cc.cliente.getName());		
		cc.setSaque(125.0);
		System.out.println(cc.getSaldo());		
		
		System.out.println("------------------------------------");
		
		contaCorrente pop = new contaCorrente();
		pop.cliente = new Cliente();
		pop.cliente.setName("Reis");
		pop.cliente.setCpf(46);
		pop.setDepositar(450.0);		
		
		System.out.println(pop.cliente.getName());
		System.out.println(pop.getSaldo());
		
		pop.setSaque(120);
		System.out.println(pop.getSaldo());
		
		System.out.println("------------------------------------");
		
		contaCorrente corrente = new contaCorrente();
		corrente.cliente = new Cliente();
		corrente.setNumero(7845445);
		corrente.setDepositar(789.0);
		corrente.setChequeEspecial(520.0);
		corrente.setSaque(120.00);
		System.out.println(corrente.getSaldo());
		System.out.println(corrente.limiteDisponivel());
		corrente.setSaque(1000.0);
		*/
	
		contaCorrente [] contas = new contaCorrente [2];
		
		contaCorrente conta1 = new contaCorrente();
		contaCorrente conta2 = new contaCorrente();
		
		conta1.cliente = new Cliente();
		conta1.cliente.setName("Enio");
		conta1.cliente.setCpf(12345979);
		conta1.setNumero(123);
		conta1.setDepositar(450.0);
		
		
		conta2.cliente = new Cliente();
		conta2.cliente.setName("Pedro");
		conta2.cliente.setCpf(987654);
		conta2.setNumero(456);
		conta2.setDepositar(100.0);
		
		
		contas[0] = conta1;
		contas[1]= conta2;
		
		//System.out.println(contas[1].getNumero());
		
		//System.out.println(contas[0].toString());
		
		for (int i = 0; i < contas.length; i++) {
			System.out.println(contas[i].toString());
		}	
	
	
	}

}
