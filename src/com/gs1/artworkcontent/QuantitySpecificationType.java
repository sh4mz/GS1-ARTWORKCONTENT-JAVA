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
 * <p>Java class for QuantitySpecificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuantitySpecificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="quantitySpecificationType" type="{urn:gs1:ecom:ecom_common:xsd:3}QuantitySpecificationTypeCodeType"/>
 *         &lt;element name="specificQuantity" type="{urn:gs1:shared:shared_common:xsd:3}QuantityType"/>
 *         &lt;element name="transactionalItemData" type="{urn:gs1:ecom:ecom_common:xsd:3}TransactionalItemDataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantitySpecificationType", propOrder = {
    "quantitySpecificationType",
    "specificQuantity",
    "transactionalItemData"
})
public class QuantitySpecificationType {

    @XmlElement(required = true)
    protected QuantitySpecificationTypeCodeType quantitySpecificationType;
    @XmlElement(required = true)
    protected QuantityType specificQuantity;
    protected TransactionalItemDataType transactionalItemData;

    /**
     * Gets the value of the quantitySpecificationType property.
     * 
     * @return
     *     possible object is
     *     {@link QuantitySpecificationTypeCodeType }
     *     
     */
    public QuantitySpecificationTypeCodeType getQuantitySpecificationType() {
        return quantitySpecificationType;
    }

    /**
     * Sets the value of the quantitySpecificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantitySpecificationTypeCodeType }
     *     
     */
    public void setQuantitySpecificationType(QuantitySpecificationTypeCodeType value) {
        this.quantitySpecificationType = value;
    }

    /**
     * Gets the value of the specificQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getSpecificQuantity() {
        return specificQuantity;
    }

    /**
     * Sets the value of the specificQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setSpecificQuantity(QuantityType value) {
        this.specificQuantity = value;
    }

    /**
     * Gets the value of the transactionalItemData property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionalItemDataType }
     *     
     */
    public TransactionalItemDataType getTransactionalItemData() {
        return transactionalItemData;
    }

    /**
     * Sets the value of the transactionalItemData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionalItemDataType }
     *     
     */
    public void setTransactionalItemData(TransactionalItemDataType value) {
        this.transactionalItemData = value;
    }

}
