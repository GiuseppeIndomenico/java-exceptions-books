package org.java.book;

public class Libro {
	private String titolo;
	private String autore;
	private String editore;
	private int numPag;
	

	public	Libro(String titolo, String autore, String editore, int numPag) throws Exception {
			setTitolo(titolo);
			setAutore(autore);
			setEditore(editore);
			setNumPag(numPag);
	}


	public String getTitolo() {
		return titolo;
	}


	public void setTitolo(String titolo) throws Exception {
		if (titolo.isBlank())
			throw new Exception("è necessario un titolo");
		
		this.titolo = titolo;
	}


	public String getAutore() {
		return autore;
	}


	public void setAutore(String autore) throws Exception {
		if (autore.isBlank())
			throw new Exception("è necessario un autore");
		this.autore = autore;
	}


	public String getEditore() {
		
		return editore;
	}


	public void setEditore(String editore) throws Exception {
		if (editore.isBlank())
			throw new Exception("è necessario un editore");
		
		this.editore = editore;
	}


	public int getNumPag() {
		return numPag;
	}


	public void setNumPag(int numPag) throws Exception {
		if(numPag<=0)
			throw new Exception("le pagine non possono essere 0 o inferiori!");
			this.numPag = numPag;
	}
	
	@Override
	public String toString() {

		return "Titolo: " + getTitolo() + 
		"\nAutore: " + getAutore() +
		"\nEdito da: " + getEditore() + 
		"\nNumero di pagine: " + getNumPag();
		
	}
}