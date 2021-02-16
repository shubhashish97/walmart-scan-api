
package com.walmart.inventory;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "WM_BU_ID",
    "WM_LOCALE_ID",
    "WM_CHANNEL_ID",
    "WM_MART_ID",
    "WM_QOS.CORRELATION_ID",
    "WM_VERTICAL_ID"
})
public class Tenant implements Serializable
{

    @JsonProperty("WM_BU_ID")
    private String wMBUID;
    @JsonProperty("WM_LOCALE_ID")
    private String wMLOCALEID;
    @JsonProperty("WM_CHANNEL_ID")
    private String wMCHANNELID;
    @JsonProperty("WM_MART_ID")
    private String wMMARTID;
    @JsonProperty("WM_QOS.CORRELATION_ID")
    private String wMQOSCORRELATIONID;
    @JsonProperty("WM_VERTICAL_ID")
    private String wMVERTICALID;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -2347364785730527580L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Tenant() {
    }

    /**
     * 
     * @param wMVERTICALID
     * @param wMLOCALEID
     * @param wMCHANNELID
     * @param wMBUID
     * @param wMMARTID
     * @param wMQOSCORRELATIONID
     */
    public Tenant(String wMBUID, String wMLOCALEID, String wMCHANNELID, String wMMARTID, String wMQOSCORRELATIONID, String wMVERTICALID) {
        super();
        this.wMBUID = wMBUID;
        this.wMLOCALEID = wMLOCALEID;
        this.wMCHANNELID = wMCHANNELID;
        this.wMMARTID = wMMARTID;
        this.wMQOSCORRELATIONID = wMQOSCORRELATIONID;
        this.wMVERTICALID = wMVERTICALID;
    }

    @JsonProperty("WM_BU_ID")
    public String getWMBUID() {
        return wMBUID;
    }

    @JsonProperty("WM_BU_ID")
    public void setWMBUID(String wMBUID) {
        this.wMBUID = wMBUID;
    }

    @JsonProperty("WM_LOCALE_ID")
    public String getWMLOCALEID() {
        return wMLOCALEID;
    }

    @JsonProperty("WM_LOCALE_ID")
    public void setWMLOCALEID(String wMLOCALEID) {
        this.wMLOCALEID = wMLOCALEID;
    }

    @JsonProperty("WM_CHANNEL_ID")
    public String getWMCHANNELID() {
        return wMCHANNELID;
    }

    @JsonProperty("WM_CHANNEL_ID")
    public void setWMCHANNELID(String wMCHANNELID) {
        this.wMCHANNELID = wMCHANNELID;
    }

    @JsonProperty("WM_MART_ID")
    public String getWMMARTID() {
        return wMMARTID;
    }

    @JsonProperty("WM_MART_ID")
    public void setWMMARTID(String wMMARTID) {
        this.wMMARTID = wMMARTID;
    }

    @JsonProperty("WM_QOS.CORRELATION_ID")
    public String getWMQOSCORRELATIONID() {
        return wMQOSCORRELATIONID;
    }

    @JsonProperty("WM_QOS.CORRELATION_ID")
    public void setWMQOSCORRELATIONID(String wMQOSCORRELATIONID) {
        this.wMQOSCORRELATIONID = wMQOSCORRELATIONID;
    }

    @JsonProperty("WM_VERTICAL_ID")
    public String getWMVERTICALID() {
        return wMVERTICALID;
    }

    @JsonProperty("WM_VERTICAL_ID")
    public void setWMVERTICALID(String wMVERTICALID) {
        this.wMVERTICALID = wMVERTICALID;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("wMBUID", wMBUID).append("wMLOCALEID", wMLOCALEID).append("wMCHANNELID", wMCHANNELID).append("wMMARTID", wMMARTID).append("wMQOSCORRELATIONID", wMQOSCORRELATIONID).append("wMVERTICALID", wMVERTICALID).append("additionalProperties", additionalProperties).toString();
    }

}
