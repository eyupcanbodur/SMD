//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.23 at 04:10:21 PM EST 
//


package org.apromore.pnml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for importPlaceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="importPlaceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="graphics" type="{pnml.apromore.org}graphicsNodeType"/>
 *         &lt;element name="toolspecific" type="{pnml.apromore.org}toolspecificType"/>
 *       &lt;/choice>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="instance" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="ref" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="parameter" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "importPlaceType", propOrder = {
    "graphicsOrToolspecific"
})
public class ImportPlaceType {

    @XmlElements({
        @XmlElement(name = "graphics", type = GraphicsNodeType.class),
        @XmlElement(name = "toolspecific", type = ToolspecificType.class)
    })
    protected List<Object> graphicsOrToolspecific;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "instance")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object instance;
    @XmlAttribute(name = "ref", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String ref;
    @XmlAttribute(name = "parameter", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String parameter;

    /**
     * Gets the value of the graphicsOrToolspecific property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the graphicsOrToolspecific property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGraphicsOrToolspecific().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GraphicsNodeType }
     * {@link ToolspecificType }
     * 
     * 
     */
    public List<Object> getGraphicsOrToolspecific() {
        if (graphicsOrToolspecific == null) {
            graphicsOrToolspecific = new ArrayList<Object>();
        }
        return this.graphicsOrToolspecific;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the instance property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getInstance() {
        return instance;
    }

    /**
     * Sets the value of the instance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setInstance(Object value) {
        this.instance = value;
    }

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRef(String value) {
        this.ref = value;
    }

    /**
     * Gets the value of the parameter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParameter() {
        return parameter;
    }

    /**
     * Sets the value of the parameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParameter(String value) {
        this.parameter = value;
    }

}
