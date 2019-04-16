package services;

public interface ServicoDePagamentoOnline {

	double pagamentoDaTaxa(double quantia);
	double mensal(double quantia, int meses);
}
