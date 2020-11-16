package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Biblio {

	private int Idb;
    private String NomB;
	 
	 public Biblio(int idb, String nomB) {
			super();
			Idb = idb;
			NomB = nomB;
		}
	 
	 
	 
	public Biblio() {
		super();
	}



	public int getIdb() {
		return Idb;
	}
	
	public void setIdb(int idb) {
		Idb = idb;
	}
	
	public String getNomB() {
		return NomB;
	}
	
	public void setNomB(String nomB) {
		NomB = nomB;
	}
	 
}
