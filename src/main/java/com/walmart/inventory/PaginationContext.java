
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
    "selected"
})
public class PaginationContext implements Serializable
{

    @JsonProperty("selected")
    private String selected;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -219914438298562860L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PaginationContext() {
    }

    /**
     * 
     * @param selected
     */
    public PaginationContext(String selected) {
        super();
        this.selected = selected;
    }

    @JsonProperty("selected")
    public String getSelected() {
        return selected;
    }

    @JsonProperty("selected")
    public void setSelected(String selected) {
        this.selected = selected;
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
        return new ToStringBuilder(this).append("selected", selected).append("additionalProperties", additionalProperties).toString();
    }

}
