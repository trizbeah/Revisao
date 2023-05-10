package br.edu.ifba.principal;

import java.util.Scanner;

import br.edu.ifba.basicas.Empresa;
import br.edu.ifba.basicas.Funcionario;
import br.edu.ifba.cadastros.CadastrosEmpresa;
import br.edu.ifba.cadastros.CadastrosFuncionario;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		CadastrosFuncionario cf = new CadastrosFuncionario();
		CadastrosEmpresa c = new CadastrosEmpresa();
		
		for(int cont = 0; cont < 2; cont++) {
			Empresa e = new Empresa();
			
			System.out.println("Digite o nome da empresa: ");
			e.setNome(in.next());
			
			System.out.println("Digite o cnpj da empresa: ");
			e.setCnpj(in.next());
			
			System.out.println("Digite o telefone da empresa: ");
			e.setTelefone(in.next());
			c.cadastrosEmpresa(e);
			
		}
		
		System.out.println("Empresas cadastradas: "+ c.listar());
		
		Empresa e = new Empresa("Apple", "1231231", "2132312");
		
		System.out.println("Digite a posicao para colocar a empresa: ");
		c.cadastrarPorPosicao(in.nextInt(), e);
		System.out.println("Empresas cadastradas: "+c.listar());
		
		System.out.println("Digite uma posicao para remover: ");
		c.removerPosicao(in.nextInt());
		System.out.println("Empresas cadastradas: "+c.listar());
		
		
		
		
		for(int cont = 0; cont < 3; cont++) {
			Funcionario f = new Funcionario();
			
			System.out.println("Digite o nome do funcionário: ");
			f.setNome(in.next());
			
			System.out.println("Digite o CPF do funcionário");
			f.setCpf(in.next());
			
			System.out.println("Digite o RG do funcionário");
			f.setRg(in.next());
			
			System.out.println("Digite o telefone do funcionário");
			f.setTelefone(in.next());
			
			System.out.println("Escolha a empresa");
			System.out.println("Empresas disponíveis: "+ c.listar());
			f.setEmpresa(c.procurarEmpresa(in.nextInt()));
			
			cf.cadastrarFuncionario(f);
			
		}
		
		System.out.println("Funcionários cadastrados: "+cf.listar());
		in.close();
	}

}
