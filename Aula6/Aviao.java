package Aula6;

public class Aviao {
	String empresa;
	String codAviao;
	int numPassageiros;
	String endPartida;
	String endDestino;
	boolean escala;
	int vagas;
	
	public Aviao(String emp, String codA, int nPas) {
		empresa = emp;
		codAviao = codA;
		nPas = numPassageiros;
	}
	
	public void criarRota(String ePar, String eDes, boolean esc, int v) {
		endPartida = ePar;
		endDestino = eDes;
		escala = esc;
		vagas = v;
	}
	
	public String statusViagem() {
		String mensagem = ("Avi�o " + codAviao + " pertencente a " + empresa + " possui " + vagas +
				" assentos livres para a rota de " + endPartida + " at� " + endDestino + ".\nPossui escala? " + escala);				
		System.out.println(mensagem);
		return mensagem;
	}
	
	public static void main(String[] args) {
		Aviao a = new Aviao("LATAM", "BA-5678", 336);
		a.criarRota("S�o Paulo", "T�quio", true, 78);
		a.statusViagem();
	}

}