
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
    "action",
    "product"
})
public class State implements Serializable
{

    @JsonProperty("action")
    private String action;
    @JsonProperty("product")
    private Integer product;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -8504325624609254595L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public State() {
    }

    /**
     * 
     * @param product
     * @param action
     */
    public State(String action, Integer product) {
        super();
        this.action = action;
        this.product = product;
    }

    @JsonProperty("action")
    public String getAction() {
        return action;
    }

    @JsonProperty("action")
    public void setAction(String action) {
        this.action = action;
    }

    @JsonProperty("product")
    public Integer getProduct() {
        return product;
    }

    @JsonProperty("product")
    public void setProduct(Integer product) {
        this.product = product;
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
        return new ToStringBuilder(this).append("action", action).append("product", product).append("additionalProperties", additionalProperties).toString();
    }

}
