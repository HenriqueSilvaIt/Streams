package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PipelineAula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		
		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		// o map vai pegar cada elemento x da lista e transforma em outra elemento
		// conforme for definido na expressao , que no caso é x elemento original
		// * 10
		System.out.println(Arrays.toString(st1.toArray()));
		
		
		// somatorio
		int sum = list.stream().reduce(0, (x, y) -> x + y);
		// reduce é uma operação terminal ele
		//  pega um elemento inicial que é um elemento neutro
		// e depois uma função que recebe 2 arguamento ,(x,y)
		// então  o elemento inicial, vai somar a quantidade
		// d itens dessa lista
	
		System.out.println("Sum = " + sum);
		
		// Produtorio
		
		// Se você quissese multiplicar os elementos da sua lista, seria assim:
		//int sum2 = list.stream().reduce(1, (x, y) -> x * y);
		//tem que ser assim porque o elemento inicial tem que ser um elemento neutro
		// e um elementro neutro de uma multiplicaçaõ é 1
		
		//Operacoes Intermediarias
		
		List<Integer> newList = list.stream()
				.filter(x -> x % 2 == 0)
				// o filter filtra a sua lista
				// nos colocamos como argumento nele um predicado
				// e ele só vai retornar os elementos que satisfacam esse predicado
				// no caso estou filtrando somente os números pares
				.map(x -> x *10)
				// o map vai pegar esses elementos pares filtrados e multiplicar
				// por 10
				.collect(Collectors.toList());
		// e para converter essa stream para lista usamos a função acima 
		
		System.out.println(Arrays.toString(newList.toArray()));
		
		// list também aceita o toArray
		
	
		for (Integer i : newList) {
			
			 System.out.print("[" + i);
			 int result = i;
			 if (result == i) {
				 System.out.print(",");
			 }
		}

		
		
	}

}
