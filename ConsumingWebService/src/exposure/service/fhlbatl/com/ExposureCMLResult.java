/**
 * ExposureCMLResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package exposure.service.fhlbatl.com;

public class ExposureCMLResult  implements java.io.Serializable {
    private java.lang.Double CMLAmt;

    private java.lang.Integer CMLFactor;

    public ExposureCMLResult() {
    }

    public ExposureCMLResult(
           java.lang.Double CMLAmt,
           java.lang.Integer CMLFactor) {
           this.CMLAmt = CMLAmt;
           this.CMLFactor = CMLFactor;
    }


    /**
     * Gets the CMLAmt value for this ExposureCMLResult.
     * 
     * @return CMLAmt
     */
    public java.lang.Double getCMLAmt() {
        return CMLAmt;
    }


    /**
     * Sets the CMLAmt value for this ExposureCMLResult.
     * 
     * @param CMLAmt
     */
    public void setCMLAmt(java.lang.Double CMLAmt) {
        this.CMLAmt = CMLAmt;
    }


    /**
     * Gets the CMLFactor value for this ExposureCMLResult.
     * 
     * @return CMLFactor
     */
    public java.lang.Integer getCMLFactor() {
        return CMLFactor;
    }


    /**
     * Sets the CMLFactor value for this ExposureCMLResult.
     * 
     * @param CMLFactor
     */
    public void setCMLFactor(java.lang.Integer CMLFactor) {
        this.CMLFactor = CMLFactor;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExposureCMLResult)) return false;
        ExposureCMLResult other = (ExposureCMLResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CMLAmt==null && other.getCMLAmt()==null) || 
             (this.CMLAmt!=null &&
              this.CMLAmt.equals(other.getCMLAmt()))) &&
            ((this.CMLFactor==null && other.getCMLFactor()==null) || 
             (this.CMLFactor!=null &&
              this.CMLFactor.equals(other.getCMLFactor())));
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
        if (getCMLAmt() != null) {
            _hashCode += getCMLAmt().hashCode();
        }
        if (getCMLFactor() != null) {
            _hashCode += getCMLFactor().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExposureCMLResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://com.fhlbatl.service.exposure", "exposureCMLResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CMLAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CMLAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CMLFactor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CMLFactor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
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
