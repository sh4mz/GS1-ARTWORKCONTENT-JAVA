//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.28 at 12:23:59 PM CST 
//


package com.gs1.artworkcontent;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DutyFeeTaxRegistrationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DutyFeeTaxRegistrationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dutyFeeTaxRegistrationID" type="{urn:gs1:shared:shared_common:xsd:3}IdentifierType"/>
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DutyFeeTaxRegistrationType", propOrder = {
    "dutyFeeTaxRegistrationID",
    "dutyFeeTaxTypeCode",
    "dutyFeeTaxAgencyName",
    "dutyFeeTaxDescription"
})
public class DutyFeeTaxRegistrationType {

    @XmlElement(required = true)
    protected IdentifierType dutyFeeTaxRegistrationID;
    @XmlElement(required = true)
    protected DutyFeeTaxTypeCodeType dutyFeeTaxTypeCode;
    protected String dutyFeeTaxAgencyName;
    protected Description80Type dutyFeeTaxDescription;

    /**
     * Gets the value of the dutyFeeTaxRegistrationID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getDutyFeeTaxRegistrationID() {
        return dutyFeeTaxRegistrationID;
    }

    /**
     * Sets the value of the dutyFeeTaxRegistrationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setDutyFeeTaxRegistrationID(IdentifierType value) {
        this.dutyFeeTaxRegistrationID = value;
    }

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

}