
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
    "usStoreId",
    "preferred",
    "semStore",
    "lastPickupStore",
    "distance"
})
public class StoreFrontId implements Serializable
{

    @JsonProperty("usStoreId")
    private String usStoreId;
    @JsonProperty("preferred")
    private Boolean preferred;
    @JsonProperty("semStore")
    private Boolean semStore;
    @JsonProperty("lastPickupStore")
    private Boolean lastPickupStore;
    @JsonProperty("distance")
    private Double distance;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 4549973987893207559L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public StoreFrontId() {
    }

    /**
     * 
     * @param semStore
     * @param distance
     * @param usStoreId
     * @param preferred
     * @param lastPickupStore
     */
    public StoreFrontId(String usStoreId, Boolean preferred, Boolean semStore, Boolean lastPickupStore, Double distance) {
        super();
        this.usStoreId = usStoreId;
        this.preferred = preferred;
        this.semStore = semStore;
        this.lastPickupStore = lastPickupStore;
        this.distance = distance;
    }

    @JsonProperty("usStoreId")
    public String getUsStoreId() {
        return usStoreId;
    }

    @JsonProperty("usStoreId")
    public void setUsStoreId(String usStoreId) {
        this.usStoreId = usStoreId;
    }

    @JsonProperty("preferred")
    public Boolean getPreferred() {
        return preferred;
    }

    @JsonProperty("preferred")
    public void setPreferred(Boolean preferred) {
        this.preferred = preferred;
    }

    @JsonProperty("semStore")
    public Boolean getSemStore() {
        return semStore;
    }

    @JsonProperty("semStore")
    public void setSemStore(Boolean semStore) {
        this.semStore = semStore;
    }

    @JsonProperty("lastPickupStore")
    public Boolean getLastPickupStore() {
        return lastPickupStore;
    }

    @JsonProperty("lastPickupStore")
    public void setLastPickupStore(Boolean lastPickupStore) {
        this.lastPickupStore = lastPickupStore;
    }

    @JsonProperty("distance")
    public Double getDistance() {
        return distance;
    }

    @JsonProperty("distance")
    public void setDistance(Double distance) {
        this.distance = distance;
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
        return new ToStringBuilder(this).append("usStoreId", usStoreId).append("preferred", preferred).append("semStore", semStore).append("lastPickupStore", lastPickupStore).append("distance", distance).append("additionalProperties", additionalProperties).toString();
    }

}
