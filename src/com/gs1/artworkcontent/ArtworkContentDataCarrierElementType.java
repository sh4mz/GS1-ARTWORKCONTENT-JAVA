//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.28 at 12:23:59 PM CST 
//


package com.gs1.artworkcontent;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArtworkContentDataCarrierElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArtworkContentDataCarrierElementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataCarrierElementTypeCode" type="{urn:gs1:ecom:artwork_content_common:xsd:3}DataCarrierElementTypeCodeType"/>
 *         &lt;element name="instanceSequence" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="localeSequence" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="expectedNumberOfOccurrences" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="actualNumberOfOccurrences" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="note" type="{urn:gs1:shared:shared_common:xsd:3}Description500Type" minOccurs="0"/>
 *         &lt;element name="sourceReference" type="{urn:gs1:ecom:ecom_common:xsd:3}SourceReferenceType" minOccurs="0"/>
 *         &lt;element name="artworkContentResponseStatus" type="{urn:gs1:ecom:artwork_content_common:xsd:3}ArtworkContentResponseStatusType" minOccurs="0"/>
 *         &lt;element name="artworkContentDataCarrierDetail" type="{urn:gs1:ecom:artwork_content_common:xsd:3}ArtworkContentDataCarrierDetailType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArtworkContentDataCarrierElementType", namespace = "urn:gs1:ecom:artwork_content_common:xsd:3", propOrder = {
    "dataCarrierElementTypeCode",
    "instanceSequence",
    "localeSequence",
    "expectedNumberOfOccurrences",
    "actualNumberOfOccurrences",
    "note",
    "sourceReference",
    "artworkContentResponseStatus",
    "artworkContentDataCarrierDetail"
})
public class ArtworkContentDataCarrierElementType {

    @XmlElement(required = true)
    protected DataCarrierElementTypeCodeType dataCarrierElementTypeCode;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger instanceSequence;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger localeSequence;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger expectedNumberOfOccurrences;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger actualNumberOfOccurrences;
    protected Description500Type note;
    protected SourceReferenceType sourceReference;
    protected ArtworkContentResponseStatusType artworkContentResponseStatus;
    @XmlElement(required = true)
    protected List<ArtworkContentDataCarrierDetailType> artworkContentDataCarrierDetail;

    /**
     * Gets the value of the dataCarrierElementTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link DataCarrierElementTypeCodeType }
     *     
     */
    public DataCarrierElementTypeCodeType getDataCarrierElementTypeCode() {
        return dataCarrierElementTypeCode;
    }

    /**
     * Sets the value of the dataCarrierElementTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataCarrierElementTypeCodeType }
     *     
     */
    public void setDataCarrierElementTypeCode(DataCarrierElementTypeCodeType value) {
        this.dataCarrierElementTypeCode = value;
    }

    /**
     * Gets the value of the instanceSequence property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInstanceSequence() {
        return instanceSequence;
    }

    /**
     * Sets the value of the instanceSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInstanceSequence(BigInteger value) {
        this.instanceSequence = value;
    }

    /**
     * Gets the value of the localeSequence property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLocaleSequence() {
        return localeSequence;
    }

    /**
     * Sets the value of the localeSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLocaleSequence(BigInteger value) {
        this.localeSequence = value;
    }

    /**
     * Gets the value of the expectedNumberOfOccurrences property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExpectedNumberOfOccurrences() {
        return expectedNumberOfOccurrences;
    }

    /**
     * Sets the value of the expectedNumberOfOccurrences property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExpectedNumberOfOccurrences(BigInteger value) {
        this.expectedNumberOfOccurrences = value;
    }

    /**
     * Gets the value of the actualNumberOfOccurrences property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getActualNumberOfOccurrences() {
        return actualNumberOfOccurrences;
    }

    /**
     * Sets the value of the actualNumberOfOccurrences property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setActualNumberOfOccurrences(BigInteger value) {
        this.actualNumberOfOccurrences = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link Description500Type }
     *     
     */
    public Description500Type getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link Description500Type }
     *     
     */
    public void setNote(Description500Type value) {
        this.note = value;
    }

    /**
     * Gets the value of the sourceReference property.
     * 
     * @return
     *     possible object is
     *     {@link SourceReferenceType }
     *     
     */
    public SourceReferenceType getSourceReference() {
        return sourceReference;
    }

    /**
     * Sets the value of the sourceReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceReferenceType }
     *     
     */
    public void setSourceReference(SourceReferenceType value) {
        this.sourceReference = value;
    }

    /**
     * Gets the value of the artworkContentResponseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ArtworkContentResponseStatusType }
     *     
     */
    public ArtworkContentResponseStatusType getArtworkContentResponseStatus() {
        return artworkContentResponseStatus;
    }

    /**
     * Sets the value of the artworkContentResponseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArtworkContentResponseStatusType }
     *     
     */
    public void setArtworkContentResponseStatus(ArtworkContentResponseStatusType value) {
        this.artworkContentResponseStatus = value;
    }

    /**
     * Gets the value of the artworkContentDataCarrierDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the artworkContentDataCarrierDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArtworkContentDataCarrierDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArtworkContentDataCarrierDetailType }
     * 
     * 
     */
    public List<ArtworkContentDataCarrierDetailType> getArtworkContentDataCarrierDetail() {
        if (artworkContentDataCarrierDetail == null) {
            artworkContentDataCarrierDetail = new ArrayList<ArtworkContentDataCarrierDetailType>();
        }
        return this.artworkContentDataCarrierDetail;
    }

}