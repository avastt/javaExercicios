package services;

public class PaypalServico implements ServicoDePagamentoOnline {
	
	private static final double TAXA_PORCENTAGEM = 0.02;
	private static final double MENSAL = 0.01;

	@Override
	public double pagamentoDaTaxa(double quantia) {
		return quantia  * TAXA_PORCENTAGEM;
	}

	@Override
	public double mensal(double quantia, int meses) {
		return (quantia * (meses * MENSAL));
	}
}
