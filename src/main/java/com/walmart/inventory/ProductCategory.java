
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
    "categoryPath",
    "categoryPathId",
    "path"
})
public class ProductCategory implements Serializable
{

    @JsonProperty("categoryPath")
    private String categoryPath;
    @JsonProperty("categoryPathId")
    private String categoryPathId;
    @JsonProperty("path")
    private List<Path> path = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 6087803869096088459L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ProductCategory() {
    }

    /**
     * 
     * @param path
     * @param categoryPath
     * @param categoryPathId
     */
    public ProductCategory(String categoryPath, String categoryPathId, List<Path> path) {
        super();
        this.categoryPath = categoryPath;
        this.categoryPathId = categoryPathId;
        this.path = path;
    }

    @JsonProperty("categoryPath")
    public String getCategoryPath() {
        return categoryPath;
    }

    @JsonProperty("categoryPath")
    public void setCategoryPath(String categoryPath) {
        this.categoryPath = categoryPath;
    }

    @JsonProperty("categoryPathId")
    public String getCategoryPathId() {
        return categoryPathId;
    }

    @JsonProperty("categoryPathId")
    public void setCategoryPathId(String categoryPathId) {
        this.categoryPathId = categoryPathId;
    }

    @JsonProperty("path")
    public List<Path> getPath() {
        return path;
    }

    @JsonProperty("path")
    public void setPath(List<Path> path) {
        this.path = path;
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
        return new ToStringBuilder(this).append("categoryPath", categoryPath).append("categoryPathId", categoryPathId).append("path", path).append("additionalProperties", additionalProperties).toString();
    }

}
