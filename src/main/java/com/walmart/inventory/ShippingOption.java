
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
    "fulfillmentPrice",
    "fulfillmentDateRange",
    "fulfillmentPriceType",
    "shipMethod",
    "slaDays"
})
public class ShippingOption implements Serializable
{

    @JsonProperty("fulfillmentPrice")
    private FulfillmentPrice fulfillmentPrice;
    @JsonProperty("fulfillmentDateRange")
    private FulfillmentDateRange fulfillmentDateRange;
    @JsonProperty("fulfillmentPriceType")
    private String fulfillmentPriceType;
    @JsonProperty("shipMethod")
    private String shipMethod;
    @JsonProperty("slaDays")
    private Integer slaDays;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 8564538781792027155L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ShippingOption() {
    }

    /**
     * 
     * @param slaDays
     * @param fulfillmentDateRange
     * @param fulfillmentPriceType
     * @param shipMethod
     * @param fulfillmentPrice
     */
    public ShippingOption(FulfillmentPrice fulfillmentPrice, FulfillmentDateRange fulfillmentDateRange, String fulfillmentPriceType, String shipMethod, Integer slaDays) {
        super();
        this.fulfillmentPrice = fulfillmentPrice;
        this.fulfillmentDateRange = fulfillmentDateRange;
        this.fulfillmentPriceType = fulfillmentPriceType;
        this.shipMethod = shipMethod;
        this.slaDays = slaDays;
    }

    @JsonProperty("fulfillmentPrice")
    public FulfillmentPrice getFulfillmentPrice() {
        return fulfillmentPrice;
    }

    @JsonProperty("fulfillmentPrice")
    public void setFulfillmentPrice(FulfillmentPrice fulfillmentPrice) {
        this.fulfillmentPrice = fulfillmentPrice;
    }

    @JsonProperty("fulfillmentDateRange")
    public FulfillmentDateRange getFulfillmentDateRange() {
        return fulfillmentDateRange;
    }

    @JsonProperty("fulfillmentDateRange")
    public void setFulfillmentDateRange(FulfillmentDateRange fulfillmentDateRange) {
        this.fulfillmentDateRange = fulfillmentDateRange;
    }

    @JsonProperty("fulfillmentPriceType")
    public String getFulfillmentPriceType() {
        return fulfillmentPriceType;
    }

    @JsonProperty("fulfillmentPriceType")
    public void setFulfillmentPriceType(String fulfillmentPriceType) {
        this.fulfillmentPriceType = fulfillmentPriceType;
    }

    @JsonProperty("shipMethod")
    public String getShipMethod() {
        return shipMethod;
    }

    @JsonProperty("shipMethod")
    public void setShipMethod(String shipMethod) {
        this.shipMethod = shipMethod;
    }

    @JsonProperty("slaDays")
    public Integer getSlaDays() {
        return slaDays;
    }

    @JsonProperty("slaDays")
    public void setSlaDays(Integer slaDays) {
        this.slaDays = slaDays;
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
        return new ToStringBuilder(this).append("fulfillmentPrice", fulfillmentPrice).append("fulfillmentDateRange", fulfillmentDateRange).append("fulfillmentPriceType", fulfillmentPriceType).append("shipMethod", shipMethod).append("slaDays", slaDays).append("additionalProperties", additionalProperties).toString();
    }

}
