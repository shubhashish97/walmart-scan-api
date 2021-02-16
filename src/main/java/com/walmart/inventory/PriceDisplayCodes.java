
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
    "eligibleForAssociateDiscount"
})
public class PriceDisplayCodes implements Serializable
{

    @JsonProperty("eligibleForAssociateDiscount")
    private Boolean eligibleForAssociateDiscount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 7591072773261306332L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PriceDisplayCodes() {
    }

    /**
     * 
     * @param eligibleForAssociateDiscount
     */
    public PriceDisplayCodes(Boolean eligibleForAssociateDiscount) {
        super();
        this.eligibleForAssociateDiscount = eligibleForAssociateDiscount;
    }

    @JsonProperty("eligibleForAssociateDiscount")
    public Boolean getEligibleForAssociateDiscount() {
        return eligibleForAssociateDiscount;
    }

    @JsonProperty("eligibleForAssociateDiscount")
    public void setEligibleForAssociateDiscount(Boolean eligibleForAssociateDiscount) {
        this.eligibleForAssociateDiscount = eligibleForAssociateDiscount;
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
        return new ToStringBuilder(this).append("eligibleForAssociateDiscount", eligibleForAssociateDiscount).append("additionalProperties", additionalProperties).toString();
    }

}
