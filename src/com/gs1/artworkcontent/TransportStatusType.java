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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TransportStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransportStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transportStatusConditionCode" type="{urn:gs1:ecom:ecom_common:xsd:3}TransportStatusConditionCodeType" maxOccurs="unbounded"/>
 *         &lt;element name="transportStatusDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="transportStatusDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description500Type" minOccurs="0"/>
 *         &lt;element name="transportStatusReasonCode" type="{urn:gs1:ecom:ecom_common:xsd:3}TransportStatusReasonCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="transportStatusReasonDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description500Type" minOccurs="0"/>
 *         &lt;element name="logisticLocation" type="{urn:gs1:ecom:ecom_common:xsd:3}LogisticLocationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportStatusType", propOrder = {
    "transportStatusConditionCode",
    "transportStatusDateTime",
    "transportStatusDescription",
    "transportStatusReasonCode",
    "transportStatusReasonDescription",
    "logisticLocation"
})
public class TransportStatusType {

    @XmlElement(required = true)
    protected List<TransportStatusConditionCodeType> transportStatusConditionCode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transportStatusDateTime;
    protected Description500Type transportStatusDescription;
    protected List<TransportStatusReasonCodeType> transportStatusReasonCode;
    protected Description500Type transportStatusReasonDescription;
    protected LogisticLocationType logisticLocation;

    /**
     * Gets the value of the transportStatusConditionCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportStatusConditionCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportStatusConditionCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportStatusConditionCodeType }
     * 
     * 
     */
    public List<TransportStatusConditionCodeType> getTransportStatusConditionCode() {
        if (transportStatusConditionCode == null) {
            transportStatusConditionCode = new ArrayList<TransportStatusConditionCodeType>();
        }
        return this.transportStatusConditionCode;
    }

    /**
     * Gets the value of the transportStatusDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransportStatusDateTime() {
        return transportStatusDateTime;
    }

    /**
     * Sets the value of the transportStatusDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransportStatusDateTime(XMLGregorianCalendar value) {
        this.transportStatusDateTime = value;
    }

    /**
     * Gets the value of the transportStatusDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Description500Type }
     *     
     */
    public Description500Type getTransportStatusDescription() {
        return transportStatusDescription;
    }

    /**
     * Sets the value of the transportStatusDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Description500Type }
     *     
     */
    public void setTransportStatusDescription(Description500Type value) {
        this.transportStatusDescription = value;
    }

    /**
     * Gets the value of the transportStatusReasonCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportStatusReasonCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportStatusReasonCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportStatusReasonCodeType }
     * 
     * 
     */
    public List<TransportStatusReasonCodeType> getTransportStatusReasonCode() {
        if (transportStatusReasonCode == null) {
            transportStatusReasonCode = new ArrayList<TransportStatusReasonCodeType>();
        }
        return this.transportStatusReasonCode;
    }

    /**
     * Gets the value of the transportStatusReasonDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Description500Type }
     *     
     */
    public Description500Type getTransportStatusReasonDescription() {
        return transportStatusReasonDescription;
    }

    /**
     * Sets the value of the transportStatusReasonDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Description500Type }
     *     
     */
    public void setTransportStatusReasonDescription(Description500Type value) {
        this.transportStatusReasonDescription = value;
    }

    /**
     * Gets the value of the logisticLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LogisticLocationType }
     *     
     */
    public LogisticLocationType getLogisticLocation() {
        return logisticLocation;
    }

    /**
     * Sets the value of the logisticLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogisticLocationType }
     *     
     */
    public void setLogisticLocation(LogisticLocationType value) {
        this.logisticLocation = value;
    }

}
