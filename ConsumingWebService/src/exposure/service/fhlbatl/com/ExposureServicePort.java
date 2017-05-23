/**
 * ExposureServicePort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package exposure.service.fhlbatl.com;

public interface ExposureServicePort extends java.rmi.Remote {
    public exposure.service.fhlbatl.com.ExposureLCVResult getMemberLCV(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception;
    public exposure.service.fhlbatl.com.ExposurePortfolioLCV[] getPortfolioLCVList(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception;
    public java.lang.String[] checkStatus(java.lang.String[] statusRows) throws java.rmi.RemoteException;
    public java.lang.Boolean calculateExposureUsingLCV(java.lang.Integer memberID, exposure.service.fhlbatl.com.ExposureMemberLCV[] memberLCVList, java.lang.Double cashPledged, java.lang.Boolean useSourceData) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception;
    public exposure.service.fhlbatl.com.CalculationResults calculateExposureResultsUsingLCV(java.lang.Integer memberID, exposure.service.fhlbatl.com.ExposureMemberLCV[] memberLCVList, java.lang.Double cashPledged, java.lang.Boolean useSourceData) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception;
    public java.lang.Boolean calculateExposureMemoPost(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception;
    public exposure.service.fhlbatl.com.CalculationResults calculateExposureResultsMemoPost(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception;
    public java.lang.Boolean calculateExposureFromSource(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception;
    public java.lang.Boolean calculateExposureFromSourceNoQueue(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception;
    public exposure.service.fhlbatl.com.CalculationResults calculateExposureResultsFromSource(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception;
    public java.lang.Boolean calculateExposureUsingAdvance(java.lang.Integer memberID, java.lang.Double advanceAmt, java.lang.Double letterOfCreditAmt, java.lang.Double corporateSettlementAmt, java.lang.Double LHFSAmt, java.lang.Double letterOfCreditCorporateSettlementAmt, java.lang.Boolean useSourceData, java.lang.Boolean isReversal) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception;
    public exposure.service.fhlbatl.com.CalculationResults calculateExposureResultsUsingAdvance(java.lang.Integer memberID, java.lang.Double advanceAmt, java.lang.Double letterOfCreditAmt, java.lang.Double corporateSettlementAmt, java.lang.Double LHFSAmt, java.lang.Double letterOfCreditCorporateSettlementAmt, java.lang.Boolean useSourceData, java.lang.Boolean isModel, java.lang.Boolean isReversal) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception;
    public java.lang.Boolean updateAdvanceExposureCalculationItem(exposure.service.fhlbatl.com.ExposureAdvance advanceItem, java.lang.Boolean useSourceData) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception;
    public java.lang.Boolean updateAdvanceExposureCalculationUsingList(exposure.service.fhlbatl.com.ExposureAdvance[] advanceItemList, java.lang.Boolean useSourceData) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception;
    public exposure.service.fhlbatl.com.CalculationResults getAllExposureCalculations(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception;
    public java.lang.Double getTotalAdvanceCollateral(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception;
    public java.lang.Double getTotalAdvanceCredit(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception;
    public java.lang.Double getLHFSAdvance(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception;
    public java.lang.Double getLetterOfCredit(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception;
    public java.lang.Double getMemberStandaloneDerivativeExposure(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception;
    public java.lang.Double getMPFCreditEnhancement(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception;
    public java.lang.Double getDIAOverdraft(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception;
    public exposure.service.fhlbatl.com.ExposureNPVResult getEstPrepaymentFees(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception;
    public java.lang.Double getCorporateSettlements(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception;
    public java.lang.Double getLetterOfCreditCorporateSettlements(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception;
    public java.lang.Double getUnsecuredCreditOvernight(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception;
    public java.lang.Double getUnsecuredCreditTerm(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception;
    public java.lang.Double getUnsecuredCreditSwap(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception;
    public java.lang.Double getTotalCollateralExposure(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception;
    public java.lang.Double getTotalUnsecuredCreditExposure(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception;
    public java.lang.Double getTotalSecuredCreditExposure(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception;
    public java.lang.Double getTotalCreditExposure(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception;
    public java.lang.Double getProjTotalCollateralExposure(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception;
    public java.lang.Double getCashPledged(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception;
    public exposure.service.fhlbatl.com.ExposureCMLResult getCollateralMaintenanceLevel(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception;
    public java.lang.Double getProjCollateralMaintenanceLevel(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception;
    public java.lang.Double getCollateralMarketValue(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception;
    public exposure.service.fhlbatl.com.ExposureLCVResult getTotalLCV(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception;
    public exposure.service.fhlbatl.com.ExposureLCVResult getAffiliateLCV(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception;
    public java.lang.Double getLCVExcess(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception;
    public java.lang.Double getLCVDivTotalCollateralExposure(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception;
    public java.lang.Double getLCVDivCollateralMaintenanceLevel(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception;
    public java.lang.Double getProjLCVExcess(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception;
    public java.lang.Double getLCVDivProjTotalCollaterallExposure(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception;
    public java.lang.Double getTotalAssets(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception;
    public java.lang.Double getTotalCollateralExposureDivAssets(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception;
    public java.lang.Double getProjTotalCollateralExposureDivAssets(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception;
    public java.lang.Double getTotalCreditExposureDivAssets(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception;
    public exposure.service.fhlbatl.com.ExposureCreditAvailabilityResult getCreditAvailability(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception;
    public java.lang.Boolean setCreditAvailabilityAmount(java.lang.Integer memberID, java.lang.Double creditAvailabilityAmount) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception;
    public java.lang.Double getRemainingCreditAvailability(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception;
    public java.lang.Double getCreditAvailabilityDivAssets(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception;
    public java.lang.Double getAdvancesDivAssets(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception;
    public java.lang.Double getLCVDivAdvances(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception;
    public java.lang.Double getLHFSLCV(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception;
    public java.lang.Double getLHFSLCVExcess(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception;
    public exposure.service.fhlbatl.com.ExposureAffiliateRelianceResult getAffiliateReliance(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception;
}
