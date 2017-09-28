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
 * <p>Java class for ArtworkContentPieceOfArtType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArtworkContentPieceOfArtType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="versionIdentifier" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="80"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="versionDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="pieceOfArtDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description200Type" minOccurs="0"/>
 *         &lt;element name="pieceOfArtGroupingIdentifier" maxOccurs="unbounded" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="80"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="packagingComponentDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description80Type" minOccurs="0"/>
 *         &lt;element name="pieceOfArtIdentification" type="{urn:gs1:shared:shared_common:xsd:3}EntityIdentificationType"/>
 *         &lt;element name="artworkTemplate" type="{urn:gs1:ecom:ecom_common:xsd:3}SourceReferenceType" minOccurs="0"/>
 *         &lt;element name="associatedTradeItem" type="{urn:gs1:shared:shared_common:xsd:3}TradeItemIdentificationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="artworkContentLocale" type="{urn:gs1:ecom:artwork_content_common:xsd:3}ArtworkContentLocaleType" maxOccurs="unbounded"/>
 *         &lt;element name="artworkContentTechnicalDrawing" type="{urn:gs1:ecom:artwork_content_common:xsd:3}ArtworkContentTechnicalDrawingType" minOccurs="0"/>
 *         &lt;element name="artworkContentCopyElement" type="{urn:gs1:ecom:artwork_content_common:xsd:3}ArtworkContentCopyElementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="artworkContentStructuredCopyElement" type="{urn:gs1:ecom:artwork_content_common:xsd:3}ArtworkContentStructuredCopyElementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="artworkContentGraphicElement" type="{urn:gs1:ecom:artwork_content_common:xsd:3}ArtworkContentGraphicElementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="artworkContentDataCarrierElement" type="{urn:gs1:ecom:artwork_content_common:xsd:3}ArtworkContentDataCarrierElementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="avpList" type="{urn:gs1:ecom:ecom_common:xsd:3}Ecom_AttributeValuePairListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArtworkContentPieceOfArtType", namespace = "urn:gs1:ecom:artwork_content_common:xsd:3", propOrder = {
    "versionIdentifier",
    "versionDateTime",
    "pieceOfArtDescription",
    "pieceOfArtGroupingIdentifier",
    "packagingComponentDescription",
    "pieceOfArtIdentification",
    "artworkTemplate",
    "associatedTradeItem",
    "artworkContentLocale",
    "artworkContentTechnicalDrawing",
    "artworkContentCopyElement",
    "artworkContentStructuredCopyElement",
    "artworkContentGraphicElement",
    "artworkContentDataCarrierElement",
    "avpList"
})
public class ArtworkContentPieceOfArtType {

    protected String versionIdentifier;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar versionDateTime;
    protected Description200Type pieceOfArtDescription;
    protected List<String> pieceOfArtGroupingIdentifier;
    protected Description80Type packagingComponentDescription;
    @XmlElement(required = true)
    protected EntityIdentificationType pieceOfArtIdentification;
    protected SourceReferenceType artworkTemplate;
    protected List<TradeItemIdentificationType> associatedTradeItem;
    @XmlElement(required = true)
    protected List<ArtworkContentLocaleType> artworkContentLocale;
    protected ArtworkContentTechnicalDrawingType artworkContentTechnicalDrawing;
    protected List<ArtworkContentCopyElementType> artworkContentCopyElement;
    protected List<ArtworkContentStructuredCopyElementType> artworkContentStructuredCopyElement;
    protected List<ArtworkContentGraphicElementType> artworkContentGraphicElement;
    protected List<ArtworkContentDataCarrierElementType> artworkContentDataCarrierElement;
    protected EcomAttributeValuePairListType avpList;

    /**
     * Gets the value of the versionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionIdentifier() {
        return versionIdentifier;
    }

    /**
     * Sets the value of the versionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionIdentifier(String value) {
        this.versionIdentifier = value;
    }

    /**
     * Gets the value of the versionDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVersionDateTime() {
        return versionDateTime;
    }

    /**
     * Sets the value of the versionDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVersionDateTime(XMLGregorianCalendar value) {
        this.versionDateTime = value;
    }

    /**
     * Gets the value of the pieceOfArtDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Description200Type }
     *     
     */
    public Description200Type getPieceOfArtDescription() {
        return pieceOfArtDescription;
    }

    /**
     * Sets the value of the pieceOfArtDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Description200Type }
     *     
     */
    public void setPieceOfArtDescription(Description200Type value) {
        this.pieceOfArtDescription = value;
    }

    /**
     * Gets the value of the pieceOfArtGroupingIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pieceOfArtGroupingIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPieceOfArtGroupingIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPieceOfArtGroupingIdentifier() {
        if (pieceOfArtGroupingIdentifier == null) {
            pieceOfArtGroupingIdentifier = new ArrayList<String>();
        }
        return this.pieceOfArtGroupingIdentifier;
    }

    /**
     * Gets the value of the packagingComponentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Description80Type }
     *     
     */
    public Description80Type getPackagingComponentDescription() {
        return packagingComponentDescription;
    }

