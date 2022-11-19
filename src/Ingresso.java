import java.util.ArrayList;
import java.util.List;

public class Ingresso {

	private String filme;
	private int ingressoMeia;
	private int ingressoInteira;
	private String horarioSecao;
	
	public String getFilme() {
		return filme;
	}
	public void setFilme(String filme) {
		this.filme = filme;
	}
	public int getIngressoMeia() {
		return ingressoMeia;
	}
	public void setIngressoMeia(int ingressoMeia) {
		this.ingressoMeia = ingressoMeia;
	}
	public int getIngressoInteira() {
		return ingressoInteira;
	}
	public void setIngressoInteira(int ingressoInteira) {
		this.ingressoInteira = ingressoInteira;
	}
	public String getHorarioSecao() {
		return horarioSecao;
	}
	public void setHorarioSecao(String horarioSecao) {
		this.horarioSecao = horarioSecao;
	}
	
	@Override
	public String toString() {
		return "Ingresso [filme=" + filme + ", ingressoMeia=" + ingressoMeia + ", ingressoInteira=" + ingressoInteira
				+ ", horarioSecao=" + horarioSecao + "]";
	}
	
	

	
}
