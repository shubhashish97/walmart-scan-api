
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
    "urgentQuantity",
    "storeId",
    "storeName",
    "storeAddress",
    "storeStateOrProvinceCode",
    "storePostalCode",
    "availability",
    "pickupMethod",
    "storeCity",
    "distance",
    "productLocation",
    "inStoreStockStatus",
    "inStorePackagePrice",
    "tireInstallationService",
    "storeTimeZone",
    "storePhone"
})
public class PickupOption implements Serializable
{

    @JsonProperty("urgentQuantity")
    private Double urgentQuantity;
    @JsonProperty("storeId")
    private Integer storeId;
    @JsonProperty("storeName")
    private String storeName;
    @JsonProperty("storeAddress")
    private String storeAddress;
    @JsonProperty("storeStateOrProvinceCode")
    private String storeStateOrProvinceCode;
    @JsonProperty("storePostalCode")
    private String storePostalCode;
    @JsonProperty("availability")
    private String availability;
    @JsonProperty("pickupMethod")
    private String pickupMethod;
    @JsonProperty("storeCity")
    private String storeCity;
    @JsonProperty("distance")
    private Integer distance;
    @JsonProperty("productLocation")
    private ProductLocation productLocation;
    @JsonProperty("inStoreStockStatus")
    private String inStoreStockStatus;
    @JsonProperty("inStorePackagePrice")
    private InStorePackagePrice inStorePackagePrice;
    @JsonProperty("tireInstallationService")
    private TireInstallationService tireInstallationService;
    @JsonProperty("storeTimeZone")
    private String storeTimeZone;
    @JsonProperty("storePhone")
    private String storePhone;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 4740644069632108315L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PickupOption() {
    }

    /**
     * 
     * @param distance
     * @param pickupMethod
     * @param availability
     * @param productLocation
     * @param storeId
     * @param urgentQuantity
     * @param inStoreStockStatus
     * @param inStorePackagePrice
     * @param storeAddress
     * @param storePhone
     * @param tireInstallationService
     * @param storeTimeZone
     * @param storeName
     * @param storeCity
     * @param storeStateOrProvinceCode
     * @param storePostalCode
     */
    public PickupOption(Double urgentQuantity, Integer storeId, String storeName, String storeAddress, String storeStateOrProvinceCode, String storePostalCode, String availability, String pickupMethod, String storeCity, Integer distance, ProductLocation productLocation, String inStoreStockStatus, InStorePackagePrice inStorePackagePrice, TireInstallationService tireInstallationService, String storeTimeZone, String storePhone) {
        super();
        this.urgentQuantity = urgentQuantity;
        this.storeId = storeId;
        this.storeName = storeName;
        this.storeAddress = storeAddress;
        this.storeStateOrProvinceCode = storeStateOrProvinceCode;
        this.storePostalCode = storePostalCode;
        this.availability = availability;
        this.pickupMethod = pickupMethod;
        this.storeCity = storeCity;
        this.distance = distance;
        this.productLocation = productLocation;
        this.inStoreStockStatus = inStoreStockStatus;
        this.inStorePackagePrice = inStorePackagePrice;
        this.tireInstallationService = tireInstallationService;
        this.storeTimeZone = storeTimeZone;
        this.storePhone = storePhone;
    }

    @JsonProperty("urgentQuantity")
    public Double getUrgentQuantity() {
        return urgentQuantity;
    }

    @JsonProperty("urgentQuantity")
    public void setUrgentQuantity(Double urgentQuantity) {
        this.urgentQuantity = urgentQuantity;
    }

    @JsonProperty("storeId")
    public Integer getStoreId() {
        return storeId;
    }

    @JsonProperty("storeId")
    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    @JsonProperty("storeName")
    public String getStoreName() {
        return storeName;
    }

    @JsonProperty("storeName")
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    @JsonProperty("storeAddress")
    public String getStoreAddress() {
        return storeAddress;
    }

