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
    "longName",
    "preferredName",
    "preferredDefinition",
    "version",
    "workflowStatus",
    "contextName",
    "contextVersion",
    "origin",
    "registrationStatus",
    "dataElementConcept",
    "valueDomain",
    "referenceDocumentsList",
    "classificationsList",
    "alternateNameList",
    "dataElementDerivation"
})
@XmlRootElement(name = "DataElement")
public class DataElement {

//    @XmlAttribute(name = "num", required = true)
//    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
//    protected String num;
    @XmlElement(name = "PUBLICID", required = true)
    protected String publicId;
    @XmlElement(name = "LONGNAME", required = true)
    protected String longName;
    @XmlElement(name = "PREFERREDNAME", required = true)
    protected String preferredName;
    @XmlElement(name = "PREFERREDDEFINITION", required = true)
    protected String preferredDefinition;
    @XmlElement(name = "VERSION", required = true)
    protected String version;
    @XmlElement(name = "WORKFLOWSTATUS", required = true)
    protected String workflowStatus;
    @XmlElement(name = "CONTEXTNAME", required = true)
    protected String contextName;
    @XmlElement(name = "CONTEXTVERSION", required = true)
    protected String contextVersion;
    @XmlElement(name = "ORIGIN", required = true)
    protected Origin origin;
    @XmlElement(name = "REGISTRATIONSTATUS", required = true)
    protected REGISTRATIONSTATUS registrationStatus;
    @XmlElement(name = "DATAELEMENTCONCEPT", required = true)
    protected DataElementConcept dataElementConcept;
    @XmlElement(name = "VALUEDOMAIN", required = true)
    protected ValueDomain valueDomain;
    @XmlElement(name = "REFERENCEDOCUMENTSLIST", required = true)
    protected REFERENCEDOCUMENTSLIST referenceDocumentsList;
    @XmlElement(name = "CLASSIFICATIONSLIST", required = true)
    protected CLASSIFICATIONSLIST classificationsList;
    @XmlElement(name = "ALTERNATENAMELIST", required = true)
    protected ALTERNATENAMELIST alternateNameList;
    @XmlElement(name = "DATAELEMENTDERIVATION", required = true)
    protected DataElementDerivation dataElementDerivation;

//    public String getNum()
//    {
//        return num;
//    }
//
//    public void setNum(String num)
//    {
//        this.num = num;
//    }

    public String getPublicId()
    {
        return publicId;
    }

    public void setPublicId(String publicId)
    {
        this.publicId = publicId;
    }

    public String getLongName()
    {
        return longName;
    }

    public void setLongName(String longName)
    {
        this.longName = longName;
    }

    public String getPreferredName()
    {
        return preferredName;
    }

    public void setPreferredName(String preferredName)
    {
        this.preferredName = preferredName;
    }

    public String getPreferredDefinition()
    {
        return preferredDefinition;
    }

    public void setPreferredDefinition(String preferredDefinition)
    {
        this.preferredDefinition = preferredDefinition;
    }

    public String getVersion()
    {
        return version;
    }

    public void setVersion(String version)
    {
        this.version = version;
    }

    public String getWorkflowStatus()
    {
        return workflowStatus;
    }

    public void setWorkflowStatus(String workflowStatus)
    {
        this.workflowStatus = workflowStatus;
    }

    public String getContextName()
    {
        return contextName;
    }

    public void setContextName(String contextName)
    {
        this.contextName = contextName;
    }

    public String getContextVersion()
    {
        return contextVersion;
    }

    public void setContextVersion(String contextVersion)
    {
        this.contextVersion = contextVersion;
    }

    public Origin getOrigin()
    {
        return origin;
    }

    public void setOrigin(Origin origin)
    {
        this.origin = origin;
    }

    public REGISTRATIONSTATUS getRegistrationStatus()
    {
        return registrationStatus;
    }

    public void setRegistrationStatus(REGISTRATIONSTATUS registrationStatus)
    {
        this.registrationStatus = registrationStatus;
    }

    public DataElementConcept getDataElementConcept()
    {
        return dataElementConcept;
    }

    public void setDataElementConcept(DataElementConcept dataElementConcept)
    {
        this.dataElementConcept = dataElementConcept;
    }

    public ValueDomain getValueDomain()
    {
        return valueDomain;
    }

    public void setValueDomain(ValueDomain valueDomain)
    {
        this.valueDomain = valueDomain;
    }

    public REFERENCEDOCUMENTSLIST getReferenceDocumentsList()
    {
        return referenceDocumentsList;
    }

    public void setReferenceDocumentsList(REFERENCEDOCUMENTSLIST referenceDocumentsList)
    {
        this.referenceDocumentsList = referenceDocumentsList;
    }

    public CLASSIFICATIONSLIST getClassificationsList()
    {
        return classificationsList;
    }

    public void setClassificationsList(CLASSIFICATIONSLIST classificationsList)
    {
        this.classificationsList = classificationsList;
    }

    public ALTERNATENAMELIST getAlternateNameList()
    {
        return alternateNameList;
    }

    public void setAlternateNameList(ALTERNATENAMELIST alternateNameList)
    {
        this.alternateNameList = alternateNameList;
    }

    public DataElementDerivation getDataElementDerivation()
    {
        return dataElementDerivation;
    }

    public void setDataElementDerivation(DataElementDerivation dataElementDerivation)
    {
        this.dataElementDerivation = dataElementDerivation;
    }
}
