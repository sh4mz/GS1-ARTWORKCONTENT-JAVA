//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.28 at 12:23:59 PM CST 
//


package com.gs1.artworkcontent;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderLogisticalDateInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderLogisticalDateInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestedDeliveryDateRange" type="{urn:gs1:shared:shared_common:xsd:3}DateTimeRangeType" minOccurs="0"/>
 *         &lt;element name="requestedShipDateRange" type="{urn:gs1:shared:shared_common:xsd:3}DateTimeRangeType" minOccurs="0"/>
 *         &lt;element name="requestedDeliveryDateRangeAtUltimateConsignee" type="{urn:gs1:shared:shared_common:xsd:3}DateTimeRangeType" minOccurs="0"/>
 *         &lt;element name="requestedDeliveryDateTime" type="{urn:gs1:shared:shared_common:xsd:3}DateOptionalTimeType" minOccurs="0"/>
 *         &lt;element name="requestedShipDateTime" type="{urn:gs1:shared:shared_common:xsd:3}DateOptionalTimeType" minOccurs="0"/>
 *         &lt;element name="requestedPickUpDateTime" type="{urn:gs1:shared:shared_common:xsd:3}DateOptionalTimeType" minOccurs="0"/>
 *         &lt;element name="requestedDeliveryDateTimeAtUltimateConsignee" type="{urn:gs1:shared:shared_common:xsd:3}DateOptionalTimeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderLogisticalDateInformationType", propOrder = {
    "requestedDeliveryDateRange",
    "requestedShipDateRange",
    "requestedDeliveryDateRangeAtUltimateConsignee",
    "requestedDeliveryDateTime",
    "requestedShipDateTime",
    "requestedPickUpDateTime",
    "requestedDeliveryDateTimeAtUltimateConsignee"
})
public class OrderLogisticalDateInformationType {

    protected DateTimeRangeType requestedDeliveryDateRange;
    protected DateTimeRangeType requestedShipDateRange;
    protected DateTimeRangeType requestedDeliveryDateRangeAtUltimateConsignee;
    protected DateOptionalTimeType requestedDeliveryDateTime;
    protected DateOptionalTimeType requestedShipDateTime;
    protected DateOptionalTimeType requestedPickUpDateTime;
    protected DateOptionalTimeType requestedDeliveryDateTimeAtUltimateConsignee;

    /**
     * Gets the value of the requestedDeliveryDateRange property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeRangeType }
     *     
     */
    public DateTimeRangeType getRequestedDeliveryDateRange() {
        return requestedDeliveryDateRange;
    }

    /**
     * Sets the value of the requestedDeliveryDateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeRangeType }
     *     
     */
    public void setRequestedDeliveryDateRange(DateTimeRangeType value) {
        this.requestedDeliveryDateRange = value;
    }

    /**
     * Gets the value of the requestedShipDateRange property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeRangeType }
     *     
     */
    public DateTimeRangeType getRequestedShipDateRange() {
        return requestedShipDateRange;
    }

    /**
     * Sets the value of the requestedShipDateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeRangeType }
     *     
     */
    public void setRequestedShipDateRange(DateTimeRangeType value) {
        this.requestedShipDateRange = value;
    }

    /**
     * Gets the value of the requestedDeliveryDateRangeAtUltimateConsignee property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeRangeType }
     *     
     */
    public DateTimeRangeType getRequestedDeliveryDateRangeAtUltimateConsignee() {
        return requestedDeliveryDateRangeAtUltimateConsignee;
    }

    /**
     * Sets the value of the requestedDeliveryDateRangeAtUltimateConsignee property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeRangeType }
     *     
     */
    public void setRequestedDeliveryDateRangeAtUltimateConsignee(DateTimeRangeType value) {
        this.requestedDeliveryDateRangeAtUltimateConsignee = value;
    }

    /**
     * Gets the value of the requestedDeliveryDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateOptionalTimeType }
     *     
     */
    public DateOptionalTimeType getRequestedDeliveryDateTime() {
        return requestedDeliveryDateTime;
    }

    /**
     * Sets the value of the requestedDeliveryDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOptionalTimeType }
     *     
     */
    public void setRequestedDeliveryDateTime(DateOptionalTimeType value) {
        this.requestedDeliveryDateTime = value;
    }

    /**
     * Gets the value of the requestedShipDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateOptionalTimeType }
     *     
     */
    public DateOptionalTimeType getRequestedShipDateTime() {
        return requestedShipDateTime;
    }

    /**
     * Sets the value of the requestedShipDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOptionalTimeType }
     *     
     */
    public void setRequestedShipDateTime(DateOptionalTimeType value) {
        this.requestedShipDateTime = value;
    }

    /**
     * Gets the value of the requestedPickUpDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateOptionalTimeType }
     *     
     */
    public DateOptionalTimeType getRequestedPickUpDateTime() {
        return requestedPickUpDateTime;
    }

    /**
     * Sets the value of the requestedPickUpDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOptionalTimeType }
     *     
     */
    public void setRequestedPickUpDateTime(DateOptionalTimeType value) {
        this.requestedPickUpDateTime = value;
    }

    /**
     * Gets the value of the requestedDeliveryDateTimeAtUltimateConsignee property.
     * 
     * @return
     *     possible object is
     *     {@link DateOptionalTimeType }
     *     
     */
    public DateOptionalTimeType getRequestedDeliveryDateTimeAtUltimateConsignee() {
        return requestedDeliveryDateTimeAtUltimateConsignee;
    }

    /**
     * Sets the value of the requestedDeliveryDateTimeAtUltimateConsignee property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOptionalTimeType }
     *     
     */
    public void setRequestedDeliveryDateTimeAtUltimateConsignee(DateOptionalTimeType value) {
        this.requestedDeliveryDateTimeAtUltimateConsignee = value;
    }

}
