
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
    "access",
    "device",
    "browser",
    "topTxId"
})
public class Context implements Serializable
{

    @JsonProperty("access")
    private Boolean access;
    @JsonProperty("device")
    private String device;
    @JsonProperty("browser")
    private String browser;
    @JsonProperty("topTxId")
    private String topTxId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 7012915854473450025L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Context() {
    }

    /**
     * 
     * @param access
     * @param browser
     * @param topTxId
     * @param device
     */
    public Context(Boolean access, String device, String browser, String topTxId) {
        super();
        this.access = access;
        this.device = device;
        this.browser = browser;
        this.topTxId = topTxId;
    }

    @JsonProperty("access")
    public Boolean getAccess() {
        return access;
    }

    @JsonProperty("access")
    public void setAccess(Boolean access) {
        this.access = access;
    }

    @JsonProperty("device")
    public String getDevice() {
        return device;
    }

    @JsonProperty("device")
    public void setDevice(String device) {
        this.device = device;
    }

    @JsonProperty("browser")
    public String getBrowser() {
        return browser;
    }

    @JsonProperty("browser")
    public void setBrowser(String browser) {
        this.browser = browser;
    }

    @JsonProperty("topTxId")
    public String getTopTxId() {
        return topTxId;
    }

    @JsonProperty("topTxId")
    public void setTopTxId(String topTxId) {
        this.topTxId = topTxId;
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
        return new ToStringBuilder(this).append("access", access).append("device", device).append("browser", browser).append("topTxId", topTxId).append("additionalProperties", additionalProperties).toString();
    }

}
