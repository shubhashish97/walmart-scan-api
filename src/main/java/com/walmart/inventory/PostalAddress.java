
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
    "postalCode",
    "zipLocated",
    "stateOrProvinceCode",
    "countryCode",
    "addressType"
})
public class PostalAddress implements Serializable
{

    @JsonProperty("postalCode")
    private String postalCode;
    @JsonProperty("zipLocated")
    private Boolean zipLocated;
    @JsonProperty("stateOrProvinceCode")
    private String stateOrProvinceCode;
    @JsonProperty("countryCode")
    private String countryCode;
    @JsonProperty("addressType")
    private String addressType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -8256454369011170607L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PostalAddress() {
    }

    /**
     * 
     * @param countryCode
     * @param addressType
     * @param postalCode
     * @param zipLocated
     * @param stateOrProvinceCode
     */
    public PostalAddress(String postalCode, Boolean zipLocated, String stateOrProvinceCode, String countryCode, String addressType) {
        super();
        this.postalCode = postalCode;
        this.zipLocated = zipLocated;
        this.stateOrProvinceCode = stateOrProvinceCode;
        this.countryCode = countryCode;
        this.addressType = addressType;
    }

    @JsonProperty("postalCode")
    public String getPostalCode() {
        return postalCode;
    }

    @JsonProperty("postalCode")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @JsonProperty("zipLocated")
    public Boolean getZipLocated() {
        return zipLocated;
    }

    @JsonProperty("zipLocated")
    public void setZipLocated(Boolean zipLocated) {
        this.zipLocated = zipLocated;
    }

    @JsonProperty("stateOrProvinceCode")
    public String getStateOrProvinceCode() {
        return stateOrProvinceCode;
    }

    @JsonProperty("stateOrProvinceCode")
    public void setStateOrProvinceCode(String stateOrProvinceCode) {
        this.stateOrProvinceCode = stateOrProvinceCode;
    }

    @JsonProperty("countryCode")
    public String getCountryCode() {
        return countryCode;
    }

    @JsonProperty("countryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @JsonProperty("addressType")
    public String getAddressType() {
        return addressType;
    }

    @JsonProperty("addressType")
    public void setAddressType(String addressType) {
        this.addressType = addressType;
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
        return new ToStringBuilder(this).append("postalCode", postalCode).append("zipLocated", zipLocated).append("stateOrProvinceCode", stateOrProvinceCode).append("countryCode", countryCode).append("addressType", addressType).append("additionalProperties", additionalProperties).toString();
    }

}
