import java.util.ArrayList;
import java.util.List;

public class Filme {
	
	private String nome;
	private String diretor;
	private String descricao;
	private String genero;
	private String duracaoFilme;
	
	private List<Filme> filmes = new ArrayList<>();
	
	public List<Filme> getFilmes() {
		return filmes;
	}
	public void setFilmes(List<Filme> filmes) {
		this.filmes = filmes;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDiretor() {
		return diretor;
	}
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getDuracaoFilme() {
		return duracaoFilme;
	}
	public void setDuracaoFilme(String duracaoFilme) {
		this.duracaoFilme = duracaoFilme;
	}
	
	@Override
	public String toString() {
		return "NOME: " + nome + "\nDIREÇÃO: " + diretor + "\n\nSINOPSE:" + descricao + "\nGENERO: " + genero
				+ "\nDURAÇÃO: " + duracaoFilme + "\n";
	}
	

}
