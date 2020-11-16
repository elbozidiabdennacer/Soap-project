package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Commande {
	
	private int IdC,IdBk,Qnt;
	private String Date,NomC,PrenomC,TeleC,AddresseC,NomBk,EmailC;
	
	
	
	public Commande(int idC, int idBk, int qnt, String date, String nomC, String prenomC, String teleC,
			String addresseC, String nomBk, String emailC) {
		super();
		IdC = idC;
		IdBk = idBk;
		Qnt = qnt;
		Date = date;
		NomC = nomC;
		PrenomC = prenomC;
		TeleC = teleC;
		AddresseC = addresseC;
		NomBk = nomBk;
		EmailC = emailC;
	}

	public String getNomC() {
		return NomC;
	}

	public void setNomC(String nomC) {
		NomC = nomC;
	}

	public String getPrenomC() {
		return PrenomC;
	}

	public void setPrenomC(String prenomC) {
		PrenomC = prenomC;
	}

	public String getTeleC() {
		return TeleC;
	}

	public void setTeleC(String teleC) {
		TeleC = teleC;
	}

	public String getAddresseC() {
		return AddresseC;
	}

	public void setAddresseC(String addresseC) {
		AddresseC = addresseC;
	}

	public String getNomBk() {
		return NomBk;
	}

	public void setNomBk(String nomBk) {
		NomBk = nomBk;
	}

	public String getEmailC() {
		return EmailC;
	}

	public void setEmailC(String emailC) {
		EmailC = emailC;
	}

	public Commande() {}

	public int getIdC() {
		return IdC;
	}

	public void setIdC(int idC) {
		IdC = idC;
	}

	public int getIdBk() {
		return IdBk;
	}

	public void setIdBk(int idBk) {
		IdBk = idBk;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}
	public int getQnt() {
		return Qnt;
	}

	public void setQnt(int qnt) {
		Qnt = qnt;
	}
	
	

}
