package aplicacao;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Programa {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random gerador = new Random();
		
		Set<Integer> a = new TreeSet<>();
		Set<Integer> b = new TreeSet<>();
		Set<Integer> c = new TreeSet<>();

		
		System.out.println("Quantos estudantes para o curso A (valor maximo:10 alunos)? ");
		int total = sc.nextInt();
		while (a.size() < total) {
			a.add(gerador.nextInt(11));
		}
		System.out.println("Numeros gerados: " + a);

		System.out.println("**************************************************");
		System.out.println("**************************************************");

		System.out.println("Quantos estudantes para o curso B (valor maximo:10 alunos)? ");
		total = sc.nextInt();
		while (b.size() < total) {
			b.add(gerador.nextInt(11));
		}
		System.out.println("Numeros gerados: " + b);
		
		System.out.println("**************************************************");
		System.out.println("**************************************************");
		
		System.out.println("Quantos estudantes para o curso C (valor maximo:10 alunos)? ");
		total = sc.nextInt();
		while (c.size() < total) {
			c.add(gerador.nextInt(11));
		}
		System.out.println("Numeros gerados: " + c);

		System.out.println("**************************************************");
		System.out.println("**************************************************");
		
		Set<Integer> somaTotal = new HashSet<>(a);
		somaTotal.addAll(b);
		somaTotal.addAll(c);

		System.out.println("Total de estudantes: " + somaTotal.size());
	}
}
