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
 * <p>Java class for DangerousGoodsRegulationInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DangerousGoodsRegulationInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dangerousGoodsRegulationCode" type="{urn:gs1:ecom:ecom_common:xsd:3}DangerousGoodsRegulationCodeType"/>
 *         &lt;element name="dangerousGoodsRegulationName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="80"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dangerousGoodsHazardClass">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="80"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dangerousGoodsPackingGroup" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="80"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dangerousGoodsAttribute" type="{urn:gs1:ecom:ecom_common:xsd:3}DangerousGoodsAttributeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DangerousGoodsRegulationInformationType", propOrder = {
    "dangerousGoodsRegulationCode",
    "dangerousGoodsRegulationName",
    "dangerousGoodsHazardClass",
    "dangerousGoodsPackingGroup",
    "dangerousGoodsAttribute"
})
public class DangerousGoodsRegulationInformationType {

    @XmlElement(required = true)
    protected DangerousGoodsRegulationCodeType dangerousGoodsRegulationCode;
    protected String dangerousGoodsRegulationName;
    @XmlElement(required = true)
    protected String dangerousGoodsHazardClass;
    protected String dangerousGoodsPackingGroup;
    protected List<DangerousGoodsAttributeType> dangerousGoodsAttribute;

    /**
     * Gets the value of the dangerousGoodsRegulationCode property.
     * 
     * @return
     *     possible object is
     *     {@link DangerousGoodsRegulationCodeType }
     *     
     */
    public DangerousGoodsRegulationCodeType getDangerousGoodsRegulationCode() {
        return dangerousGoodsRegulationCode;
    }

    /**
     * Sets the value of the dangerousGoodsRegulationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DangerousGoodsRegulationCodeType }
     *     
     */
    public void setDangerousGoodsRegulationCode(DangerousGoodsRegulationCodeType value) {
        this.dangerousGoodsRegulationCode = value;
    }

    /**
     * Gets the value of the dangerousGoodsRegulationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDangerousGoodsRegulationName() {
        return dangerousGoodsRegulationName;
    }

    /**
     * Sets the value of the dangerousGoodsRegulationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDangerousGoodsRegulationName(String value) {
        this.dangerousGoodsRegulationName = value;
    }

    /**
     * Gets the value of the dangerousGoodsHazardClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDangerousGoodsHazardClass() {
        return dangerousGoodsHazardClass;
    }

    /**
     * Sets the value of the dangerousGoodsHazardClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDangerousGoodsHazardClass(String value) {
        this.dangerousGoodsHazardClass = value;
    }

    /**
     * Gets the value of the dangerousGoodsPackingGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDangerousGoodsPackingGroup() {
        return dangerousGoodsPackingGroup;
    }

    /**
     * Sets the value of the dangerousGoodsPackingGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDangerousGoodsPackingGroup(String value) {
        this.dangerousGoodsPackingGroup = value;
    }

    /**
     * Gets the value of the dangerousGoodsAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dangerousGoodsAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDangerousGoodsAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DangerousGoodsAttributeType }
     * 
     * 
     */
    public List<DangerousGoodsAttributeType> getDangerousGoodsAttribute() {
        if (dangerousGoodsAttribute == null) {
            dangerousGoodsAttribute = new ArrayList<DangerousGoodsAttributeType>();
        }
        return this.dangerousGoodsAttribute;
    }

}
