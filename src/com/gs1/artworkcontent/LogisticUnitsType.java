//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.28 at 12:23:59 PM CST 
//


package com.gs1.artworkcontent;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LogisticUnitsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LogisticUnitsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="levelIdentification" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="parentLevelIdentification" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="packageTypeCode" type="{urn:gs1:ecom:ecom_common:xsd:3}PackageTypeCodeType" minOccurs="0"/>
 *         &lt;element name="quantityOfLogisticUnits" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="childPackageTypeCode" type="{urn:gs1:ecom:ecom_common:xsd:3}PackageTypeCodeType" minOccurs="0"/>
 *         &lt;element name="quantityOfChildren" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="logisticUnitIdentification" type="{urn:gs1:shared:shared_common:xsd:3}LogisticUnitIdentificationType" minOccurs="0"/>
 *         &lt;element name="logisticUnitMeasurement" type="{urn:gs1:ecom:ecom_common:xsd:3}LogisticUnitMeasurementType" minOccurs="0"/>
 *         &lt;element name="returnablePackaging" type="{urn:gs1:ecom:ecom_common:xsd:3}ReturnablePackagingType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="individualAssetIdentification" type="{urn:gs1:shared:shared_common:xsd:3}IndividualAssetIdentificationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="carrierTrackAndTraceInformation" type="{urn:gs1:ecom:ecom_common:xsd:3}CarrierTrackAndTraceInformationType" minOccurs="0"/>
 *         &lt;element name="avpList" type="{urn:gs1:ecom:ecom_common:xsd:3}Ecom_AttributeValuePairListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogisticUnitsType", propOrder = {
    "levelIdentification",
    "parentLevelIdentification",
    "packageTypeCode",
    "quantityOfLogisticUnits",
    "childPackageTypeCode",
    "quantityOfChildren",
    "logisticUnitIdentification",
    "logisticUnitMeasurement",
    "returnablePackaging",
    "individualAssetIdentification",
    "carrierTrackAndTraceInformation",
    "avpList"
})
public class LogisticUnitsType {

    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger levelIdentification;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger parentLevelIdentification;
    protected PackageTypeCodeType packageTypeCode;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger quantityOfLogisticUnits;
    protected PackageTypeCodeType childPackageTypeCode;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger quantityOfChildren;
    protected LogisticUnitIdentificationType logisticUnitIdentification;
    protected LogisticUnitMeasurementType logisticUnitMeasurement;
    protected List<ReturnablePackagingType> returnablePackaging;
    protected List<IndividualAssetIdentificationType> individualAssetIdentification;
    protected CarrierTrackAndTraceInformationType carrierTrackAndTraceInformation;
    protected EcomAttributeValuePairListType avpList;

    /**
     * Gets the value of the levelIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLevelIdentification() {
        return levelIdentification;
    }

    /**
     * Sets the value of the levelIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLevelIdentification(BigInteger value) {
        this.levelIdentification = value;
    }

    /**
     * Gets the value of the parentLevelIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParentLevelIdentification() {
        return parentLevelIdentification;
    }

    /**
     * Sets the value of the parentLevelIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParentLevelIdentification(BigInteger value) {
        this.parentLevelIdentification = value;
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
     * Gets the value of the quantityOfLogisticUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantityOfLogisticUnits() {
        return quantityOfLogisticUnits;
    }

    /**
     * Sets the value of the quantityOfLogisticUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantityOfLogisticUnits(BigInteger value) {
        this.quantityOfLogisticUnits = value;
    }

    /**
     * Gets the value of the childPackageTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link PackageTypeCodeType }
     *     
     */
    public PackageTypeCodeType getChildPackageTypeCode() {
        return childPackageTypeCode;
    }

    /**
     * Sets the value of the childPackageTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageTypeCodeType }
     *     
     */
    public void setChildPackageTypeCode(PackageTypeCodeType value) {
        this.childPackageTypeCode = value;
    }

    /**
     * Gets the value of the quantityOfChildren property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantityOfChildren() {
        return quantityOfChildren;
    }

    /**
     * Sets the value of the quantityOfChildren property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantityOfChildren(BigInteger value) {
        this.quantityOfChildren = value;
    }

    /**
     * Gets the value of the logisticUnitIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link LogisticUnitIdentificationType }
     *     
     */
    public LogisticUnitIdentificationType getLogisticUnitIdentification() {
        return logisticUnitIdentification;
    }

    /**
     * Sets the value of the logisticUnitIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogisticUnitIdentificationType }
     *     
     */
    public void setLogisticUnitIdentification(LogisticUnitIdentificationType value) {
        this.logisticUnitIdentification = value;
    }

    /**
     * Gets the value of the logisticUnitMeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link LogisticUnitMeasurementType }
     *     
     */
    public LogisticUnitMeasurementType getLogisticUnitMeasurement() {
        return logisticUnitMeasurement;
    }

    /**
     * Sets the value of the logisticUnitMeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogisticUnitMeasurementType }
     *     
     */
    public void setLogisticUnitMeasurement(LogisticUnitMeasurementType value) {
        this.logisticUnitMeasurement = value;
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
     * Gets the value of the individualAssetIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the individualAssetIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndividualAssetIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndividualAssetIdentificationType }
     * 
     * 
     */
    public List<IndividualAssetIdentificationType> getIndividualAssetIdentification() {
        if (individualAssetIdentification == null) {
            individualAssetIdentification = new ArrayList<IndividualAssetIdentificationType>();
        }
        return this.individualAssetIdentification;
    }

    /**
     * Gets the value of the carrierTrackAndTraceInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierTrackAndTraceInformationType }
     *     
     */
    public CarrierTrackAndTraceInformationType getCarrierTrackAndTraceInformation() {
        return carrierTrackAndTraceInformation;
    }

    /**
     * Sets the value of the carrierTrackAndTraceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierTrackAndTraceInformationType }
     *     
     */
    public void setCarrierTrackAndTraceInformation(CarrierTrackAndTraceInformationType value) {
        this.carrierTrackAndTraceInformation = value;
    }

    /**
     * Gets the value of the avpList property.
     * 
     * @return
     *     possible object is
     *     {@link EcomAttributeValuePairListType }
     *     
     */
    public EcomAttributeValuePairListType getAvpList() {
        return avpList;
    }

    /**
     * Sets the value of the avpList property.
     * 
     * @param value
     *     allowed object is
     *     {@link EcomAttributeValuePairListType }
     *     
     */
    public void setAvpList(EcomAttributeValuePairListType value) {
        this.avpList = value;
    }

}
