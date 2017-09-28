//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.28 at 12:23:59 PM CST 
//


package com.gs1.artworkcontent;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for GS1CodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GS1CodeType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:gs1:shared:shared_common:xsd:3>String80Type">
 *       &lt;attribute name="codeListVersion">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="35"/>
 *             &lt;minLength value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GS1CodeType", namespace = "urn:gs1:shared:shared_common:xsd:3", propOrder = {
    "value"
})
@XmlSeeAlso({
    IncotermsCodeType.class,
    TimeMeasurementUnitCodeType.class,
    BarCodeTypeCodeType.class,
    AdditionalConsignmentIdentificationTypeCodeType.class,
    LanguageCodeType.class,
    AdditionalShipmentIdentificationTypeCodeType.class,
    AdditionalPartyIdentificationTypeCodeType.class,
    AdditionalTradeItemIdentificationTypeCodeType.class,
    MeasurementUnitCodeType.class,
    ContactTypeCodeType.class,
    CountrySubdivisionCodeType.class,
    PartyRoleCodeType.class,
    AdditionalIndividualAssetIdentificationTypeCodeType.class,
    DateFormatCodeType.class,
    CommunicationChannelCodeType.class,
    TemperatureMeasurementUnitCodeType.class,
    NutrientTypeCodeType.class,
    AdditionalServiceRelationIdentificationTypeCodeType.class,
    AdditionalLogisticUnitIdentificationTypeCodeType.class,
    CurrencyCodeType.class,
    PaymentTermsTypeCodeType.class,
    TaxCategoryCodeType.class,
    EntityTypeCodeType.class,
    AllowanceChargeTypeCodeType.class,
    FinancialAccountNumberTypeCodeType.class,
    FinancialRoutingNumberTypeCodeType.class,
    PaymentMethodCodeType.class,
    CountryCodeType.class,
    AdditionalReturnableAssetIdentificationTypeCodeType.class,
    InventoryActivityTypeCodeType.class,
    LogisticServiceRequirementCodeType.class,
    FinancialAdjustmentReasonCodeType.class,
    CargoTypeCodeType.class,
    TransportServiceConditionTypeCodeType.class,
    WarehouseABCClassificationCodeType.class,
    SettlementTypeCodeType.class,
    LogisticServiceReferenceTypeCodeType.class,
    ItemScopeTypeCodeType.class,
    PaymentFormatCodeType.class,
    TransportMeansTypeCodeType.class,
    OutOfStockMeasurementTypeCodeType.class,
    TransportInstructionStatusReasonCodeType.class,
    LogisticEventTypeCodeType.class,
    PlanBucketSizeCodeType.class,
    InventoryMeasurementBasisTypeCodeType.class,
    LegalRegistrationCodeType.class,
    AdministrativeUnitTypeCodeType.class,
    LineItemActionCodeType.class,
    InventorySubLocationTypeCodeType.class,
    DataCarrierTypeCodeType.class,
    CustomsWarehouseStatusCodeType.class,
    LocationScopeTypeCodeType.class,
    PeriodicityTypeCodeType.class,
    InventoryStatusCodeType.class,
    PackagingConditionCodeType.class,
    ServiceLevelBasisTypeCodeType.class,
    GoodsReceiptReportingCodeType.class,
    TransactionalReferenceTypeCodeType.class,
    StockRequirementTypeCodeType.class,
    TradeItemUnitDescriptorCodeType.class,
    PrintingInstructionCodeType.class,
    EffectiveDateTypeCodeType.class,
    SealConditionCodeType.class,
    ResponseStatusCodeType.class,
    PackageTypeCodeType.class,
    IdentityDocumentTypeCodeType.class,
    SealTypeCodeType.class,
    DeliveryTypeCodeType.class,
    InventorySubLocationFunctionCodeType.class,
    TransportReferenceTypeCodeType.class,
    PerformanceMeasureTypeCodeType.class,
    ObservationTypeCodeType.class,
    MaterialTypeCodeType.class,
    ForecastPurposeCodeType.class,
    InventoryMovementTypeCodeType.class,
    DangerousGoodsAttributeTypeCodeType.class,
    DemandEstimationTypeCodeType.class,
    DangerousGoodsRegulationCodeType.class,
    TransportStatusReasonCodeType.class,
    DeliveryTimeMeasurementBasisTypeCodeType.class,
    PurchaseConditionsCommitmentTypeCodeType.class,
    SalesMeasurementTypeCodeType.class,
    MeasurementTypeCodeType.class,
    CreditReasonCodeType.class,
    PackageLevelCodeType.class,
    DeliverDateTypeCodeType.class,
    UNLocationCodeType.class,
    VarianceReasonCodeType.class,
    MarginSchemeCodeType.class,
    QuantitySpecificationTypeCodeType.class,
    TransportPartyRoleCodeType.class,
    PaymentTermsEventCodeType.class,
    TransportPaymentMethodCodeType.class,
    SynchronisationCalculationTypeCodeType.class,
    ReceivingConditionCodeType.class,
    SettlementHandlingTypeCodeType.class,
    PassengerCategoryCodeType.class,
    TransportServiceLevelCodeType.class,
    DutyFeeTaxTypeCodeType.class,
    PackagingMarkingTypeCodeType.class,
    PlanCommitmentLevelCodeType.class,
    ErrorOrWarningCodeType.class,
    AppointmentTimeMeasurementBasisTypeCodeType.class,
    StructureTypeCodeType.class,
    HandlingInstructionCodeType.class,
    LocationScopeParameterTypeCodeType.class,
    OrderInstructionCodeType.class,
    SpecialServiceTypeCodeType.class,
    TransportModeCodeType.class,
    SymbolComponentCodeType.class,
    ServiceLevelMeasurementBasisTypeCodeType.class,
    TransportServiceCategoryCodeType.class,
    OrderTypeCodeType.class,
    TimePeriodScopeTypeCodeType.class,
    ForecastTypeCodeType.class,
    QualityControlCodeType.class,
    InvoiceTypeCodeType.class,
    HarmonizedSystemCodeType.class,
    RemainingQuantityStatusCodeType.class,
    TransportStatusConditionCodeType.class,
    ItemTypeCodeType.class
})
public class GS1CodeType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "codeListVersion")
    protected String codeListVersion;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the codeListVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeListVersion() {
        return codeListVersion;
    }

    /**
     * Sets the value of the codeListVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeListVersion(String value) {
        this.codeListVersion = value;
    }

}