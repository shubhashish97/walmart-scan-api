
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
    "elapsed",
    "active",
    "threads",
    "futures",
    "delay",
    "orchestrate"
})
public class Total implements Serializable
{

    @JsonProperty("elapsed")
    private Integer elapsed;
    @JsonProperty("active")
    private Integer active;
    @JsonProperty("threads")
    private Integer threads;
    @JsonProperty("futures")
    private Integer futures;
    @JsonProperty("delay")
    private Integer delay;
    @JsonProperty("orchestrate")
    private Integer orchestrate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 7216965181527049599L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Total() {
    }

    /**
     * 
     * @param elapsed
     * @param delay
     * @param orchestrate
     * @param active
     * @param threads
     * @param futures
     */
    public Total(Integer elapsed, Integer active, Integer threads, Integer futures, Integer delay, Integer orchestrate) {
        super();
        this.elapsed = elapsed;
        this.active = active;
        this.threads = threads;
        this.futures = futures;
        this.delay = delay;
        this.orchestrate = orchestrate;
    }

    @JsonProperty("elapsed")
    public Integer getElapsed() {
        return elapsed;
    }

    @JsonProperty("elapsed")
    public void setElapsed(Integer elapsed) {
        this.elapsed = elapsed;
    }

    @JsonProperty("active")
    public Integer getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(Integer active) {
        this.active = active;
    }

    @JsonProperty("threads")
    public Integer getThreads() {
        return threads;
    }

    @JsonProperty("threads")
    public void setThreads(Integer threads) {
        this.threads = threads;
    }

    @JsonProperty("futures")
    public Integer getFutures() {
        return futures;
    }

    @JsonProperty("futures")
    public void setFutures(Integer futures) {
        this.futures = futures;
    }

    @JsonProperty("delay")
    public Integer getDelay() {
        return delay;
    }

    @JsonProperty("delay")
    public void setDelay(Integer delay) {
        this.delay = delay;
    }

    @JsonProperty("orchestrate")
    public Integer getOrchestrate() {
        return orchestrate;
    }

    @JsonProperty("orchestrate")
    public void setOrchestrate(Integer orchestrate) {
        this.orchestrate = orchestrate;
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
        return new ToStringBuilder(this).append("elapsed", elapsed).append("active", active).append("threads", threads).append("futures", futures).append("delay", delay).append("orchestrate", orchestrate).append("additionalProperties", additionalProperties).toString();
    }

}
