/**
 * Biblio.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws;

public class Biblio  implements java.io.Serializable {
    private int idb;

    private java.lang.String nomB;

    public Biblio() {
    }

    public Biblio(
           int idb,
           java.lang.String nomB) {
           this.idb = idb;
           this.nomB = nomB;
    }


    /**
     * Gets the idb value for this Biblio.
     * 
     * @return idb
     */
    public int getIdb() {
        return idb;
    }


    /**
     * Sets the idb value for this Biblio.
     * 
     * @param idb
     */
    public void setIdb(int idb) {
        this.idb = idb;
    }


    /**
     * Gets the nomB value for this Biblio.
     * 
     * @return nomB
     */
    public java.lang.String getNomB() {
        return nomB;
    }


    /**
     * Sets the nomB value for this Biblio.
     * 
     * @param nomB
     */
    public void setNomB(java.lang.String nomB) {
        this.nomB = nomB;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Biblio)) return false;
        Biblio other = (Biblio) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.idb == other.getIdb() &&
            ((this.nomB==null && other.getNomB()==null) || 
             (this.nomB!=null &&
              this.nomB.equals(other.getNomB())));
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
        _hashCode += getIdb();
        if (getNomB() != null) {
            _hashCode += getNomB().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Biblio.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws", "Biblio"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idb");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws", "idb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomB");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws", "nomB"));
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
