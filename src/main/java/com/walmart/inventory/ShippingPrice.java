
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
    "price",
    "currencyUnit",
    "currencyUnitSymbol"
})
public class ShippingPrice implements Serializable
{

    @JsonProperty("price")
    private Double price;
    @JsonProperty("currencyUnit")
    private String currencyUnit;
    @JsonProperty("currencyUnitSymbol")
    private String currencyUnitSymbol;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -6398093424075709406L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ShippingPrice() {
    }

    /**
     * 
     * @param price
     * @param currencyUnitSymbol
     * @param currencyUnit
     */
    public ShippingPrice(Double price, String currencyUnit, String currencyUnitSymbol) {
        super();
        this.price = price;
        this.currencyUnit = currencyUnit;
        this.currencyUnitSymbol = currencyUnitSymbol;
    }

    @JsonProperty("price")
    public Double getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Double price) {
        this.price = price;
    }

    @JsonProperty("currencyUnit")
    public String getCurrencyUnit() {
        return currencyUnit;
    }

    @JsonProperty("currencyUnit")
    public void setCurrencyUnit(String currencyUnit) {
        this.currencyUnit = currencyUnit;
    }

    @JsonProperty("currencyUnitSymbol")
    public String getCurrencyUnitSymbol() {
        return currencyUnitSymbol;
    }

    @JsonProperty("currencyUnitSymbol")
    public void setCurrencyUnitSymbol(String currencyUnitSymbol) {
        this.currencyUnitSymbol = currencyUnitSymbol;
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
        return new ToStringBuilder(this).append("price", price).append("currencyUnit", currencyUnit).append("currencyUnitSymbol", currencyUnitSymbol).append("additionalProperties", additionalProperties).toString();
    }

}
