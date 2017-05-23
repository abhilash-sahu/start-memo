/**
 * CalculationResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package exposure.service.fhlbatl.com;

public class CalculationResults  implements java.io.Serializable {
    private java.lang.Double advanceTotalExcLHFSAmt;

    private java.lang.Double advanceTotalIncLHFSAmt;

    private java.lang.Double advancesDivAssets;

    private exposure.service.fhlbatl.com.ExposureLCVResult affiliateLCV;

    private exposure.service.fhlbatl.com.ExposureAffiliateRelianceResult affiliateReliance;

    private java.lang.Double cashPledged;

    private exposure.service.fhlbatl.com.ExposureCMLResult collateralMaintenanceLevel;

    private java.lang.Double collateralMarketValue;

    private java.lang.Double corporateSettlementsNextMaturityAmt;

    private java.util.Calendar corporateSettlementsNextMaturityDate;

    private java.lang.Double corporateSettlementsNextSettlementAmt;

    private java.util.Calendar corporateSettlementsNextSettlementDate;

    private java.lang.Double corporateSettlementsTotalAmt;

    private exposure.service.fhlbatl.com.ExposureCreditAvailabilityResult creditAvailability;

    private java.lang.Double creditAvailabilityDivAssets;

    private java.lang.Double DIAOverdraftTotalAmt;

    private java.lang.Integer errorCode;

    private exposure.service.fhlbatl.com.ExposureNPVResult estPrepaymentFeesAmt;

    private java.lang.Boolean isError;

    private java.lang.Double LCVDivAdvances;

    private java.lang.Double LCVDivCollateralMaintenanceLevel;

    private java.lang.Double LCVDivProjTotalCollateralExposure;

    private java.lang.Double LCVDivTotalCollateralExposure;

    private java.lang.Double LCVExcess;

    private java.lang.Double LHFSAdvanceTotalAmt;

    private java.lang.Double LHFSLCV;

    private java.lang.Double LHFSLCVExcess;

    private java.lang.Double LOCCorpSettlementsNextMaturityAmt;

    private java.util.Calendar LOCCorpSettlementsNextMaturityDate;

    private java.lang.Double LOCCorpSettlementsNextSettlementAmt;

    private java.util.Calendar LOCCorpSettlementsNextSettlementDate;

    private java.lang.Double LOCCorporateSettlementsTotalAmt;

    private java.lang.Double letterOfCreditTotalAmt;

    private java.lang.Double MPFCreditEnhancementTotalAmt;

    private java.lang.Integer memberID;

    private exposure.service.fhlbatl.com.ExposureLCVResult memberLCV;

    private java.lang.Double memberStandaloneDerivativeTotalAmt;

    private exposure.service.fhlbatl.com.ExposurePortfolioLCV[] portfolioLCVList;

    private java.lang.Double projCollateralMaintenanceLevel;

    private java.lang.Double projLCVExcess;

    private java.lang.Double projTotalCollateralExposure;

    private java.lang.Double projTotalCollateralExposureDivAssets;

    private java.lang.Double remainingCreditAvailabilityAmt;

    private java.lang.Double totalAssetsAmt;

    private java.lang.Double totalCollateralExposure;

    private java.lang.Double totalCollateralExposureDivAssets;

    private java.lang.Double totalCreditExposure;

    private java.lang.Double totalCreditExposureDivAssets;

    private exposure.service.fhlbatl.com.ExposureLCVResult totalLCV;

    private java.lang.Double totalSecuredCreditExposure;

    private java.lang.Double totalUnsecuredCreditExposure;

    private java.lang.Double unsecuredCreditOvernightAmt;

    private java.lang.Double unsecuredCreditSwapAmt;

    private java.lang.Double unsecuredCreditTermAmt;

    public CalculationResults() {
    }

    public CalculationResults(
           java.lang.Double advanceTotalExcLHFSAmt,
           java.lang.Double advanceTotalIncLHFSAmt,
           java.lang.Double advancesDivAssets,
           exposure.service.fhlbatl.com.ExposureLCVResult affiliateLCV,
           exposure.service.fhlbatl.com.ExposureAffiliateRelianceResult affiliateReliance,
           java.lang.Double cashPledged,
           exposure.service.fhlbatl.com.ExposureCMLResult collateralMaintenanceLevel,
           java.lang.Double collateralMarketValue,
           java.lang.Double corporateSettlementsNextMaturityAmt,
           java.util.Calendar corporateSettlementsNextMaturityDate,
           java.lang.Double corporateSettlementsNextSettlementAmt,
           java.util.Calendar corporateSettlementsNextSettlementDate,
           java.lang.Double corporateSettlementsTotalAmt,
           exposure.service.fhlbatl.com.ExposureCreditAvailabilityResult creditAvailability,
           java.lang.Double creditAvailabilityDivAssets,
           java.lang.Double DIAOverdraftTotalAmt,
           java.lang.Integer errorCode,
           exposure.service.fhlbatl.com.ExposureNPVResult estPrepaymentFeesAmt,
           java.lang.Boolean isError,
           java.lang.Double LCVDivAdvances,
           java.lang.Double LCVDivCollateralMaintenanceLevel,
           java.lang.Double LCVDivProjTotalCollateralExposure,
           java.lang.Double LCVDivTotalCollateralExposure,
           java.lang.Double LCVExcess,
           java.lang.Double LHFSAdvanceTotalAmt,
           java.lang.Double LHFSLCV,
           java.lang.Double LHFSLCVExcess,
           java.lang.Double LOCCorpSettlementsNextMaturityAmt,
           java.util.Calendar LOCCorpSettlementsNextMaturityDate,
           java.lang.Double LOCCorpSettlementsNextSettlementAmt,
           java.util.Calendar LOCCorpSettlementsNextSettlementDate,
           java.lang.Double LOCCorporateSettlementsTotalAmt,
           java.lang.Double letterOfCreditTotalAmt,
           java.lang.Double MPFCreditEnhancementTotalAmt,
           java.lang.Integer memberID,
           exposure.service.fhlbatl.com.ExposureLCVResult memberLCV,
           java.lang.Double memberStandaloneDerivativeTotalAmt,
           exposure.service.fhlbatl.com.ExposurePortfolioLCV[] portfolioLCVList,
           java.lang.Double projCollateralMaintenanceLevel,
           java.lang.Double projLCVExcess,
           java.lang.Double projTotalCollateralExposure,
           java.lang.Double projTotalCollateralExposureDivAssets,
           java.lang.Double remainingCreditAvailabilityAmt,
           java.lang.Double totalAssetsAmt,
           java.lang.Double totalCollateralExposure,
           java.lang.Double totalCollateralExposureDivAssets,
           java.lang.Double totalCreditExposure,
           java.lang.Double totalCreditExposureDivAssets,
           exposure.service.fhlbatl.com.ExposureLCVResult totalLCV,
           java.lang.Double totalSecuredCreditExposure,
           java.lang.Double totalUnsecuredCreditExposure,
           java.lang.Double unsecuredCreditOvernightAmt,
           java.lang.Double unsecuredCreditSwapAmt,
           java.lang.Double unsecuredCreditTermAmt) {
           this.advanceTotalExcLHFSAmt = advanceTotalExcLHFSAmt;
           this.advanceTotalIncLHFSAmt = advanceTotalIncLHFSAmt;
           this.advancesDivAssets = advancesDivAssets;
           this.affiliateLCV = affiliateLCV;
           this.affiliateReliance = affiliateReliance;
           this.cashPledged = cashPledged;
           this.collateralMaintenanceLevel = collateralMaintenanceLevel;
           this.collateralMarketValue = collateralMarketValue;
           this.corporateSettlementsNextMaturityAmt = corporateSettlementsNextMaturityAmt;
           this.corporateSettlementsNextMaturityDate = corporateSettlementsNextMaturityDate;
           this.corporateSettlementsNextSettlementAmt = corporateSettlementsNextSettlementAmt;
           this.corporateSettlementsNextSettlementDate = corporateSettlementsNextSettlementDate;
           this.corporateSettlementsTotalAmt = corporateSettlementsTotalAmt;
           this.creditAvailability = creditAvailability;
           this.creditAvailabilityDivAssets = creditAvailabilityDivAssets;
           this.DIAOverdraftTotalAmt = DIAOverdraftTotalAmt;
           this.errorCode = errorCode;
           this.estPrepaymentFeesAmt = estPrepaymentFeesAmt;
           this.isError = isError;
           this.LCVDivAdvances = LCVDivAdvances;
           this.LCVDivCollateralMaintenanceLevel = LCVDivCollateralMaintenanceLevel;
           this.LCVDivProjTotalCollateralExposure = LCVDivProjTotalCollateralExposure;
           this.LCVDivTotalCollateralExposure = LCVDivTotalCollateralExposure;
           this.LCVExcess = LCVExcess;
           this.LHFSAdvanceTotalAmt = LHFSAdvanceTotalAmt;
           this.LHFSLCV = LHFSLCV;
           this.LHFSLCVExcess = LHFSLCVExcess;
           this.LOCCorpSettlementsNextMaturityAmt = LOCCorpSettlementsNextMaturityAmt;
           this.LOCCorpSettlementsNextMaturityDate = LOCCorpSettlementsNextMaturityDate;
           this.LOCCorpSettlementsNextSettlementAmt = LOCCorpSettlementsNextSettlementAmt;
           this.LOCCorpSettlementsNextSettlementDate = LOCCorpSettlementsNextSettlementDate;
           this.LOCCorporateSettlementsTotalAmt = LOCCorporateSettlementsTotalAmt;
           this.letterOfCreditTotalAmt = letterOfCreditTotalAmt;
           this.MPFCreditEnhancementTotalAmt = MPFCreditEnhancementTotalAmt;
           this.memberID = memberID;
           this.memberLCV = memberLCV;
           this.memberStandaloneDerivativeTotalAmt = memberStandaloneDerivativeTotalAmt;
           this.portfolioLCVList = portfolioLCVList;
           this.projCollateralMaintenanceLevel = projCollateralMaintenanceLevel;
           this.projLCVExcess = projLCVExcess;
           this.projTotalCollateralExposure = projTotalCollateralExposure;
           this.projTotalCollateralExposureDivAssets = projTotalCollateralExposureDivAssets;
           this.remainingCreditAvailabilityAmt = remainingCreditAvailabilityAmt;
           this.totalAssetsAmt = totalAssetsAmt;
           this.totalCollateralExposure = totalCollateralExposure;
           this.totalCollateralExposureDivAssets = totalCollateralExposureDivAssets;
           this.totalCreditExposure = totalCreditExposure;
           this.totalCreditExposureDivAssets = totalCreditExposureDivAssets;
           this.totalLCV = totalLCV;
           this.totalSecuredCreditExposure = totalSecuredCreditExposure;
           this.totalUnsecuredCreditExposure = totalUnsecuredCreditExposure;
           this.unsecuredCreditOvernightAmt = unsecuredCreditOvernightAmt;
           this.unsecuredCreditSwapAmt = unsecuredCreditSwapAmt;
           this.unsecuredCreditTermAmt = unsecuredCreditTermAmt;
    }


    /**
     * Gets the advanceTotalExcLHFSAmt value for this CalculationResults.
     * 
     * @return advanceTotalExcLHFSAmt
     */
    public java.lang.Double getAdvanceTotalExcLHFSAmt() {
        return advanceTotalExcLHFSAmt;
    }


    /**
     * Sets the advanceTotalExcLHFSAmt value for this CalculationResults.
     * 
     * @param advanceTotalExcLHFSAmt
     */
    public void setAdvanceTotalExcLHFSAmt(java.lang.Double advanceTotalExcLHFSAmt) {
        this.advanceTotalExcLHFSAmt = advanceTotalExcLHFSAmt;
    }


    /**
     * Gets the advanceTotalIncLHFSAmt value for this CalculationResults.
     * 
     * @return advanceTotalIncLHFSAmt
     */
    public java.lang.Double getAdvanceTotalIncLHFSAmt() {
        return advanceTotalIncLHFSAmt;
    }


    /**
     * Sets the advanceTotalIncLHFSAmt value for this CalculationResults.
     * 
     * @param advanceTotalIncLHFSAmt
     */
    public void setAdvanceTotalIncLHFSAmt(java.lang.Double advanceTotalIncLHFSAmt) {
        this.advanceTotalIncLHFSAmt = advanceTotalIncLHFSAmt;
    }


    /**
     * Gets the advancesDivAssets value for this CalculationResults.
     * 
     * @return advancesDivAssets
     */
    public java.lang.Double getAdvancesDivAssets() {
        return advancesDivAssets;
    }


    /**
     * Sets the advancesDivAssets value for this CalculationResults.
     * 
     * @param advancesDivAssets
     */
    public void setAdvancesDivAssets(java.lang.Double advancesDivAssets) {
        this.advancesDivAssets = advancesDivAssets;
    }


    /**
     * Gets the affiliateLCV value for this CalculationResults.
     * 
     * @return affiliateLCV
     */
    public exposure.service.fhlbatl.com.ExposureLCVResult getAffiliateLCV() {
        return affiliateLCV;
    }


    /**
     * Sets the affiliateLCV value for this CalculationResults.
     * 
     * @param affiliateLCV
     */
    public void setAffiliateLCV(exposure.service.fhlbatl.com.ExposureLCVResult affiliateLCV) {
        this.affiliateLCV = affiliateLCV;
    }


    /**
     * Gets the affiliateReliance value for this CalculationResults.
     * 
     * @return affiliateReliance
     */
    public exposure.service.fhlbatl.com.ExposureAffiliateRelianceResult getAffiliateReliance() {
        return affiliateReliance;
    }


    /**
     * Sets the affiliateReliance value for this CalculationResults.
     * 
     * @param affiliateReliance
     */
    public void setAffiliateReliance(exposure.service.fhlbatl.com.ExposureAffiliateRelianceResult affiliateReliance) {
        this.affiliateReliance = affiliateReliance;
    }


    /**
     * Gets the cashPledged value for this CalculationResults.
     * 
     * @return cashPledged
     */
    public java.lang.Double getCashPledged() {
        return cashPledged;
    }


    /**
     * Sets the cashPledged value for this CalculationResults.
     * 
     * @param cashPledged
     */
    public void setCashPledged(java.lang.Double cashPledged) {
        this.cashPledged = cashPledged;
    }


    /**
     * Gets the collateralMaintenanceLevel value for this CalculationResults.
     * 
     * @return collateralMaintenanceLevel
     */
    public exposure.service.fhlbatl.com.ExposureCMLResult getCollateralMaintenanceLevel() {
        return collateralMaintenanceLevel;
    }


    /**
     * Sets the collateralMaintenanceLevel value for this CalculationResults.
     * 
     * @param collateralMaintenanceLevel
     */
    public void setCollateralMaintenanceLevel(exposure.service.fhlbatl.com.ExposureCMLResult collateralMaintenanceLevel) {
        this.collateralMaintenanceLevel = collateralMaintenanceLevel;
    }


    /**
     * Gets the collateralMarketValue value for this CalculationResults.
     * 
     * @return collateralMarketValue
     */
    public java.lang.Double getCollateralMarketValue() {
        return collateralMarketValue;
    }


    /**
     * Sets the collateralMarketValue value for this CalculationResults.
     * 
     * @param collateralMarketValue
     */
    public void setCollateralMarketValue(java.lang.Double collateralMarketValue) {
        this.collateralMarketValue = collateralMarketValue;
    }


    /**
     * Gets the corporateSettlementsNextMaturityAmt value for this CalculationResults.
     * 
     * @return corporateSettlementsNextMaturityAmt
     */
    public java.lang.Double getCorporateSettlementsNextMaturityAmt() {
        return corporateSettlementsNextMaturityAmt;
    }


    /**
     * Sets the corporateSettlementsNextMaturityAmt value for this CalculationResults.
     * 
     * @param corporateSettlementsNextMaturityAmt
     */
    public void setCorporateSettlementsNextMaturityAmt(java.lang.Double corporateSettlementsNextMaturityAmt) {
        this.corporateSettlementsNextMaturityAmt = corporateSettlementsNextMaturityAmt;
    }


    /**
     * Gets the corporateSettlementsNextMaturityDate value for this CalculationResults.
     * 
     * @return corporateSettlementsNextMaturityDate
     */
    public java.util.Calendar getCorporateSettlementsNextMaturityDate() {
        return corporateSettlementsNextMaturityDate;
    }


    /**
     * Sets the corporateSettlementsNextMaturityDate value for this CalculationResults.
     * 
     * @param corporateSettlementsNextMaturityDate
     */
    public void setCorporateSettlementsNextMaturityDate(java.util.Calendar corporateSettlementsNextMaturityDate) {
        this.corporateSettlementsNextMaturityDate = corporateSettlementsNextMaturityDate;
    }


    /**
     * Gets the corporateSettlementsNextSettlementAmt value for this CalculationResults.
     * 
     * @return corporateSettlementsNextSettlementAmt
     */
    public java.lang.Double getCorporateSettlementsNextSettlementAmt() {
        return corporateSettlementsNextSettlementAmt;
    }


    /**
     * Sets the corporateSettlementsNextSettlementAmt value for this CalculationResults.
     * 
     * @param corporateSettlementsNextSettlementAmt
     */
    public void setCorporateSettlementsNextSettlementAmt(java.lang.Double corporateSettlementsNextSettlementAmt) {
        this.corporateSettlementsNextSettlementAmt = corporateSettlementsNextSettlementAmt;
    }


    /**
     * Gets the corporateSettlementsNextSettlementDate value for this CalculationResults.
     * 
     * @return corporateSettlementsNextSettlementDate
     */
    public java.util.Calendar getCorporateSettlementsNextSettlementDate() {
        return corporateSettlementsNextSettlementDate;
    }


    /**
     * Sets the corporateSettlementsNextSettlementDate value for this CalculationResults.
     * 
     * @param corporateSettlementsNextSettlementDate
     */
    public void setCorporateSettlementsNextSettlementDate(java.util.Calendar corporateSettlementsNextSettlementDate) {
        this.corporateSettlementsNextSettlementDate = corporateSettlementsNextSettlementDate;
    }


    /**
     * Gets the corporateSettlementsTotalAmt value for this CalculationResults.
     * 
     * @return corporateSettlementsTotalAmt
     */
    public java.lang.Double getCorporateSettlementsTotalAmt() {
        return corporateSettlementsTotalAmt;
    }


    /**
     * Sets the corporateSettlementsTotalAmt value for this CalculationResults.
     * 
     * @param corporateSettlementsTotalAmt
     */
    public void setCorporateSettlementsTotalAmt(java.lang.Double corporateSettlementsTotalAmt) {
        this.corporateSettlementsTotalAmt = corporateSettlementsTotalAmt;
    }


    /**
     * Gets the creditAvailability value for this CalculationResults.
     * 
     * @return creditAvailability
     */
    public exposure.service.fhlbatl.com.ExposureCreditAvailabilityResult getCreditAvailability() {
        return creditAvailability;
    }


    /**
     * Sets the creditAvailability value for this CalculationResults.
     * 
     * @param creditAvailability
     */
    public void setCreditAvailability(exposure.service.fhlbatl.com.ExposureCreditAvailabilityResult creditAvailability) {
        this.creditAvailability = creditAvailability;
    }


    /**
     * Gets the creditAvailabilityDivAssets value for this CalculationResults.
     * 
     * @return creditAvailabilityDivAssets
     */
    public java.lang.Double getCreditAvailabilityDivAssets() {
        return creditAvailabilityDivAssets;
    }


    /**
     * Sets the creditAvailabilityDivAssets value for this CalculationResults.
     * 
     * @param creditAvailabilityDivAssets
     */
    public void setCreditAvailabilityDivAssets(java.lang.Double creditAvailabilityDivAssets) {
        this.creditAvailabilityDivAssets = creditAvailabilityDivAssets;
    }


    /**
     * Gets the DIAOverdraftTotalAmt value for this CalculationResults.
     * 
     * @return DIAOverdraftTotalAmt
     */
    public java.lang.Double getDIAOverdraftTotalAmt() {
        return DIAOverdraftTotalAmt;
    }


    /**
     * Sets the DIAOverdraftTotalAmt value for this CalculationResults.
     * 
     * @param DIAOverdraftTotalAmt
     */
    public void setDIAOverdraftTotalAmt(java.lang.Double DIAOverdraftTotalAmt) {
        this.DIAOverdraftTotalAmt = DIAOverdraftTotalAmt;
    }


    /**
     * Gets the errorCode value for this CalculationResults.
     * 
     * @return errorCode
     */
    public java.lang.Integer getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this CalculationResults.
     * 
     * @param errorCode
     */
    public void setErrorCode(java.lang.Integer errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the estPrepaymentFeesAmt value for this CalculationResults.
     * 
     * @return estPrepaymentFeesAmt
     */
    public exposure.service.fhlbatl.com.ExposureNPVResult getEstPrepaymentFeesAmt() {
        return estPrepaymentFeesAmt;
    }


    /**
     * Sets the estPrepaymentFeesAmt value for this CalculationResults.
     * 
     * @param estPrepaymentFeesAmt
     */
    public void setEstPrepaymentFeesAmt(exposure.service.fhlbatl.com.ExposureNPVResult estPrepaymentFeesAmt) {
        this.estPrepaymentFeesAmt = estPrepaymentFeesAmt;
    }


    /**
     * Gets the isError value for this CalculationResults.
     * 
     * @return isError
     */
    public java.lang.Boolean getIsError() {
        return isError;
    }


    /**
     * Sets the isError value for this CalculationResults.
     * 
     * @param isError
     */
    public void setIsError(java.lang.Boolean isError) {
        this.isError = isError;
    }


    /**
     * Gets the LCVDivAdvances value for this CalculationResults.
     * 
     * @return LCVDivAdvances
     */
    public java.lang.Double getLCVDivAdvances() {
        return LCVDivAdvances;
    }


    /**
     * Sets the LCVDivAdvances value for this CalculationResults.
     * 
     * @param LCVDivAdvances
     */
    public void setLCVDivAdvances(java.lang.Double LCVDivAdvances) {
        this.LCVDivAdvances = LCVDivAdvances;
    }


    /**
     * Gets the LCVDivCollateralMaintenanceLevel value for this CalculationResults.
     * 
     * @return LCVDivCollateralMaintenanceLevel
     */
    public java.lang.Double getLCVDivCollateralMaintenanceLevel() {
        return LCVDivCollateralMaintenanceLevel;
    }


    /**
     * Sets the LCVDivCollateralMaintenanceLevel value for this CalculationResults.
     * 
     * @param LCVDivCollateralMaintenanceLevel
     */
    public void setLCVDivCollateralMaintenanceLevel(java.lang.Double LCVDivCollateralMaintenanceLevel) {
        this.LCVDivCollateralMaintenanceLevel = LCVDivCollateralMaintenanceLevel;
    }


    /**
     * Gets the LCVDivProjTotalCollateralExposure value for this CalculationResults.
     * 
     * @return LCVDivProjTotalCollateralExposure
     */
    public java.lang.Double getLCVDivProjTotalCollateralExposure() {
        return LCVDivProjTotalCollateralExposure;
    }


    /**
     * Sets the LCVDivProjTotalCollateralExposure value for this CalculationResults.
     * 
     * @param LCVDivProjTotalCollateralExposure
     */
    public void setLCVDivProjTotalCollateralExposure(java.lang.Double LCVDivProjTotalCollateralExposure) {
        this.LCVDivProjTotalCollateralExposure = LCVDivProjTotalCollateralExposure;
    }


    /**
     * Gets the LCVDivTotalCollateralExposure value for this CalculationResults.
     * 
     * @return LCVDivTotalCollateralExposure
     */
    public java.lang.Double getLCVDivTotalCollateralExposure() {
        return LCVDivTotalCollateralExposure;
    }


    /**
     * Sets the LCVDivTotalCollateralExposure value for this CalculationResults.
     * 
     * @param LCVDivTotalCollateralExposure
     */
    public void setLCVDivTotalCollateralExposure(java.lang.Double LCVDivTotalCollateralExposure) {
        this.LCVDivTotalCollateralExposure = LCVDivTotalCollateralExposure;
    }


    /**
     * Gets the LCVExcess value for this CalculationResults.
     * 
     * @return LCVExcess
     */
    public java.lang.Double getLCVExcess() {
        return LCVExcess;
    }


    /**
     * Sets the LCVExcess value for this CalculationResults.
     * 
     * @param LCVExcess
     */
    public void setLCVExcess(java.lang.Double LCVExcess) {
        this.LCVExcess = LCVExcess;
    }


    /**
     * Gets the LHFSAdvanceTotalAmt value for this CalculationResults.
     * 
     * @return LHFSAdvanceTotalAmt
     */
    public java.lang.Double getLHFSAdvanceTotalAmt() {
        return LHFSAdvanceTotalAmt;
    }


    /**
     * Sets the LHFSAdvanceTotalAmt value for this CalculationResults.
     * 
     * @param LHFSAdvanceTotalAmt
     */
    public void setLHFSAdvanceTotalAmt(java.lang.Double LHFSAdvanceTotalAmt) {
        this.LHFSAdvanceTotalAmt = LHFSAdvanceTotalAmt;
    }


    /**
     * Gets the LHFSLCV value for this CalculationResults.
     * 
     * @return LHFSLCV
     */
    public java.lang.Double getLHFSLCV() {
        return LHFSLCV;
    }


    /**
     * Sets the LHFSLCV value for this CalculationResults.
     * 
     * @param LHFSLCV
     */
    public void setLHFSLCV(java.lang.Double LHFSLCV) {
        this.LHFSLCV = LHFSLCV;
    }


    /**
     * Gets the LHFSLCVExcess value for this CalculationResults.
     * 
     * @return LHFSLCVExcess
     */
    public java.lang.Double getLHFSLCVExcess() {
        return LHFSLCVExcess;
    }


    /**
     * Sets the LHFSLCVExcess value for this CalculationResults.
     * 
     * @param LHFSLCVExcess
     */
    public void setLHFSLCVExcess(java.lang.Double LHFSLCVExcess) {
        this.LHFSLCVExcess = LHFSLCVExcess;
    }


    /**
     * Gets the LOCCorpSettlementsNextMaturityAmt value for this CalculationResults.
     * 
     * @return LOCCorpSettlementsNextMaturityAmt
     */
    public java.lang.Double getLOCCorpSettlementsNextMaturityAmt() {
        return LOCCorpSettlementsNextMaturityAmt;
    }


    /**
     * Sets the LOCCorpSettlementsNextMaturityAmt value for this CalculationResults.
     * 
     * @param LOCCorpSettlementsNextMaturityAmt
     */
    public void setLOCCorpSettlementsNextMaturityAmt(java.lang.Double LOCCorpSettlementsNextMaturityAmt) {
        this.LOCCorpSettlementsNextMaturityAmt = LOCCorpSettlementsNextMaturityAmt;
    }


    /**
     * Gets the LOCCorpSettlementsNextMaturityDate value for this CalculationResults.
     * 
     * @return LOCCorpSettlementsNextMaturityDate
     */
    public java.util.Calendar getLOCCorpSettlementsNextMaturityDate() {
        return LOCCorpSettlementsNextMaturityDate;
    }


    /**
     * Sets the LOCCorpSettlementsNextMaturityDate value for this CalculationResults.
     * 
     * @param LOCCorpSettlementsNextMaturityDate
     */
    public void setLOCCorpSettlementsNextMaturityDate(java.util.Calendar LOCCorpSettlementsNextMaturityDate) {
        this.LOCCorpSettlementsNextMaturityDate = LOCCorpSettlementsNextMaturityDate;
    }


    /**
     * Gets the LOCCorpSettlementsNextSettlementAmt value for this CalculationResults.
     * 
     * @return LOCCorpSettlementsNextSettlementAmt
     */
    public java.lang.Double getLOCCorpSettlementsNextSettlementAmt() {
        return LOCCorpSettlementsNextSettlementAmt;
    }


    /**
     * Sets the LOCCorpSettlementsNextSettlementAmt value for this CalculationResults.
     * 
     * @param LOCCorpSettlementsNextSettlementAmt
     */
    public void setLOCCorpSettlementsNextSettlementAmt(java.lang.Double LOCCorpSettlementsNextSettlementAmt) {
        this.LOCCorpSettlementsNextSettlementAmt = LOCCorpSettlementsNextSettlementAmt;
    }


    /**
     * Gets the LOCCorpSettlementsNextSettlementDate value for this CalculationResults.
     * 
     * @return LOCCorpSettlementsNextSettlementDate
     */
    public java.util.Calendar getLOCCorpSettlementsNextSettlementDate() {
        return LOCCorpSettlementsNextSettlementDate;
    }


    /**
     * Sets the LOCCorpSettlementsNextSettlementDate value for this CalculationResults.
     * 
     * @param LOCCorpSettlementsNextSettlementDate
     */
    public void setLOCCorpSettlementsNextSettlementDate(java.util.Calendar LOCCorpSettlementsNextSettlementDate) {
        this.LOCCorpSettlementsNextSettlementDate = LOCCorpSettlementsNextSettlementDate;
    }


    /**
     * Gets the LOCCorporateSettlementsTotalAmt value for this CalculationResults.
     * 
     * @return LOCCorporateSettlementsTotalAmt
     */
    public java.lang.Double getLOCCorporateSettlementsTotalAmt() {
        return LOCCorporateSettlementsTotalAmt;
    }


    /**
     * Sets the LOCCorporateSettlementsTotalAmt value for this CalculationResults.
     * 
     * @param LOCCorporateSettlementsTotalAmt
     */
    public void setLOCCorporateSettlementsTotalAmt(java.lang.Double LOCCorporateSettlementsTotalAmt) {
        this.LOCCorporateSettlementsTotalAmt = LOCCorporateSettlementsTotalAmt;
    }


    /**
     * Gets the letterOfCreditTotalAmt value for this CalculationResults.
     * 
     * @return letterOfCreditTotalAmt
     */
    public java.lang.Double getLetterOfCreditTotalAmt() {
        return letterOfCreditTotalAmt;
    }


    /**
     * Sets the letterOfCreditTotalAmt value for this CalculationResults.
     * 
     * @param letterOfCreditTotalAmt
     */
    public void setLetterOfCreditTotalAmt(java.lang.Double letterOfCreditTotalAmt) {
        this.letterOfCreditTotalAmt = letterOfCreditTotalAmt;
    }


    /**
     * Gets the MPFCreditEnhancementTotalAmt value for this CalculationResults.
     * 
     * @return MPFCreditEnhancementTotalAmt
     */
    public java.lang.Double getMPFCreditEnhancementTotalAmt() {
        return MPFCreditEnhancementTotalAmt;
    }


    /**
     * Sets the MPFCreditEnhancementTotalAmt value for this CalculationResults.
     * 
     * @param MPFCreditEnhancementTotalAmt
     */
    public void setMPFCreditEnhancementTotalAmt(java.lang.Double MPFCreditEnhancementTotalAmt) {
        this.MPFCreditEnhancementTotalAmt = MPFCreditEnhancementTotalAmt;
    }


    /**
     * Gets the memberID value for this CalculationResults.
     * 
     * @return memberID
     */
    public java.lang.Integer getMemberID() {
        return memberID;
    }


    /**
     * Sets the memberID value for this CalculationResults.
     * 
     * @param memberID
     */
    public void setMemberID(java.lang.Integer memberID) {
        this.memberID = memberID;
    }


    /**
     * Gets the memberLCV value for this CalculationResults.
     * 
     * @return memberLCV
     */
    public exposure.service.fhlbatl.com.ExposureLCVResult getMemberLCV() {
        return memberLCV;
    }


    /**
     * Sets the memberLCV value for this CalculationResults.
     * 
     * @param memberLCV
     */
    public void setMemberLCV(exposure.service.fhlbatl.com.ExposureLCVResult memberLCV) {
        this.memberLCV = memberLCV;
    }


    /**
     * Gets the memberStandaloneDerivativeTotalAmt value for this CalculationResults.
     * 
     * @return memberStandaloneDerivativeTotalAmt
     */
    public java.lang.Double getMemberStandaloneDerivativeTotalAmt() {
        return memberStandaloneDerivativeTotalAmt;
    }


    /**
     * Sets the memberStandaloneDerivativeTotalAmt value for this CalculationResults.
     * 
     * @param memberStandaloneDerivativeTotalAmt
     */
    public void setMemberStandaloneDerivativeTotalAmt(java.lang.Double memberStandaloneDerivativeTotalAmt) {
        this.memberStandaloneDerivativeTotalAmt = memberStandaloneDerivativeTotalAmt;
    }


    /**
     * Gets the portfolioLCVList value for this CalculationResults.
     * 
     * @return portfolioLCVList
     */
    public exposure.service.fhlbatl.com.ExposurePortfolioLCV[] getPortfolioLCVList() {
        return portfolioLCVList;
    }


    /**
     * Sets the portfolioLCVList value for this CalculationResults.
     * 
     * @param portfolioLCVList
     */
    public void setPortfolioLCVList(exposure.service.fhlbatl.com.ExposurePortfolioLCV[] portfolioLCVList) {
        this.portfolioLCVList = portfolioLCVList;
    }

    public exposure.service.fhlbatl.com.ExposurePortfolioLCV getPortfolioLCVList(int i) {
        return this.portfolioLCVList[i];
    }

    public void setPortfolioLCVList(int i, exposure.service.fhlbatl.com.ExposurePortfolioLCV _value) {
        this.portfolioLCVList[i] = _value;
    }


    /**
     * Gets the projCollateralMaintenanceLevel value for this CalculationResults.
     * 
     * @return projCollateralMaintenanceLevel
     */
    public java.lang.Double getProjCollateralMaintenanceLevel() {
        return projCollateralMaintenanceLevel;
    }


    /**
     * Sets the projCollateralMaintenanceLevel value for this CalculationResults.
     * 
     * @param projCollateralMaintenanceLevel
     */
    public void setProjCollateralMaintenanceLevel(java.lang.Double projCollateralMaintenanceLevel) {
        this.projCollateralMaintenanceLevel = projCollateralMaintenanceLevel;
    }


    /**
     * Gets the projLCVExcess value for this CalculationResults.
     * 
     * @return projLCVExcess
     */
    public java.lang.Double getProjLCVExcess() {
        return projLCVExcess;
    }


    /**
     * Sets the projLCVExcess value for this CalculationResults.
     * 
     * @param projLCVExcess
     */
    public void setProjLCVExcess(java.lang.Double projLCVExcess) {
        this.projLCVExcess = projLCVExcess;
    }


    /**
     * Gets the projTotalCollateralExposure value for this CalculationResults.
     * 
     * @return projTotalCollateralExposure
     */
    public java.lang.Double getProjTotalCollateralExposure() {
        return projTotalCollateralExposure;
    }


    /**
     * Sets the projTotalCollateralExposure value for this CalculationResults.
     * 
     * @param projTotalCollateralExposure
     */
    public void setProjTotalCollateralExposure(java.lang.Double projTotalCollateralExposure) {
        this.projTotalCollateralExposure = projTotalCollateralExposure;
    }


    /**
     * Gets the projTotalCollateralExposureDivAssets value for this CalculationResults.
     * 
     * @return projTotalCollateralExposureDivAssets
     */
    public java.lang.Double getProjTotalCollateralExposureDivAssets() {
        return projTotalCollateralExposureDivAssets;
    }


    /**
     * Sets the projTotalCollateralExposureDivAssets value for this CalculationResults.
     * 
     * @param projTotalCollateralExposureDivAssets
     */
    public void setProjTotalCollateralExposureDivAssets(java.lang.Double projTotalCollateralExposureDivAssets) {
        this.projTotalCollateralExposureDivAssets = projTotalCollateralExposureDivAssets;
    }


    /**
     * Gets the remainingCreditAvailabilityAmt value for this CalculationResults.
     * 
     * @return remainingCreditAvailabilityAmt
     */
    public java.lang.Double getRemainingCreditAvailabilityAmt() {
        return remainingCreditAvailabilityAmt;
    }


    /**
     * Sets the remainingCreditAvailabilityAmt value for this CalculationResults.
     * 
     * @param remainingCreditAvailabilityAmt
     */
    public void setRemainingCreditAvailabilityAmt(java.lang.Double remainingCreditAvailabilityAmt) {
        this.remainingCreditAvailabilityAmt = remainingCreditAvailabilityAmt;
    }


    /**
     * Gets the totalAssetsAmt value for this CalculationResults.
     * 
     * @return totalAssetsAmt
     */
    public java.lang.Double getTotalAssetsAmt() {
        return totalAssetsAmt;
    }


    /**
     * Sets the totalAssetsAmt value for this CalculationResults.
     * 
     * @param totalAssetsAmt
     */
    public void setTotalAssetsAmt(java.lang.Double totalAssetsAmt) {
        this.totalAssetsAmt = totalAssetsAmt;
    }


    /**
     * Gets the totalCollateralExposure value for this CalculationResults.
     * 
     * @return totalCollateralExposure
     */
    public java.lang.Double getTotalCollateralExposure() {
        return totalCollateralExposure;
    }


    /**
     * Sets the totalCollateralExposure value for this CalculationResults.
     * 
     * @param totalCollateralExposure
     */
    public void setTotalCollateralExposure(java.lang.Double totalCollateralExposure) {
        this.totalCollateralExposure = totalCollateralExposure;
    }


    /**
     * Gets the totalCollateralExposureDivAssets value for this CalculationResults.
     * 
     * @return totalCollateralExposureDivAssets
     */
    public java.lang.Double getTotalCollateralExposureDivAssets() {
        return totalCollateralExposureDivAssets;
    }


    /**
     * Sets the totalCollateralExposureDivAssets value for this CalculationResults.
     * 
     * @param totalCollateralExposureDivAssets
     */
    public void setTotalCollateralExposureDivAssets(java.lang.Double totalCollateralExposureDivAssets) {
        this.totalCollateralExposureDivAssets = totalCollateralExposureDivAssets;
    }


    /**
     * Gets the totalCreditExposure value for this CalculationResults.
     * 
     * @return totalCreditExposure
     */
    public java.lang.Double getTotalCreditExposure() {
        return totalCreditExposure;
    }


    /**
     * Sets the totalCreditExposure value for this CalculationResults.
     * 
     * @param totalCreditExposure
     */
    public void setTotalCreditExposure(java.lang.Double totalCreditExposure) {
        this.totalCreditExposure = totalCreditExposure;
    }


    /**
     * Gets the totalCreditExposureDivAssets value for this CalculationResults.
     * 
     * @return totalCreditExposureDivAssets
     */
    public java.lang.Double getTotalCreditExposureDivAssets() {
        return totalCreditExposureDivAssets;
    }


    /**
     * Sets the totalCreditExposureDivAssets value for this CalculationResults.
     * 
     * @param totalCreditExposureDivAssets
     */
    public void setTotalCreditExposureDivAssets(java.lang.Double totalCreditExposureDivAssets) {
        this.totalCreditExposureDivAssets = totalCreditExposureDivAssets;
    }


    /**
     * Gets the totalLCV value for this CalculationResults.
     * 
     * @return totalLCV
     */
    public exposure.service.fhlbatl.com.ExposureLCVResult getTotalLCV() {
        return totalLCV;
    }


    /**
     * Sets the totalLCV value for this CalculationResults.
     * 
     * @param totalLCV
     */
    public void setTotalLCV(exposure.service.fhlbatl.com.ExposureLCVResult totalLCV) {
        this.totalLCV = totalLCV;
    }


    /**
     * Gets the totalSecuredCreditExposure value for this CalculationResults.
     * 
     * @return totalSecuredCreditExposure
     */
    public java.lang.Double getTotalSecuredCreditExposure() {
        return totalSecuredCreditExposure;
    }


    /**
     * Sets the totalSecuredCreditExposure value for this CalculationResults.
     * 
     * @param totalSecuredCreditExposure
     */
    public void setTotalSecuredCreditExposure(java.lang.Double totalSecuredCreditExposure) {
        this.totalSecuredCreditExposure = totalSecuredCreditExposure;
    }


    /**
     * Gets the totalUnsecuredCreditExposure value for this CalculationResults.
     * 
     * @return totalUnsecuredCreditExposure
     */
    public java.lang.Double getTotalUnsecuredCreditExposure() {
        return totalUnsecuredCreditExposure;
    }


    /**
     * Sets the totalUnsecuredCreditExposure value for this CalculationResults.
     * 
     * @param totalUnsecuredCreditExposure
     */
    public void setTotalUnsecuredCreditExposure(java.lang.Double totalUnsecuredCreditExposure) {
        this.totalUnsecuredCreditExposure = totalUnsecuredCreditExposure;
    }


    /**
     * Gets the unsecuredCreditOvernightAmt value for this CalculationResults.
     * 
     * @return unsecuredCreditOvernightAmt
     */
    public java.lang.Double getUnsecuredCreditOvernightAmt() {
        return unsecuredCreditOvernightAmt;
    }


    /**
     * Sets the unsecuredCreditOvernightAmt value for this CalculationResults.
     * 
     * @param unsecuredCreditOvernightAmt
     */
    public void setUnsecuredCreditOvernightAmt(java.lang.Double unsecuredCreditOvernightAmt) {
        this.unsecuredCreditOvernightAmt = unsecuredCreditOvernightAmt;
    }


    /**
     * Gets the unsecuredCreditSwapAmt value for this CalculationResults.
     * 
     * @return unsecuredCreditSwapAmt
     */
    public java.lang.Double getUnsecuredCreditSwapAmt() {
        return unsecuredCreditSwapAmt;
    }


    /**
     * Sets the unsecuredCreditSwapAmt value for this CalculationResults.
     * 
     * @param unsecuredCreditSwapAmt
     */
    public void setUnsecuredCreditSwapAmt(java.lang.Double unsecuredCreditSwapAmt) {
        this.unsecuredCreditSwapAmt = unsecuredCreditSwapAmt;
    }


    /**
     * Gets the unsecuredCreditTermAmt value for this CalculationResults.
     * 
     * @return unsecuredCreditTermAmt
     */
    public java.lang.Double getUnsecuredCreditTermAmt() {
        return unsecuredCreditTermAmt;
    }


    /**
     * Sets the unsecuredCreditTermAmt value for this CalculationResults.
     * 
     * @param unsecuredCreditTermAmt
     */
    public void setUnsecuredCreditTermAmt(java.lang.Double unsecuredCreditTermAmt) {
        this.unsecuredCreditTermAmt = unsecuredCreditTermAmt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CalculationResults)) return false;
        CalculationResults other = (CalculationResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.advanceTotalExcLHFSAmt==null && other.getAdvanceTotalExcLHFSAmt()==null) || 
             (this.advanceTotalExcLHFSAmt!=null &&
              this.advanceTotalExcLHFSAmt.equals(other.getAdvanceTotalExcLHFSAmt()))) &&
            ((this.advanceTotalIncLHFSAmt==null && other.getAdvanceTotalIncLHFSAmt()==null) || 
             (this.advanceTotalIncLHFSAmt!=null &&
              this.advanceTotalIncLHFSAmt.equals(other.getAdvanceTotalIncLHFSAmt()))) &&
            ((this.advancesDivAssets==null && other.getAdvancesDivAssets()==null) || 
             (this.advancesDivAssets!=null &&
              this.advancesDivAssets.equals(other.getAdvancesDivAssets()))) &&
            ((this.affiliateLCV==null && other.getAffiliateLCV()==null) || 
             (this.affiliateLCV!=null &&
              this.affiliateLCV.equals(other.getAffiliateLCV()))) &&
            ((this.affiliateReliance==null && other.getAffiliateReliance()==null) || 
             (this.affiliateReliance!=null &&
              this.affiliateReliance.equals(other.getAffiliateReliance()))) &&
            ((this.cashPledged==null && other.getCashPledged()==null) || 
             (this.cashPledged!=null &&
              this.cashPledged.equals(other.getCashPledged()))) &&
            ((this.collateralMaintenanceLevel==null && other.getCollateralMaintenanceLevel()==null) || 
             (this.collateralMaintenanceLevel!=null &&
              this.collateralMaintenanceLevel.equals(other.getCollateralMaintenanceLevel()))) &&
            ((this.collateralMarketValue==null && other.getCollateralMarketValue()==null) || 
             (this.collateralMarketValue!=null &&
              this.collateralMarketValue.equals(other.getCollateralMarketValue()))) &&
            ((this.corporateSettlementsNextMaturityAmt==null && other.getCorporateSettlementsNextMaturityAmt()==null) || 
             (this.corporateSettlementsNextMaturityAmt!=null &&
              this.corporateSettlementsNextMaturityAmt.equals(other.getCorporateSettlementsNextMaturityAmt()))) &&
            ((this.corporateSettlementsNextMaturityDate==null && other.getCorporateSettlementsNextMaturityDate()==null) || 
             (this.corporateSettlementsNextMaturityDate!=null &&
              this.corporateSettlementsNextMaturityDate.equals(other.getCorporateSettlementsNextMaturityDate()))) &&
            ((this.corporateSettlementsNextSettlementAmt==null && other.getCorporateSettlementsNextSettlementAmt()==null) || 
             (this.corporateSettlementsNextSettlementAmt!=null &&
              this.corporateSettlementsNextSettlementAmt.equals(other.getCorporateSettlementsNextSettlementAmt()))) &&
            ((this.corporateSettlementsNextSettlementDate==null && other.getCorporateSettlementsNextSettlementDate()==null) || 
             (this.corporateSettlementsNextSettlementDate!=null &&
              this.corporateSettlementsNextSettlementDate.equals(other.getCorporateSettlementsNextSettlementDate()))) &&
            ((this.corporateSettlementsTotalAmt==null && other.getCorporateSettlementsTotalAmt()==null) || 
             (this.corporateSettlementsTotalAmt!=null &&
              this.corporateSettlementsTotalAmt.equals(other.getCorporateSettlementsTotalAmt()))) &&
            ((this.creditAvailability==null && other.getCreditAvailability()==null) || 
             (this.creditAvailability!=null &&
              this.creditAvailability.equals(other.getCreditAvailability()))) &&
            ((this.creditAvailabilityDivAssets==null && other.getCreditAvailabilityDivAssets()==null) || 
             (this.creditAvailabilityDivAssets!=null &&
              this.creditAvailabilityDivAssets.equals(other.getCreditAvailabilityDivAssets()))) &&
            ((this.DIAOverdraftTotalAmt==null && other.getDIAOverdraftTotalAmt()==null) || 
             (this.DIAOverdraftTotalAmt!=null &&
              this.DIAOverdraftTotalAmt.equals(other.getDIAOverdraftTotalAmt()))) &&
            ((this.errorCode==null && other.getErrorCode()==null) || 
             (this.errorCode!=null &&
              this.errorCode.equals(other.getErrorCode()))) &&
            ((this.estPrepaymentFeesAmt==null && other.getEstPrepaymentFeesAmt()==null) || 
             (this.estPrepaymentFeesAmt!=null &&
              this.estPrepaymentFeesAmt.equals(other.getEstPrepaymentFeesAmt()))) &&
            ((this.isError==null && other.getIsError()==null) || 
             (this.isError!=null &&
              this.isError.equals(other.getIsError()))) &&
            ((this.LCVDivAdvances==null && other.getLCVDivAdvances()==null) || 
             (this.LCVDivAdvances!=null &&
              this.LCVDivAdvances.equals(other.getLCVDivAdvances()))) &&
            ((this.LCVDivCollateralMaintenanceLevel==null && other.getLCVDivCollateralMaintenanceLevel()==null) || 
             (this.LCVDivCollateralMaintenanceLevel!=null &&
              this.LCVDivCollateralMaintenanceLevel.equals(other.getLCVDivCollateralMaintenanceLevel()))) &&
            ((this.LCVDivProjTotalCollateralExposure==null && other.getLCVDivProjTotalCollateralExposure()==null) || 
             (this.LCVDivProjTotalCollateralExposure!=null &&
              this.LCVDivProjTotalCollateralExposure.equals(other.getLCVDivProjTotalCollateralExposure()))) &&
            ((this.LCVDivTotalCollateralExposure==null && other.getLCVDivTotalCollateralExposure()==null) || 
             (this.LCVDivTotalCollateralExposure!=null &&
              this.LCVDivTotalCollateralExposure.equals(other.getLCVDivTotalCollateralExposure()))) &&
            ((this.LCVExcess==null && other.getLCVExcess()==null) || 
             (this.LCVExcess!=null &&
              this.LCVExcess.equals(other.getLCVExcess()))) &&
            ((this.LHFSAdvanceTotalAmt==null && other.getLHFSAdvanceTotalAmt()==null) || 
             (this.LHFSAdvanceTotalAmt!=null &&
              this.LHFSAdvanceTotalAmt.equals(other.getLHFSAdvanceTotalAmt()))) &&
            ((this.LHFSLCV==null && other.getLHFSLCV()==null) || 
             (this.LHFSLCV!=null &&
              this.LHFSLCV.equals(other.getLHFSLCV()))) &&
            ((this.LHFSLCVExcess==null && other.getLHFSLCVExcess()==null) || 
             (this.LHFSLCVExcess!=null &&
              this.LHFSLCVExcess.equals(other.getLHFSLCVExcess()))) &&
            ((this.LOCCorpSettlementsNextMaturityAmt==null && other.getLOCCorpSettlementsNextMaturityAmt()==null) || 
             (this.LOCCorpSettlementsNextMaturityAmt!=null &&
              this.LOCCorpSettlementsNextMaturityAmt.equals(other.getLOCCorpSettlementsNextMaturityAmt()))) &&
            ((this.LOCCorpSettlementsNextMaturityDate==null && other.getLOCCorpSettlementsNextMaturityDate()==null) || 
             (this.LOCCorpSettlementsNextMaturityDate!=null &&
              this.LOCCorpSettlementsNextMaturityDate.equals(other.getLOCCorpSettlementsNextMaturityDate()))) &&
            ((this.LOCCorpSettlementsNextSettlementAmt==null && other.getLOCCorpSettlementsNextSettlementAmt()==null) || 
             (this.LOCCorpSettlementsNextSettlementAmt!=null &&
              this.LOCCorpSettlementsNextSettlementAmt.equals(other.getLOCCorpSettlementsNextSettlementAmt()))) &&
            ((this.LOCCorpSettlementsNextSettlementDate==null && other.getLOCCorpSettlementsNextSettlementDate()==null) || 
             (this.LOCCorpSettlementsNextSettlementDate!=null &&
              this.LOCCorpSettlementsNextSettlementDate.equals(other.getLOCCorpSettlementsNextSettlementDate()))) &&
            ((this.LOCCorporateSettlementsTotalAmt==null && other.getLOCCorporateSettlementsTotalAmt()==null) || 
             (this.LOCCorporateSettlementsTotalAmt!=null &&
              this.LOCCorporateSettlementsTotalAmt.equals(other.getLOCCorporateSettlementsTotalAmt()))) &&
            ((this.letterOfCreditTotalAmt==null && other.getLetterOfCreditTotalAmt()==null) || 
             (this.letterOfCreditTotalAmt!=null &&
              this.letterOfCreditTotalAmt.equals(other.getLetterOfCreditTotalAmt()))) &&
            ((this.MPFCreditEnhancementTotalAmt==null && other.getMPFCreditEnhancementTotalAmt()==null) || 
             (this.MPFCreditEnhancementTotalAmt!=null &&
              this.MPFCreditEnhancementTotalAmt.equals(other.getMPFCreditEnhancementTotalAmt()))) &&
            ((this.memberID==null && other.getMemberID()==null) || 
             (this.memberID!=null &&
              this.memberID.equals(other.getMemberID()))) &&
            ((this.memberLCV==null && other.getMemberLCV()==null) || 
             (this.memberLCV!=null &&
              this.memberLCV.equals(other.getMemberLCV()))) &&
            ((this.memberStandaloneDerivativeTotalAmt==null && other.getMemberStandaloneDerivativeTotalAmt()==null) || 
             (this.memberStandaloneDerivativeTotalAmt!=null &&
              this.memberStandaloneDerivativeTotalAmt.equals(other.getMemberStandaloneDerivativeTotalAmt()))) &&
            ((this.portfolioLCVList==null && other.getPortfolioLCVList()==null) || 
             (this.portfolioLCVList!=null &&
              java.util.Arrays.equals(this.portfolioLCVList, other.getPortfolioLCVList()))) &&
            ((this.projCollateralMaintenanceLevel==null && other.getProjCollateralMaintenanceLevel()==null) || 
             (this.projCollateralMaintenanceLevel!=null &&
              this.projCollateralMaintenanceLevel.equals(other.getProjCollateralMaintenanceLevel()))) &&
            ((this.projLCVExcess==null && other.getProjLCVExcess()==null) || 
             (this.projLCVExcess!=null &&
              this.projLCVExcess.equals(other.getProjLCVExcess()))) &&
            ((this.projTotalCollateralExposure==null && other.getProjTotalCollateralExposure()==null) || 
             (this.projTotalCollateralExposure!=null &&
              this.projTotalCollateralExposure.equals(other.getProjTotalCollateralExposure()))) &&
            ((this.projTotalCollateralExposureDivAssets==null && other.getProjTotalCollateralExposureDivAssets()==null) || 
             (this.projTotalCollateralExposureDivAssets!=null &&
              this.projTotalCollateralExposureDivAssets.equals(other.getProjTotalCollateralExposureDivAssets()))) &&
            ((this.remainingCreditAvailabilityAmt==null && other.getRemainingCreditAvailabilityAmt()==null) || 
             (this.remainingCreditAvailabilityAmt!=null &&
              this.remainingCreditAvailabilityAmt.equals(other.getRemainingCreditAvailabilityAmt()))) &&
            ((this.totalAssetsAmt==null && other.getTotalAssetsAmt()==null) || 
             (this.totalAssetsAmt!=null &&
              this.totalAssetsAmt.equals(other.getTotalAssetsAmt()))) &&
            ((this.totalCollateralExposure==null && other.getTotalCollateralExposure()==null) || 
             (this.totalCollateralExposure!=null &&
              this.totalCollateralExposure.equals(other.getTotalCollateralExposure()))) &&
            ((this.totalCollateralExposureDivAssets==null && other.getTotalCollateralExposureDivAssets()==null) || 
             (this.totalCollateralExposureDivAssets!=null &&
              this.totalCollateralExposureDivAssets.equals(other.getTotalCollateralExposureDivAssets()))) &&
            ((this.totalCreditExposure==null && other.getTotalCreditExposure()==null) || 
             (this.totalCreditExposure!=null &&
              this.totalCreditExposure.equals(other.getTotalCreditExposure()))) &&
            ((this.totalCreditExposureDivAssets==null && other.getTotalCreditExposureDivAssets()==null) || 
             (this.totalCreditExposureDivAssets!=null &&
              this.totalCreditExposureDivAssets.equals(other.getTotalCreditExposureDivAssets()))) &&
            ((this.totalLCV==null && other.getTotalLCV()==null) || 
             (this.totalLCV!=null &&
              this.totalLCV.equals(other.getTotalLCV()))) &&
            ((this.totalSecuredCreditExposure==null && other.getTotalSecuredCreditExposure()==null) || 
             (this.totalSecuredCreditExposure!=null &&
              this.totalSecuredCreditExposure.equals(other.getTotalSecuredCreditExposure()))) &&
            ((this.totalUnsecuredCreditExposure==null && other.getTotalUnsecuredCreditExposure()==null) || 
             (this.totalUnsecuredCreditExposure!=null &&
              this.totalUnsecuredCreditExposure.equals(other.getTotalUnsecuredCreditExposure()))) &&
            ((this.unsecuredCreditOvernightAmt==null && other.getUnsecuredCreditOvernightAmt()==null) || 
             (this.unsecuredCreditOvernightAmt!=null &&
              this.unsecuredCreditOvernightAmt.equals(other.getUnsecuredCreditOvernightAmt()))) &&
            ((this.unsecuredCreditSwapAmt==null && other.getUnsecuredCreditSwapAmt()==null) || 
             (this.unsecuredCreditSwapAmt!=null &&
              this.unsecuredCreditSwapAmt.equals(other.getUnsecuredCreditSwapAmt()))) &&
            ((this.unsecuredCreditTermAmt==null && other.getUnsecuredCreditTermAmt()==null) || 
             (this.unsecuredCreditTermAmt!=null &&
              this.unsecuredCreditTermAmt.equals(other.getUnsecuredCreditTermAmt())));
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
        if (getAdvanceTotalExcLHFSAmt() != null) {
            _hashCode += getAdvanceTotalExcLHFSAmt().hashCode();
        }
        if (getAdvanceTotalIncLHFSAmt() != null) {
            _hashCode += getAdvanceTotalIncLHFSAmt().hashCode();
        }
        if (getAdvancesDivAssets() != null) {
            _hashCode += getAdvancesDivAssets().hashCode();
        }
        if (getAffiliateLCV() != null) {
            _hashCode += getAffiliateLCV().hashCode();
        }
        if (getAffiliateReliance() != null) {
            _hashCode += getAffiliateReliance().hashCode();
        }
        if (getCashPledged() != null) {
            _hashCode += getCashPledged().hashCode();
        }
        if (getCollateralMaintenanceLevel() != null) {
            _hashCode += getCollateralMaintenanceLevel().hashCode();
        }
        if (getCollateralMarketValue() != null) {
            _hashCode += getCollateralMarketValue().hashCode();
        }
        if (getCorporateSettlementsNextMaturityAmt() != null) {
            _hashCode += getCorporateSettlementsNextMaturityAmt().hashCode();
        }
        if (getCorporateSettlementsNextMaturityDate() != null) {
            _hashCode += getCorporateSettlementsNextMaturityDate().hashCode();
        }
        if (getCorporateSettlementsNextSettlementAmt() != null) {
            _hashCode += getCorporateSettlementsNextSettlementAmt().hashCode();
        }
        if (getCorporateSettlementsNextSettlementDate() != null) {
            _hashCode += getCorporateSettlementsNextSettlementDate().hashCode();
        }
        if (getCorporateSettlementsTotalAmt() != null) {
            _hashCode += getCorporateSettlementsTotalAmt().hashCode();
        }
        if (getCreditAvailability() != null) {
            _hashCode += getCreditAvailability().hashCode();
        }
        if (getCreditAvailabilityDivAssets() != null) {
            _hashCode += getCreditAvailabilityDivAssets().hashCode();
        }
        if (getDIAOverdraftTotalAmt() != null) {
            _hashCode += getDIAOverdraftTotalAmt().hashCode();
        }
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        if (getEstPrepaymentFeesAmt() != null) {
            _hashCode += getEstPrepaymentFeesAmt().hashCode();
        }
        if (getIsError() != null) {
            _hashCode += getIsError().hashCode();
        }
        if (getLCVDivAdvances() != null) {
            _hashCode += getLCVDivAdvances().hashCode();
        }
        if (getLCVDivCollateralMaintenanceLevel() != null) {
            _hashCode += getLCVDivCollateralMaintenanceLevel().hashCode();
        }
        if (getLCVDivProjTotalCollateralExposure() != null) {
            _hashCode += getLCVDivProjTotalCollateralExposure().hashCode();
        }
        if (getLCVDivTotalCollateralExposure() != null) {
            _hashCode += getLCVDivTotalCollateralExposure().hashCode();
        }
        if (getLCVExcess() != null) {
            _hashCode += getLCVExcess().hashCode();
        }
        if (getLHFSAdvanceTotalAmt() != null) {
            _hashCode += getLHFSAdvanceTotalAmt().hashCode();
        }
        if (getLHFSLCV() != null) {
            _hashCode += getLHFSLCV().hashCode();
        }
        if (getLHFSLCVExcess() != null) {
            _hashCode += getLHFSLCVExcess().hashCode();
        }
        if (getLOCCorpSettlementsNextMaturityAmt() != null) {
            _hashCode += getLOCCorpSettlementsNextMaturityAmt().hashCode();
        }
        if (getLOCCorpSettlementsNextMaturityDate() != null) {
            _hashCode += getLOCCorpSettlementsNextMaturityDate().hashCode();
        }
        if (getLOCCorpSettlementsNextSettlementAmt() != null) {
            _hashCode += getLOCCorpSettlementsNextSettlementAmt().hashCode();
        }
        if (getLOCCorpSettlementsNextSettlementDate() != null) {
            _hashCode += getLOCCorpSettlementsNextSettlementDate().hashCode();
        }
        if (getLOCCorporateSettlementsTotalAmt() != null) {
            _hashCode += getLOCCorporateSettlementsTotalAmt().hashCode();
        }
        if (getLetterOfCreditTotalAmt() != null) {
            _hashCode += getLetterOfCreditTotalAmt().hashCode();
        }
        if (getMPFCreditEnhancementTotalAmt() != null) {
            _hashCode += getMPFCreditEnhancementTotalAmt().hashCode();
        }
        if (getMemberID() != null) {
            _hashCode += getMemberID().hashCode();
        }
        if (getMemberLCV() != null) {
            _hashCode += getMemberLCV().hashCode();
        }
        if (getMemberStandaloneDerivativeTotalAmt() != null) {
            _hashCode += getMemberStandaloneDerivativeTotalAmt().hashCode();
        }
        if (getPortfolioLCVList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPortfolioLCVList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPortfolioLCVList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProjCollateralMaintenanceLevel() != null) {
            _hashCode += getProjCollateralMaintenanceLevel().hashCode();
        }
        if (getProjLCVExcess() != null) {
            _hashCode += getProjLCVExcess().hashCode();
        }
        if (getProjTotalCollateralExposure() != null) {
            _hashCode += getProjTotalCollateralExposure().hashCode();
        }
        if (getProjTotalCollateralExposureDivAssets() != null) {
            _hashCode += getProjTotalCollateralExposureDivAssets().hashCode();
        }
        if (getRemainingCreditAvailabilityAmt() != null) {
            _hashCode += getRemainingCreditAvailabilityAmt().hashCode();
        }
        if (getTotalAssetsAmt() != null) {
            _hashCode += getTotalAssetsAmt().hashCode();
        }
        if (getTotalCollateralExposure() != null) {
            _hashCode += getTotalCollateralExposure().hashCode();
        }
        if (getTotalCollateralExposureDivAssets() != null) {
            _hashCode += getTotalCollateralExposureDivAssets().hashCode();
        }
        if (getTotalCreditExposure() != null) {
            _hashCode += getTotalCreditExposure().hashCode();
        }
        if (getTotalCreditExposureDivAssets() != null) {
            _hashCode += getTotalCreditExposureDivAssets().hashCode();
        }
        if (getTotalLCV() != null) {
            _hashCode += getTotalLCV().hashCode();
        }
        if (getTotalSecuredCreditExposure() != null) {
            _hashCode += getTotalSecuredCreditExposure().hashCode();
        }
        if (getTotalUnsecuredCreditExposure() != null) {
            _hashCode += getTotalUnsecuredCreditExposure().hashCode();
        }
        if (getUnsecuredCreditOvernightAmt() != null) {
            _hashCode += getUnsecuredCreditOvernightAmt().hashCode();
        }
        if (getUnsecuredCreditSwapAmt() != null) {
            _hashCode += getUnsecuredCreditSwapAmt().hashCode();
        }
        if (getUnsecuredCreditTermAmt() != null) {
            _hashCode += getUnsecuredCreditTermAmt().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CalculationResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://com.fhlbatl.service.exposure", "calculationResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advanceTotalExcLHFSAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "advanceTotalExcLHFSAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advanceTotalIncLHFSAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "advanceTotalIncLHFSAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advancesDivAssets");
        elemField.setXmlName(new javax.xml.namespace.QName("", "advancesDivAssets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("affiliateLCV");
        elemField.setXmlName(new javax.xml.namespace.QName("", "affiliateLCV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://com.fhlbatl.service.exposure", "exposureLCVResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("affiliateReliance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "affiliateReliance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://com.fhlbatl.service.exposure", "exposureAffiliateRelianceResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cashPledged");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cashPledged"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collateralMaintenanceLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "collateralMaintenanceLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://com.fhlbatl.service.exposure", "exposureCMLResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collateralMarketValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "collateralMarketValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corporateSettlementsNextMaturityAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "corporateSettlementsNextMaturityAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corporateSettlementsNextMaturityDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "corporateSettlementsNextMaturityDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corporateSettlementsNextSettlementAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "corporateSettlementsNextSettlementAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corporateSettlementsNextSettlementDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "corporateSettlementsNextSettlementDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corporateSettlementsTotalAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "corporateSettlementsTotalAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditAvailability");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditAvailability"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://com.fhlbatl.service.exposure", "exposureCreditAvailabilityResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditAvailabilityDivAssets");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditAvailabilityDivAssets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DIAOverdraftTotalAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DIAOverdraftTotalAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("estPrepaymentFeesAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estPrepaymentFeesAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://com.fhlbatl.service.exposure", "exposureNPVResult"));
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
        elemField.setFieldName("LCVDivAdvances");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LCVDivAdvances"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LCVDivCollateralMaintenanceLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LCVDivCollateralMaintenanceLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LCVDivProjTotalCollateralExposure");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LCVDivProjTotalCollateralExposure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LCVDivTotalCollateralExposure");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LCVDivTotalCollateralExposure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LCVExcess");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LCVExcess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LHFSAdvanceTotalAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LHFSAdvanceTotalAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LHFSLCV");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LHFSLCV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LHFSLCVExcess");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LHFSLCVExcess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LOCCorpSettlementsNextMaturityAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LOCCorpSettlementsNextMaturityAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LOCCorpSettlementsNextMaturityDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LOCCorpSettlementsNextMaturityDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LOCCorpSettlementsNextSettlementAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LOCCorpSettlementsNextSettlementAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LOCCorpSettlementsNextSettlementDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LOCCorpSettlementsNextSettlementDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LOCCorporateSettlementsTotalAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LOCCorporateSettlementsTotalAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("letterOfCreditTotalAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "letterOfCreditTotalAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MPFCreditEnhancementTotalAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MPFCreditEnhancementTotalAmt"));
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
        elemField.setFieldName("memberLCV");
        elemField.setXmlName(new javax.xml.namespace.QName("", "memberLCV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://com.fhlbatl.service.exposure", "exposureLCVResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memberStandaloneDerivativeTotalAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "memberStandaloneDerivativeTotalAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portfolioLCVList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "portfolioLCVList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://com.fhlbatl.service.exposure", "exposurePortfolioLCV"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projCollateralMaintenanceLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "projCollateralMaintenanceLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projLCVExcess");
        elemField.setXmlName(new javax.xml.namespace.QName("", "projLCVExcess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projTotalCollateralExposure");
        elemField.setXmlName(new javax.xml.namespace.QName("", "projTotalCollateralExposure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projTotalCollateralExposureDivAssets");
        elemField.setXmlName(new javax.xml.namespace.QName("", "projTotalCollateralExposureDivAssets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remainingCreditAvailabilityAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remainingCreditAvailabilityAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalAssetsAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalAssetsAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalCollateralExposure");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalCollateralExposure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalCollateralExposureDivAssets");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalCollateralExposureDivAssets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalCreditExposure");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalCreditExposure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalCreditExposureDivAssets");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalCreditExposureDivAssets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalLCV");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalLCV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://com.fhlbatl.service.exposure", "exposureLCVResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalSecuredCreditExposure");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalSecuredCreditExposure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalUnsecuredCreditExposure");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalUnsecuredCreditExposure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unsecuredCreditOvernightAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unsecuredCreditOvernightAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unsecuredCreditSwapAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unsecuredCreditSwapAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unsecuredCreditTermAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unsecuredCreditTermAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
