//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.21 at 05:37:30 PM CST 
//


package com.ming.graph.xsd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for graph.nodeids.type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="graph.nodeids.type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="canonical"/&gt;
 *     &lt;enumeration value="free"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "graph.nodeids.type")
@XmlEnum
public enum GraphNodeidsType {

    @XmlEnumValue("canonical")
    CANONICAL("canonical"),
    @XmlEnumValue("free")
    FREE("free");
    private final String value;

    GraphNodeidsType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GraphNodeidsType fromValue(String v) {
        for (GraphNodeidsType c: GraphNodeidsType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