    @JsonProperty("storeAddress")
    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }

    @JsonProperty("storeStateOrProvinceCode")
    public String getStoreStateOrProvinceCode() {
        return storeStateOrProvinceCode;
    }

    @JsonProperty("storeStateOrProvinceCode")
    public void setStoreStateOrProvinceCode(String storeStateOrProvinceCode) {
        this.storeStateOrProvinceCode = storeStateOrProvinceCode;
    }

    @JsonProperty("storePostalCode")
    public String getStorePostalCode() {
        return storePostalCode;
    }

    @JsonProperty("storePostalCode")
    public void setStorePostalCode(String storePostalCode) {
        this.storePostalCode = storePostalCode;
    }

    @JsonProperty("availability")
    public String getAvailability() {
        return availability;
    }

    @JsonProperty("availability")
    public void setAvailability(String availability) {
        this.availability = availability;
    }

    @JsonProperty("pickupMethod")
    public String getPickupMethod() {
        return pickupMethod;
    }

    @JsonProperty("pickupMethod")
    public void setPickupMethod(String pickupMethod) {
        this.pickupMethod = pickupMethod;
    }

    @JsonProperty("storeCity")
    public String getStoreCity() {
        return storeCity;
    }

    @JsonProperty("storeCity")
    public void setStoreCity(String storeCity) {
        this.storeCity = storeCity;
    }

    @JsonProperty("distance")
    public Integer getDistance() {
        return distance;
    }

    @JsonProperty("distance")
    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    @JsonProperty("productLocation")
    public ProductLocation getProductLocation() {
        return productLocation;
    }

    @JsonProperty("productLocation")
    public void setProductLocation(ProductLocation productLocation) {
        this.productLocation = productLocation;
    }

    @JsonProperty("inStoreStockStatus")
    public String getInStoreStockStatus() {
        return inStoreStockStatus;
    }

    @JsonProperty("inStoreStockStatus")
    public void setInStoreStockStatus(String inStoreStockStatus) {
        this.inStoreStockStatus = inStoreStockStatus;
    }

    @JsonProperty("inStorePackagePrice")
    public InStorePackagePrice getInStorePackagePrice() {
        return inStorePackagePrice;
    }

    @JsonProperty("inStorePackagePrice")
    public void setInStorePackagePrice(InStorePackagePrice inStorePackagePrice) {
        this.inStorePackagePrice = inStorePackagePrice;
    }

    @JsonProperty("tireInstallationService")
    public TireInstallationService getTireInstallationService() {
        return tireInstallationService;
    }

    @JsonProperty("tireInstallationService")
    public void setTireInstallationService(TireInstallationService tireInstallationService) {
        this.tireInstallationService = tireInstallationService;
    }

    @JsonProperty("storeTimeZone")
    public String getStoreTimeZone() {
        return storeTimeZone;
    }

    @JsonProperty("storeTimeZone")
    public void setStoreTimeZone(String storeTimeZone) {
        this.storeTimeZone = storeTimeZone;
    }

    @JsonProperty("storePhone")
    public String getStorePhone() {
        return storePhone;
    }

    @JsonProperty("storePhone")
    public void setStorePhone(String storePhone) {
        this.storePhone = storePhone;
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
        return new ToStringBuilder(this).append("urgentQuantity", urgentQuantity).append("storeId", storeId).append("storeName", storeName).append("storeAddress", storeAddress).append("storeStateOrProvinceCode", storeStateOrProvinceCode).append("storePostalCode", storePostalCode).append("availability", availability).append("pickupMethod", pickupMethod).append("storeCity", storeCity).append("distance", distance).append("productLocation", productLocation).append("inStoreStockStatus", inStoreStockStatus).append("inStorePackagePrice", inStorePackagePrice).append("tireInstallationService", tireInstallationService).append("storeTimeZone", storeTimeZone).append("storePhone", storePhone).append("additionalProperties", additionalProperties).toString();
    }

}
