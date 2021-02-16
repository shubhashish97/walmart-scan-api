
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
    "code",
    "field",
    "description",
    "info",
    "severity",
    "category",
    "errorIdentifiers"
})
public class Error implements Serializable
{

    @JsonProperty("code")
    private String code;
    @JsonProperty("field")
    private String field;
    @JsonProperty("description")
    private String description;
    @JsonProperty("info")
    private String info;
    @JsonProperty("severity")
    private String severity;
    @JsonProperty("category")
    private String category;
    @JsonProperty("errorIdentifiers")
    private ErrorIdentifiers errorIdentifiers;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 2756543830654755304L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Error() {
    }

    /**
     * 
     * @param severity
     * @param code
     * @param field
     * @param errorIdentifiers
     * @param description
     * @param category
     * @param info
     */
    public Error(String code, String field, String description, String info, String severity, String category, ErrorIdentifiers errorIdentifiers) {
        super();
        this.code = code;
        this.field = field;
        this.description = description;
        this.info = info;
        this.severity = severity;
        this.category = category;
        this.errorIdentifiers = errorIdentifiers;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("field")
    public String getField() {
        return field;
    }

    @JsonProperty("field")
    public void setField(String field) {
        this.field = field;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("info")
    public String getInfo() {
        return info;
    }

    @JsonProperty("info")
    public void setInfo(String info) {
        this.info = info;
    }

    @JsonProperty("severity")
    public String getSeverity() {
        return severity;
    }

    @JsonProperty("severity")
    public void setSeverity(String severity) {
        this.severity = severity;
    }

    @JsonProperty("category")
    public String getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(String category) {
        this.category = category;
    }

    @JsonProperty("errorIdentifiers")
    public ErrorIdentifiers getErrorIdentifiers() {
        return errorIdentifiers;
    }

    @JsonProperty("errorIdentifiers")
    public void setErrorIdentifiers(ErrorIdentifiers errorIdentifiers) {
        this.errorIdentifiers = errorIdentifiers;
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
        return new ToStringBuilder(this).append("code", code).append("field", field).append("description", description).append("info", info).append("severity", severity).append("category", category).append("errorIdentifiers", errorIdentifiers).append("additionalProperties", additionalProperties).toString();
    }

}
