package application;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Contrato;
import entities.Parcela;
import services.ContratoDeServicos;
import services.PaypalServico;

public class Programa {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		sc.useLocale(Locale.US);
		
		Contrato contrato = new Contrato();
		
		System.out.println("Número do contrato: ");
        contrato.setNumero(sc.nextInt());
        
        sc.nextLine();
		
        try {
        	System.out.println("Data do contrato: ");
            String dataString = sc.nextLine();
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            Date data = df.parse(dataString);
            contrato.setData(data);
        } catch (Exception ex) {
        	ex.printStackTrace();
        }
        
		System.out.println("Valor do contrato: ");
        contrato.setValorTotal(sc.nextDouble());
        
        System.out.println("Quantidade de parcelas: ");
        int n = sc.nextInt();
        
        ContratoDeServicos contratoDeServicos = new ContratoDeServicos(new PaypalServico());
        
        contratoDeServicos.processoDeContrato(contrato, n);
        
    	System.out.println("Parcelas:");
		for (Parcela x : contrato.getParcelas()) {
			System.out.println(x);
		}
		
		sc.close();
	}
}
