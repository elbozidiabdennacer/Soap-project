/**
 * Client.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws;

public class Client  implements java.io.Serializable {
    private java.lang.String addresseC;

    private java.lang.String email;

    private int idC;

    private java.lang.String nomC;

    private java.lang.String password;

    private java.lang.String prenomC;

    private java.lang.String teleC;

    public Client() {
    }

    public Client(
           java.lang.String addresseC,
           java.lang.String email,
           int idC,
           java.lang.String nomC,
           java.lang.String password,
           java.lang.String prenomC,
           java.lang.String teleC) {
           this.addresseC = addresseC;
           this.email = email;
           this.idC = idC;
           this.nomC = nomC;
           this.password = password;
           this.prenomC = prenomC;
           this.teleC = teleC;
    }


    /**
     * Gets the addresseC value for this Client.
     * 
     * @return addresseC
     */
    public java.lang.String getAddresseC() {
        return addresseC;
    }


    /**
     * Sets the addresseC value for this Client.
     * 
     * @param addresseC
     */
    public void setAddresseC(java.lang.String addresseC) {
        this.addresseC = addresseC;
    }


    /**
     * Gets the email value for this Client.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this Client.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the idC value for this Client.
     * 
     * @return idC
     */
    public int getIdC() {
        return idC;
    }


    /**
     * Sets the idC value for this Client.
     * 
     * @param idC
     */
    public void setIdC(int idC) {
        this.idC = idC;
    }


    /**
     * Gets the nomC value for this Client.
     * 
     * @return nomC
     */
    public java.lang.String getNomC() {
        return nomC;
    }


    /**
     * Sets the nomC value for this Client.
     * 
     * @param nomC
     */
    public void setNomC(java.lang.String nomC) {
        this.nomC = nomC;
    }


    /**
     * Gets the password value for this Client.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this Client.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the prenomC value for this Client.
     * 
     * @return prenomC
     */
    public java.lang.String getPrenomC() {
        return prenomC;
    }


    /**
     * Sets the prenomC value for this Client.
     * 
     * @param prenomC
     */
    public void setPrenomC(java.lang.String prenomC) {
        this.prenomC = prenomC;
    }


    /**
     * Gets the teleC value for this Client.
     * 
     * @return teleC
     */
    public java.lang.String getTeleC() {
        return teleC;
    }


    /**
     * Sets the teleC value for this Client.
     * 
     * @param teleC
     */
    public void setTeleC(java.lang.String teleC) {
        this.teleC = teleC;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Client)) return false;
        Client other = (Client) obj;
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
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            this.idC == other.getIdC() &&
            ((this.nomC==null && other.getNomC()==null) || 
             (this.nomC!=null &&
              this.nomC.equals(other.getNomC()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.prenomC==null && other.getPrenomC()==null) || 
             (this.prenomC!=null &&
              this.prenomC.equals(other.getPrenomC()))) &&
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
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        _hashCode += getIdC();
        if (getNomC() != null) {
            _hashCode += getNomC().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getPrenomC() != null) {
            _hashCode += getPrenomC().hashCode();
        }
        if (getTeleC() != null) {
            _hashCode += getTeleC().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Client.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws", "Client"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addresseC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws", "addresseC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws", "idC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws", "nomC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws", "password"));
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
