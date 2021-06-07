package at.htlklu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

import javax.naming.PartialResultException;

public class Exercise {
	private static ArrayList<Book> book = new ArrayList<Book>();

	public static void fillAray() {
		for (int i = 0; i < 6; i++) {
			book.add(new Book("A" + i * Math.random(), "B" + i, "C" + i));
		}
	}

	public static void main(String[] args) {
		fillAray();
		System.out.println("part6");
		part6();
		System.out.println("\n");
		System.out.println("part7");
		part7();
		System.out.println("\n");
		System.out.println("part8");
		part8();
		System.out.println("\n");
		System.out.println("part9");
		part9();
	}

	public static void part6() {
		System.out.println("unsorted");
		book.forEach(System.out::println);
		System.out.println("sorted");
		Collections.sort(book);
		book.forEach(System.out::println);
		System.out.println("reversed");
		Collections.reverse(book);
		book.forEach(System.out::println);

	}

	public static void part7() {
		HashSet<Book> hashSet = new HashSet<>();
		hashSet.addAll(book);
		hashSet.add(book.get(book.size() - 1));
		hashSet.forEach(System.out::println);
	}

	public static void part8() {
		HashMap<Integer, Book> hashMap = new HashMap<>();
		for (int i = 0; i < book.size(); i++) {
			hashMap.put(i, book.get(i));
		}
		hashMap.entrySet().forEach(e -> System.out.println(e.getValue()));
	}

	public static void part9() {
		TreeSet<Book> treeSet = new TreeSet<>();
		treeSet.addAll(book);
		treeSet.add(book.get(book.size()-1));
		treeSet.forEach(System.out::println);
	}
}
