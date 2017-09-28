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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SpecialOperatingHoursType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialOperatingHoursType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isOperational" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="specialDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="closingTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="openingTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="specialDateName" type="{urn:gs1:shared:shared_common:xsd:3}Description80Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialOperatingHoursType", propOrder = {
    "isOperational",
    "specialDate",
    "closingTime",
    "openingTime",
    "specialDateName"
})
public class SpecialOperatingHoursType {

    protected boolean isOperational;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar specialDate;
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar closingTime;
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar openingTime;
    protected Description80Type specialDateName;

    /**
     * Gets the value of the isOperational property.
     * 
     */
    public boolean isIsOperational() {
        return isOperational;
    }

    /**
     * Sets the value of the isOperational property.
     * 
     */
    public void setIsOperational(boolean value) {
        this.isOperational = value;
    }

    /**
     * Gets the value of the specialDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSpecialDate() {
        return specialDate;
    }

    /**
     * Sets the value of the specialDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSpecialDate(XMLGregorianCalendar value) {
        this.specialDate = value;
    }

    /**
     * Gets the value of the closingTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClosingTime() {
        return closingTime;
    }

    /**
     * Sets the value of the closingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClosingTime(XMLGregorianCalendar value) {
        this.closingTime = value;
    }

    /**
     * Gets the value of the openingTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOpeningTime() {
        return openingTime;
    }

    /**
     * Sets the value of the openingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOpeningTime(XMLGregorianCalendar value) {
        this.openingTime = value;
    }

    /**
     * Gets the value of the specialDateName property.
     * 
     * @return
     *     possible object is
     *     {@link Description80Type }
     *     
     */
    public Description80Type getSpecialDateName() {
        return specialDateName;
    }

    /**
     * Sets the value of the specialDateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Description80Type }
     *     
     */
    public void setSpecialDateName(Description80Type value) {
        this.specialDateName = value;
    }

}