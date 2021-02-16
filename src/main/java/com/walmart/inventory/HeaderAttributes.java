
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
    "tenant",
    "server",
    "context",
    "timing"
})
public class HeaderAttributes implements Serializable
{

    @JsonProperty("tenant")
    private Tenant tenant;
    @JsonProperty("server")
    private Server server;
    @JsonProperty("context")
    private Context context;
    @JsonProperty("timing")
    private Timing timing;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -8297919697868499788L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public HeaderAttributes() {
    }

    /**
     * 
     * @param server
     * @param timing
     * @param context
     * @param tenant
     */
    public HeaderAttributes(Tenant tenant, Server server, Context context, Timing timing) {
        super();
        this.tenant = tenant;
        this.server = server;
        this.context = context;
        this.timing = timing;
    }

    @JsonProperty("tenant")
    public Tenant getTenant() {
        return tenant;
    }

    @JsonProperty("tenant")
    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    @JsonProperty("server")
    public Server getServer() {
        return server;
    }

    @JsonProperty("server")
    public void setServer(Server server) {
        this.server = server;
    }

    @JsonProperty("context")
    public Context getContext() {
        return context;
    }

    @JsonProperty("context")
    public void setContext(Context context) {
        this.context = context;
    }

    @JsonProperty("timing")
    public Timing getTiming() {
        return timing;
    }

    @JsonProperty("timing")
    public void setTiming(Timing timing) {
        this.timing = timing;
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
        return new ToStringBuilder(this).append("tenant", tenant).append("server", server).append("context", context).append("timing", timing).append("additionalProperties", additionalProperties).toString();
    }

}
