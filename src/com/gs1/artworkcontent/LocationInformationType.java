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
 * <p>Java class for LocationInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="partyIdentification" type="{urn:gs1:shared:shared_common:xsd:3}PartyIdentificationType" minOccurs="0"/>
 *         &lt;element name="address" type="{urn:gs1:shared:shared_common:xsd:3}AddressType"/>
 *         &lt;element name="contactInformation" type="{urn:gs1:shared:shared_common:xsd:3}ContactType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationInformationType", propOrder = {
    "partyIdentification",
    "address",
    "contactInformation"
})
public class LocationInformationType {

    protected PartyIdentificationType partyIdentification;
    @XmlElement(required = true)
    protected AddressType address;
    protected List<ContactType> contactInformation;

    /**
     * Gets the value of the partyIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationType }
     *     
     */
    public PartyIdentificationType getPartyIdentification() {
        return partyIdentification;
    }

    /**
     * Sets the value of the partyIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationType }
     *     
     */
    public void setPartyIdentification(PartyIdentificationType value) {
        this.partyIdentification = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the contactInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactType }
     * 
     * 
     */
    public List<ContactType> getContactInformation() {
        if (contactInformation == null) {
            contactInformation = new ArrayList<ContactType>();
        }
        return this.contactInformation;
    }

}
