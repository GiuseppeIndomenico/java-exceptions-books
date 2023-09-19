package org.java;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.java.book.Libro;

public class Main {
	
	private static final String FILE_PATH = "C:\\esercizi_file\\libri.txt";

	
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
		FileWriter myWriter = null;

		try {
		    myWriter = new FileWriter(FILE_PATH);

		    for (int x = 0; x < booksCount; x++) {
		        myWriter.write("\nlibro " + (x + 1) + "\n");
		        myWriter.write("------------------\n");
		        myWriter.write(libri[x].toString() + "\n");
		    }
		} catch (IOException e) {
		    System.out.println("Errore nell'apertura o scrittura del file: " + e.getMessage());
		} finally {
		    try {
		        if (myWriter != null) {
		            myWriter.close();
		        }
		    } catch (IOException e) {
		        System.out.println("Errore nella chiusura del file: " + e.getMessage());
		    }
		}


		

				File tmpFile = new File(FILE_PATH);
				Scanner reader = null;
				try {
					
					reader = new Scanner(tmpFile);
					
					while (reader.hasNextLine()) {
						
						String line = reader.nextLine();
						System.out.println(line);
					}
				} catch (Exception e) { 
				
					System.out.println("Error reading file: " + e.getMessage());
				} finally {
					
					if (reader != null)
						reader.close();
				}
			
	}
	
}
