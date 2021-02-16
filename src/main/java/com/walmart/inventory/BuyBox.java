
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
    "primaryProductId",
    "primaryUsItemId",
    "products",
    "states",
    "verticalTheme",
    "verticalId",
    "athenaProductId",
    "athenaCategoryPathId",
    "athenaAvailabilityStatus",
    "athenaOfferType",
    "athenaUsItemId",
    "athenaPrimaryShelfId"
})
public class BuyBox implements Serializable
{

    @JsonProperty("primaryProductId")
    private String primaryProductId;
    @JsonProperty("primaryUsItemId")
    private String primaryUsItemId;
    @JsonProperty("products")
    private List<Product> products = null;
    @JsonProperty("states")
    private List<State> states = null;
    @JsonProperty("verticalTheme")
    private String verticalTheme;
    @JsonProperty("verticalId")
    private String verticalId;
    @JsonProperty("athenaProductId")
    private String athenaProductId;
    @JsonProperty("athenaCategoryPathId")
    private String athenaCategoryPathId;
    @JsonProperty("athenaAvailabilityStatus")
    private String athenaAvailabilityStatus;
    @JsonProperty("athenaOfferType")
    private String athenaOfferType;
    @JsonProperty("athenaUsItemId")
    private String athenaUsItemId;
    @JsonProperty("athenaPrimaryShelfId")
    private String athenaPrimaryShelfId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -4021355745627565285L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public BuyBox() {
    }

    /**
     * 
     * @param athenaAvailabilityStatus
     * @param athenaUsItemId
     * @param verticalId
     * @param primaryUsItemId
     * @param athenaOfferType
     * @param athenaPrimaryShelfId
     * @param athenaCategoryPathId
     * @param verticalTheme
     * @param athenaProductId
     * @param primaryProductId
     * @param products
     * @param states
     */
    public BuyBox(String primaryProductId, String primaryUsItemId, List<Product> products, List<State> states, String verticalTheme, String verticalId, String athenaProductId, String athenaCategoryPathId, String athenaAvailabilityStatus, String athenaOfferType, String athenaUsItemId, String athenaPrimaryShelfId) {
        super();
        this.primaryProductId = primaryProductId;
        this.primaryUsItemId = primaryUsItemId;
        this.products = products;
        this.states = states;
        this.verticalTheme = verticalTheme;
        this.verticalId = verticalId;
        this.athenaProductId = athenaProductId;
        this.athenaCategoryPathId = athenaCategoryPathId;
        this.athenaAvailabilityStatus = athenaAvailabilityStatus;
        this.athenaOfferType = athenaOfferType;
        this.athenaUsItemId = athenaUsItemId;
        this.athenaPrimaryShelfId = athenaPrimaryShelfId;
    }

    @JsonProperty("primaryProductId")
    public String getPrimaryProductId() {
        return primaryProductId;
    }

    @JsonProperty("primaryProductId")
    public void setPrimaryProductId(String primaryProductId) {
        this.primaryProductId = primaryProductId;
    }

    @JsonProperty("primaryUsItemId")
    public String getPrimaryUsItemId() {
        return primaryUsItemId;
    }

    @JsonProperty("primaryUsItemId")
    public void setPrimaryUsItemId(String primaryUsItemId) {
        this.primaryUsItemId = primaryUsItemId;
    }

    @JsonProperty("products")
    public List<Product> getProducts() {
        return products;
    }

    @JsonProperty("products")
    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @JsonProperty("states")
    public List<State> getStates() {
        return states;
    }

    @JsonProperty("states")
    public void setStates(List<State> states) {
        this.states = states;
    }

    @JsonProperty("verticalTheme")
    public String getVerticalTheme() {
        return verticalTheme;
    }

    @JsonProperty("verticalTheme")
    public void setVerticalTheme(String verticalTheme) {
        this.verticalTheme = verticalTheme;
    }

    @JsonProperty("verticalId")
    public String getVerticalId() {
        return verticalId;
    }

    @JsonProperty("verticalId")
    public void setVerticalId(String verticalId) {
        this.verticalId = verticalId;
    }

    @JsonProperty("athenaProductId")
    public String getAthenaProductId() {
        return athenaProductId;
    }

    @JsonProperty("athenaProductId")
    public void setAthenaProductId(String athenaProductId) {
        this.athenaProductId = athenaProductId;
    }

    @JsonProperty("athenaCategoryPathId")
    public String getAthenaCategoryPathId() {
        return athenaCategoryPathId;
    }

    @JsonProperty("athenaCategoryPathId")
    public void setAthenaCategoryPathId(String athenaCategoryPathId) {
        this.athenaCategoryPathId = athenaCategoryPathId;
    }

    @JsonProperty("athenaAvailabilityStatus")
    public String getAthenaAvailabilityStatus() {
        return athenaAvailabilityStatus;
    }

    @JsonProperty("athenaAvailabilityStatus")
    public void setAthenaAvailabilityStatus(String athenaAvailabilityStatus) {
        this.athenaAvailabilityStatus = athenaAvailabilityStatus;
    }

    @JsonProperty("athenaOfferType")
    public String getAthenaOfferType() {
        return athenaOfferType;
    }

    @JsonProperty("athenaOfferType")
    public void setAthenaOfferType(String athenaOfferType) {
        this.athenaOfferType = athenaOfferType;
    }

    @JsonProperty("athenaUsItemId")
    public String getAthenaUsItemId() {
        return athenaUsItemId;
    }

    @JsonProperty("athenaUsItemId")
    public void setAthenaUsItemId(String athenaUsItemId) {
        this.athenaUsItemId = athenaUsItemId;
    }

    @JsonProperty("athenaPrimaryShelfId")
    public String getAthenaPrimaryShelfId() {
        return athenaPrimaryShelfId;
    }

    @JsonProperty("athenaPrimaryShelfId")
    public void setAthenaPrimaryShelfId(String athenaPrimaryShelfId) {
        this.athenaPrimaryShelfId = athenaPrimaryShelfId;
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
        return new ToStringBuilder(this).append("primaryProductId", primaryProductId).append("primaryUsItemId", primaryUsItemId).append("products", products).append("states", states).append("verticalTheme", verticalTheme).append("verticalId", verticalId).append("athenaProductId", athenaProductId).append("athenaCategoryPathId", athenaCategoryPathId).append("athenaAvailabilityStatus", athenaAvailabilityStatus).append("athenaOfferType", athenaOfferType).append("athenaUsItemId", athenaUsItemId).append("athenaPrimaryShelfId", athenaPrimaryShelfId).append("additionalProperties", additionalProperties).toString();
    }

}