    /**
     * Sets the value of the packagingComponentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Description80Type }
     *     
     */
    public void setPackagingComponentDescription(Description80Type value) {
        this.packagingComponentDescription = value;
    }

    /**
     * Gets the value of the pieceOfArtIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link EntityIdentificationType }
     *     
     */
    public EntityIdentificationType getPieceOfArtIdentification() {
        return pieceOfArtIdentification;
    }

    /**
     * Sets the value of the pieceOfArtIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityIdentificationType }
     *     
     */
    public void setPieceOfArtIdentification(EntityIdentificationType value) {
        this.pieceOfArtIdentification = value;
    }

    /**
     * Gets the value of the artworkTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link SourceReferenceType }
     *     
     */
    public SourceReferenceType getArtworkTemplate() {
        return artworkTemplate;
    }

    /**
     * Sets the value of the artworkTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceReferenceType }
     *     
     */
    public void setArtworkTemplate(SourceReferenceType value) {
        this.artworkTemplate = value;
    }

    /**
     * Gets the value of the associatedTradeItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the associatedTradeItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociatedTradeItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeItemIdentificationType }
     * 
     * 
     */
    public List<TradeItemIdentificationType> getAssociatedTradeItem() {
        if (associatedTradeItem == null) {
            associatedTradeItem = new ArrayList<TradeItemIdentificationType>();
        }
        return this.associatedTradeItem;
    }

    /**
     * Gets the value of the artworkContentLocale property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the artworkContentLocale property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArtworkContentLocale().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArtworkContentLocaleType }
     * 
     * 
     */
    public List<ArtworkContentLocaleType> getArtworkContentLocale() {
        if (artworkContentLocale == null) {
            artworkContentLocale = new ArrayList<ArtworkContentLocaleType>();
        }
        return this.artworkContentLocale;
    }

    /**
     * Gets the value of the artworkContentTechnicalDrawing property.
     * 
     * @return
     *     possible object is
     *     {@link ArtworkContentTechnicalDrawingType }
     *     
     */
    public ArtworkContentTechnicalDrawingType getArtworkContentTechnicalDrawing() {
        return artworkContentTechnicalDrawing;
    }

    /**
     * Sets the value of the artworkContentTechnicalDrawing property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArtworkContentTechnicalDrawingType }
     *     
     */
    public void setArtworkContentTechnicalDrawing(ArtworkContentTechnicalDrawingType value) {
        this.artworkContentTechnicalDrawing = value;
    }

    /**
     * Gets the value of the artworkContentCopyElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the artworkContentCopyElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArtworkContentCopyElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArtworkContentCopyElementType }
     * 
     * 
     */
    public List<ArtworkContentCopyElementType> getArtworkContentCopyElement() {
        if (artworkContentCopyElement == null) {
            artworkContentCopyElement = new ArrayList<ArtworkContentCopyElementType>();
        }
        return this.artworkContentCopyElement;
    }

    /**
     * Gets the value of the artworkContentStructuredCopyElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the artworkContentStructuredCopyElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArtworkContentStructuredCopyElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArtworkContentStructuredCopyElementType }
     * 
     * 
     */
    public List<ArtworkContentStructuredCopyElementType> getArtworkContentStructuredCopyElement() {
        if (artworkContentStructuredCopyElement == null) {
            artworkContentStructuredCopyElement = new ArrayList<ArtworkContentStructuredCopyElementType>();
        }
        return this.artworkContentStructuredCopyElement;
    }

    /**
     * Gets the value of the artworkContentGraphicElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the artworkContentGraphicElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArtworkContentGraphicElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArtworkContentGraphicElementType }
     * 
     * 
     */
    public List<ArtworkContentGraphicElementType> getArtworkContentGraphicElement() {
        if (artworkContentGraphicElement == null) {
            artworkContentGraphicElement = new ArrayList<ArtworkContentGraphicElementType>();
        }
        return this.artworkContentGraphicElement;
    }

    /**
     * Gets the value of the artworkContentDataCarrierElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the artworkContentDataCarrierElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArtworkContentDataCarrierElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArtworkContentDataCarrierElementType }
     * 
     * 
     */
    public List<ArtworkContentDataCarrierElementType> getArtworkContentDataCarrierElement() {
        if (artworkContentDataCarrierElement == null) {
            artworkContentDataCarrierElement = new ArrayList<ArtworkContentDataCarrierElementType>();
        }
        return this.artworkContentDataCarrierElement;
    }

    /**
     * Gets the value of the avpList property.
     * 
     * @return
     *     possible object is
     *     {@link EcomAttributeValuePairListType }
     *     
     */
    public EcomAttributeValuePairListType getAvpList() {
        return avpList;
    }

    /**
     * Sets the value of the avpList property.
     * 
     * @param value
     *     allowed object is
     *     {@link EcomAttributeValuePairListType }
     *     
     */
    public void setAvpList(EcomAttributeValuePairListType value) {
        this.avpList = value;
    }

}
