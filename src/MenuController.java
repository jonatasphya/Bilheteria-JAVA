import java.util.ArrayList;
import java.util.List;
import java.text.NumberFormat;
import java.util.*;
import java.util.Scanner;

public class MenuController {
		
		
		
		
		Scanner sc = new Scanner(System.in);
		Ingresso ingresso = new Ingresso();
		
		private int opc;
		
	public void menuFilmes() {
		Filme filmes = new Filme();
		Filme filme1 = new Filme();
		Filme filme2 = new Filme();
		Filme filme3 = new Filme();
		Filme filme4 = new Filme();
		Filme filme5 = new Filme();
		Filme filme6 = new Filme();
		
	    filme1.setNome("Duna");
	    filme1.setDiretor("Denis Villeneuve");
	    filme1.setDescricao("Paul Atreides é um jovem brilhante, "
	    		+ "dono de um destino além de sua compreensão. "
	    		+ "Ele deve viajar para o planeta mais perigoso "
	    		+ "do universo para garantir o futuro de seu povo.");
	    filme1.setGenero("Ficção científica/Aventura");
	    filme1.setDuracaoFilme("2h 35m");
	    //------
	    filme2.setNome("Matrix");
	    filme2.setDiretor("Lana Wachowski, Lilly Wachowski");
	    filme2.setDescricao("Um jovem programador é atormentado "
	    		+ "por estranhos pesadelos nos quais sempre está "
	    		+ "conectado por cabos a um imenso sistema de computadores "
	    		+ "do futuro. À medida que o sonho se repete, ele começa a "
	    		+ "levantar dúvidas sobre a realidade. E quando encontra os "
	    		+ "misteriosos Morpheus e Trinity, ele descobre que é vítima "
	    		+ "do Matrix, um sistema inteligente e artificial que manipula "
	    		+ "a mente das pessoas e cria a ilusão de um mundo real enquanto "
	    		+ "usa os cérebros e corpos dos indivíduos para produzir energia.");
	    filme2.setGenero("Ação/Ficção científica");
	    filme2.setDuracaoFilme("2h 26m");
	    //------
	    filme3.setNome("Blade Runner 2049");
	    filme3.setDiretor("Denis Villeneuve");
	    filme3.setDescricao("Após descobrir um segredo que ameaça o que resta "
	    		+ "da sociedade, um novo policial parte em busca de Rick Deckard, "
	    		+ "que está desaparecido há 30 anos.");
	    filme3.setGenero("Ficção científica/Ação");
	    filme3.setDuracaoFilme("2h 43m");
	    //------
	    filme4.setNome("K-PAX - O Caminho da Luz");
	    filme4.setDiretor("Iain Softley");
	    filme4.setDescricao("Misterioso paciente de um hospital psiquiátrico afirma "
	    		+ "pertencer a um planeta distante chamado K-PAX. À medida que seu "
	    		+ "psiquiatra tenta ajudá-lo, ele percebe que o possível alienígena "
	    		+ "está causando um efeito extraordinário na saúde mental de outros "
	    		+ "pacientes da instituição.");
	    filme4.setGenero("Ficção científica/Drama");
	    filme4.setDuracaoFilme("2h 1m");
	    //------
	    filme5.setNome("A Chegada");
	    filme5.setDiretor("Denis Villeneuve");
	    filme5.setDescricao("Naves alienígenas chegaram às principais cidades do mundo. "
	    		+ "Com a intenção de se comunicar com os visitantes, uma linguista e um "
	    		+ "militar são chamados para decifrar as estranhas mensagens dos visitantes.");
	    filme5.setGenero("Ficção científica/Thriller");
	    filme5.setDuracaoFilme("1h 56m");
	    //------
	    filme6.setNome("Prometheus");
	    filme6.setDiretor("Ridley Scott");
	    filme6.setDescricao("Este prelúdio do filme Alien conta a história de "
	    		+ "uma equipe de cientistas que embarca em uma jornada espacial "
	    		+ "para descobrir a verdade sobre a origem da raça humana. "
	    		+ "No planeta de destino, eles encontram criaturas poderosas "
	    		+ "e revelações assustadoras.");
	    filme6.setGenero("Ficção científica/Terror");
	    filme6.setDuracaoFilme("2h 4m");
	    
	    filmes.setFilmes(List.of(filme1, filme2, filme3, filme4, filme5, filme6));
		
		int i = 1;
		int opc;
	
		System.out.println("FILMES");
	
		for(Filme a : filmes.getFilmes()) {
			System.out.println(i + " - " + a.getNome());
			i++;
		}
		
		System.out.print("SELECIONE O FILME: ");
		opc = sc.nextInt();
	
		mostrarDadosFilme(opc, filmes);
		
	}
	
	public void mostrarDadosFilme(int opc, Filme filme) {
		
		System.out.println(filme.getFilmes().get(opc - 1));
		System.out.print("SELECIONAR ESTE FILME? (S/N): ");
		String SN = sc.next();
		if(SN.equals("s")) {
			ingresso.setFilme(filme.getFilmes().get(opc - 1).getNome());
			selecionarSessoes();
		}
		else {
			menuFilmes();
		}
	}
	
	public void selecionarSessoes() {
		
		ArrayList<String> arrSessoes = new ArrayList<>(Arrays.asList(
	            "14:30",
	            "15:00",
	            "16:30", 
	            "17:00",
	            "17:30",
	            "18:00",
	            "19:00",
	            "19:30",
	            "20:30",
	            "21:00"));
		
		System.out.println("SESSÕES");
		int i = 1;
		for(String horarios : arrSessoes) {
			System.out.println(i + " - " +horarios);
			i++;
		}
		
		System.out.print("DIGITE O NÚMERO CORRESPONDENTE A SESSÃO: ");
		int opc = sc.nextInt();
		ingresso.setHorarioSecao(arrSessoes.get(opc-1));
		selecionarIngressos();
	}
	
	public void selecionarIngressos() {
		System.out.println("QUANTAS ENTRADAS INTEIRAS (R$ 24,00)? ");
		ingresso.setIngressoInteira(sc.nextInt());
		System.out.println("QUANTAS ENTRADAS MEIAS (R$ 12,00)? ");
		ingresso.setIngressoMeia(sc.nextInt());
		finalizaCompra(ingresso.getIngressoInteira(), ingresso.getIngressoMeia());
	}
	
	public void finalizaCompra(int qtdInteira, int qtdMeia) {
		
		double totalIngressos = (qtdInteira * 24.00) + (qtdMeia * 12.00);
		
		System.out.println("VOCÊ IRÁ ASSISTIR " + ingresso.getFilme()  
				+ "\nNA SESSÃO DE " + ingresso.getHorarioSecao());
		
		System.out.println("INTEIRAS: " + ingresso.getIngressoInteira() + " x R$ 24,00");
		System.out.println("MEIAS: " + ingresso.getIngressoMeia() + " x R$ 12,00");
		System.out.println("TOTAL A PAGAR: " + NumberFormat.getCurrencyInstance(new Locale("pt-BR", "BR")).format(totalIngressos));
	}

	
}

	

