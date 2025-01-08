package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAula {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		
		// Criando uma Stream a partir da lista
		Stream<Integer> st1 = list.stream().map(x -> x *10);
		// map aplica uma operação a cada elemento do conjunto, nesse caso da stream
		// no exemplo acima ele pegou o elemento x (que representa cada elemento da
		// lista de stream e fez ele receber ele mesmo x * 10
		// esse isso multiplica cada elemento da list
		System.out.println(Arrays.toString(st1.toArray()));
		
		Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
		// Stream.of permite colocar os elementos direto
		// no entre ("), sem precisar pegar a lista
		
		System.out.println(Arrays.toString(st2.toArray()));
		
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
		// O iterate (arg, agr2) o primeiro argumento é valor do elemento e o segundo
		// é qual a função (calculo) que vai gerar o proximo elemento
		// nesse calculo acima ele vai calcular o valor de 0 + 2, e ir somando
		// sem parar
		System.out.println(Arrays.toString(st3.limit(8).toArray()))
		;
		// para limitar a soma do calculo usado no iterate acima utilizamos o limit()
		// e como o limit é uma função intermediaria, utilizamos o toArray para pegar
		// o conjunto de stream e imprimir na tela, porque o to toArray é uma
		// funcao terminal
		
		 //Gerando stream na frequenci de fibonat
		Stream<Long> st4 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long [] {p[1], p[0]+p[1]}).map(p -> p[0]);
		// map é utilizado para transforma esses pares do vetor em apenas um elemento
		System.out.println(Arrays.toString(st4.limit(10).toArray()));
	}	

}
