/**
 * Controle.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws;

public interface Controle extends java.rmi.Remote {
    public ws.Client[] getClients(java.lang.String email, java.lang.String pass) throws java.rmi.RemoteException;
    public void ajouter(ws.Client c) throws java.rmi.RemoteException;
    public boolean estAdmin(java.lang.String email, java.lang.String pass) throws java.rmi.RemoteException;
    public void addCommande(ws.Commande c) throws java.rmi.RemoteException;
    public ws.Book[] getBook() throws java.rmi.RemoteException;
    public void addBook(ws.Book b) throws java.rmi.RemoteException;
    public ws.Book getBok(int id) throws java.rmi.RemoteException;
    public ws.Commande[] getCommandes(java.lang.String email, java.lang.String pass) throws java.rmi.RemoteException;
    public ws.Client logIn(java.lang.String email, java.lang.String pass) throws java.rmi.RemoteException;
    public ws.Book[] getBookB(int cat) throws java.rmi.RemoteException;
    public void addBiblio(ws.Biblio bb) throws java.rmi.RemoteException;
    public ws.Biblio[] getCategorie() throws java.rmi.RemoteException;
    public void addArticle(int idc, int idb) throws java.rmi.RemoteException;
    public void removeArticle(int idc, int idb) throws java.rmi.RemoteException;
    public ws.Book[] getPanier(int idc) throws java.rmi.RemoteException;
    public void sousArticle(int idc, int idb) throws java.rmi.RemoteException;
    public void vider(int idc) throws java.rmi.RemoteException;
}
