package ws;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Client {

	private int IdC;
	private String NomC,PrenomC,Email,AddresseC,TeleC,Password;
	
	public Client(String nomC, String prenomC, String email, String addresseC, String teleC, String password) {
		super();
		NomC = nomC;
		PrenomC = prenomC;
		Email = email;
		AddresseC = addresseC;
		TeleC = teleC;
		Password = password;
	}
	
	public Client() {}
	
	public int getIdC() {
		return IdC;
	}
	public void setIdC(int idC) {
		IdC = idC;
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
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getAddresseC() {
		return AddresseC;
	}
	public void setAddresseC(String addresseC) {
		AddresseC = addresseC;
	}
	public String getTeleC() {
		return TeleC;
	}
	public void setTeleC(String teleC) {
		TeleC = teleC;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
}
