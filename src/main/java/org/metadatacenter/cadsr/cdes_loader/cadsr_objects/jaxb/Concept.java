//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.14 at 05:38:06 PM PDT 
//


package org.metadatacenter.cadsr.cdes_loader.cadsr_objects.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "preferredName",
    "longName",
    "conId",
    "definitionSource",
    "origin",
    "evsSource",
    "primaryFlagInd",
    "displayOrder"
})
@XmlRootElement(name = "ConceptDetails_ITEM")
public class Concept {

    @XmlElement(name = "PREFERRED_NAME", required = true)
    protected String preferredName;
    @XmlElement(name = "LONG_NAME", required = true)
    protected String longName;
    @XmlElement(name = "CON_ID", required = true)
    protected String conId;
    @XmlElement(name = "DEFINITION_SOURCE", required = true)
    protected DEFINITIONSOURCE definitionSource;
    @XmlElement(name = "ORIGIN", required = true)
    protected Origin origin;
    @XmlElement(name = "EVS_SOURCE", required = true)
    protected String evsSource;
    @XmlElement(name = "PRIMARY_FLAG_IND", required = true)
    protected String primaryFlagInd;
    @XmlElement(name = "DISPLAY_ORDER", required = true)
    protected String displayOrder;

    public String getPreferredName()
    {
        return preferredName;
    }

    public void setPreferredName(String preferredName)
    {
        this.preferredName = preferredName;
    }

    public String getLongName()
    {
        return longName;
    }

    public void setLongName(String longName)
    {
        this.longName = longName;
    }

    public String getConId()
    {
        return conId;
    }

    public void setConId(String conId)
    {
        this.conId = conId;
    }

    public DEFINITIONSOURCE getDefinitionSource()
    {
        return definitionSource;
    }

    public void setDefinitionSource(DEFINITIONSOURCE definitionSource)
    {
        this.definitionSource = definitionSource;
    }

    public Origin getOrigin()
    {
        return origin;
    }

    public void setOrigin(Origin origin)
    {
        this.origin = origin;
    }

    public String getEvsSource()
    {
        return evsSource;
    }

    public void setEvsSource(String evsSource)
    {
        this.evsSource = evsSource;
    }

    public String getPrimaryFlagInd()
    {
        return primaryFlagInd;
    }

    public void setPrimaryFlagInd(String primaryFlagInd)
    {
        this.primaryFlagInd = primaryFlagInd;
    }

    public String getDisplayOrder()
    {
        return displayOrder;
    }

    public void setDisplayOrder(String displayOrder)
    {
        this.displayOrder = displayOrder;
    }
}
