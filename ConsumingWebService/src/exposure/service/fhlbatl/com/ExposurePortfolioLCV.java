/**
 * ExposurePortfolioLCV.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package exposure.service.fhlbatl.com;

public class ExposurePortfolioLCV  implements java.io.Serializable {
    private java.lang.Integer affiliateID;

    private exposure.service.fhlbatl.com.ExposureAssetLCV[] assetLCV;

    private java.lang.Double bookValueAmt;

    private java.util.Calendar CVRDueDate;

    private java.util.Calendar CVRStartDate;

    private java.lang.String CVRStatus;

    private java.lang.Double extrapolationFactor;

    private java.lang.Integer freqency;

    private java.lang.Boolean hasAgreement;

    private java.lang.Boolean isActive;

    private java.lang.Double LCVAmt;

    private java.lang.Integer LCVFactor;

    private java.lang.Double marketValueAmt;

    private java.lang.String portfolioCode;

    private java.lang.String portfolioType;

    private java.lang.Integer portfolioTypeID;

    private java.util.Calendar QCRDueDate;

    private java.lang.Integer relianceFactor;

    private java.lang.String source;

    public ExposurePortfolioLCV() {
    }

    public ExposurePortfolioLCV(
           java.lang.Integer affiliateID,
           exposure.service.fhlbatl.com.ExposureAssetLCV[] assetLCV,
           java.lang.Double bookValueAmt,
           java.util.Calendar CVRDueDate,
           java.util.Calendar CVRStartDate,
           java.lang.String CVRStatus,
           java.lang.Double extrapolationFactor,
           java.lang.Integer freqency,
           java.lang.Boolean hasAgreement,
           java.lang.Boolean isActive,
           java.lang.Double LCVAmt,
           java.lang.Integer LCVFactor,
           java.lang.Double marketValueAmt,
           java.lang.String portfolioCode,
           java.lang.String portfolioType,
           java.lang.Integer portfolioTypeID,
           java.util.Calendar QCRDueDate,
           java.lang.Integer relianceFactor,
           java.lang.String source) {
           this.affiliateID = affiliateID;
           this.assetLCV = assetLCV;
           this.bookValueAmt = bookValueAmt;
           this.CVRDueDate = CVRDueDate;
           this.CVRStartDate = CVRStartDate;
           this.CVRStatus = CVRStatus;
           this.extrapolationFactor = extrapolationFactor;
           this.freqency = freqency;
           this.hasAgreement = hasAgreement;
           this.isActive = isActive;
           this.LCVAmt = LCVAmt;
           this.LCVFactor = LCVFactor;
           this.marketValueAmt = marketValueAmt;
           this.portfolioCode = portfolioCode;
           this.portfolioType = portfolioType;
           this.portfolioTypeID = portfolioTypeID;
           this.QCRDueDate = QCRDueDate;
           this.relianceFactor = relianceFactor;
           this.source = source;
    }


    /**
     * Gets the affiliateID value for this ExposurePortfolioLCV.
     * 
     * @return affiliateID
     */
    public java.lang.Integer getAffiliateID() {
        return affiliateID;
    }


    /**
     * Sets the affiliateID value for this ExposurePortfolioLCV.
     * 
     * @param affiliateID
     */
    public void setAffiliateID(java.lang.Integer affiliateID) {
        this.affiliateID = affiliateID;
    }


    /**
     * Gets the assetLCV value for this ExposurePortfolioLCV.
     * 
     * @return assetLCV
     */
    public exposure.service.fhlbatl.com.ExposureAssetLCV[] getAssetLCV() {
        return assetLCV;
    }


    /**
     * Sets the assetLCV value for this ExposurePortfolioLCV.
     * 
     * @param assetLCV
     */
    public void setAssetLCV(exposure.service.fhlbatl.com.ExposureAssetLCV[] assetLCV) {
        this.assetLCV = assetLCV;
    }

    public exposure.service.fhlbatl.com.ExposureAssetLCV getAssetLCV(int i) {
        return this.assetLCV[i];
    }

    public void setAssetLCV(int i, exposure.service.fhlbatl.com.ExposureAssetLCV _value) {
        this.assetLCV[i] = _value;
    }


    /**
     * Gets the bookValueAmt value for this ExposurePortfolioLCV.
     * 
     * @return bookValueAmt
     */
    public java.lang.Double getBookValueAmt() {
        return bookValueAmt;
    }


    /**
     * Sets the bookValueAmt value for this ExposurePortfolioLCV.
     * 
     * @param bookValueAmt
     */
    public void setBookValueAmt(java.lang.Double bookValueAmt) {
        this.bookValueAmt = bookValueAmt;
    }


    /**
     * Gets the CVRDueDate value for this ExposurePortfolioLCV.
     * 
     * @return CVRDueDate
     */
    public java.util.Calendar getCVRDueDate() {
        return CVRDueDate;
    }


    /**
     * Sets the CVRDueDate value for this ExposurePortfolioLCV.
     * 
     * @param CVRDueDate
     */
    public void setCVRDueDate(java.util.Calendar CVRDueDate) {
        this.CVRDueDate = CVRDueDate;
    }


    /**
     * Gets the CVRStartDate value for this ExposurePortfolioLCV.
     * 
     * @return CVRStartDate
     */
    public java.util.Calendar getCVRStartDate() {
        return CVRStartDate;
    }


    /**
     * Sets the CVRStartDate value for this ExposurePortfolioLCV.
     * 
     * @param CVRStartDate
     */
    public void setCVRStartDate(java.util.Calendar CVRStartDate) {
        this.CVRStartDate = CVRStartDate;
    }


    /**
     * Gets the CVRStatus value for this ExposurePortfolioLCV.
     * 
     * @return CVRStatus
     */
    public java.lang.String getCVRStatus() {
        return CVRStatus;
    }


    /**
     * Sets the CVRStatus value for this ExposurePortfolioLCV.
     * 
     * @param CVRStatus
     */
    public void setCVRStatus(java.lang.String CVRStatus) {
        this.CVRStatus = CVRStatus;
    }


    /**
     * Gets the extrapolationFactor value for this ExposurePortfolioLCV.
     * 
     * @return extrapolationFactor
     */
    public java.lang.Double getExtrapolationFactor() {
        return extrapolationFactor;
    }


    /**
     * Sets the extrapolationFactor value for this ExposurePortfolioLCV.
     * 
     * @param extrapolationFactor
     */
    public void setExtrapolationFactor(java.lang.Double extrapolationFactor) {
        this.extrapolationFactor = extrapolationFactor;
    }


    /**
     * Gets the freqency value for this ExposurePortfolioLCV.
     * 
     * @return freqency
     */
    public java.lang.Integer getFreqency() {
        return freqency;
    }


    /**
     * Sets the freqency value for this ExposurePortfolioLCV.
     * 
     * @param freqency
     */
    public void setFreqency(java.lang.Integer freqency) {
        this.freqency = freqency;
    }


    /**
     * Gets the hasAgreement value for this ExposurePortfolioLCV.
     * 
     * @return hasAgreement
     */
    public java.lang.Boolean getHasAgreement() {
        return hasAgreement;
    }


    /**
     * Sets the hasAgreement value for this ExposurePortfolioLCV.
     * 
     * @param hasAgreement
     */
    public void setHasAgreement(java.lang.Boolean hasAgreement) {
        this.hasAgreement = hasAgreement;
    }


    /**
     * Gets the isActive value for this ExposurePortfolioLCV.
     * 
     * @return isActive
     */
    public java.lang.Boolean getIsActive() {
        return isActive;
    }


    /**
     * Sets the isActive value for this ExposurePortfolioLCV.
     * 
     * @param isActive
     */
    public void setIsActive(java.lang.Boolean isActive) {
        this.isActive = isActive;
    }


    /**
     * Gets the LCVAmt value for this ExposurePortfolioLCV.
     * 
     * @return LCVAmt
     */
    public java.lang.Double getLCVAmt() {
        return LCVAmt;
    }


    /**
     * Sets the LCVAmt value for this ExposurePortfolioLCV.
     * 
     * @param LCVAmt
     */
    public void setLCVAmt(java.lang.Double LCVAmt) {
        this.LCVAmt = LCVAmt;
    }


    /**
     * Gets the LCVFactor value for this ExposurePortfolioLCV.
     * 
     * @return LCVFactor
     */
    public java.lang.Integer getLCVFactor() {
        return LCVFactor;
    }


    /**
     * Sets the LCVFactor value for this ExposurePortfolioLCV.
     * 
     * @param LCVFactor
     */
    public void setLCVFactor(java.lang.Integer LCVFactor) {
        this.LCVFactor = LCVFactor;
    }


    /**
     * Gets the marketValueAmt value for this ExposurePortfolioLCV.
     * 
     * @return marketValueAmt
     */
    public java.lang.Double getMarketValueAmt() {
        return marketValueAmt;
    }


    /**
     * Sets the marketValueAmt value for this ExposurePortfolioLCV.
     * 
     * @param marketValueAmt
     */
    public void setMarketValueAmt(java.lang.Double marketValueAmt) {
        this.marketValueAmt = marketValueAmt;
    }


    /**
     * Gets the portfolioCode value for this ExposurePortfolioLCV.
     * 
     * @return portfolioCode
     */
    public java.lang.String getPortfolioCode() {
        return portfolioCode;
    }


    /**
     * Sets the portfolioCode value for this ExposurePortfolioLCV.
     * 
     * @param portfolioCode
     */
    public void setPortfolioCode(java.lang.String portfolioCode) {
        this.portfolioCode = portfolioCode;
    }


    /**
     * Gets the portfolioType value for this ExposurePortfolioLCV.
     * 
     * @return portfolioType
     */
    public java.lang.String getPortfolioType() {
        return portfolioType;
    }


    /**
     * Sets the portfolioType value for this ExposurePortfolioLCV.
     * 
     * @param portfolioType
     */
    public void setPortfolioType(java.lang.String portfolioType) {
        this.portfolioType = portfolioType;
    }


    /**
     * Gets the portfolioTypeID value for this ExposurePortfolioLCV.
     * 
     * @return portfolioTypeID
     */
    public java.lang.Integer getPortfolioTypeID() {
        return portfolioTypeID;
    }


    /**
     * Sets the portfolioTypeID value for this ExposurePortfolioLCV.
     * 
     * @param portfolioTypeID
     */
    public void setPortfolioTypeID(java.lang.Integer portfolioTypeID) {
        this.portfolioTypeID = portfolioTypeID;
    }


    /**
     * Gets the QCRDueDate value for this ExposurePortfolioLCV.
     * 
     * @return QCRDueDate
     */
    public java.util.Calendar getQCRDueDate() {
        return QCRDueDate;
    }


    /**
     * Sets the QCRDueDate value for this ExposurePortfolioLCV.
     * 
     * @param QCRDueDate
     */
    public void setQCRDueDate(java.util.Calendar QCRDueDate) {
        this.QCRDueDate = QCRDueDate;
    }


    /**
     * Gets the relianceFactor value for this ExposurePortfolioLCV.
     * 
     * @return relianceFactor
     */
    public java.lang.Integer getRelianceFactor() {
        return relianceFactor;
    }


    /**
     * Sets the relianceFactor value for this ExposurePortfolioLCV.
     * 
     * @param relianceFactor
     */
    public void setRelianceFactor(java.lang.Integer relianceFactor) {
        this.relianceFactor = relianceFactor;
    }


    /**
     * Gets the source value for this ExposurePortfolioLCV.
     * 
     * @return source
     */
    public java.lang.String getSource() {
        return source;
    }


    /**
     * Sets the source value for this ExposurePortfolioLCV.
     * 
     * @param source
     */
    public void setSource(java.lang.String source) {
        this.source = source;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExposurePortfolioLCV)) return false;
        ExposurePortfolioLCV other = (ExposurePortfolioLCV) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.affiliateID==null && other.getAffiliateID()==null) || 
             (this.affiliateID!=null &&
              this.affiliateID.equals(other.getAffiliateID()))) &&
            ((this.assetLCV==null && other.getAssetLCV()==null) || 
             (this.assetLCV!=null &&
              java.util.Arrays.equals(this.assetLCV, other.getAssetLCV()))) &&
            ((this.bookValueAmt==null && other.getBookValueAmt()==null) || 
             (this.bookValueAmt!=null &&
              this.bookValueAmt.equals(other.getBookValueAmt()))) &&
            ((this.CVRDueDate==null && other.getCVRDueDate()==null) || 
             (this.CVRDueDate!=null &&
              this.CVRDueDate.equals(other.getCVRDueDate()))) &&
            ((this.CVRStartDate==null && other.getCVRStartDate()==null) || 
             (this.CVRStartDate!=null &&
              this.CVRStartDate.equals(other.getCVRStartDate()))) &&
            ((this.CVRStatus==null && other.getCVRStatus()==null) || 
             (this.CVRStatus!=null &&
              this.CVRStatus.equals(other.getCVRStatus()))) &&
            ((this.extrapolationFactor==null && other.getExtrapolationFactor()==null) || 
             (this.extrapolationFactor!=null &&
              this.extrapolationFactor.equals(other.getExtrapolationFactor()))) &&
            ((this.freqency==null && other.getFreqency()==null) || 
             (this.freqency!=null &&
              this.freqency.equals(other.getFreqency()))) &&
            ((this.hasAgreement==null && other.getHasAgreement()==null) || 
             (this.hasAgreement!=null &&
              this.hasAgreement.equals(other.getHasAgreement()))) &&
            ((this.isActive==null && other.getIsActive()==null) || 
             (this.isActive!=null &&
              this.isActive.equals(other.getIsActive()))) &&
            ((this.LCVAmt==null && other.getLCVAmt()==null) || 
             (this.LCVAmt!=null &&
              this.LCVAmt.equals(other.getLCVAmt()))) &&
            ((this.LCVFactor==null && other.getLCVFactor()==null) || 
             (this.LCVFactor!=null &&
              this.LCVFactor.equals(other.getLCVFactor()))) &&
            ((this.marketValueAmt==null && other.getMarketValueAmt()==null) || 
             (this.marketValueAmt!=null &&
              this.marketValueAmt.equals(other.getMarketValueAmt()))) &&
            ((this.portfolioCode==null && other.getPortfolioCode()==null) || 
             (this.portfolioCode!=null &&
              this.portfolioCode.equals(other.getPortfolioCode()))) &&
            ((this.portfolioType==null && other.getPortfolioType()==null) || 
             (this.portfolioType!=null &&
              this.portfolioType.equals(other.getPortfolioType()))) &&
            ((this.portfolioTypeID==null && other.getPortfolioTypeID()==null) || 
             (this.portfolioTypeID!=null &&
              this.portfolioTypeID.equals(other.getPortfolioTypeID()))) &&
            ((this.QCRDueDate==null && other.getQCRDueDate()==null) || 
             (this.QCRDueDate!=null &&
              this.QCRDueDate.equals(other.getQCRDueDate()))) &&
            ((this.relianceFactor==null && other.getRelianceFactor()==null) || 
             (this.relianceFactor!=null &&
              this.relianceFactor.equals(other.getRelianceFactor()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource())));
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
        if (getAffiliateID() != null) {
            _hashCode += getAffiliateID().hashCode();
        }
        if (getAssetLCV() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssetLCV());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssetLCV(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBookValueAmt() != null) {
            _hashCode += getBookValueAmt().hashCode();
        }
        if (getCVRDueDate() != null) {
            _hashCode += getCVRDueDate().hashCode();
        }
        if (getCVRStartDate() != null) {
            _hashCode += getCVRStartDate().hashCode();
        }
        if (getCVRStatus() != null) {
            _hashCode += getCVRStatus().hashCode();
        }
        if (getExtrapolationFactor() != null) {
            _hashCode += getExtrapolationFactor().hashCode();
        }
        if (getFreqency() != null) {
            _hashCode += getFreqency().hashCode();
        }
        if (getHasAgreement() != null) {
            _hashCode += getHasAgreement().hashCode();
        }
        if (getIsActive() != null) {
            _hashCode += getIsActive().hashCode();
        }
        if (getLCVAmt() != null) {
            _hashCode += getLCVAmt().hashCode();
        }
        if (getLCVFactor() != null) {
            _hashCode += getLCVFactor().hashCode();
        }
        if (getMarketValueAmt() != null) {
            _hashCode += getMarketValueAmt().hashCode();
        }
        if (getPortfolioCode() != null) {
            _hashCode += getPortfolioCode().hashCode();
        }
        if (getPortfolioType() != null) {
            _hashCode += getPortfolioType().hashCode();
        }
        if (getPortfolioTypeID() != null) {
            _hashCode += getPortfolioTypeID().hashCode();
        }
        if (getQCRDueDate() != null) {
            _hashCode += getQCRDueDate().hashCode();
        }
        if (getRelianceFactor() != null) {
            _hashCode += getRelianceFactor().hashCode();
        }
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExposurePortfolioLCV.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://com.fhlbatl.service.exposure", "exposurePortfolioLCV"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("affiliateID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "affiliateID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetLCV");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assetLCV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://com.fhlbatl.service.exposure", "exposureAssetLCV"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bookValueAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bookValueAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CVRDueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CVRDueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CVRStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CVRStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CVRStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CVRStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extrapolationFactor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "extrapolationFactor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freqency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "freqency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasAgreement");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hasAgreement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isActive");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isActive"));
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
        elemField.setFieldName("marketValueAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "marketValueAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portfolioCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "portfolioCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portfolioType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "portfolioType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portfolioTypeID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "portfolioTypeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("QCRDueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "QCRDueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relianceFactor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relianceFactor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
