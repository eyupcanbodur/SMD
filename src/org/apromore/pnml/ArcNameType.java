//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.23 at 04:10:21 PM EST 
//


package org.apromore.pnml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Extension see "http://www.informatik.hu-berlin.de/top/pnml/conv.rng"
 * 
 * <p>Java class for arcNameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="arcNameType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="graphics" type="{pnml.apromore.org}annotationGraphisType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arcNameType", propOrder = {
    "text",
    "graphics"
})
public class ArcNameType {

    protected int text;
    protected AnnotationGraphisType graphics;

    /**
     * Gets the value of the text property.
     * 
     */
    public int getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     */
    public void setText(int value) {
        this.text = value;
    }

    /**
     * Gets the value of the graphics property.
     * 
     * @return
     *     possible object is
     *     {@link AnnotationGraphisType }
     *     
     */
    public AnnotationGraphisType getGraphics() {
        return graphics;
    }

    /**
     * Sets the value of the graphics property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnotationGraphisType }
     *     
     */
    public void setGraphics(AnnotationGraphisType value) {
        this.graphics = value;
    }

}
