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
 * <p>Java class for TransportReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransportReferenceType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:gs1:shared:shared_common:xsd:3}DocumentReferenceType">
 *       &lt;sequence>
 *         &lt;element name="transportReferenceTypeCode" type="{urn:gs1:ecom:ecom_common:xsd:3}TransportReferenceTypeCodeType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportReferenceType", propOrder = {
    "transportReferenceTypeCode"
})
public class TransportReferenceType
    extends DocumentReferenceType
{

    @XmlElement(required = true)
    protected TransportReferenceTypeCodeType transportReferenceTypeCode;

    /**
     * Gets the value of the transportReferenceTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link TransportReferenceTypeCodeType }
     *     
     */
    public TransportReferenceTypeCodeType getTransportReferenceTypeCode() {
        return transportReferenceTypeCode;
    }

    /**
     * Sets the value of the transportReferenceTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportReferenceTypeCodeType }
     *     
     */
    public void setTransportReferenceTypeCode(TransportReferenceTypeCodeType value) {
        this.transportReferenceTypeCode = value;
    }

}
