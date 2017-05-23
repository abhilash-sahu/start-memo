package exposure.service.fhlbatl.com;

public class ExposureServicePortProxy implements exposure.service.fhlbatl.com.ExposureServicePort {
  private String _endpoint = null;
  private exposure.service.fhlbatl.com.ExposureServicePort exposureServicePort = null;
  
  public ExposureServicePortProxy() {
    _initExposureServicePortProxy();
  }
  
  public ExposureServicePortProxy(String endpoint) {
    _endpoint = endpoint;
    _initExposureServicePortProxy();
  }
  
  private void _initExposureServicePortProxy() {
    try {
      exposureServicePort = (new exposure.service.fhlbatl.com.ExposureServiceLocator()).getExposureServicePort();
      if (exposureServicePort != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)exposureServicePort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)exposureServicePort)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (exposureServicePort != null)
      ((javax.xml.rpc.Stub)exposureServicePort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public exposure.service.fhlbatl.com.ExposureServicePort getExposureServicePort() {
    if (exposureServicePort == null)
      _initExposureServicePortProxy();
    return exposureServicePort;
  }
  
  public exposure.service.fhlbatl.com.ExposureLCVResult getMemberLCV(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception{
    if (exposureServicePort == null)
      _initExposureServicePortProxy();
    return exposureServicePort.getMemberLCV(memberID);
  }
  
  public exposure.service.fhlbatl.com.ExposurePortfolioLCV[] getPortfolioLCVList(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception{
    if (exposureServicePort == null)
      _initExposureServicePortProxy();
    return exposureServicePort.getPortfolioLCVList(memberID);
  }
  
  public java.lang.String[] checkStatus(java.lang.String[] statusRows) throws java.rmi.RemoteException{
    if (exposureServicePort == null)
      _initExposureServicePortProxy();
    return exposureServicePort.checkStatus(statusRows);
  }
  
  public java.lang.Boolean calculateExposureUsingLCV(java.lang.Integer memberID, exposure.service.fhlbatl.com.ExposureMemberLCV[] memberLCVList, java.lang.Double cashPledged, java.lang.Boolean useSourceData) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception{
    if (exposureServicePort == null)
      _initExposureServicePortProxy();
    return exposureServicePort.calculateExposureUsingLCV(memberID, memberLCVList, cashPledged, useSourceData);
  }
  
  public exposure.service.fhlbatl.com.CalculationResults calculateExposureResultsUsingLCV(java.lang.Integer memberID, exposure.service.fhlbatl.com.ExposureMemberLCV[] memberLCVList, java.lang.Double cashPledged, java.lang.Boolean useSourceData) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception{
    if (exposureServicePort == null)
      _initExposureServicePortProxy();
    return exposureServicePort.calculateExposureResultsUsingLCV(memberID, memberLCVList, cashPledged, useSourceData);
  }
  
  public java.lang.Boolean calculateExposureMemoPost(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception{
    if (exposureServicePort == null)
      _initExposureServicePortProxy();
    return exposureServicePort.calculateExposureMemoPost(memberID);
  }
  
  public exposure.service.fhlbatl.com.CalculationResults calculateExposureResultsMemoPost(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception{
    if (exposureServicePort == null)
      _initExposureServicePortProxy();
    return exposureServicePort.calculateExposureResultsMemoPost(memberID);
  }
  
  public java.lang.Boolean calculateExposureFromSource(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception{
    if (exposureServicePort == null)
      _initExposureServicePortProxy();
    return exposureServicePort.calculateExposureFromSource(memberID);
  }
  
  public java.lang.Boolean calculateExposureFromSourceNoQueue(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception{
    if (exposureServicePort == null)
      _initExposureServicePortProxy();
    return exposureServicePort.calculateExposureFromSourceNoQueue(memberID);
  }
  
  public exposure.service.fhlbatl.com.CalculationResults calculateExposureResultsFromSource(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception{
    if (exposureServicePort == null)
      _initExposureServicePortProxy();
    return exposureServicePort.calculateExposureResultsFromSource(memberID);
  }
  
  public java.lang.Boolean calculateExposureUsingAdvance(java.lang.Integer memberID, java.lang.Double advanceAmt, java.lang.Double letterOfCreditAmt, java.lang.Double corporateSettlementAmt, java.lang.Double LHFSAmt, java.lang.Double letterOfCreditCorporateSettlementAmt, java.lang.Boolean useSourceData, java.lang.Boolean isReversal) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception{
    if (exposureServicePort == null)
      _initExposureServicePortProxy();
    return exposureServicePort.calculateExposureUsingAdvance(memberID, advanceAmt, letterOfCreditAmt, corporateSettlementAmt, LHFSAmt, letterOfCreditCorporateSettlementAmt, useSourceData, isReversal);
  }
  
  public exposure.service.fhlbatl.com.CalculationResults calculateExposureResultsUsingAdvance(java.lang.Integer memberID, java.lang.Double advanceAmt, java.lang.Double letterOfCreditAmt, java.lang.Double corporateSettlementAmt, java.lang.Double LHFSAmt, java.lang.Double letterOfCreditCorporateSettlementAmt, java.lang.Boolean useSourceData, java.lang.Boolean isModel, java.lang.Boolean isReversal) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception{
    if (exposureServicePort == null)
      _initExposureServicePortProxy();
    return exposureServicePort.calculateExposureResultsUsingAdvance(memberID, advanceAmt, letterOfCreditAmt, corporateSettlementAmt, LHFSAmt, letterOfCreditCorporateSettlementAmt, useSourceData, isModel, isReversal);
  }
  
  public java.lang.Boolean updateAdvanceExposureCalculationItem(exposure.service.fhlbatl.com.ExposureAdvance advanceItem, java.lang.Boolean useSourceData) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception{
    if (exposureServicePort == null)
      _initExposureServicePortProxy();
    return exposureServicePort.updateAdvanceExposureCalculationItem(advanceItem, useSourceData);
  }
  
  public java.lang.Boolean updateAdvanceExposureCalculationUsingList(exposure.service.fhlbatl.com.ExposureAdvance[] advanceItemList, java.lang.Boolean useSourceData) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception{
    if (exposureServicePort == null)
      _initExposureServicePortProxy();
    return exposureServicePort.updateAdvanceExposureCalculationUsingList(advanceItemList, useSourceData);
  }
  
  public exposure.service.fhlbatl.com.CalculationResults getAllExposureCalculations(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception{
    if (exposureServicePort == null)
      _initExposureServicePortProxy();
    return exposureServicePort.getAllExposureCalculations(memberID);
  }
  
  public java.lang.Double getTotalAdvanceCollateral(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception{
    if (exposureServicePort == null)
      _initExposureServicePortProxy();
    return exposureServicePort.getTotalAdvanceCollateral(memberID);
  }
  
  public java.lang.Double getTotalAdvanceCredit(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception{
    if (exposureServicePort == null)
      _initExposureServicePortProxy();
    return exposureServicePort.getTotalAdvanceCredit(memberID);
  }
  
  public java.lang.Double getLHFSAdvance(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception{
    if (exposureServicePort == null)
      _initExposureServicePortProxy();
    return exposureServicePort.getLHFSAdvance(memberID);
  }
  
  public java.lang.Double getLetterOfCredit(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception{
    if (exposureServicePort == null)
      _initExposureServicePortProxy();
    return exposureServicePort.getLetterOfCredit(memberID);
  }
  
  public java.lang.Double getMemberStandaloneDerivativeExposure(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception{
    if (exposureServicePort == null)
      _initExposureServicePortProxy();
    return exposureServicePort.getMemberStandaloneDerivativeExposure(memberID);
  }
  
  public java.lang.Double getMPFCreditEnhancement(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception{
    if (exposureServicePort == null)
      _initExposureServicePortProxy();
    return exposureServicePort.getMPFCreditEnhancement(memberID);
  }
  
  public java.lang.Double getDIAOverdraft(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception{
    if (exposureServicePort == null)
      _initExposureServicePortProxy();
    return exposureServicePort.getDIAOverdraft(memberID);
  }
  
  public exposure.service.fhlbatl.com.ExposureNPVResult getEstPrepaymentFees(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception{
    if (exposureServicePort == null)
      _initExposureServicePortProxy();
    return exposureServicePort.getEstPrepaymentFees(memberID);
  }
  
  public java.lang.Double getCorporateSettlements(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception{
    if (exposureServicePort == null)
      _initExposureServicePortProxy();
    return exposureServicePort.getCorporateSettlements(memberID);
  }
  
  public java.lang.Double getLetterOfCreditCorporateSettlements(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception{
    if (exposureServicePort == null)
      _initExposureServicePortProxy();
    return exposureServicePort.getLetterOfCreditCorporateSettlements(memberID);
  }
  
  public java.lang.Double getUnsecuredCreditOvernight(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception{
    if (exposureServicePort == null)
      _initExposureServicePortProxy();
    return exposureServicePort.getUnsecuredCreditOvernight(memberID);
  }
  
  public java.lang.Double getUnsecuredCreditTerm(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception{
    if (exposureServicePort == null)
      _initExposureServicePortProxy();
    return exposureServicePort.getUnsecuredCreditTerm(memberID);
  }
  
  public java.lang.Double getUnsecuredCreditSwap(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception{
    if (exposureServicePort == null)
      _initExposureServicePortProxy();
    return exposureServicePort.getUnsecuredCreditSwap(memberID);
  }
  
  public java.lang.Double getTotalCollateralExposure(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception{
    if (exposureServicePort == null)
      _initExposureServicePortProxy();
    return exposureServicePort.getTotalCollateralExposure(memberID);
  }
  
  public java.lang.Double getTotalUnsecuredCreditExposure(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception{
    if (exposureServicePort == null)
      _initExposureServicePortProxy();
    return exposureServicePort.getTotalUnsecuredCreditExposure(memberID);
  }
  
  public java.lang.Double getTotalSecuredCreditExposure(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception{
    if (exposureServicePort == null)
      _initExposureServicePortProxy();
    return exposureServicePort.getTotalSecuredCreditExposure(memberID);
  }
  
  public java.lang.Double getTotalCreditExposure(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception{
    if (exposureServicePort == null)
      _initExposureServicePortProxy();
    return exposureServicePort.getTotalCreditExposure(memberID);
  }
  
  public java.lang.Double getProjTotalCollateralExposure(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception{
    if (exposureServicePort == null)
      _initExposureServicePortProxy();
    return exposureServicePort.getProjTotalCollateralExposure(memberID);
  }
  
  public java.lang.Double getCashPledged(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception{
    if (exposureServicePort == null)
      _initExposureServicePortProxy();
    return exposureServicePort.getCashPledged(memberID);
  }
  
  public exposure.service.fhlbatl.com.ExposureCMLResult getCollateralMaintenanceLevel(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception{
    if (exposureServicePort == null)
      _initExposureServicePortProxy();
    return exposureServicePort.getCollateralMaintenanceLevel(memberID);
  }
  
  public java.lang.Double getProjCollateralMaintenanceLevel(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception{
    if (exposureServicePort == null)
      _initExposureServicePortProxy();
    return exposureServicePort.getProjCollateralMaintenanceLevel(memberID);
  }
  
  public java.lang.Double getCollateralMarketValue(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception{
    if (exposureServicePort == null)
      _initExposureServicePortProxy();
    return exposureServicePort.getCollateralMarketValue(memberID);
  }
  
  public exposure.service.fhlbatl.com.ExposureLCVResult getTotalLCV(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception{
    if (exposureServicePort == null)
      _initExposureServicePortProxy();
    return exposureServicePort.getTotalLCV(memberID);
  }
  
  public exposure.service.fhlbatl.com.ExposureLCVResult getAffiliateLCV(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception{
    if (exposureServicePort == null)
      _initExposureServicePortProxy();
    return exposureServicePort.getAffiliateLCV(memberID);
  }
  
  public java.lang.Double getLCVExcess(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception{
    if (exposureServicePort == null)
      _initExposureServicePortProxy();
    return exposureServicePort.getLCVExcess(memberID);
  }
  
  public java.lang.Double getLCVDivTotalCollateralExposure(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception{
    if (exposureServicePort == null)
      _initExposureServicePortProxy();
    return exposureServicePort.getLCVDivTotalCollateralExposure(memberID);
  }
  
  public java.lang.Double getLCVDivCollateralMaintenanceLevel(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception{
    if (exposureServicePort == null)
      _initExposureServicePortProxy();
    return exposureServicePort.getLCVDivCollateralMaintenanceLevel(memberID);
  }
  
  public java.lang.Double getProjLCVExcess(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception{
    if (exposureServicePort == null)
      _initExposureServicePortProxy();
    return exposureServicePort.getProjLCVExcess(memberID);
  }
  
  public java.lang.Double getLCVDivProjTotalCollaterallExposure(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception{
    if (exposureServicePort == null)
      _initExposureServicePortProxy();
    return exposureServicePort.getLCVDivProjTotalCollaterallExposure(memberID);
  }
  
  public java.lang.Double getTotalAssets(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception{
    if (exposureServicePort == null)
      _initExposureServicePortProxy();
    return exposureServicePort.getTotalAssets(memberID);
  }
  
  public java.lang.Double getTotalCollateralExposureDivAssets(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception{
    if (exposureServicePort == null)
      _initExposureServicePortProxy();
    return exposureServicePort.getTotalCollateralExposureDivAssets(memberID);
  }
  
  public java.lang.Double getProjTotalCollateralExposureDivAssets(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception{
    if (exposureServicePort == null)
      _initExposureServicePortProxy();
    return exposureServicePort.getProjTotalCollateralExposureDivAssets(memberID);
  }
  
  public java.lang.Double getTotalCreditExposureDivAssets(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception{
    if (exposureServicePort == null)
      _initExposureServicePortProxy();
    return exposureServicePort.getTotalCreditExposureDivAssets(memberID);
  }
  
  public exposure.service.fhlbatl.com.ExposureCreditAvailabilityResult getCreditAvailability(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception{
    if (exposureServicePort == null)
      _initExposureServicePortProxy();
    return exposureServicePort.getCreditAvailability(memberID);
  }
  
  public java.lang.Boolean setCreditAvailabilityAmount(java.lang.Integer memberID, java.lang.Double creditAvailabilityAmount) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception{
    if (exposureServicePort == null)
      _initExposureServicePortProxy();
    return exposureServicePort.setCreditAvailabilityAmount(memberID, creditAvailabilityAmount);
  }
  
  public java.lang.Double getRemainingCreditAvailability(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception{
    if (exposureServicePort == null)
      _initExposureServicePortProxy();
    return exposureServicePort.getRemainingCreditAvailability(memberID);
  }
  
  public java.lang.Double getCreditAvailabilityDivAssets(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception{
    if (exposureServicePort == null)
      _initExposureServicePortProxy();
    return exposureServicePort.getCreditAvailabilityDivAssets(memberID);
  }
  
  public java.lang.Double getAdvancesDivAssets(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception{
    if (exposureServicePort == null)
      _initExposureServicePortProxy();
    return exposureServicePort.getAdvancesDivAssets(memberID);
  }
  
  public java.lang.Double getLCVDivAdvances(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception{
    if (exposureServicePort == null)
      _initExposureServicePortProxy();
    return exposureServicePort.getLCVDivAdvances(memberID);
  }
  
  public java.lang.Double getLHFSLCV(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception{
    if (exposureServicePort == null)
      _initExposureServicePortProxy();
    return exposureServicePort.getLHFSLCV(memberID);
  }
  
  public java.lang.Double getLHFSLCVExcess(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception{
    if (exposureServicePort == null)
      _initExposureServicePortProxy();
    return exposureServicePort.getLHFSLCVExcess(memberID);
  }
  
  public exposure.service.fhlbatl.com.ExposureAffiliateRelianceResult getAffiliateReliance(java.lang.Integer memberID) throws java.rmi.RemoteException, exposure.service.fhlbatl.com.Exception{
    if (exposureServicePort == null)
      _initExposureServicePortProxy();
    return exposureServicePort.getAffiliateReliance(memberID);
  }
  
  
}