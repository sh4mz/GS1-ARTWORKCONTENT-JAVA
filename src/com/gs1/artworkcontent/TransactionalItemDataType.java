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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TransactionalItemDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionalItemDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="availableForSaleDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="batchNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="80"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="bestBeforeDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="countryOfOrigin" type="{urn:gs1:shared:shared_common:xsd:3}CountryCodeType" minOccurs="0"/>
 *         &lt;element name="itemExpirationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="lotNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="80"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="packagingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="productionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="productQualityIndication" type="{urn:gs1:shared:shared_common:xsd:3}QuantityType" minOccurs="0"/>
 *         &lt;element name="sellByDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="serialNumber" maxOccurs="unbounded" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="shelfLife" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="80"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="tradeItemQuantity" type="{urn:gs1:shared:shared_common:xsd:3}QuantityType" minOccurs="0"/>
 *         &lt;element name="transactionalItemWeight" type="{urn:gs1:ecom:ecom_common:xsd:3}UnitMeasurementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="serialNumberRange" type="{urn:gs1:shared:shared_common:xsd:3}StringRangeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionalItemDataType", propOrder = {
    "availableForSaleDate",
    "batchNumber",
    "bestBeforeDate",
    "countryOfOrigin",
    "itemExpirationDate",
    "lotNumber",
    "packagingDate",
    "productionDate",
    "productQualityIndication",
    "sellByDate",
    "serialNumber",
    "shelfLife",
    "tradeItemQuantity",
    "transactionalItemWeight",
    "serialNumberRange"
})
public class TransactionalItemDataType {

    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar availableForSaleDate;
    protected String batchNumber;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar bestBeforeDate;
    protected CountryCodeType countryOfOrigin;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar itemExpirationDate;
    protected String lotNumber;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar packagingDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar productionDate;
    protected QuantityType productQualityIndication;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sellByDate;
    protected List<String> serialNumber;
    protected String shelfLife;
    protected QuantityType tradeItemQuantity;
    protected List<UnitMeasurementType> transactionalItemWeight;
    protected List<StringRangeType> serialNumberRange;

    /**
     * Gets the value of the availableForSaleDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAvailableForSaleDate() {
        return availableForSaleDate;
    }

    /**
     * Sets the value of the availableForSaleDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAvailableForSaleDate(XMLGregorianCalendar value) {
        this.availableForSaleDate = value;
    }

    /**
     * Gets the value of the batchNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchNumber() {
        return batchNumber;
    }

    /**
     * Sets the value of the batchNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchNumber(String value) {
        this.batchNumber = value;
    }

    /**
     * Gets the value of the bestBeforeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBestBeforeDate() {
        return bestBeforeDate;
    }

    /**
     * Sets the value of the bestBeforeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBestBeforeDate(XMLGregorianCalendar value) {
        this.bestBeforeDate = value;
    }

    /**
     * Gets the value of the countryOfOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *     
     */
    public CountryCodeType getCountryOfOrigin() {
        return countryOfOrigin;
    }

    /**
     * Sets the value of the countryOfOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public void setCountryOfOrigin(CountryCodeType value) {
        this.countryOfOrigin = value;
    }

    /**
     * Gets the value of the itemExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getItemExpirationDate() {
        return itemExpirationDate;
    }

    /**
     * Sets the value of the itemExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setItemExpirationDate(XMLGregorianCalendar value) {
        this.itemExpirationDate = value;
    }

    /**
     * Gets the value of the lotNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLotNumber() {
        return lotNumber;
    }

    /**
     * Sets the value of the lotNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLotNumber(String value) {
        this.lotNumber = value;
    }

    /**
     * Gets the value of the packagingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPackagingDate() {
        return packagingDate;
    }

    /**
     * Sets the value of the packagingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPackagingDate(XMLGregorianCalendar value) {
        this.packagingDate = value;
    }

    /**
     * Gets the value of the productionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProductionDate() {
        return productionDate;
    }

    /**
     * Sets the value of the productionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProductionDate(XMLGregorianCalendar value) {
        this.productionDate = value;
    }

    /**
     * Gets the value of the productQualityIndication property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getProductQualityIndication() {
        return productQualityIndication;
    }

    /**
     * Sets the value of the productQualityIndication property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setProductQualityIndication(QuantityType value) {
        this.productQualityIndication = value;
    }

    /**
     * Gets the value of the sellByDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSellByDate() {
        return sellByDate;
    }

    /**
     * Sets the value of the sellByDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSellByDate(XMLGregorianCalendar value) {
        this.sellByDate = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serialNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSerialNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSerialNumber() {
        if (serialNumber == null) {
            serialNumber = new ArrayList<String>();
        }
        return this.serialNumber;
    }

    /**
     * Gets the value of the shelfLife property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShelfLife() {
        return shelfLife;
    }

    /**
     * Sets the value of the shelfLife property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShelfLife(String value) {
        this.shelfLife = value;
    }

    /**
     * Gets the value of the tradeItemQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getTradeItemQuantity() {
        return tradeItemQuantity;
    }

    /**
     * Sets the value of the tradeItemQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setTradeItemQuantity(QuantityType value) {
        this.tradeItemQuantity = value;
    }

    /**
     * Gets the value of the transactionalItemWeight property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactionalItemWeight property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionalItemWeight().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnitMeasurementType }
     * 
     * 
     */
    public List<UnitMeasurementType> getTransactionalItemWeight() {
        if (transactionalItemWeight == null) {
            transactionalItemWeight = new ArrayList<UnitMeasurementType>();
        }
        return this.transactionalItemWeight;
    }

    /**
     * Gets the value of the serialNumberRange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serialNumberRange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSerialNumberRange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringRangeType }
     * 
     * 
     */
    public List<StringRangeType> getSerialNumberRange() {
        if (serialNumberRange == null) {
            serialNumberRange = new ArrayList<StringRangeType>();
        }
        return this.serialNumberRange;
    }

}
