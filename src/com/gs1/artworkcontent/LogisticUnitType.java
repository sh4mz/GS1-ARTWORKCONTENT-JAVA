//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.28 at 12:23:59 PM CST 
//


package com.gs1.artworkcontent;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LogisticUnitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LogisticUnitType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:gs1:shared:shared_common:xsd:3}LogisticUnitIdentificationType">
 *       &lt;sequence>
 *         &lt;element name="parentLogisticUnitId" type="{urn:gs1:shared:shared_common:xsd:3}LogisticUnitIdentificationType" minOccurs="0"/>
 *         &lt;element name="grossWeight" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/>
 *         &lt;element name="packageLevelCode" type="{urn:gs1:ecom:ecom_common:xsd:3}PackageLevelCodeType" minOccurs="0"/>
 *         &lt;element name="packageTypeCode" type="{urn:gs1:ecom:ecom_common:xsd:3}PackageTypeCodeType" minOccurs="0"/>
 *         &lt;element name="tradeItemQuantity" type="{urn:gs1:shared:shared_common:xsd:3}QuantityType" minOccurs="0"/>
 *         &lt;element name="packagingMarking" type="{urn:gs1:ecom:ecom_common:xsd:3}PackagingMarkingType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="referencedTransportEquipment" type="{urn:gs1:ecom:ecom_common:xsd:3}TransportEquipmentType" minOccurs="0"/>
 *         &lt;element name="returnablePackaging" type="{urn:gs1:ecom:ecom_common:xsd:3}ReturnablePackagingType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dimension" type="{urn:gs1:shared:shared_common:xsd:3}DimensionType" minOccurs="0"/>
 *         &lt;element name="unitMeasurement" type="{urn:gs1:ecom:ecom_common:xsd:3}UnitMeasurementType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogisticUnitType", propOrder = {
    "parentLogisticUnitId",
    "grossWeight",
    "packageLevelCode",
    "packageTypeCode",
    "tradeItemQuantity",
    "packagingMarking",
    "referencedTransportEquipment",
    "returnablePackaging",
    "dimension",
    "unitMeasurement"
})
public class LogisticUnitType
    extends LogisticUnitIdentificationType
{

    protected LogisticUnitIdentificationType parentLogisticUnitId;
    protected MeasurementType grossWeight;
    protected PackageLevelCodeType packageLevelCode;
    protected PackageTypeCodeType packageTypeCode;
    protected QuantityType tradeItemQuantity;
    protected List<PackagingMarkingType> packagingMarking;
    protected TransportEquipmentType referencedTransportEquipment;
    protected List<ReturnablePackagingType> returnablePackaging;
    protected DimensionType dimension;
    protected List<UnitMeasurementType> unitMeasurement;

    /**
     * Gets the value of the parentLogisticUnitId property.
     * 
     * @return
     *     possible object is
     *     {@link LogisticUnitIdentificationType }
     *     
     */
    public LogisticUnitIdentificationType getParentLogisticUnitId() {
        return parentLogisticUnitId;
    }

    /**
     * Sets the value of the parentLogisticUnitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogisticUnitIdentificationType }
     *     
     */
    public void setParentLogisticUnitId(LogisticUnitIdentificationType value) {
        this.parentLogisticUnitId = value;
    }

    /**
     * Gets the value of the grossWeight property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getGrossWeight() {
        return grossWeight;
    }

    /**
     * Sets the value of the grossWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setGrossWeight(MeasurementType value) {
        this.grossWeight = value;
    }

    /**
     * Gets the value of the packageLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link PackageLevelCodeType }
     *     
     */
    public PackageLevelCodeType getPackageLevelCode() {
        return packageLevelCode;
    }

    /**
     * Sets the value of the packageLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageLevelCodeType }
     *     
     */
    public void setPackageLevelCode(PackageLevelCodeType value) {
        this.packageLevelCode = value;
    }

    /**
     * Gets the value of the packageTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link PackageTypeCodeType }
     *     
     */
    public PackageTypeCodeType getPackageTypeCode() {
        return packageTypeCode;
    }

    /**
     * Sets the value of the packageTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageTypeCodeType }
     *     
     */
    public void setPackageTypeCode(PackageTypeCodeType value) {
        this.packageTypeCode = value;
    }

    /**
     * Gets the value of the tradeItemQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getTradeItemQuantity() {
        return tradeItemQuantity;
    }

    /**
     * Sets the value of the tradeItemQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setTradeItemQuantity(QuantityType value) {
        this.tradeItemQuantity = value;
    }

    /**
     * Gets the value of the packagingMarking property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagingMarking property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagingMarking().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackagingMarkingType }
     * 
     * 
     */
    public List<PackagingMarkingType> getPackagingMarking() {
        if (packagingMarking == null) {
            packagingMarking = new ArrayList<PackagingMarkingType>();
        }
        return this.packagingMarking;
    }

    /**
     * Gets the value of the referencedTransportEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link TransportEquipmentType }
     *     
     */
    public TransportEquipmentType getReferencedTransportEquipment() {
        return referencedTransportEquipment;
    }

    /**
     * Sets the value of the referencedTransportEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEquipmentType }
     *     
     */
    public void setReferencedTransportEquipment(TransportEquipmentType value) {
        this.referencedTransportEquipment = value;
    }

    /**
     * Gets the value of the returnablePackaging property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the returnablePackaging property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReturnablePackaging().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReturnablePackagingType }
     * 
     * 
     */
    public List<ReturnablePackagingType> getReturnablePackaging() {
        if (returnablePackaging == null) {
            returnablePackaging = new ArrayList<ReturnablePackagingType>();
        }
        return this.returnablePackaging;
    }

    /**
     * Gets the value of the dimension property.
     * 
     * @return
     *     possible object is
     *     {@link DimensionType }
     *     
     */
    public DimensionType getDimension() {
        return dimension;
    }

    /**
     * Sets the value of the dimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionType }
     *     
     */
    public void setDimension(DimensionType value) {
        this.dimension = value;
    }

    /**
     * Gets the value of the unitMeasurement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitMeasurement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitMeasurement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnitMeasurementType }
     * 
     * 
     */
    public List<UnitMeasurementType> getUnitMeasurement() {
        if (unitMeasurement == null) {
            unitMeasurement = new ArrayList<UnitMeasurementType>();
        }
        return this.unitMeasurement;
    }

}