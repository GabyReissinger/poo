package exercicio08;

public class Produto {
	private int codigo;
	private String descricao;
	private double valor;
	Categoria categoria;

	public Produto(int codigo, String descricao, double valor, Categoria categoria) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
		this.categoria = categoria;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getValor() {
		return valor;
	}

	public Categoria getCategoria() {
		return categoria;
	}

}
