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
 * <p>Java class for ArtworkContentResponseStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArtworkContentResponseStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="changedByRecipient" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="changeReason" type="{urn:gs1:shared:shared_common:xsd:3}Description80Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArtworkContentResponseStatusType", namespace = "urn:gs1:ecom:artwork_content_common:xsd:3", propOrder = {
    "changedByRecipient",
    "changeReason"
})
public class ArtworkContentResponseStatusType {

    protected boolean changedByRecipient;
    protected Description80Type changeReason;

    /**
     * Gets the value of the changedByRecipient property.
     * 
     */
    public boolean isChangedByRecipient() {
        return changedByRecipient;
    }

    /**
     * Sets the value of the changedByRecipient property.
     * 
     */
    public void setChangedByRecipient(boolean value) {
        this.changedByRecipient = value;
    }

    /**
     * Gets the value of the changeReason property.
     * 
     * @return
     *     possible object is
     *     {@link Description80Type }
     *     
     */
    public Description80Type getChangeReason() {
        return changeReason;
    }

    /**
     * Sets the value of the changeReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link Description80Type }
     *     
     */
    public void setChangeReason(Description80Type value) {
        this.changeReason = value;
    }

}
