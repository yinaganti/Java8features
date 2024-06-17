package com.example.lambdaexpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class ExecuteClass {

	public static void main(String[] args) {
		
		//Interface2 inter = ()->10;
		//System.out.println(inter.sum());
		
		List<Integer> list = Arrays.asList(12,10,23,45);
		//Collections.sort(list); ASC
		//Collections.sort(list, (e1, e2)-> e1.compareTo(e2)); ASC
		/*
		Collections.sort(list, (e2, e1)-> {
			if(e2 > e1) 
				return -1;
			else if(e2 < e1)
				return 1;
			else
				return 0;
		}); DESC
		**/
		
		
		//Consumer<List<Integer>> con = (e)->System.out.println(e); // 1 input; no return
		//Consumer<List<Integer>> con = System.out::println;
		//IntConsumer con = System.out::println;
		//DoubleConsumer, LongConsumer
		//BiConsumer<Integer, Integer> con = (e, a) -> System.out.println(e * a); // 2 inputs, no return
		//con.accept(10, 20);
		
		//Consumer<Integer> con = a -> System.out.println(a*10);
		//con.andThen(b->System.out.println(b*20)).accept(20); // o/p : 200, 400
				
		
		//Predicate<Integer> pred = n-> n==10; // 1 input; have return(true/false)
		//BiPredicate<String, Integer> pred = (s, n)-> s.length() == n;// 2 inputs, have return
		//pred.test("sri", 3);
		
		//Predicate<String> prc = s-> s.length() > 10;
		//prc.and(n-> n.length() > 5).test("srik");// &&
		//prc.or(n-> n.length() < 5).test("srik"); // ||
		//prc.negate().test("sri"); ?? !true = false; !false = true
		
		//Function<Integer, Integer> fun = e-> e* 10;// 1 input, have return
		//Function<List<Integer>, Integer> fun = e-> e.stream().max(Comparator.comparing(Integer::new)).get();
		//BiFunction<Integer, Integer, Integer> fun = (a, b)-> a*b; // 2 input, have return
		 //UnaryOperator<Integer> fun = n -> n*10;// 1 input, have return but input and return type same type
		//BinaryOperator<Integer> fun = (a, b) -> a - b;// 2 input, have return but input and return type same types
		//fun.apply(100, 20);
		
		//Function<String, String> fun = s->s.substring(0, s.length()/2);
		//fun.andThen(n->n.substring(n.length()/2)).apply("srikanth"); // o/p : ik sol: x.andThen(y)
		/*
		Function<String, Integer> fun = s->s.length();
		Integer len = fun.compose(n -> {
			String v = (String) n;
			v = v.concat("yinaganti"); 
			return v;
		}).apply("srikanth");   // o/p:17 ; y.anThen(x); 
		**/
		
		
		//Supplier<String> sup = ()-> "some texrt";// no input, only return
		//sup.get();
		
	}
	

}
