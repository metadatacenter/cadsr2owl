//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.14 at 05:38:06 PM PDT 
//


package org.metadatacenter.cadsr.cdes_loader.cadsr_objects.jaxb;

import java.util.ArrayList;
import java.util.List;
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
    "dataElements"
})
@XmlRootElement(name = "DataElementsList")
public class DataElementsList {

    @XmlElement(name = "DataElement")
    protected List<DataElement> dataElements;

    /**
     * Gets the value of the dataElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataElement }
     * 
     * 
     */
    public List<DataElement> getDataElements() {
        if (dataElements == null) {
            dataElements = new ArrayList<DataElement>();
        }
        return this.dataElements;
    }

    public void setDataElements(List<DataElement> dataElements)
    {
        this.dataElements = dataElements;
    }
}
