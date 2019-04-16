package services;

import java.util.Calendar;
import java.util.Date;

import entities.Contrato;
import entities.Parcela;

public class ContratoDeServicos {

	private ServicoDePagamentoOnline servicoDePagamentoOnline;

	public ContratoDeServicos(ServicoDePagamentoOnline servicoDePagamentoOnline) {

		this.servicoDePagamentoOnline = servicoDePagamentoOnline;

	}

	public void processoDeContrato(Contrato contrato, int meses) {

		Double parcelaBasica = (contrato.getValorTotal() / meses);

		for (int i = 1; i <= meses; i++) {
			
			Date data = addMeses(contrato.getData(), i);
			Double parcelaAtualizada = parcelaBasica + servicoDePagamentoOnline.mensal(parcelaBasica, i);
			Double parcelaTotal = parcelaAtualizada + servicoDePagamentoOnline.pagamentoDaTaxa(parcelaAtualizada);

			Parcela parcelas = new Parcela();
			parcelas.setDataDeVencimento(data);
			parcelas.setQuantidade(parcelaTotal);
			contrato.addParcelas(parcelas);
		}
	}

	private Date addMeses(Date data, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}
}
