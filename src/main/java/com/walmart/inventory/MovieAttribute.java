
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
    "movieAttributeType",
    "movieAttributeValue"
})
public class MovieAttribute implements Serializable
{

    @JsonProperty("movieAttributeType")
    private String movieAttributeType;
    @JsonProperty("movieAttributeValue")
    private String movieAttributeValue;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -7477139196981236964L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public MovieAttribute() {
    }

    /**
     * 
     * @param movieAttributeValue
     * @param movieAttributeType
     */
    public MovieAttribute(String movieAttributeType, String movieAttributeValue) {
        super();
        this.movieAttributeType = movieAttributeType;
        this.movieAttributeValue = movieAttributeValue;
    }

    @JsonProperty("movieAttributeType")
    public String getMovieAttributeType() {
        return movieAttributeType;
    }

    @JsonProperty("movieAttributeType")
    public void setMovieAttributeType(String movieAttributeType) {
        this.movieAttributeType = movieAttributeType;
    }

    @JsonProperty("movieAttributeValue")
    public String getMovieAttributeValue() {
        return movieAttributeValue;
    }

    @JsonProperty("movieAttributeValue")
    public void setMovieAttributeValue(String movieAttributeValue) {
        this.movieAttributeValue = movieAttributeValue;
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
        return new ToStringBuilder(this).append("movieAttributeType", movieAttributeType).append("movieAttributeValue", movieAttributeValue).append("additionalProperties", additionalProperties).toString();
    }

}
