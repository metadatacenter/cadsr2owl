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
    "publicId",
    "contextName",
    "contextVersion",
    "preferredName",
    "version",
    "longName"
})
@XmlRootElement(name = "ConceptualDomain")
public class ConceptualDomain {

    @XmlElement(name = "PublicId", required = true)
    protected PublicId publicId;
    @XmlElement(name = "ContextName", required = true)
    protected ContextName contextName;
    @XmlElement(name = "ContextVersion", required = true)
    protected ContextVersion contextVersion;
    @XmlElement(name = "PreferredName", required = true)
    protected PreferredName preferredName;
    @XmlElement(name = "Version", required = true)
    protected Version version;
    @XmlElement(name = "LongName", required = true)
    protected LongName longName;

    /**
     * Gets the value of the publicId property.
     * 
     * @return
     *     possible object is
     *     {@link PublicId }
     *     
     */
    public PublicId getPublicId() {
        return publicId;
    }

    /**
     * Sets the value of the publicId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicId }
     *     
     */
    public void setPublicId(PublicId value) {
        this.publicId = value;
    }

    /**
     * Gets the value of the contextName property.
     * 
     * @return
     *     possible object is
     *     {@link ContextName }
     *     
     */
    public ContextName getContextName() {
        return contextName;
    }

    /**
     * Sets the value of the contextName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContextName }
     *     
     */
    public void setContextName(ContextName value) {
        this.contextName = value;
    }

    /**
     * Gets the value of the contextVersion property.
     * 
     * @return
     *     possible object is
     *     {@link ContextVersion }
     *     
     */
    public ContextVersion getContextVersion() {
        return contextVersion;
    }

    /**
     * Sets the value of the contextVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContextVersion }
     *     
     */
    public void setContextVersion(ContextVersion value) {
        this.contextVersion = value;
    }

    /**
     * Gets the value of the preferredName property.
     * 
     * @return
     *     possible object is
     *     {@link PreferredName }
     *     
     */
    public PreferredName getPreferredName() {
        return preferredName;
    }

    /**
     * Sets the value of the preferredName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferredName }
     *     
     */
    public void setPreferredName(PreferredName value) {
        this.preferredName = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link Version }
     *     
     */
    public Version getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link Version }
     *     
     */
    public void setVersion(Version value) {
        this.version = value;
    }

    /**
     * Gets the value of the longName property.
     * 
     * @return
     *     possible object is
     *     {@link LongName }
     *     
     */
    public LongName getLongName() {
        return longName;
    }

    /**
     * Sets the value of the longName property.
     * 
     * @param value
     *     allowed object is
     *     {@link LongName }
     *     
     */
    public void setLongName(LongName value) {
        this.longName = value;
    }

}
