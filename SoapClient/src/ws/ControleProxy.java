package ws;

public class ControleProxy implements ws.Controle {
  private String _endpoint = null;
  private ws.Controle controle = null;
  
  public ControleProxy() {
    _initControleProxy();
  }
  
  public ControleProxy(String endpoint) {
    _endpoint = endpoint;
    _initControleProxy();
  }
  
  private void _initControleProxy() {
    try {
      controle = (new ws.ControleServiceLocator()).getControle();
      if (controle != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)controle)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)controle)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (controle != null)
      ((javax.xml.rpc.Stub)controle)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ws.Controle getControle() {
    if (controle == null)
      _initControleProxy();
    return controle;
  }
  
  public ws.Client[] getClients(java.lang.String email, java.lang.String pass) throws java.rmi.RemoteException{
    if (controle == null)
      _initControleProxy();
    return controle.getClients(email, pass);
  }
  
  public void ajouter(ws.Client c) throws java.rmi.RemoteException{
    if (controle == null)
      _initControleProxy();
    controle.ajouter(c);
  }
  
  public boolean estAdmin(java.lang.String email, java.lang.String pass) throws java.rmi.RemoteException{
    if (controle == null)
      _initControleProxy();
    return controle.estAdmin(email, pass);
  }
  
  public void addCommande(ws.Commande c) throws java.rmi.RemoteException{
    if (controle == null)
      _initControleProxy();
    controle.addCommande(c);
  }
  
  public ws.Book[] getBook() throws java.rmi.RemoteException{
    if (controle == null)
      _initControleProxy();
    return controle.getBook();
  }
  
  public void addBook(ws.Book b) throws java.rmi.RemoteException{
    if (controle == null)
      _initControleProxy();
    controle.addBook(b);
  }
  
  public ws.Book getBok(int id) throws java.rmi.RemoteException{
    if (controle == null)
      _initControleProxy();
    return controle.getBok(id);
  }
  
  public ws.Commande[] getCommandes(java.lang.String email, java.lang.String pass) throws java.rmi.RemoteException{
    if (controle == null)
      _initControleProxy();
    return controle.getCommandes(email, pass);
  }
  
  public ws.Client logIn(java.lang.String email, java.lang.String pass) throws java.rmi.RemoteException{
    if (controle == null)
      _initControleProxy();
    return controle.logIn(email, pass);
  }
  
  public ws.Book[] getBookB(int cat) throws java.rmi.RemoteException{
    if (controle == null)
      _initControleProxy();
    return controle.getBookB(cat);
  }
  
  public void addBiblio(ws.Biblio bb) throws java.rmi.RemoteException{
    if (controle == null)
      _initControleProxy();
    controle.addBiblio(bb);
  }
  
  public ws.Biblio[] getCategorie() throws java.rmi.RemoteException{
    if (controle == null)
      _initControleProxy();
    return controle.getCategorie();
  }
  
  public void addArticle(int idc, int idb) throws java.rmi.RemoteException{
    if (controle == null)
      _initControleProxy();
    controle.addArticle(idc, idb);
  }
  
  public void removeArticle(int idc, int idb) throws java.rmi.RemoteException{
    if (controle == null)
      _initControleProxy();
    controle.removeArticle(idc, idb);
  }
  
  public ws.Book[] getPanier(int idc) throws java.rmi.RemoteException{
    if (controle == null)
      _initControleProxy();
    return controle.getPanier(idc);
  }
  
  public void sousArticle(int idc, int idb) throws java.rmi.RemoteException{
    if (controle == null)
      _initControleProxy();
    controle.sousArticle(idc, idb);
  }
  
  public void vider(int idc) throws java.rmi.RemoteException{
    if (controle == null)
      _initControleProxy();
    controle.vider(idc);
  }
  
  
}