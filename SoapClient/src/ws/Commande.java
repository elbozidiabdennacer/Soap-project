/**
 * Commande.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws;

public class Commande  implements java.io.Serializable {
    private java.lang.String addresseC;

    private java.lang.String date;

    private java.lang.String emailC;

    private int idBk;

    private int idC;

    private java.lang.String nomBk;

    private java.lang.String nomC;

    private java.lang.String prenomC;

    private int qnt;

    private java.lang.String teleC;

    public Commande() {
    }

    public Commande(
           java.lang.String addresseC,
           java.lang.String date,
           java.lang.String emailC,
           int idBk,
           int idC,
           java.lang.String nomBk,
           java.lang.String nomC,
           java.lang.String prenomC,
           int qnt,
           java.lang.String teleC) {
           this.addresseC = addresseC;
           this.date = date;
           this.emailC = emailC;
           this.idBk = idBk;
           this.idC = idC;
           this.nomBk = nomBk;
           this.nomC = nomC;
           this.prenomC = prenomC;
           this.qnt = qnt;
           this.teleC = teleC;
    }


    /**
     * Gets the addresseC value for this Commande.
     * 
     * @return addresseC
     */
    public java.lang.String getAddresseC() {
        return addresseC;
    }


    /**
     * Sets the addresseC value for this Commande.
     * 
     * @param addresseC
     */
    public void setAddresseC(java.lang.String addresseC) {
        this.addresseC = addresseC;
    }


    /**
     * Gets the date value for this Commande.
     * 
     * @return date
     */
    public java.lang.String getDate() {
        return date;
    }


    /**
     * Sets the date value for this Commande.
     * 
     * @param date
     */
    public void setDate(java.lang.String date) {
        this.date = date;
    }


    /**
     * Gets the emailC value for this Commande.
     * 
     * @return emailC
     */
    public java.lang.String getEmailC() {
        return emailC;
    }


    /**
     * Sets the emailC value for this Commande.
     * 
     * @param emailC
     */
    public void setEmailC(java.lang.String emailC) {
        this.emailC = emailC;
    }


    /**
     * Gets the idBk value for this Commande.
     * 
     * @return idBk
     */
    public int getIdBk() {
        return idBk;
    }


    /**
     * Sets the idBk value for this Commande.
     * 
     * @param idBk
     */
    public void setIdBk(int idBk) {
        this.idBk = idBk;
    }


    /**
     * Gets the idC value for this Commande.
     * 
     * @return idC
     */
    public int getIdC() {
        return idC;
    }


    /**
     * Sets the idC value for this Commande.
     * 
     * @param idC
     */
    public void setIdC(int idC) {
        this.idC = idC;
    }


    /**
     * Gets the nomBk value for this Commande.
     * 
     * @return nomBk
     */
    public java.lang.String getNomBk() {
        return nomBk;
    }


    /**
     * Sets the nomBk value for this Commande.
     * 
     * @param nomBk
     */
    public void setNomBk(java.lang.String nomBk) {
        this.nomBk = nomBk;
    }


    /**
     * Gets the nomC value for this Commande.
     * 
     * @return nomC
     */
    public java.lang.String getNomC() {
        return nomC;
    }


    /**
     * Sets the nomC value for this Commande.
     * 
     * @param nomC
     */
    public void setNomC(java.lang.String nomC) {
        this.nomC = nomC;
    }


    /**
     * Gets the prenomC value for this Commande.
     * 
     * @return prenomC
     */
    public java.lang.String getPrenomC() {
        return prenomC;
    }


    /**
     * Sets the prenomC value for this Commande.
     * 
     * @param prenomC
     */
    public void setPrenomC(java.lang.String prenomC) {
        this.prenomC = prenomC;
    }


    /**
     * Gets the qnt value for this Commande.
     * 
     * @return qnt
     */
    public int getQnt() {
        return qnt;
    }


    /**
     * Sets the qnt value for this Commande.
     * 
     * @param qnt
     */
    public void setQnt(int qnt) {
        this.qnt = qnt;
    }


    /**
     * Gets the teleC value for this Commande.
     * 
     * @return teleC
     */
    public java.lang.String getTeleC() {
        return teleC;
    }


    /**
     * Sets the teleC value for this Commande.
     * 
     * @param teleC
     */
    public void setTeleC(java.lang.String teleC) {
        this.teleC = teleC;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Commande)) return false;
        Commande other = (Commande) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addresseC==null && other.getAddresseC()==null) || 
             (this.addresseC!=null &&
              this.addresseC.equals(other.getAddresseC()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.emailC==null && other.getEmailC()==null) || 
             (this.emailC!=null &&
              this.emailC.equals(other.getEmailC()))) &&
            this.idBk == other.getIdBk() &&
            this.idC == other.getIdC() &&
            ((this.nomBk==null && other.getNomBk()==null) || 
             (this.nomBk!=null &&
              this.nomBk.equals(other.getNomBk()))) &&
            ((this.nomC==null && other.getNomC()==null) || 
             (this.nomC!=null &&
              this.nomC.equals(other.getNomC()))) &&
            ((this.prenomC==null && other.getPrenomC()==null) || 
             (this.prenomC!=null &&
              this.prenomC.equals(other.getPrenomC()))) &&
            this.qnt == other.getQnt() &&
            ((this.teleC==null && other.getTeleC()==null) || 
             (this.teleC!=null &&
              this.teleC.equals(other.getTeleC())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAddresseC() != null) {
            _hashCode += getAddresseC().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getEmailC() != null) {
            _hashCode += getEmailC().hashCode();
        }
        _hashCode += getIdBk();
        _hashCode += getIdC();
        if (getNomBk() != null) {
            _hashCode += getNomBk().hashCode();
        }
        if (getNomC() != null) {
            _hashCode += getNomC().hashCode();
        }
        if (getPrenomC() != null) {
            _hashCode += getPrenomC().hashCode();
        }
        _hashCode += getQnt();
        if (getTeleC() != null) {
            _hashCode += getTeleC().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Commande.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws", "Commande"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addresseC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws", "addresseC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws", "emailC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idBk");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws", "idBk"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws", "idC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomBk");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws", "nomBk"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws", "nomC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prenomC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws", "prenomC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qnt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws", "qnt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("teleC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws", "teleC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
