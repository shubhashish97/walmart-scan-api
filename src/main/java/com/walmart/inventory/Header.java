
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
    "headerAttributes"
})
public class Header implements Serializable
{

    @JsonProperty("headerAttributes")
    private HeaderAttributes headerAttributes;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -6992570738476094720L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Header() {
    }

    /**
     * 
     * @param headerAttributes
     */
    public Header(HeaderAttributes headerAttributes) {
        super();
        this.headerAttributes = headerAttributes;
    }

    @JsonProperty("headerAttributes")
    public HeaderAttributes getHeaderAttributes() {
        return headerAttributes;
    }

    @JsonProperty("headerAttributes")
    public void setHeaderAttributes(HeaderAttributes headerAttributes) {
        this.headerAttributes = headerAttributes;
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
        return new ToStringBuilder(this).append("headerAttributes", headerAttributes).append("additionalProperties", additionalProperties).toString();
    }

}
