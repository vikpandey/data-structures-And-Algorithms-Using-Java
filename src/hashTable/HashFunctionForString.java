package hashTable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import linkedList.ListNode;

public class HashFunctionForString {
	
	private int N;
	private static Integer arraySize;
	private int data;
	
	ListNode node = new ListNode(data);

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		System.out.println("enter array size:- ");
		arraySize = sc1.nextInt();
		
		while(true) {
		/*System.out.println("enter a string:- ");
		String s = br.readLine();
		System.out.println("enter an Integer:- ");
		*/
		Integer num = br.read();
		//String s = sc.nextLine();
		//hashValue(s);
		//System.out.println("hash code is:- " + hash(s, arraySize));
		System.out.println("hash code for Integer is:- " + hash(num, arraySize));
		}
		
	}
	
	public static void hashValue(String s) {
		int hash = 0;
		Character[] ch = new Character[s.length()];
		// System.out.println("hash code for String:- " + s + " is - " + s.hashCode());
		for(int i = 0; i < s.length(); i++) {
			ch[i] = s.charAt(i);
			hash = ch[i].hashCode();
			System.out.println("hash value for " + ch[i] + " is:- " + hash);
		}
	}
	
	public static int hash(Integer num, Integer aSize) {
		return (num.hashCode() % 0x7fffffff) % aSize;
	}	
	
	public static int hash(String s, Integer aSize) {
		return (s.hashCode() & 0x7fffffff) % aSize;
	}
}
