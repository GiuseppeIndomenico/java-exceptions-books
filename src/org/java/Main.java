package org.java;

import java.util.Scanner;

import org.java.book.Libro;

public class Main {
	public static void main(String[] args)  {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Numero di libri: ");
		int booksCount = Integer.valueOf(sc.nextLine());
		
		Libro[] libri = new Libro[booksCount];
		
		
		for(int x=0; x<booksCount; x++) {
		
		
			try {	System.out.print("Titolo: ");
			String titolo = sc.nextLine();
			
			System.out.print("Autore: ");
			String autore = sc.nextLine();
			
			System.out.print("Editore: ");
			String editore = sc.nextLine();
			
			System.out.print("Numerodi pagine: ");
			int numPag = Integer.valueOf(sc.nextLine());
		
			Libro b = new Libro(titolo, autore, editore, numPag);
			libri[x] = b;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.err.println("dati libro non corretti: " + e.getMessage());
				x--;
			}
		
		}
		sc.close();
		
		for (int x=0;x<booksCount;x++) {
			
			
			System.out.println("\nlibro " + (x + 1));
			System.out.println("------------------");
			System.out.println(libri[x]);
			System.out.println("");
			
		}
	}
	
}
