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
 * <p>Java class for TransportTrackingObservationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransportTrackingObservationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transportObservationTypeCode" type="{urn:gs1:ecom:ecom_common:xsd:3}ObservationTypeCodeType"/>
 *         &lt;element name="transportObservationValueCode" type="{urn:gs1:shared:shared_common:xsd:3}CodeType" minOccurs="0"/>
 *         &lt;element name="transportObservationValueMeasurement" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/>
 *         &lt;element name="transportObservationValueNumeric" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportTrackingObservationType", propOrder = {
    "transportObservationTypeCode",
    "transportObservationValueCode",
    "transportObservationValueMeasurement",
    "transportObservationValueNumeric"
})
public class TransportTrackingObservationType {

    @XmlElement(required = true)
    protected ObservationTypeCodeType transportObservationTypeCode;
    protected CodeType transportObservationValueCode;
    protected MeasurementType transportObservationValueMeasurement;
    protected Float transportObservationValueNumeric;

    /**
     * Gets the value of the transportObservationTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ObservationTypeCodeType }
     *     
     */
    public ObservationTypeCodeType getTransportObservationTypeCode() {
        return transportObservationTypeCode;
    }

    /**
     * Sets the value of the transportObservationTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObservationTypeCodeType }
     *     
     */
    public void setTransportObservationTypeCode(ObservationTypeCodeType value) {
        this.transportObservationTypeCode = value;
    }

    /**
     * Gets the value of the transportObservationValueCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getTransportObservationValueCode() {
        return transportObservationValueCode;
    }

    /**
     * Sets the value of the transportObservationValueCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setTransportObservationValueCode(CodeType value) {
        this.transportObservationValueCode = value;
    }

    /**
     * Gets the value of the transportObservationValueMeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getTransportObservationValueMeasurement() {
        return transportObservationValueMeasurement;
    }

    /**
     * Sets the value of the transportObservationValueMeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setTransportObservationValueMeasurement(MeasurementType value) {
        this.transportObservationValueMeasurement = value;
    }

    /**
     * Gets the value of the transportObservationValueNumeric property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTransportObservationValueNumeric() {
        return transportObservationValueNumeric;
    }

    /**
     * Sets the value of the transportObservationValueNumeric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTransportObservationValueNumeric(Float value) {
        this.transportObservationValueNumeric = value;
    }

}