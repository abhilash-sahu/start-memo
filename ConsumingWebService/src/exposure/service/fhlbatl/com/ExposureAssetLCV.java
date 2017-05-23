/**
 * ExposureAssetLCV.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package exposure.service.fhlbatl.com;

public class ExposureAssetLCV  implements java.io.Serializable {
    private java.lang.String assetType;

    private java.lang.Integer assetTypeID;

    private exposure.service.fhlbatl.com.ExposureInstrumentLCV[] instrumentLCV;

    private java.lang.Double LCVAmt;

    private java.lang.Integer LCVFactor;

    public ExposureAssetLCV() {
    }

    public ExposureAssetLCV(
           java.lang.String assetType,
           java.lang.Integer assetTypeID,
           exposure.service.fhlbatl.com.ExposureInstrumentLCV[] instrumentLCV,
           java.lang.Double LCVAmt,
           java.lang.Integer LCVFactor) {
           this.assetType = assetType;
           this.assetTypeID = assetTypeID;
           this.instrumentLCV = instrumentLCV;
           this.LCVAmt = LCVAmt;
           this.LCVFactor = LCVFactor;
    }


    /**
     * Gets the assetType value for this ExposureAssetLCV.
     * 
     * @return assetType
     */
    public java.lang.String getAssetType() {
        return assetType;
    }


    /**
     * Sets the assetType value for this ExposureAssetLCV.
     * 
     * @param assetType
     */
    public void setAssetType(java.lang.String assetType) {
        this.assetType = assetType;
    }


    /**
     * Gets the assetTypeID value for this ExposureAssetLCV.
     * 
     * @return assetTypeID
     */
    public java.lang.Integer getAssetTypeID() {
        return assetTypeID;
    }


    /**
     * Sets the assetTypeID value for this ExposureAssetLCV.
     * 
     * @param assetTypeID
     */
    public void setAssetTypeID(java.lang.Integer assetTypeID) {
        this.assetTypeID = assetTypeID;
    }


    /**
     * Gets the instrumentLCV value for this ExposureAssetLCV.
     * 
     * @return instrumentLCV
     */
    public exposure.service.fhlbatl.com.ExposureInstrumentLCV[] getInstrumentLCV() {
        return instrumentLCV;
    }


    /**
     * Sets the instrumentLCV value for this ExposureAssetLCV.
     * 
     * @param instrumentLCV
     */
    public void setInstrumentLCV(exposure.service.fhlbatl.com.ExposureInstrumentLCV[] instrumentLCV) {
        this.instrumentLCV = instrumentLCV;
    }

    public exposure.service.fhlbatl.com.ExposureInstrumentLCV getInstrumentLCV(int i) {
        return this.instrumentLCV[i];
    }

    public void setInstrumentLCV(int i, exposure.service.fhlbatl.com.ExposureInstrumentLCV _value) {
        this.instrumentLCV[i] = _value;
    }


    /**
     * Gets the LCVAmt value for this ExposureAssetLCV.
     * 
     * @return LCVAmt
     */
    public java.lang.Double getLCVAmt() {
        return LCVAmt;
    }


    /**
     * Sets the LCVAmt value for this ExposureAssetLCV.
     * 
     * @param LCVAmt
     */
    public void setLCVAmt(java.lang.Double LCVAmt) {
        this.LCVAmt = LCVAmt;
    }


    /**
     * Gets the LCVFactor value for this ExposureAssetLCV.
     * 
     * @return LCVFactor
     */
    public java.lang.Integer getLCVFactor() {
        return LCVFactor;
    }


    /**
     * Sets the LCVFactor value for this ExposureAssetLCV.
     * 
     * @param LCVFactor
     */
    public void setLCVFactor(java.lang.Integer LCVFactor) {
        this.LCVFactor = LCVFactor;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExposureAssetLCV)) return false;
        ExposureAssetLCV other = (ExposureAssetLCV) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.assetType==null && other.getAssetType()==null) || 
             (this.assetType!=null &&
              this.assetType.equals(other.getAssetType()))) &&
            ((this.assetTypeID==null && other.getAssetTypeID()==null) || 
             (this.assetTypeID!=null &&
              this.assetTypeID.equals(other.getAssetTypeID()))) &&
            ((this.instrumentLCV==null && other.getInstrumentLCV()==null) || 
             (this.instrumentLCV!=null &&
              java.util.Arrays.equals(this.instrumentLCV, other.getInstrumentLCV()))) &&
            ((this.LCVAmt==null && other.getLCVAmt()==null) || 
             (this.LCVAmt!=null &&
              this.LCVAmt.equals(other.getLCVAmt()))) &&
            ((this.LCVFactor==null && other.getLCVFactor()==null) || 
             (this.LCVFactor!=null &&
              this.LCVFactor.equals(other.getLCVFactor())));
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
        if (getAssetType() != null) {
            _hashCode += getAssetType().hashCode();
        }
        if (getAssetTypeID() != null) {
            _hashCode += getAssetTypeID().hashCode();
        }
        if (getInstrumentLCV() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInstrumentLCV());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInstrumentLCV(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLCVAmt() != null) {
            _hashCode += getLCVAmt().hashCode();
        }
        if (getLCVFactor() != null) {
            _hashCode += getLCVFactor().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExposureAssetLCV.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://com.fhlbatl.service.exposure", "exposureAssetLCV"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assetType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetTypeID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assetTypeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instrumentLCV");
        elemField.setXmlName(new javax.xml.namespace.QName("", "instrumentLCV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://com.fhlbatl.service.exposure", "exposureInstrumentLCV"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
