
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
    "CURRENT",
    "UNIT"
})
public class PriceMap implements Serializable
{

    @JsonProperty("CURRENT")
    private CURRENT cURRENT;
    @JsonProperty("UNIT")
    private UNIT uNIT;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -382098523057374308L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PriceMap() {
    }

    /**
     * 
     * @param uNIT
     * @param cURRENT
     */
    public PriceMap(CURRENT cURRENT, UNIT uNIT) {
        super();
        this.cURRENT = cURRENT;
        this.uNIT = uNIT;
    }

    @JsonProperty("CURRENT")
    public CURRENT getCURRENT() {
        return cURRENT;
    }

    @JsonProperty("CURRENT")
    public void setCURRENT(CURRENT cURRENT) {
        this.cURRENT = cURRENT;
    }

    @JsonProperty("UNIT")
    public UNIT getUNIT() {
        return uNIT;
    }

    @JsonProperty("UNIT")
    public void setUNIT(UNIT uNIT) {
        this.uNIT = uNIT;
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
        return new ToStringBuilder(this).append("cURRENT", cURRENT).append("uNIT", uNIT).append("additionalProperties", additionalProperties).toString();
    }

}
