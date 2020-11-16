/**
 * Book.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws;

public class Book  implements java.io.Serializable {
    private java.lang.String auteurBk;

    private java.lang.String date_edition;

    private int idB;

    private int idBk;

    private java.lang.String nomB;

    private java.lang.String nomBk;

    private java.lang.String path;

    private java.lang.Double prixBx;

    private int qnt;

    public Book() {
    }

    public Book(
           java.lang.String auteurBk,
           java.lang.String date_edition,
           int idB,
           int idBk,
           java.lang.String nomB,
           java.lang.String nomBk,
           java.lang.String path,
           java.lang.Double prixBx,
           int qnt) {
           this.auteurBk = auteurBk;
           this.date_edition = date_edition;
           this.idB = idB;
           this.idBk = idBk;
           this.nomB = nomB;
           this.nomBk = nomBk;
           this.path = path;
           this.prixBx = prixBx;
           this.qnt = qnt;
    }


    /**
     * Gets the auteurBk value for this Book.
     * 
     * @return auteurBk
     */
    public java.lang.String getAuteurBk() {
        return auteurBk;
    }


    /**
     * Sets the auteurBk value for this Book.
     * 
     * @param auteurBk
     */
    public void setAuteurBk(java.lang.String auteurBk) {
        this.auteurBk = auteurBk;
    }


    /**
     * Gets the date_edition value for this Book.
     * 
     * @return date_edition
     */
    public java.lang.String getDate_edition() {
        return date_edition;
    }


    /**
     * Sets the date_edition value for this Book.
     * 
     * @param date_edition
     */
    public void setDate_edition(java.lang.String date_edition) {
        this.date_edition = date_edition;
    }


    /**
     * Gets the idB value for this Book.
     * 
     * @return idB
     */
    public int getIdB() {
        return idB;
    }


    /**
     * Sets the idB value for this Book.
     * 
     * @param idB
     */
    public void setIdB(int idB) {
        this.idB = idB;
    }


    /**
     * Gets the idBk value for this Book.
     * 
     * @return idBk
     */
    public int getIdBk() {
        return idBk;
    }


    /**
     * Sets the idBk value for this Book.
     * 
     * @param idBk
     */
    public void setIdBk(int idBk) {
        this.idBk = idBk;
    }


    /**
     * Gets the nomB value for this Book.
     * 
     * @return nomB
     */
    public java.lang.String getNomB() {
        return nomB;
    }


    /**
     * Sets the nomB value for this Book.
     * 
     * @param nomB
     */
    public void setNomB(java.lang.String nomB) {
        this.nomB = nomB;
    }


    /**
     * Gets the nomBk value for this Book.
     * 
     * @return nomBk
     */
    public java.lang.String getNomBk() {
        return nomBk;
    }


    /**
     * Sets the nomBk value for this Book.
     * 
     * @param nomBk
     */
    public void setNomBk(java.lang.String nomBk) {
        this.nomBk = nomBk;
    }


    /**
     * Gets the path value for this Book.
     * 
     * @return path
     */
    public java.lang.String getPath() {
        return path;
    }


    /**
     * Sets the path value for this Book.
     * 
     * @param path
     */
    public void setPath(java.lang.String path) {
        this.path = path;
    }


    /**
     * Gets the prixBx value for this Book.
     * 
     * @return prixBx
     */
    public java.lang.Double getPrixBx() {
        return prixBx;
    }


    /**
     * Sets the prixBx value for this Book.
     * 
     * @param prixBx
     */
    public void setPrixBx(java.lang.Double prixBx) {
        this.prixBx = prixBx;
    }


    /**
     * Gets the qnt value for this Book.
     * 
     * @return qnt
     */
    public int getQnt() {
        return qnt;
    }


    /**
     * Sets the qnt value for this Book.
     * 
     * @param qnt
     */
    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Book)) return false;
        Book other = (Book) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.auteurBk==null && other.getAuteurBk()==null) || 
             (this.auteurBk!=null &&
              this.auteurBk.equals(other.getAuteurBk()))) &&
            ((this.date_edition==null && other.getDate_edition()==null) || 
             (this.date_edition!=null &&
              this.date_edition.equals(other.getDate_edition()))) &&
            this.idB == other.getIdB() &&
            this.idBk == other.getIdBk() &&
            ((this.nomB==null && other.getNomB()==null) || 
             (this.nomB!=null &&
              this.nomB.equals(other.getNomB()))) &&
            ((this.nomBk==null && other.getNomBk()==null) || 
             (this.nomBk!=null &&
              this.nomBk.equals(other.getNomBk()))) &&
            ((this.path==null && other.getPath()==null) || 
             (this.path!=null &&
              this.path.equals(other.getPath()))) &&
            ((this.prixBx==null && other.getPrixBx()==null) || 
             (this.prixBx!=null &&
              this.prixBx.equals(other.getPrixBx()))) &&
            this.qnt == other.getQnt();
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
        if (getAuteurBk() != null) {
            _hashCode += getAuteurBk().hashCode();
        }
        if (getDate_edition() != null) {
            _hashCode += getDate_edition().hashCode();
        }
        _hashCode += getIdB();
        _hashCode += getIdBk();
        if (getNomB() != null) {
            _hashCode += getNomB().hashCode();
        }
        if (getNomBk() != null) {
            _hashCode += getNomBk().hashCode();
        }
        if (getPath() != null) {
            _hashCode += getPath().hashCode();
        }
        if (getPrixBx() != null) {
            _hashCode += getPrixBx().hashCode();
        }
        _hashCode += getQnt();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Book.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws", "Book"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auteurBk");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws", "auteurBk"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_edition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws", "date_edition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idB");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws", "idB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idBk");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws", "idBk"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomB");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws", "nomB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomBk");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws", "nomBk"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("path");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws", "path"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prixBx");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws", "prixBx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qnt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws", "qnt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
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
