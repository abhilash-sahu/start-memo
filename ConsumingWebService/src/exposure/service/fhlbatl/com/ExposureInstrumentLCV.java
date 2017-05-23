/**
 * ExposureInstrumentLCV.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package exposure.service.fhlbatl.com;

public class ExposureInstrumentLCV  implements java.io.Serializable {
    private java.lang.String instrumentID;

    private java.lang.Double LCVAmt;

    private java.lang.Integer LCVPercent;

    public ExposureInstrumentLCV() {
    }

    public ExposureInstrumentLCV(
           java.lang.String instrumentID,
           java.lang.Double LCVAmt,
           java.lang.Integer LCVPercent) {
           this.instrumentID = instrumentID;
           this.LCVAmt = LCVAmt;
           this.LCVPercent = LCVPercent;
    }


    /**
     * Gets the instrumentID value for this ExposureInstrumentLCV.
     * 
     * @return instrumentID
     */
    public java.lang.String getInstrumentID() {
        return instrumentID;
    }


    /**
     * Sets the instrumentID value for this ExposureInstrumentLCV.
     * 
     * @param instrumentID
     */
    public void setInstrumentID(java.lang.String instrumentID) {
        this.instrumentID = instrumentID;
    }


    /**
     * Gets the LCVAmt value for this ExposureInstrumentLCV.
     * 
     * @return LCVAmt
     */
    public java.lang.Double getLCVAmt() {
        return LCVAmt;
    }


    /**
     * Sets the LCVAmt value for this ExposureInstrumentLCV.
     * 
     * @param LCVAmt
     */
    public void setLCVAmt(java.lang.Double LCVAmt) {
        this.LCVAmt = LCVAmt;
    }


    /**
     * Gets the LCVPercent value for this ExposureInstrumentLCV.
     * 
     * @return LCVPercent
     */
    public java.lang.Integer getLCVPercent() {
        return LCVPercent;
    }


    /**
     * Sets the LCVPercent value for this ExposureInstrumentLCV.
     * 
     * @param LCVPercent
     */
    public void setLCVPercent(java.lang.Integer LCVPercent) {
        this.LCVPercent = LCVPercent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExposureInstrumentLCV)) return false;
        ExposureInstrumentLCV other = (ExposureInstrumentLCV) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.instrumentID==null && other.getInstrumentID()==null) || 
             (this.instrumentID!=null &&
              this.instrumentID.equals(other.getInstrumentID()))) &&
            ((this.LCVAmt==null && other.getLCVAmt()==null) || 
             (this.LCVAmt!=null &&
              this.LCVAmt.equals(other.getLCVAmt()))) &&
            ((this.LCVPercent==null && other.getLCVPercent()==null) || 
             (this.LCVPercent!=null &&
              this.LCVPercent.equals(other.getLCVPercent())));
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
        if (getInstrumentID() != null) {
            _hashCode += getInstrumentID().hashCode();
        }
        if (getLCVAmt() != null) {
            _hashCode += getLCVAmt().hashCode();
        }
        if (getLCVPercent() != null) {
            _hashCode += getLCVPercent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExposureInstrumentLCV.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://com.fhlbatl.service.exposure", "exposureInstrumentLCV"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instrumentID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "instrumentID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("LCVPercent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LCVPercent"));
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
