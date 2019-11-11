package no.hvl.dat100.jplab12.oppgave3;

import no.hvl.dat100.jplab12.common.TODO;
import no.hvl.dat100.jplab12.oppgave1.*;

public class Blogg {

	private Innlegg[] innleggtabell;
	private int nesteledige;

	public Blogg() {
		
		this.innleggtabell = new Innlegg[20];
		this.nesteledige = 0;
		
	}

	public Blogg(int lengde) {
		
		this.innleggtabell = new Innlegg[lengde];
		this.nesteledige = 0;
	}

	public int getAntall() {
		
		return nesteledige;
	}
	
	public Innlegg[] getSamling() {
		
		return innleggtabell;
	}
	
	public int finnInnlegg(Innlegg innlegg) {

		int p = -1;
		int i = 0;
		
		while (i < nesteledige && p == -1) {
			if (innleggtabell[i].erLik(innlegg)) {
				p = i;
			}
			i++;
		}
		return p;
	}

	public boolean finnes(Innlegg innlegg) {
		
		for (Innlegg innleggTab : innleggtabell) {
			if (innleggTab != null && innleggTab.getId() == innlegg.getId()) {
				return true;
			}
		}
			return false;
	}
	
	public boolean ledigPlass() {
		
		boolean lp = false;
		
		for (Innlegg i : innleggtabell) {
			if (i==null) {
				lp = true;
				break;
			}
		}
			return lp;
	}
	
	public boolean leggTil(Innlegg innlegg) {

		if (ledigPlass() == true) {
			innleggtabell[nesteledige] = innlegg;
			nesteledige++;
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		
		String string = getAntall() + "\n";
		for (Innlegg i : innleggtabell) {
			if (i != null) {
				string += i.toString();
			}
		}
		return string;
	}
	
	
	
	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}