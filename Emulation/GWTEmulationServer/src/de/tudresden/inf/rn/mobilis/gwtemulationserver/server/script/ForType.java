//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.12.11 at 05:55:28 PM MEZ 
//


package de.tudresden.inf.rn.mobilis.gwtemulationserver.server.script;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for forType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="forType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://mobilis.inf.tu-dresden.de/XMLEmulationScript}structureType">
 *       &lt;attribute name="times" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "forType")
public class ForType
    extends StructureType
{

    @XmlAttribute(required = true)
    protected int times;

    /**
     * Gets the value of the times property.
     * 
     */
    public int getTimes() {
        return times;
    }

    /**
     * Sets the value of the times property.
     * 
     */
    public void setTimes(int value) {
        this.times = value;
    }

}
