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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InventoryDutyFeeTaxStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventoryDutyFeeTaxStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dutyFeeTaxTypeCode" type="{urn:gs1:ecom:ecom_common:xsd:3}DutyFeeTaxTypeCodeType"/>
 *         &lt;element name="dutyFeeTaxAgencyName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="80"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dutyFeeTaxDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description80Type" minOccurs="0"/>
 *         &lt;element name="dutyFeeTaxCategoryCode" type="{urn:gs1:shared:shared_common:xsd:3}TaxCategoryCodeType" minOccurs="0"/>
 *         &lt;element name="customsWarehouseStatusCode" type="{urn:gs1:ecom:ecom_common:xsd:3}CustomsWarehouseStatusCodeType" minOccurs="0"/>
 *         &lt;element name="customsLicenseCode" type="{urn:gs1:shared:shared_common:xsd:3}CodeType" minOccurs="0"/>
 *         &lt;element name="transactionalReference" type="{urn:gs1:ecom:ecom_common:xsd:3}TransactionalReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventoryDutyFeeTaxStatusType", propOrder = {
    "dutyFeeTaxTypeCode",
    "dutyFeeTaxAgencyName",
    "dutyFeeTaxDescription",
    "dutyFeeTaxCategoryCode",
    "customsWarehouseStatusCode",
    "customsLicenseCode",
    "transactionalReference"
})
public class InventoryDutyFeeTaxStatusType {

    @XmlElement(required = true)
    protected DutyFeeTaxTypeCodeType dutyFeeTaxTypeCode;
    protected String dutyFeeTaxAgencyName;
    protected Description80Type dutyFeeTaxDescription;
    protected TaxCategoryCodeType dutyFeeTaxCategoryCode;
    protected CustomsWarehouseStatusCodeType customsWarehouseStatusCode;
    protected CodeType customsLicenseCode;
    protected List<TransactionalReferenceType> transactionalReference;

    /**
     * Gets the value of the dutyFeeTaxTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link DutyFeeTaxTypeCodeType }
     *     
     */
    public DutyFeeTaxTypeCodeType getDutyFeeTaxTypeCode() {
        return dutyFeeTaxTypeCode;
    }

    /**
     * Sets the value of the dutyFeeTaxTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutyFeeTaxTypeCodeType }
     *     
     */
    public void setDutyFeeTaxTypeCode(DutyFeeTaxTypeCodeType value) {
        this.dutyFeeTaxTypeCode = value;
    }

    /**
     * Gets the value of the dutyFeeTaxAgencyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDutyFeeTaxAgencyName() {
        return dutyFeeTaxAgencyName;
    }

    /**
     * Sets the value of the dutyFeeTaxAgencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDutyFeeTaxAgencyName(String value) {
        this.dutyFeeTaxAgencyName = value;
    }

    /**
     * Gets the value of the dutyFeeTaxDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Description80Type }
     *     
     */
    public Description80Type getDutyFeeTaxDescription() {
        return dutyFeeTaxDescription;
    }

    /**
     * Sets the value of the dutyFeeTaxDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Description80Type }
     *     
     */
    public void setDutyFeeTaxDescription(Description80Type value) {
        this.dutyFeeTaxDescription = value;
    }

    /**
     * Gets the value of the dutyFeeTaxCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link TaxCategoryCodeType }
     *     
     */
    public TaxCategoryCodeType getDutyFeeTaxCategoryCode() {
        return dutyFeeTaxCategoryCode;
    }

    /**
     * Sets the value of the dutyFeeTaxCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxCategoryCodeType }
     *     
     */
    public void setDutyFeeTaxCategoryCode(TaxCategoryCodeType value) {
        this.dutyFeeTaxCategoryCode = value;
    }

    /**
     * Gets the value of the customsWarehouseStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link CustomsWarehouseStatusCodeType }
     *     
     */
    public CustomsWarehouseStatusCodeType getCustomsWarehouseStatusCode() {
        return customsWarehouseStatusCode;
    }

    /**
     * Sets the value of the customsWarehouseStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsWarehouseStatusCodeType }
     *     
     */
    public void setCustomsWarehouseStatusCode(CustomsWarehouseStatusCodeType value) {
        this.customsWarehouseStatusCode = value;
    }

    /**
     * Gets the value of the customsLicenseCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getCustomsLicenseCode() {
        return customsLicenseCode;
    }

    /**
     * Sets the value of the customsLicenseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setCustomsLicenseCode(CodeType value) {
        this.customsLicenseCode = value;
    }

    /**
     * Gets the value of the transactionalReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactionalReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionalReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionalReferenceType }
     * 
     * 
     */
    public List<TransactionalReferenceType> getTransactionalReference() {
        if (transactionalReference == null) {
            transactionalReference = new ArrayList<TransactionalReferenceType>();
        }
        return this.transactionalReference;
    }

}
