
package com.walmart.inventory;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
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
    "legalAttributes"
})
public class LegalContent implements Serializable
{

    @JsonProperty("legalAttributes")
    private List<Object> legalAttributes = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 6880502896059968633L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public LegalContent() {
    }

    /**
     * 
     * @param legalAttributes
     */
    public LegalContent(List<Object> legalAttributes) {
        super();
        this.legalAttributes = legalAttributes;
    }

    @JsonProperty("legalAttributes")
    public List<Object> getLegalAttributes() {
        return legalAttributes;
    }

    @JsonProperty("legalAttributes")
    public void setLegalAttributes(List<Object> legalAttributes) {
        this.legalAttributes = legalAttributes;
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
        return new ToStringBuilder(this).append("legalAttributes", legalAttributes).append("additionalProperties", additionalProperties).toString();
    }

}
