
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
    "priceType",
    "price",
    "currencyUnit",
    "currencyUnitSymbol",
    "unitOfMeasure"
})
public class UNIT implements Serializable
{

    @JsonProperty("priceType")
    private String priceType;
    @JsonProperty("price")
    private Double price;
    @JsonProperty("currencyUnit")
    private String currencyUnit;
    @JsonProperty("currencyUnitSymbol")
    private String currencyUnitSymbol;
    @JsonProperty("unitOfMeasure")
    private String unitOfMeasure;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 1994625126978442113L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public UNIT() {
    }

    /**
     * 
     * @param unitOfMeasure
     * @param price
     * @param priceType
     * @param currencyUnitSymbol
     * @param currencyUnit
     */
    public UNIT(String priceType, Double price, String currencyUnit, String currencyUnitSymbol, String unitOfMeasure) {
        super();
        this.priceType = priceType;
        this.price = price;
        this.currencyUnit = currencyUnit;
        this.currencyUnitSymbol = currencyUnitSymbol;
        this.unitOfMeasure = unitOfMeasure;
    }

    @JsonProperty("priceType")
    public String getPriceType() {
        return priceType;
    }

    @JsonProperty("priceType")
    public void setPriceType(String priceType) {
        this.priceType = priceType;
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

    @JsonProperty("unitOfMeasure")
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    @JsonProperty("unitOfMeasure")
    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
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
        return new ToStringBuilder(this).append("priceType", priceType).append("price", price).append("currencyUnit", currencyUnit).append("currencyUnitSymbol", currencyUnitSymbol).append("unitOfMeasure", unitOfMeasure).append("additionalProperties", additionalProperties).toString();
    }

}
