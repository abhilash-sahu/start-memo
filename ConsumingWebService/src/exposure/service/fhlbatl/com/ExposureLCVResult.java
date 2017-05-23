/**
 * ExposureLCVResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package exposure.service.fhlbatl.com;

public class ExposureLCVResult  implements java.io.Serializable {
    private java.lang.Boolean isAffiliate;

    private java.lang.Double LCVAmt;

    private java.lang.Integer LCVFactor;

    private java.lang.Integer memberID;

    public ExposureLCVResult() {
    }

    public ExposureLCVResult(
           java.lang.Boolean isAffiliate,
           java.lang.Double LCVAmt,
           java.lang.Integer LCVFactor,
           java.lang.Integer memberID) {
           this.isAffiliate = isAffiliate;
           this.LCVAmt = LCVAmt;
           this.LCVFactor = LCVFactor;
           this.memberID = memberID;
    }


    /**
     * Gets the isAffiliate value for this ExposureLCVResult.
     * 
     * @return isAffiliate
     */
    public java.lang.Boolean getIsAffiliate() {
        return isAffiliate;
    }


    /**
     * Sets the isAffiliate value for this ExposureLCVResult.
     * 
     * @param isAffiliate
     */
    public void setIsAffiliate(java.lang.Boolean isAffiliate) {
        this.isAffiliate = isAffiliate;
    }


    /**
     * Gets the LCVAmt value for this ExposureLCVResult.
     * 
     * @return LCVAmt
     */
    public java.lang.Double getLCVAmt() {
        return LCVAmt;
    }


    /**
     * Sets the LCVAmt value for this ExposureLCVResult.
     * 
     * @param LCVAmt
     */
    public void setLCVAmt(java.lang.Double LCVAmt) {
        this.LCVAmt = LCVAmt;
    }


    /**
     * Gets the LCVFactor value for this ExposureLCVResult.
     * 
     * @return LCVFactor
     */
    public java.lang.Integer getLCVFactor() {
        return LCVFactor;
    }


    /**
     * Sets the LCVFactor value for this ExposureLCVResult.
     * 
     * @param LCVFactor
     */
    public void setLCVFactor(java.lang.Integer LCVFactor) {
        this.LCVFactor = LCVFactor;
    }


    /**
     * Gets the memberID value for this ExposureLCVResult.
     * 
     * @return memberID
     */
    public java.lang.Integer getMemberID() {
        return memberID;
    }


    /**
     * Sets the memberID value for this ExposureLCVResult.
     * 
     * @param memberID
     */
    public void setMemberID(java.lang.Integer memberID) {
        this.memberID = memberID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExposureLCVResult)) return false;
        ExposureLCVResult other = (ExposureLCVResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.isAffiliate==null && other.getIsAffiliate()==null) || 
             (this.isAffiliate!=null &&
              this.isAffiliate.equals(other.getIsAffiliate()))) &&
            ((this.LCVAmt==null && other.getLCVAmt()==null) || 
             (this.LCVAmt!=null &&
              this.LCVAmt.equals(other.getLCVAmt()))) &&
            ((this.LCVFactor==null && other.getLCVFactor()==null) || 
             (this.LCVFactor!=null &&
              this.LCVFactor.equals(other.getLCVFactor()))) &&
            ((this.memberID==null && other.getMemberID()==null) || 
             (this.memberID!=null &&
              this.memberID.equals(other.getMemberID())));
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
        if (getIsAffiliate() != null) {
            _hashCode += getIsAffiliate().hashCode();
        }
        if (getLCVAmt() != null) {
            _hashCode += getLCVAmt().hashCode();
        }
        if (getLCVFactor() != null) {
            _hashCode += getLCVFactor().hashCode();
        }
        if (getMemberID() != null) {
            _hashCode += getMemberID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExposureLCVResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://com.fhlbatl.service.exposure", "exposureLCVResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAffiliate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isAffiliate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LCVAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LCVAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LCVFactor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LCVFactor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memberID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "memberID"));
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
