/**
 * ExposureCreditAvailabilityResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package exposure.service.fhlbatl.com;

public class ExposureCreditAvailabilityResult  implements java.io.Serializable {
    private java.lang.Double creditAvailabilityAmt;

    private java.lang.Integer creditAvailabilityFactor;

    public ExposureCreditAvailabilityResult() {
    }

    public ExposureCreditAvailabilityResult(
           java.lang.Double creditAvailabilityAmt,
           java.lang.Integer creditAvailabilityFactor) {
           this.creditAvailabilityAmt = creditAvailabilityAmt;
           this.creditAvailabilityFactor = creditAvailabilityFactor;
    }


    /**
     * Gets the creditAvailabilityAmt value for this ExposureCreditAvailabilityResult.
     * 
     * @return creditAvailabilityAmt
     */
    public java.lang.Double getCreditAvailabilityAmt() {
        return creditAvailabilityAmt;
    }


    /**
     * Sets the creditAvailabilityAmt value for this ExposureCreditAvailabilityResult.
     * 
     * @param creditAvailabilityAmt
     */
    public void setCreditAvailabilityAmt(java.lang.Double creditAvailabilityAmt) {
        this.creditAvailabilityAmt = creditAvailabilityAmt;
    }


    /**
     * Gets the creditAvailabilityFactor value for this ExposureCreditAvailabilityResult.
     * 
     * @return creditAvailabilityFactor
     */
    public java.lang.Integer getCreditAvailabilityFactor() {
        return creditAvailabilityFactor;
    }


    /**
     * Sets the creditAvailabilityFactor value for this ExposureCreditAvailabilityResult.
     * 
     * @param creditAvailabilityFactor
     */
    public void setCreditAvailabilityFactor(java.lang.Integer creditAvailabilityFactor) {
        this.creditAvailabilityFactor = creditAvailabilityFactor;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExposureCreditAvailabilityResult)) return false;
        ExposureCreditAvailabilityResult other = (ExposureCreditAvailabilityResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.creditAvailabilityAmt==null && other.getCreditAvailabilityAmt()==null) || 
             (this.creditAvailabilityAmt!=null &&
              this.creditAvailabilityAmt.equals(other.getCreditAvailabilityAmt()))) &&
            ((this.creditAvailabilityFactor==null && other.getCreditAvailabilityFactor()==null) || 
             (this.creditAvailabilityFactor!=null &&
              this.creditAvailabilityFactor.equals(other.getCreditAvailabilityFactor())));
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
        if (getCreditAvailabilityAmt() != null) {
            _hashCode += getCreditAvailabilityAmt().hashCode();
        }
        if (getCreditAvailabilityFactor() != null) {
            _hashCode += getCreditAvailabilityFactor().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExposureCreditAvailabilityResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://com.fhlbatl.service.exposure", "exposureCreditAvailabilityResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditAvailabilityAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditAvailabilityAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditAvailabilityFactor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditAvailabilityFactor"));
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
