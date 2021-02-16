
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
    "sha",
    "ver",
    "name",
    "dc",
    "env"
})
public class Server implements Serializable
{

    @JsonProperty("sha")
    private String sha;
    @JsonProperty("ver")
    private String ver;
    @JsonProperty("name")
    private String name;
    @JsonProperty("dc")
    private String dc;
    @JsonProperty("env")
    private String env;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 6898407191059687114L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Server() {
    }

    /**
     * 
     * @param ver
     * @param name
     * @param env
     * @param sha
     * @param dc
     */
    public Server(String sha, String ver, String name, String dc, String env) {
        super();
        this.sha = sha;
        this.ver = ver;
        this.name = name;
        this.dc = dc;
        this.env = env;
    }

    @JsonProperty("sha")
    public String getSha() {
        return sha;
    }

    @JsonProperty("sha")
    public void setSha(String sha) {
        this.sha = sha;
    }

    @JsonProperty("ver")
    public String getVer() {
        return ver;
    }

    @JsonProperty("ver")
    public void setVer(String ver) {
        this.ver = ver;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("dc")
    public String getDc() {
        return dc;
    }

    @JsonProperty("dc")
    public void setDc(String dc) {
        this.dc = dc;
    }

    @JsonProperty("env")
    public String getEnv() {
        return env;
    }

    @JsonProperty("env")
    public void setEnv(String env) {
        this.env = env;
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
        return new ToStringBuilder(this).append("sha", sha).append("ver", ver).append("name", name).append("dc", dc).append("env", env).append("additionalProperties", additionalProperties).toString();
    }

}
