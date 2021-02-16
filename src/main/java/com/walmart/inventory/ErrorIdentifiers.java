
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
    "entry"
})
public class ErrorIdentifiers implements Serializable
{

    @JsonProperty("entry")
    private List<Entry> entry = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -7002150567879347386L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ErrorIdentifiers() {
    }

    /**
     * 
     * @param entry
     */
    public ErrorIdentifiers(List<Entry> entry) {
        super();
        this.entry = entry;
    }

    @JsonProperty("entry")
    public List<Entry> getEntry() {
        return entry;
    }

    @JsonProperty("entry")
    public void setEntry(List<Entry> entry) {
        this.entry = entry;
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
        return new ToStringBuilder(this).append("entry", entry).append("additionalProperties", additionalProperties).toString();
    }

}
