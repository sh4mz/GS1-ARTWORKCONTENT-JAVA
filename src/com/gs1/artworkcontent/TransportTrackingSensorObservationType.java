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
 * <p>Java class for TransportTrackingSensorObservationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransportTrackingSensorObservationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sensorLocation">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="80"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="transportTrackingObservation" type="{urn:gs1:ecom:ecom_common:xsd:3}TransportTrackingObservationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportTrackingSensorObservationType", propOrder = {
    "sensorLocation",
    "transportTrackingObservation"
})
public class TransportTrackingSensorObservationType {

    @XmlElement(required = true)
    protected String sensorLocation;
    protected List<TransportTrackingObservationType> transportTrackingObservation;

    /**
     * Gets the value of the sensorLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSensorLocation() {
        return sensorLocation;
    }

    /**
     * Sets the value of the sensorLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSensorLocation(String value) {
        this.sensorLocation = value;
    }

    /**
     * Gets the value of the transportTrackingObservation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportTrackingObservation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportTrackingObservation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportTrackingObservationType }
     * 
     * 
     */
    public List<TransportTrackingObservationType> getTransportTrackingObservation() {
        if (transportTrackingObservation == null) {
            transportTrackingObservation = new ArrayList<TransportTrackingObservationType>();
        }
        return this.transportTrackingObservation;
    }

}
