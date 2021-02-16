
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
    "accOnlineScheduling",
    "phone"
})
public class TireInstallationService implements Serializable
{

    @JsonProperty("accOnlineScheduling")
    private Boolean accOnlineScheduling;
    @JsonProperty("phone")
    private String phone;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 8864703804967454876L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TireInstallationService() {
    }

    /**
     * 
     * @param phone
     * @param accOnlineScheduling
     */
    public TireInstallationService(Boolean accOnlineScheduling, String phone) {
        super();
        this.accOnlineScheduling = accOnlineScheduling;
        this.phone = phone;
    }

    @JsonProperty("accOnlineScheduling")
    public Boolean getAccOnlineScheduling() {
        return accOnlineScheduling;
    }

    @JsonProperty("accOnlineScheduling")
    public void setAccOnlineScheduling(Boolean accOnlineScheduling) {
        this.accOnlineScheduling = accOnlineScheduling;
    }

    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
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
        return new ToStringBuilder(this).append("accOnlineScheduling", accOnlineScheduling).append("phone", phone).append("additionalProperties", additionalProperties).toString();
    }

}
