
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
    "movieAttributes"
})
public class MovieContent implements Serializable
{

    @JsonProperty("movieAttributes")
    private List<MovieAttribute> movieAttributes = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -6826929750525954385L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public MovieContent() {
    }

    /**
     * 
     * @param movieAttributes
     */
    public MovieContent(List<MovieAttribute> movieAttributes) {
        super();
        this.movieAttributes = movieAttributes;
    }

    @JsonProperty("movieAttributes")
    public List<MovieAttribute> getMovieAttributes() {
        return movieAttributes;
    }

    @JsonProperty("movieAttributes")
    public void setMovieAttributes(List<MovieAttribute> movieAttributes) {
        this.movieAttributes = movieAttributes;
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
        return new ToStringBuilder(this).append("movieAttributes", movieAttributes).append("additionalProperties", additionalProperties).toString();
    }

}
