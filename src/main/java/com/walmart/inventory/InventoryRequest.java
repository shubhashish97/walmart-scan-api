
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
    "itemId",
    "paginationContext",
    "postalAddress",
    "storeFrontIds"
})
public class InventoryRequest implements Serializable
{

    @JsonProperty("itemId")
    private String itemId;
    @JsonProperty("paginationContext")
    private PaginationContext paginationContext;
    @JsonProperty("postalAddress")
    private PostalAddress postalAddress;
    @JsonProperty("storeFrontIds")
    private List<StoreFrontId> storeFrontIds = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -3908939031559455360L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public InventoryRequest() {
    }

    /**
     * 
     * @param itemId
     * @param postalAddress
     * @param paginationContext
     * @param storeFrontIds
     */
    public InventoryRequest(String itemId, PaginationContext paginationContext, PostalAddress postalAddress, List<StoreFrontId> storeFrontIds) {
        super();
        this.itemId = itemId;
        this.paginationContext = paginationContext;
        this.postalAddress = postalAddress;
        this.storeFrontIds = storeFrontIds;
    }

    @JsonProperty("itemId")
    public String getItemId() {
        return itemId;
    }

    @JsonProperty("itemId")
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    @JsonProperty("paginationContext")
    public PaginationContext getPaginationContext() {
        return paginationContext;
    }

    @JsonProperty("paginationContext")
    public void setPaginationContext(PaginationContext paginationContext) {
        this.paginationContext = paginationContext;
    }

    @JsonProperty("postalAddress")
    public PostalAddress getPostalAddress() {
        return postalAddress;
    }

    @JsonProperty("postalAddress")
    public void setPostalAddress(PostalAddress postalAddress) {
        this.postalAddress = postalAddress;
    }

    @JsonProperty("storeFrontIds")
    public List<StoreFrontId> getStoreFrontIds() {
        return storeFrontIds;
    }

    @JsonProperty("storeFrontIds")
    public void setStoreFrontIds(List<StoreFrontId> storeFrontIds) {
        this.storeFrontIds = storeFrontIds;
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
        return new ToStringBuilder(this).append("itemId", itemId).append("paginationContext", paginationContext).append("postalAddress", postalAddress).append("storeFrontIds", storeFrontIds).append("additionalProperties", additionalProperties).toString();
    }

}
