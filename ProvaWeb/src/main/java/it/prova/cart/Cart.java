/**
 * 
 */
package it.prova.cart;

import java.util.ArrayList;
import java.util.Iterator;

import it.prova.beans.ProdottoWrapper;

/**
 * @author marco
 *
 */
public class Cart {
	private ArrayList<ProdottoWrapper> carrello = new ArrayList();
	private Integer quantiProdottiCiSono;
	private Double prezzoTotale;
	/**
	 * 
	 */
	public Cart() {
		// TODO Auto-generated constructor stub
	}

	public Boolean aggiungiProdotto(ProdottoWrapper p) {
		
		Iterator it = carrello.iterator();
		while (it.hasNext()) {
			ProdottoWrapper prod = (ProdottoWrapper) it.next();
			
			// if  il prodotto è presente
			// sommi la quantità 
			
			
		}
		
		
		
		try {
			carrello.add(p);
		} catch (Exception e) {
			e.printStackTrace();	
			return false;
		}
		return true;
	}

	public Integer getQuantiProdottiCiSono() {
		quantiProdottiCiSono = carrello.size(); 
		return quantiProdottiCiSono;
	}

	public void setQuantiProdottiCiSono(Integer quantiProdottiCiSono) {
		this.quantiProdottiCiSono = carrello.size();
	}

	public Double getPrezzoTotale() {
		prezzoTotale = (double) 0;
		Iterator<ProdottoWrapper> i = carrello.iterator();
		while (i.hasNext()) {
			ProdottoWrapper prodottow = (ProdottoWrapper) i.next();
			prezzoTotale = prezzoTotale + prodottow.getP().getPrezzo() * prodottow.getQuantita() ;
		}
		return prezzoTotale;
	}

	public void setPrezzoTotale(Double prezzoTotale) {
		this.prezzoTotale = prezzoTotale;
	}
	
	public Boolean togliProdotto (ProdottoWrapper p) {
		return true;
	}
	
	public Boolean togliProdotto (ProdottoWrapper p, Integer quantita) {
		return true;
	}

	public Boolean svuotaCarrello () {
		return true;
	}

}
