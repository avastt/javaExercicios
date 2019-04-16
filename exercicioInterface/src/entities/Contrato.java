package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {

	private Integer numero;
	private Date data;
	private Double valorTotal;
	private List<Parcela> parcelas = new ArrayList<>();

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	public void addParcelas(Parcela parcela) {
		parcelas.add(parcela);
	}
	
	public void removeParcelas(Parcela parcela) {
		parcelas.remove(parcela);
	}

	public List<Parcela> getParcelas() {
		return parcelas;
	}
}
