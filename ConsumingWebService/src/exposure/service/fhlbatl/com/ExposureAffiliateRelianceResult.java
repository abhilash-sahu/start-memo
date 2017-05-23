/**
 * ExposureAffiliateRelianceResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package exposure.service.fhlbatl.com;

public class ExposureAffiliateRelianceResult  implements java.io.Serializable {
    private java.lang.Double affiliateRelianceAmt;

    private java.lang.Integer affiliateRelianceFactor;

    public ExposureAffiliateRelianceResult() {
    }

    public ExposureAffiliateRelianceResult(
           java.lang.Double affiliateRelianceAmt,
           java.lang.Integer affiliateRelianceFactor) {
           this.affiliateRelianceAmt = affiliateRelianceAmt;
           this.affiliateRelianceFactor = affiliateRelianceFactor;
    }


    /**
     * Gets the affiliateRelianceAmt value for this ExposureAffiliateRelianceResult.
     * 
     * @return affiliateRelianceAmt
     */
    public java.lang.Double getAffiliateRelianceAmt() {
        return affiliateRelianceAmt;
    }


    /**
     * Sets the affiliateRelianceAmt value for this ExposureAffiliateRelianceResult.
     * 
     * @param affiliateRelianceAmt
     */
    public void setAffiliateRelianceAmt(java.lang.Double affiliateRelianceAmt) {
        this.affiliateRelianceAmt = affiliateRelianceAmt;
    }


    /**
     * Gets the affiliateRelianceFactor value for this ExposureAffiliateRelianceResult.
     * 
     * @return affiliateRelianceFactor
     */
    public java.lang.Integer getAffiliateRelianceFactor() {
        return affiliateRelianceFactor;
    }


    /**
     * Sets the affiliateRelianceFactor value for this ExposureAffiliateRelianceResult.
     * 
     * @param affiliateRelianceFactor
     */
    public void setAffiliateRelianceFactor(java.lang.Integer affiliateRelianceFactor) {
        this.affiliateRelianceFactor = affiliateRelianceFactor;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExposureAffiliateRelianceResult)) return false;
        ExposureAffiliateRelianceResult other = (ExposureAffiliateRelianceResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.affiliateRelianceAmt==null && other.getAffiliateRelianceAmt()==null) || 
             (this.affiliateRelianceAmt!=null &&
              this.affiliateRelianceAmt.equals(other.getAffiliateRelianceAmt()))) &&
            ((this.affiliateRelianceFactor==null && other.getAffiliateRelianceFactor()==null) || 
             (this.affiliateRelianceFactor!=null &&
              this.affiliateRelianceFactor.equals(other.getAffiliateRelianceFactor())));
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
        if (getAffiliateRelianceAmt() != null) {
            _hashCode += getAffiliateRelianceAmt().hashCode();
        }
        if (getAffiliateRelianceFactor() != null) {
            _hashCode += getAffiliateRelianceFactor().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExposureAffiliateRelianceResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://com.fhlbatl.service.exposure", "exposureAffiliateRelianceResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("affiliateRelianceAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "affiliateRelianceAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("affiliateRelianceFactor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "affiliateRelianceFactor"));
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
