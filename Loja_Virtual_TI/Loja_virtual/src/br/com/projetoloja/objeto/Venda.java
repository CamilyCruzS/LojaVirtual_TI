package br.com.projetoloja.objeto;

import java.util.Date;

public class Venda {
	//Atributos da classe venda
	private int idVenda;
	private Cliente cliente;
	private Funcionario funcionario;
	private Date dataVenda;
	
	//Construtor1
	public Venda() {
	}

	
	//Construtor2
	public Venda(int idVenda, Cliente cliente, Funcionario funcionario, Date dataVenda) {
		this.idVenda = idVenda;
		this.cliente = cliente;
		this.funcionario = funcionario;
		this.dataVenda = dataVenda;
	}


	//Get e Set
	public int getIdVenda() {
		return idVenda;
	}


	public void setIdVenda(int idVenda) {
		this.idVenda = idVenda;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Funcionario getFuncionario() {
		return funcionario;
	}


	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}


	public Date getDataVenda() {
		return dataVenda;
	}


	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}
	
	
}
