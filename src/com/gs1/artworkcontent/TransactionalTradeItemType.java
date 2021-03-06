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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionalTradeItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionalTradeItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:gs1:shared:shared_common:xsd:3}TradeItemIdentificationType">
 *       &lt;sequence>
 *         &lt;element name="tradeItemQuantity" type="{urn:gs1:shared:shared_common:xsd:3}QuantityType" minOccurs="0"/>
 *         &lt;element name="tradeItemDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description200Type" minOccurs="0"/>
 *         &lt;element name="productVariantIdentifier" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="80"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="itemTypeCode" type="{urn:gs1:ecom:ecom_common:xsd:3}ItemTypeCodeType" minOccurs="0"/>
 *         &lt;element name="transactionalItemData" type="{urn:gs1:ecom:ecom_common:xsd:3}TransactionalItemDataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="colour" type="{urn:gs1:shared:shared_common:xsd:3}ColourType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="size" type="{urn:gs1:shared:shared_common:xsd:3}SizeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionalTradeItemType", propOrder = {
    "tradeItemQuantity",
    "tradeItemDescription",
    "productVariantIdentifier",
    "itemTypeCode",
    "transactionalItemData",
    "colour",
    "size"
})
public class TransactionalTradeItemType
    extends TradeItemIdentificationType
{

    protected QuantityType tradeItemQuantity;
    protected Description200Type tradeItemDescription;
    protected String productVariantIdentifier;
    protected ItemTypeCodeType itemTypeCode;
    protected List<TransactionalItemDataType> transactionalItemData;
    protected List<ColourType> colour;
    protected List<SizeType> size;

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
     * Gets the value of the tradeItemDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Description200Type }
     *     
     */
    public Description200Type getTradeItemDescription() {
        return tradeItemDescription;
    }

    /**
     * Sets the value of the tradeItemDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Description200Type }
     *     
     */
    public void setTradeItemDescription(Description200Type value) {
        this.tradeItemDescription = value;
    }

    /**
     * Gets the value of the productVariantIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductVariantIdentifier() {
        return productVariantIdentifier;
    }

    /**
     * Sets the value of the productVariantIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductVariantIdentifier(String value) {
        this.productVariantIdentifier = value;
    }

    /**
     * Gets the value of the itemTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ItemTypeCodeType }
     *     
     */
    public ItemTypeCodeType getItemTypeCode() {
        return itemTypeCode;
    }

    /**
     * Sets the value of the itemTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemTypeCodeType }
     *     
     */
    public void setItemTypeCode(ItemTypeCodeType value) {
        this.itemTypeCode = value;
    }

    /**
     * Gets the value of the transactionalItemData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactionalItemData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionalItemData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionalItemDataType }
     * 
     * 
     */
    public List<TransactionalItemDataType> getTransactionalItemData() {
        if (transactionalItemData == null) {
            transactionalItemData = new ArrayList<TransactionalItemDataType>();
        }
        return this.transactionalItemData;
    }

    /**
     * Gets the value of the colour property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the colour property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColour().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ColourType }
     * 
     * 
     */
    public List<ColourType> getColour() {
        if (colour == null) {
            colour = new ArrayList<ColourType>();
        }
        return this.colour;
    }

    /**
     * Gets the value of the size property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the size property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSize().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SizeType }
     * 
     * 
     */
    public List<SizeType> getSize() {
        if (size == null) {
            size = new ArrayList<SizeType>();
        }
        return this.size;
    }

}
