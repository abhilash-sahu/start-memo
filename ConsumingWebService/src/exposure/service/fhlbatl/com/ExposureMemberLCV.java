/**
 * ExposureMemberLCV.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package exposure.service.fhlbatl.com;

public class ExposureMemberLCV  implements java.io.Serializable {
    private java.lang.Integer affiliateMemberID;

    private java.lang.Integer errorCode;

    private java.lang.Boolean isError;

    private java.lang.Double LCVAmt;

    private java.lang.Integer LCVFactor;

    private java.lang.Double marketValue;

    private java.lang.Integer memberID;

    private exposure.service.fhlbatl.com.ExposurePortfolioLCV[] portfolioLCV;

    public ExposureMemberLCV() {
    }

    public ExposureMemberLCV(
           java.lang.Integer affiliateMemberID,
           java.lang.Integer errorCode,
           java.lang.Boolean isError,
           java.lang.Double LCVAmt,
           java.lang.Integer LCVFactor,
           java.lang.Double marketValue,
           java.lang.Integer memberID,
           exposure.service.fhlbatl.com.ExposurePortfolioLCV[] portfolioLCV) {
           this.affiliateMemberID = affiliateMemberID;
           this.errorCode = errorCode;
           this.isError = isError;
           this.LCVAmt = LCVAmt;
           this.LCVFactor = LCVFactor;
           this.marketValue = marketValue;
           this.memberID = memberID;
           this.portfolioLCV = portfolioLCV;
    }


    /**
     * Gets the affiliateMemberID value for this ExposureMemberLCV.
     * 
     * @return affiliateMemberID
     */
    public java.lang.Integer getAffiliateMemberID() {
        return affiliateMemberID;
    }


    /**
     * Sets the affiliateMemberID value for this ExposureMemberLCV.
     * 
     * @param affiliateMemberID
     */
    public void setAffiliateMemberID(java.lang.Integer affiliateMemberID) {
        this.affiliateMemberID = affiliateMemberID;
    }


    /**
     * Gets the errorCode value for this ExposureMemberLCV.
     * 
     * @return errorCode
     */
    public java.lang.Integer getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this ExposureMemberLCV.
     * 
     * @param errorCode
     */
    public void setErrorCode(java.lang.Integer errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the isError value for this ExposureMemberLCV.
     * 
     * @return isError
     */
    public java.lang.Boolean getIsError() {
        return isError;
    }


    /**
     * Sets the isError value for this ExposureMemberLCV.
     * 
     * @param isError
     */
    public void setIsError(java.lang.Boolean isError) {
        this.isError = isError;
    }


    /**
     * Gets the LCVAmt value for this ExposureMemberLCV.
     * 
     * @return LCVAmt
     */
    public java.lang.Double getLCVAmt() {
        return LCVAmt;
    }


    /**
     * Sets the LCVAmt value for this ExposureMemberLCV.
     * 
     * @param LCVAmt
     */
    public void setLCVAmt(java.lang.Double LCVAmt) {
        this.LCVAmt = LCVAmt;
    }


    /**
     * Gets the LCVFactor value for this ExposureMemberLCV.
     * 
     * @return LCVFactor
     */
    public java.lang.Integer getLCVFactor() {
        return LCVFactor;
    }


    /**
     * Sets the LCVFactor value for this ExposureMemberLCV.
     * 
     * @param LCVFactor
     */
    public void setLCVFactor(java.lang.Integer LCVFactor) {
        this.LCVFactor = LCVFactor;
    }


    /**
     * Gets the marketValue value for this ExposureMemberLCV.
     * 
     * @return marketValue
     */
    public java.lang.Double getMarketValue() {
        return marketValue;
    }


    /**
     * Sets the marketValue value for this ExposureMemberLCV.
     * 
     * @param marketValue
     */
    public void setMarketValue(java.lang.Double marketValue) {
        this.marketValue = marketValue;
    }


    /**
     * Gets the memberID value for this ExposureMemberLCV.
     * 
     * @return memberID
     */
    public java.lang.Integer getMemberID() {
        return memberID;
    }


    /**
     * Sets the memberID value for this ExposureMemberLCV.
     * 
     * @param memberID
     */
    public void setMemberID(java.lang.Integer memberID) {
        this.memberID = memberID;
    }


    /**
     * Gets the portfolioLCV value for this ExposureMemberLCV.
     * 
     * @return portfolioLCV
     */
    public exposure.service.fhlbatl.com.ExposurePortfolioLCV[] getPortfolioLCV() {
        return portfolioLCV;
    }


    /**
     * Sets the portfolioLCV value for this ExposureMemberLCV.
     * 
     * @param portfolioLCV
     */
    public void setPortfolioLCV(exposure.service.fhlbatl.com.ExposurePortfolioLCV[] portfolioLCV) {
        this.portfolioLCV = portfolioLCV;
    }

    public exposure.service.fhlbatl.com.ExposurePortfolioLCV getPortfolioLCV(int i) {
        return this.portfolioLCV[i];
    }

    public void setPortfolioLCV(int i, exposure.service.fhlbatl.com.ExposurePortfolioLCV _value) {
        this.portfolioLCV[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExposureMemberLCV)) return false;
        ExposureMemberLCV other = (ExposureMemberLCV) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.affiliateMemberID==null && other.getAffiliateMemberID()==null) || 
             (this.affiliateMemberID!=null &&
              this.affiliateMemberID.equals(other.getAffiliateMemberID()))) &&
            ((this.errorCode==null && other.getErrorCode()==null) || 
             (this.errorCode!=null &&
              this.errorCode.equals(other.getErrorCode()))) &&
            ((this.isError==null && other.getIsError()==null) || 
             (this.isError!=null &&
              this.isError.equals(other.getIsError()))) &&
            ((this.LCVAmt==null && other.getLCVAmt()==null) || 
             (this.LCVAmt!=null &&
              this.LCVAmt.equals(other.getLCVAmt()))) &&
            ((this.LCVFactor==null && other.getLCVFactor()==null) || 
             (this.LCVFactor!=null &&
              this.LCVFactor.equals(other.getLCVFactor()))) &&
            ((this.marketValue==null && other.getMarketValue()==null) || 
             (this.marketValue!=null &&
              this.marketValue.equals(other.getMarketValue()))) &&
            ((this.memberID==null && other.getMemberID()==null) || 
             (this.memberID!=null &&
              this.memberID.equals(other.getMemberID()))) &&
            ((this.portfolioLCV==null && other.getPortfolioLCV()==null) || 
             (this.portfolioLCV!=null &&
              java.util.Arrays.equals(this.portfolioLCV, other.getPortfolioLCV())));
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
        if (getAffiliateMemberID() != null) {
            _hashCode += getAffiliateMemberID().hashCode();
        }
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        if (getIsError() != null) {
            _hashCode += getIsError().hashCode();
        }
        if (getLCVAmt() != null) {
            _hashCode += getLCVAmt().hashCode();
        }
        if (getLCVFactor() != null) {
            _hashCode += getLCVFactor().hashCode();
        }
        if (getMarketValue() != null) {
            _hashCode += getMarketValue().hashCode();
        }
        if (getMemberID() != null) {
            _hashCode += getMemberID().hashCode();
        }
        if (getPortfolioLCV() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPortfolioLCV());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPortfolioLCV(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExposureMemberLCV.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://com.fhlbatl.service.exposure", "exposureMemberLCV"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("affiliateMemberID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "affiliateMemberID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isError");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isError"));
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
        elemField.setFieldName("marketValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "marketValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portfolioLCV");
        elemField.setXmlName(new javax.xml.namespace.QName("", "portfolioLCV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://com.fhlbatl.service.exposure", "exposurePortfolioLCV"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
