/**
 * ExposureNPVResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package exposure.service.fhlbatl.com;

public class ExposureNPVResult  implements java.io.Serializable {
    private java.lang.Double estPrepaymentFeesAmt;

    private java.util.Calendar estPrepaymentFeesDate;

    private java.lang.Boolean estPrepaymentFeesOption;

    public ExposureNPVResult() {
    }

    public ExposureNPVResult(
           java.lang.Double estPrepaymentFeesAmt,
           java.util.Calendar estPrepaymentFeesDate,
           java.lang.Boolean estPrepaymentFeesOption) {
           this.estPrepaymentFeesAmt = estPrepaymentFeesAmt;
           this.estPrepaymentFeesDate = estPrepaymentFeesDate;
           this.estPrepaymentFeesOption = estPrepaymentFeesOption;
    }


    /**
     * Gets the estPrepaymentFeesAmt value for this ExposureNPVResult.
     * 
     * @return estPrepaymentFeesAmt
     */
    public java.lang.Double getEstPrepaymentFeesAmt() {
        return estPrepaymentFeesAmt;
    }


    /**
     * Sets the estPrepaymentFeesAmt value for this ExposureNPVResult.
     * 
     * @param estPrepaymentFeesAmt
     */
    public void setEstPrepaymentFeesAmt(java.lang.Double estPrepaymentFeesAmt) {
        this.estPrepaymentFeesAmt = estPrepaymentFeesAmt;
    }


    /**
     * Gets the estPrepaymentFeesDate value for this ExposureNPVResult.
     * 
     * @return estPrepaymentFeesDate
     */
    public java.util.Calendar getEstPrepaymentFeesDate() {
        return estPrepaymentFeesDate;
    }


    /**
     * Sets the estPrepaymentFeesDate value for this ExposureNPVResult.
     * 
     * @param estPrepaymentFeesDate
     */
    public void setEstPrepaymentFeesDate(java.util.Calendar estPrepaymentFeesDate) {
        this.estPrepaymentFeesDate = estPrepaymentFeesDate;
    }


    /**
     * Gets the estPrepaymentFeesOption value for this ExposureNPVResult.
     * 
     * @return estPrepaymentFeesOption
     */
    public java.lang.Boolean getEstPrepaymentFeesOption() {
        return estPrepaymentFeesOption;
    }


    /**
     * Sets the estPrepaymentFeesOption value for this ExposureNPVResult.
     * 
     * @param estPrepaymentFeesOption
     */
    public void setEstPrepaymentFeesOption(java.lang.Boolean estPrepaymentFeesOption) {
        this.estPrepaymentFeesOption = estPrepaymentFeesOption;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExposureNPVResult)) return false;
        ExposureNPVResult other = (ExposureNPVResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.estPrepaymentFeesAmt==null && other.getEstPrepaymentFeesAmt()==null) || 
             (this.estPrepaymentFeesAmt!=null &&
              this.estPrepaymentFeesAmt.equals(other.getEstPrepaymentFeesAmt()))) &&
            ((this.estPrepaymentFeesDate==null && other.getEstPrepaymentFeesDate()==null) || 
             (this.estPrepaymentFeesDate!=null &&
              this.estPrepaymentFeesDate.equals(other.getEstPrepaymentFeesDate()))) &&
            ((this.estPrepaymentFeesOption==null && other.getEstPrepaymentFeesOption()==null) || 
             (this.estPrepaymentFeesOption!=null &&
              this.estPrepaymentFeesOption.equals(other.getEstPrepaymentFeesOption())));
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
        if (getEstPrepaymentFeesAmt() != null) {
            _hashCode += getEstPrepaymentFeesAmt().hashCode();
        }
        if (getEstPrepaymentFeesDate() != null) {
            _hashCode += getEstPrepaymentFeesDate().hashCode();
        }
        if (getEstPrepaymentFeesOption() != null) {
            _hashCode += getEstPrepaymentFeesOption().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExposureNPVResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://com.fhlbatl.service.exposure", "exposureNPVResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estPrepaymentFeesAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estPrepaymentFeesAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estPrepaymentFeesDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estPrepaymentFeesDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estPrepaymentFeesOption");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estPrepaymentFeesOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
