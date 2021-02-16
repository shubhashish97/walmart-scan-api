
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
    "upsellable",
    "shippingPrice",
    "shipMethod",
    "arrivalDate",
    "displayArrivalDate",
    "skyLineAdEnabled",
    "displayUpsellForAllCategoriesEnabled",
    "title"
})
public class UpsellFulfillmentOption implements Serializable
{

    @JsonProperty("upsellable")
    private Boolean upsellable;
    @JsonProperty("shippingPrice")
    private ShippingPrice shippingPrice;
    @JsonProperty("shipMethod")
    private String shipMethod;
    @JsonProperty("arrivalDate")
    private Integer arrivalDate;
    @JsonProperty("displayArrivalDate")
    private String displayArrivalDate;
    @JsonProperty("skyLineAdEnabled")
    private Boolean skyLineAdEnabled;
    @JsonProperty("displayUpsellForAllCategoriesEnabled")
    private Boolean displayUpsellForAllCategoriesEnabled;
    @JsonProperty("title")
    private String title;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -7417728874886598795L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public UpsellFulfillmentOption() {
    }

    /**
     * 
     * @param displayUpsellForAllCategoriesEnabled
     * @param shippingPrice
     * @param skyLineAdEnabled
     * @param shipMethod
     * @param displayArrivalDate
     * @param title
     * @param upsellable
     * @param arrivalDate
     */
    public UpsellFulfillmentOption(Boolean upsellable, ShippingPrice shippingPrice, String shipMethod, Integer arrivalDate, String displayArrivalDate, Boolean skyLineAdEnabled, Boolean displayUpsellForAllCategoriesEnabled, String title) {
        super();
        this.upsellable = upsellable;
        this.shippingPrice = shippingPrice;
        this.shipMethod = shipMethod;
        this.arrivalDate = arrivalDate;
        this.displayArrivalDate = displayArrivalDate;
        this.skyLineAdEnabled = skyLineAdEnabled;
        this.displayUpsellForAllCategoriesEnabled = displayUpsellForAllCategoriesEnabled;
        this.title = title;
    }

    @JsonProperty("upsellable")
    public Boolean getUpsellable() {
        return upsellable;
    }

    @JsonProperty("upsellable")
    public void setUpsellable(Boolean upsellable) {
        this.upsellable = upsellable;
    }

    @JsonProperty("shippingPrice")
    public ShippingPrice getShippingPrice() {
        return shippingPrice;
    }

    @JsonProperty("shippingPrice")
    public void setShippingPrice(ShippingPrice shippingPrice) {
        this.shippingPrice = shippingPrice;
    }

    @JsonProperty("shipMethod")
    public String getShipMethod() {
        return shipMethod;
    }

    @JsonProperty("shipMethod")
    public void setShipMethod(String shipMethod) {
        this.shipMethod = shipMethod;
    }

    @JsonProperty("arrivalDate")
    public Integer getArrivalDate() {
        return arrivalDate;
    }

    @JsonProperty("arrivalDate")
    public void setArrivalDate(Integer arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    @JsonProperty("displayArrivalDate")
    public String getDisplayArrivalDate() {
        return displayArrivalDate;
    }

    @JsonProperty("displayArrivalDate")
    public void setDisplayArrivalDate(String displayArrivalDate) {
        this.displayArrivalDate = displayArrivalDate;
    }

    @JsonProperty("skyLineAdEnabled")
    public Boolean getSkyLineAdEnabled() {
        return skyLineAdEnabled;
    }

    @JsonProperty("skyLineAdEnabled")
    public void setSkyLineAdEnabled(Boolean skyLineAdEnabled) {
        this.skyLineAdEnabled = skyLineAdEnabled;
    }

    @JsonProperty("displayUpsellForAllCategoriesEnabled")
    public Boolean getDisplayUpsellForAllCategoriesEnabled() {
        return displayUpsellForAllCategoriesEnabled;
    }

    @JsonProperty("displayUpsellForAllCategoriesEnabled")
    public void setDisplayUpsellForAllCategoriesEnabled(Boolean displayUpsellForAllCategoriesEnabled) {
        this.displayUpsellForAllCategoriesEnabled = displayUpsellForAllCategoriesEnabled;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
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
        return new ToStringBuilder(this).append("upsellable", upsellable).append("shippingPrice", shippingPrice).append("shipMethod", shipMethod).append("arrivalDate", arrivalDate).append("displayArrivalDate", displayArrivalDate).append("skyLineAdEnabled", skyLineAdEnabled).append("displayUpsellForAllCategoriesEnabled", displayUpsellForAllCategoriesEnabled).append("title", title).append("additionalProperties", additionalProperties).toString();
    }

}
