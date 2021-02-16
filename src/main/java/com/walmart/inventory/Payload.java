
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
    "products",
    "offers",
    "idmlMap",
    "buyBox"
})
public class Payload implements Serializable
{

    @JsonProperty("products")
    private Products products;
    @JsonProperty("offers")
    private Offers offers;
    @JsonProperty("idmlMap")
    private IdmlMap idmlMap;
    @JsonProperty("buyBox")
    private BuyBox buyBox;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 6567138219737605837L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Payload() {
    }

    /**
     * 
     * @param offers
     * @param buyBox
     * @param idmlMap
     * @param products
     */
    public Payload(Products products, Offers offers, IdmlMap idmlMap, BuyBox buyBox) {
        super();
        this.products = products;
        this.offers = offers;
        this.idmlMap = idmlMap;
        this.buyBox = buyBox;
    }

    @JsonProperty("products")
    public Products getProducts() {
        return products;
    }

    @JsonProperty("products")
    public void setProducts(Products products) {
        this.products = products;
    }

    @JsonProperty("offers")
    public Offers getOffers() {
        return offers;
    }

    @JsonProperty("offers")
    public void setOffers(Offers offers) {
        this.offers = offers;
    }

    @JsonProperty("idmlMap")
    public IdmlMap getIdmlMap() {
        return idmlMap;
    }

    @JsonProperty("idmlMap")
    public void setIdmlMap(IdmlMap idmlMap) {
        this.idmlMap = idmlMap;
    }

    @JsonProperty("buyBox")
    public BuyBox getBuyBox() {
        return buyBox;
    }

    @JsonProperty("buyBox")
    public void setBuyBox(BuyBox buyBox) {
        this.buyBox = buyBox;
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
        return new ToStringBuilder(this).append("products", products).append("offers", offers).append("idmlMap", idmlMap).append("buyBox", buyBox).append("additionalProperties", additionalProperties).toString();
    }

}
