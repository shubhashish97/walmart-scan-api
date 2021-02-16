
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
    "exactDeliveryDate"
})
public class FulfillmentDateRange implements Serializable
{

    @JsonProperty("exactDeliveryDate")
    private Integer exactDeliveryDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 3093697349796166244L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public FulfillmentDateRange() {
    }

    /**
     * 
     * @param exactDeliveryDate
     */
    public FulfillmentDateRange(Integer exactDeliveryDate) {
        super();
        this.exactDeliveryDate = exactDeliveryDate;
    }

    @JsonProperty("exactDeliveryDate")
    public Integer getExactDeliveryDate() {
        return exactDeliveryDate;
    }

    @JsonProperty("exactDeliveryDate")
    public void setExactDeliveryDate(Integer exactDeliveryDate) {
        this.exactDeliveryDate = exactDeliveryDate;
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
        return new ToStringBuilder(this).append("exactDeliveryDate", exactDeliveryDate).append("additionalProperties", additionalProperties).toString();
    }

}
