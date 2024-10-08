package exercicios07;

import java.time.LocalDate;

public class Moto extends Veiculo {
	int cilindradas;

	public Moto(String modelo, LocalDate dataConserto, Proprietario proprietario, int cilindradas) {
		super(modelo, dataConserto, proprietario);
		this.cilindradas = cilindradas;
	}

	@Override
	public double lavarVeiculo() {
		valorCobrado += TipoServico.LAVAGEM.getValorPorServico();
		return valorCobrado;
	}

	@Override
	public double trocaOleo() {
		valorCobrado += TipoServico.OLEO.getValorPorServico();
		return valorCobrado;
	}

	@Override
	public double revisao() {
		valorCobrado += TipoServico.REVISAO.getValorPorServico();
		return valorCobrado;
	}

}
