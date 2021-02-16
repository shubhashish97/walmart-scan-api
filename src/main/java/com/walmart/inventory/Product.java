
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
    "offerCount",
    "transactableOfferCount",
    "productId",
    "usItemId",
    "upc",
    "fetched",
    "productSegment",
    "productType",
    "productTypeId",
    "images",
    "productName",
    "shortDescription",
    "detailedDescription",
    "manufacturerProductId",
    "manufacturerName",
    "classType",
    "classId",
    "productCategory",
    "productClassification",
    "legalContent",
    "movieContent",
    "walmartItemNumber",
    "brand",
    "brandUrl",
    "rhPath",
    "canonicalUrl",
    "averageRating",
    "numberOfReviews",
    "primaryShelfId",
    "ironbankCategory",
    "sku",
    "model",
    "karfMaximumOrderQuantity",
    "merchandiseCommerceNumber",
    "pricePerUnitUom",
    "pricePerUnitQuantity",
    "primaryShelf",
    "karfMaximumQuantityFactor",
    "karfIsAlcohol",
    "karfSalesUnit",
    "karfPrimaryShelfId",
    "karfPrimaryShelfTitle",
    "karfPrimaryAisleId",
    "karfPrimaryAisleTitle",
    "karfPrimaryDepartmentId",
    "karfPrimaryDepartmentTitle",
    "hazardousMaterialsIndicator",
    "controlledSubstance",
    "cpscRegulatedIndicator",
    "pesticideIndicator",
    "chemicalIndicator",
    "fuelRestrictionIndicator",
    "color",
    "aerosolIndicator",
    "hasMercury",
    "temperatureSensitive",
    "varietyPack",
    "multipackIndicator",
    "batteriesIncluded",
    "hasStateRestrictions",
    "alcohol",
    "priceDisplayCodes",
    "priceMap",
    "shippingOptions",
    "pickupOptions",
    "freeShippingThresholdPrice",
    "highlightedPickupOption",
    "upsellShippingOptionIndex",
    "highlightedShippingOption",
    "shippable",
    "pickupable",
    "pickupAvailable",
    "offerId",
    "personalizationData",
    "status",
    "upsellFulfillmentOption",
    "shipAsIs",
    "shippingTier",
    "offerPUTEligible",
    "internationalShippingEligible",
    "sourcePickupDiscountEligible",
    "mustShipAlone",
    "hazardMaterial",
    "ormd",
    "storePickable",
    "airShippable",
    "geoItemClassification",
    "availabilityStatus",
    "sellerId",
    "catalogSellerId",
    "sellerName",
    "sellerDisplayName",
    "sellerType",
    "offerType",
    "globalTaxCode",
    "sellerOfferId",
    "purchaseOption",
    "conditionType",
    "associateDiscountableInd",
    "orderLimit",
    "orderMinLimit",
    "homeServiceEligible",
    "specifications",
    "productHighlights",
    "idmlLongDescription",
    "idmlShortDescription"
})
public class Product implements Serializable
{

    @JsonProperty("offerCount")
    private Integer offerCount;
    @JsonProperty("transactableOfferCount")
    private Integer transactableOfferCount;
    @JsonProperty("productId")
    private String productId;
    @JsonProperty("usItemId")
    private String usItemId;
    @JsonProperty("upc")
    private String upc;
    @JsonProperty("fetched")
    private Boolean fetched;
    @JsonProperty("productSegment")
    private String productSegment;
    @JsonProperty("productType")
    private String productType;
    @JsonProperty("productTypeId")
    private String productTypeId;
    @JsonProperty("images")
    private List<Image> images = null;
    @JsonProperty("productName")
    private String productName;
    @JsonProperty("shortDescription")
    private String shortDescription;
    @JsonProperty("detailedDescription")
    private String detailedDescription;
    @JsonProperty("manufacturerProductId")
    private String manufacturerProductId;
    @JsonProperty("manufacturerName")
    private String manufacturerName;
    @JsonProperty("classType")
    private String classType;
    @JsonProperty("classId")
    private String classId;
    @JsonProperty("productCategory")
    private ProductCategory productCategory;
    @JsonProperty("productClassification")
    private ProductClassification productClassification;
    @JsonProperty("legalContent")
    private LegalContent legalContent;
    @JsonProperty("movieContent")
    private MovieContent movieContent;
    @JsonProperty("walmartItemNumber")
    private String walmartItemNumber;
    @JsonProperty("brand")
    private String brand;
    @JsonProperty("brandUrl")
    private String brandUrl;
    @JsonProperty("rhPath")
    private String rhPath;
    @JsonProperty("canonicalUrl")
    private String canonicalUrl;
    @JsonProperty("averageRating")
    private Double averageRating;
    @JsonProperty("numberOfReviews")
    private Integer numberOfReviews;
    @JsonProperty("primaryShelfId")
    private String primaryShelfId;
    @JsonProperty("ironbankCategory")
    private String ironbankCategory;
    @JsonProperty("sku")
    private String sku;
    @JsonProperty("model")
    private String model;
    @JsonProperty("karfMaximumOrderQuantity")
    private String karfMaximumOrderQuantity;
    @JsonProperty("merchandiseCommerceNumber")
    private String merchandiseCommerceNumber;
    @JsonProperty("pricePerUnitUom")
    private String pricePerUnitUom;
    @JsonProperty("pricePerUnitQuantity")
    private String pricePerUnitQuantity;
    @JsonProperty("primaryShelf")
    private String primaryShelf;
    @JsonProperty("karfMaximumQuantityFactor")
    private String karfMaximumQuantityFactor;
    @JsonProperty("karfIsAlcohol")
    private String karfIsAlcohol;
    @JsonProperty("karfSalesUnit")
    private String karfSalesUnit;
    @JsonProperty("karfPrimaryShelfId")
    private String karfPrimaryShelfId;
    @JsonProperty("karfPrimaryShelfTitle")
    private String karfPrimaryShelfTitle;
    @JsonProperty("karfPrimaryAisleId")
    private String karfPrimaryAisleId;
    @JsonProperty("karfPrimaryAisleTitle")
    private String karfPrimaryAisleTitle;
    @JsonProperty("karfPrimaryDepartmentId")
    private String karfPrimaryDepartmentId;
    @JsonProperty("karfPrimaryDepartmentTitle")
    private String karfPrimaryDepartmentTitle;
    @JsonProperty("hazardousMaterialsIndicator")
    private String hazardousMaterialsIndicator;
    @JsonProperty("controlledSubstance")
    private Boolean controlledSubstance;
    @JsonProperty("cpscRegulatedIndicator")
    private String cpscRegulatedIndicator;
    @JsonProperty("pesticideIndicator")
    private String pesticideIndicator;
    @JsonProperty("chemicalIndicator")
    private String chemicalIndicator;
    @JsonProperty("fuelRestrictionIndicator")
    private String fuelRestrictionIndicator;
    @JsonProperty("color")
    private String color;
    @JsonProperty("aerosolIndicator")
    private String aerosolIndicator;
    @JsonProperty("hasMercury")
    private String hasMercury;
    @JsonProperty("temperatureSensitive")
    private Boolean temperatureSensitive;
    @JsonProperty("varietyPack")
    private Boolean varietyPack;
    @JsonProperty("multipackIndicator")
    private String multipackIndicator;
    @JsonProperty("batteriesIncluded")
    private String batteriesIncluded;
    @JsonProperty("hasStateRestrictions")
    private String hasStateRestrictions;
    @JsonProperty("alcohol")
    private Boolean alcohol;
    @JsonProperty("priceDisplayCodes")
    private PriceDisplayCodes priceDisplayCodes;
    @JsonProperty("priceMap")
    private PriceMap priceMap;
    @JsonProperty("shippingOptions")
    private List<ShippingOption> shippingOptions = null;
    @JsonProperty("pickupOptions")
    private List<PickupOption> pickupOptions = null;
    @JsonProperty("freeShippingThresholdPrice")
    private FreeShippingThresholdPrice freeShippingThresholdPrice;
    @JsonProperty("highlightedPickupOption")
    private Integer highlightedPickupOption;
    @JsonProperty("upsellShippingOptionIndex")
    private Integer upsellShippingOptionIndex;
    @JsonProperty("highlightedShippingOption")
    private HighlightedShippingOption highlightedShippingOption;
    @JsonProperty("shippable")
    private Boolean shippable;
    @JsonProperty("pickupable")
    private Boolean pickupable;
    @JsonProperty("pickupAvailable")
    private Boolean pickupAvailable;
    @JsonProperty("offerId")
    private String offerId;
    @JsonProperty("personalizationData")
    private PersonalizationData personalizationData;
    @JsonProperty("status")
    private String status;
    @JsonProperty("upsellFulfillmentOption")
    private UpsellFulfillmentOption upsellFulfillmentOption;
    @JsonProperty("shipAsIs")
    private Boolean shipAsIs;
    @JsonProperty("shippingTier")
    private String shippingTier;
    @JsonProperty("offerPUTEligible")
    private Boolean offerPUTEligible;
    @JsonProperty("internationalShippingEligible")
    private Boolean internationalShippingEligible;
    @JsonProperty("sourcePickupDiscountEligible")
    private Boolean sourcePickupDiscountEligible;
    @JsonProperty("mustShipAlone")
    private Boolean mustShipAlone;
    @JsonProperty("hazardMaterial")
    private Boolean hazardMaterial;
    @JsonProperty("ormd")
    private Boolean ormd;
    @JsonProperty("storePickable")
    private Boolean storePickable;
    @JsonProperty("airShippable")
    private Boolean airShippable;
    @JsonProperty("geoItemClassification")
    private String geoItemClassification;
    @JsonProperty("availabilityStatus")
    private String availabilityStatus;
    @JsonProperty("sellerId")
    private String sellerId;
    @JsonProperty("catalogSellerId")
    private String catalogSellerId;
    @JsonProperty("sellerName")
    private String sellerName;
    @JsonProperty("sellerDisplayName")
    private String sellerDisplayName;
    @JsonProperty("sellerType")
    private String sellerType;
    @JsonProperty("offerType")
    private String offerType;
    @JsonProperty("globalTaxCode")
    private String globalTaxCode;
    @JsonProperty("sellerOfferId")
    private String sellerOfferId;
    @JsonProperty("purchaseOption")
    private String purchaseOption;
    @JsonProperty("conditionType")
    private String conditionType;
    @JsonProperty("associateDiscountableInd")
    private Boolean associateDiscountableInd;
    @JsonProperty("orderLimit")
    private Integer orderLimit;
    @JsonProperty("orderMinLimit")
    private Integer orderMinLimit;
    @JsonProperty("homeServiceEligible")
    private Boolean homeServiceEligible;
    @JsonProperty("specifications")
    private List<Specification> specifications = null;
    @JsonProperty("productHighlights")
    private List<ProductHighlight> productHighlights = null;
    @JsonProperty("idmlLongDescription")
    private String idmlLongDescription;
    @JsonProperty("idmlShortDescription")
    private String idmlShortDescription;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 8479133205382364763L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Product() {
    }

    /**
     * 
     * @param karfPrimaryShelfTitle
     * @param offerCount
     * @param orderMinLimit
     * @param numberOfReviews
     * @param karfPrimaryAisleId
     * @param orderLimit
     * @param upsellShippingOptionIndex
     * @param offerPUTEligible
     * @param productName
     * @param karfPrimaryDepartmentTitle
     * @param shippable
     * @param brandUrl
     * @param legalContent
     * @param chemicalIndicator
     * @param model
     * @param karfPrimaryShelfId
     * @param rhPath
     * @param sku
     * @param brand
     * @param aerosolIndicator
     * @param shippingOptions
     * @param alcohol
     * @param images
     * @param productId
     * @param varietyPack
     * @param upc
     * @param multipackIndicator
     * @param priceDisplayCodes
     * @param sellerDisplayName
     * @param freeShippingThresholdPrice
     * @param walmartItemNumber
     * @param offerId
     * @param conditionType
     * @param status
     * @param idmlShortDescription
     * @param karfMaximumOrderQuantity
     * @param transactableOfferCount
     * @param sellerName
     * @param offerType
     * @param classId
     * @param temperatureSensitive
     * @param movieContent
     * @param averageRating
     * @param pickupable
     * @param pickupOptions
     * @param karfSalesUnit
     * @param karfPrimaryDepartmentId
     * @param hasStateRestrictions
     * @param hazardMaterial
     * @param karfMaximumQuantityFactor
     * @param shipAsIs
     * @param fetched
     * @param catalogSellerId
     * @param batteriesIncluded
     * @param airShippable
     * @param manufacturerName
     * @param priceMap
     * @param homeServiceEligible
     * @param ironbankCategory
     * @param mustShipAlone
     * @param specifications
     * @param ormd
     * @param sellerOfferId
     * @param pickupAvailable
     * @param sellerId
     * @param hazardousMaterialsIndicator
     * @param highlightedShippingOption
     * @param shortDescription
     * @param fuelRestrictionIndicator
     * @param sourcePickupDiscountEligible
     * @param pesticideIndicator
     * @param primaryShelf
     * @param purchaseOption
     * @param detailedDescription
     * @param pricePerUnitQuantity
     * @param internationalShippingEligible
     * @param usItemId
     * @param primaryShelfId
     * @param sellerType
     * @param globalTaxCode
     * @param cpscRegulatedIndicator
     * @param classType
     * @param color
     * @param controlledSubstance
     * @param merchandiseCommerceNumber
     * @param productCategory
     * @param productHighlights
     * @param productClassification
     * @param manufacturerProductId
     * @param karfPrimaryAisleTitle
     * @param karfIsAlcohol
     * @param availabilityStatus
     * @param productType
     * @param highlightedPickupOption
     * @param associateDiscountableInd
     * @param hasMercury
     * @param canonicalUrl
     * @param idmlLongDescription
     * @param geoItemClassification
     * @param productSegment
     * @param productTypeId
     * @param upsellFulfillmentOption
     * @param shippingTier
     * @param pricePerUnitUom
     * @param storePickable
     * @param personalizationData
     */
    public Product(Integer offerCount, Integer transactableOfferCount, String productId, String usItemId, String upc, Boolean fetched, String productSegment, String productType, String productTypeId, List<Image> images, String productName, String shortDescription, String detailedDescription, String manufacturerProductId, String manufacturerName, String classType, String classId, ProductCategory productCategory, ProductClassification productClassification, LegalContent legalContent, MovieContent movieContent, String walmartItemNumber, String brand, String brandUrl, String rhPath, String canonicalUrl, Double averageRating, Integer numberOfReviews, String primaryShelfId, String ironbankCategory, String sku, String model, String karfMaximumOrderQuantity, String merchandiseCommerceNumber, String pricePerUnitUom, String pricePerUnitQuantity, String primaryShelf, String karfMaximumQuantityFactor, String karfIsAlcohol, String karfSalesUnit, String karfPrimaryShelfId, String karfPrimaryShelfTitle, String karfPrimaryAisleId, String karfPrimaryAisleTitle, String karfPrimaryDepartmentId, String karfPrimaryDepartmentTitle, String hazardousMaterialsIndicator, Boolean controlledSubstance, String cpscRegulatedIndicator, String pesticideIndicator, String chemicalIndicator, String fuelRestrictionIndicator, String color, String aerosolIndicator, String hasMercury, Boolean temperatureSensitive, Boolean varietyPack, String multipackIndicator, String batteriesIncluded, String hasStateRestrictions, Boolean alcohol, PriceDisplayCodes priceDisplayCodes, PriceMap priceMap, List<ShippingOption> shippingOptions, List<PickupOption> pickupOptions, FreeShippingThresholdPrice freeShippingThresholdPrice, Integer highlightedPickupOption, Integer upsellShippingOptionIndex, HighlightedShippingOption highlightedShippingOption, Boolean shippable, Boolean pickupable, Boolean pickupAvailable, String offerId, PersonalizationData personalizationData, String status, UpsellFulfillmentOption upsellFulfillmentOption, Boolean shipAsIs, String shippingTier, Boolean offerPUTEligible, Boolean internationalShippingEligible, Boolean sourcePickupDiscountEligible, Boolean mustShipAlone, Boolean hazardMaterial, Boolean ormd, Boolean storePickable, Boolean airShippable, String geoItemClassification, String availabilityStatus, String sellerId, String catalogSellerId, String sellerName, String sellerDisplayName, String sellerType, String offerType, String globalTaxCode, String sellerOfferId, String purchaseOption, String conditionType, Boolean associateDiscountableInd, Integer orderLimit, Integer orderMinLimit, Boolean homeServiceEligible, List<Specification> specifications, List<ProductHighlight> productHighlights, String idmlLongDescription, String idmlShortDescription) {
        super();
        this.offerCount = offerCount;
        this.transactableOfferCount = transactableOfferCount;
        this.productId = productId;
        this.usItemId = usItemId;
        this.upc = upc;
        this.fetched = fetched;
        this.productSegment = productSegment;
        this.productType = productType;
        this.productTypeId = productTypeId;
        this.images = images;
        this.productName = productName;
        this.shortDescription = shortDescription;
        this.detailedDescription = detailedDescription;
        this.manufacturerProductId = manufacturerProductId;
        this.manufacturerName = manufacturerName;
        this.classType = classType;
        this.classId = classId;
        this.productCategory = productCategory;
        this.productClassification = productClassification;
        this.legalContent = legalContent;
        this.movieContent = movieContent;
        this.walmartItemNumber = walmartItemNumber;
        this.brand = brand;
        this.brandUrl = brandUrl;
        this.rhPath = rhPath;
        this.canonicalUrl = canonicalUrl;
        this.averageRating = averageRating;
        this.numberOfReviews = numberOfReviews;
        this.primaryShelfId = primaryShelfId;
        this.ironbankCategory = ironbankCategory;
        this.sku = sku;
        this.model = model;
        this.karfMaximumOrderQuantity = karfMaximumOrderQuantity;
        this.merchandiseCommerceNumber = merchandiseCommerceNumber;
        this.pricePerUnitUom = pricePerUnitUom;
        this.pricePerUnitQuantity = pricePerUnitQuantity;
        this.primaryShelf = primaryShelf;
        this.karfMaximumQuantityFactor = karfMaximumQuantityFactor;
        this.karfIsAlcohol = karfIsAlcohol;
        this.karfSalesUnit = karfSalesUnit;
        this.karfPrimaryShelfId = karfPrimaryShelfId;
        this.karfPrimaryShelfTitle = karfPrimaryShelfTitle;
        this.karfPrimaryAisleId = karfPrimaryAisleId;
        this.karfPrimaryAisleTitle = karfPrimaryAisleTitle;
        this.karfPrimaryDepartmentId = karfPrimaryDepartmentId;
        this.karfPrimaryDepartmentTitle = karfPrimaryDepartmentTitle;
        this.hazardousMaterialsIndicator = hazardousMaterialsIndicator;
        this.controlledSubstance = controlledSubstance;
        this.cpscRegulatedIndicator = cpscRegulatedIndicator;
        this.pesticideIndicator = pesticideIndicator;
        this.chemicalIndicator = chemicalIndicator;
        this.fuelRestrictionIndicator = fuelRestrictionIndicator;
        this.color = color;
        this.aerosolIndicator = aerosolIndicator;
        this.hasMercury = hasMercury;
        this.temperatureSensitive = temperatureSensitive;
        this.varietyPack = varietyPack;
        this.multipackIndicator = multipackIndicator;
        this.batteriesIncluded = batteriesIncluded;
        this.hasStateRestrictions = hasStateRestrictions;
        this.alcohol = alcohol;
        this.priceDisplayCodes = priceDisplayCodes;
        this.priceMap = priceMap;
        this.shippingOptions = shippingOptions;
        this.pickupOptions = pickupOptions;
        this.freeShippingThresholdPrice = freeShippingThresholdPrice;
        this.highlightedPickupOption = highlightedPickupOption;
        this.upsellShippingOptionIndex = upsellShippingOptionIndex;
        this.highlightedShippingOption = highlightedShippingOption;
        this.shippable = shippable;
        this.pickupable = pickupable;
        this.pickupAvailable = pickupAvailable;
        this.offerId = offerId;
        this.personalizationData = personalizationData;
        this.status = status;
        this.upsellFulfillmentOption = upsellFulfillmentOption;
        this.shipAsIs = shipAsIs;
        this.shippingTier = shippingTier;
        this.offerPUTEligible = offerPUTEligible;
        this.internationalShippingEligible = internationalShippingEligible;
        this.sourcePickupDiscountEligible = sourcePickupDiscountEligible;
        this.mustShipAlone = mustShipAlone;
        this.hazardMaterial = hazardMaterial;
        this.ormd = ormd;
        this.storePickable = storePickable;
        this.airShippable = airShippable;
        this.geoItemClassification = geoItemClassification;
        this.availabilityStatus = availabilityStatus;
        this.sellerId = sellerId;
        this.catalogSellerId = catalogSellerId;
        this.sellerName = sellerName;
        this.sellerDisplayName = sellerDisplayName;
        this.sellerType = sellerType;
        this.offerType = offerType;
        this.globalTaxCode = globalTaxCode;
        this.sellerOfferId = sellerOfferId;
        this.purchaseOption = purchaseOption;
        this.conditionType = conditionType;
        this.associateDiscountableInd = associateDiscountableInd;
        this.orderLimit = orderLimit;
        this.orderMinLimit = orderMinLimit;
        this.homeServiceEligible = homeServiceEligible;
        this.specifications = specifications;
        this.productHighlights = productHighlights;
        this.idmlLongDescription = idmlLongDescription;
        this.idmlShortDescription = idmlShortDescription;
    }

    @JsonProperty("offerCount")
    public Integer getOfferCount() {
        return offerCount;
    }

    @JsonProperty("offerCount")
    public void setOfferCount(Integer offerCount) {
        this.offerCount = offerCount;
    }

    @JsonProperty("transactableOfferCount")
    public Integer getTransactableOfferCount() {
        return transactableOfferCount;
    }

    @JsonProperty("transactableOfferCount")
    public void setTransactableOfferCount(Integer transactableOfferCount) {
        this.transactableOfferCount = transactableOfferCount;
    }

    @JsonProperty("productId")
    public String getProductId() {
        return productId;
    }

    @JsonProperty("productId")
    public void setProductId(String productId) {
        this.productId = productId;
    }

    @JsonProperty("usItemId")
    public String getUsItemId() {
        return usItemId;
    }

    @JsonProperty("usItemId")
    public void setUsItemId(String usItemId) {
        this.usItemId = usItemId;
    }

    @JsonProperty("upc")
    public String getUpc() {
        return upc;
    }

    @JsonProperty("upc")
    public void setUpc(String upc) {
        this.upc = upc;
    }

    @JsonProperty("fetched")
    public Boolean getFetched() {
        return fetched;
    }

    @JsonProperty("fetched")
    public void setFetched(Boolean fetched) {
        this.fetched = fetched;
    }

    @JsonProperty("productSegment")
    public String getProductSegment() {
        return productSegment;
    }

    @JsonProperty("productSegment")
    public void setProductSegment(String productSegment) {
        this.productSegment = productSegment;
    }

    @JsonProperty("productType")
    public String getProductType() {
        return productType;
    }

    @JsonProperty("productType")
    public void setProductType(String productType) {
        this.productType = productType;
    }

    @JsonProperty("productTypeId")
    public String getProductTypeId() {
        return productTypeId;
    }

    @JsonProperty("productTypeId")
    public void setProductTypeId(String productTypeId) {
        this.productTypeId = productTypeId;
    }

    @JsonProperty("images")
    public List<Image> getImages() {
        return images;
    }

    @JsonProperty("images")
    public void setImages(List<Image> images) {
        this.images = images;
    }

    @JsonProperty("productName")
    public String getProductName() {
        return productName;
    }

    @JsonProperty("productName")
    public void setProductName(String productName) {
        this.productName = productName;
    }

    @JsonProperty("shortDescription")
    public String getShortDescription() {
        return shortDescription;
    }

    @JsonProperty("shortDescription")
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    @JsonProperty("detailedDescription")
    public String getDetailedDescription() {
        return detailedDescription;
    }

    @JsonProperty("detailedDescription")
    public void setDetailedDescription(String detailedDescription) {
        this.detailedDescription = detailedDescription;
    }

    @JsonProperty("manufacturerProductId")
    public String getManufacturerProductId() {
        return manufacturerProductId;
    }

    @JsonProperty("manufacturerProductId")
    public void setManufacturerProductId(String manufacturerProductId) {
        this.manufacturerProductId = manufacturerProductId;
    }

    @JsonProperty("manufacturerName")
    public String getManufacturerName() {
        return manufacturerName;
    }

    @JsonProperty("manufacturerName")
    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    @JsonProperty("classType")
    public String getClassType() {
        return classType;
    }

    @JsonProperty("classType")
    public void setClassType(String classType) {
        this.classType = classType;
    }

    @JsonProperty("classId")
    public String getClassId() {
        return classId;
    }

    @JsonProperty("classId")
    public void setClassId(String classId) {
        this.classId = classId;
    }

    @JsonProperty("productCategory")
    public ProductCategory getProductCategory() {
        return productCategory;
    }

    @JsonProperty("productCategory")
    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    @JsonProperty("productClassification")
    public ProductClassification getProductClassification() {
        return productClassification;
    }

    @JsonProperty("productClassification")
    public void setProductClassification(ProductClassification productClassification) {
        this.productClassification = productClassification;
    }

    @JsonProperty("legalContent")
    public LegalContent getLegalContent() {
        return legalContent;
    }

    @JsonProperty("legalContent")
    public void setLegalContent(LegalContent legalContent) {
        this.legalContent = legalContent;
    }

    @JsonProperty("movieContent")
    public MovieContent getMovieContent() {
        return movieContent;
    }

    @JsonProperty("movieContent")
    public void setMovieContent(MovieContent movieContent) {
        this.movieContent = movieContent;
    }

    @JsonProperty("walmartItemNumber")
    public String getWalmartItemNumber() {
        return walmartItemNumber;
    }

    @JsonProperty("walmartItemNumber")
    public void setWalmartItemNumber(String walmartItemNumber) {
        this.walmartItemNumber = walmartItemNumber;
    }

    @JsonProperty("brand")
    public String getBrand() {
        return brand;
    }

    @JsonProperty("brand")
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @JsonProperty("brandUrl")
    public String getBrandUrl() {
        return brandUrl;
    }

    @JsonProperty("brandUrl")
    public void setBrandUrl(String brandUrl) {
        this.brandUrl = brandUrl;
    }

    @JsonProperty("rhPath")
    public String getRhPath() {
        return rhPath;
    }

    @JsonProperty("rhPath")
    public void setRhPath(String rhPath) {
        this.rhPath = rhPath;
    }

    @JsonProperty("canonicalUrl")
    public String getCanonicalUrl() {
        return canonicalUrl;
    }

    @JsonProperty("canonicalUrl")
    public void setCanonicalUrl(String canonicalUrl) {
        this.canonicalUrl = canonicalUrl;
    }

    @JsonProperty("averageRating")
    public Double getAverageRating() {
        return averageRating;
    }

    @JsonProperty("averageRating")
    public void setAverageRating(Double averageRating) {
        this.averageRating = averageRating;
    }

    @JsonProperty("numberOfReviews")
    public Integer getNumberOfReviews() {
        return numberOfReviews;
    }

    @JsonProperty("numberOfReviews")
    public void setNumberOfReviews(Integer numberOfReviews) {
        this.numberOfReviews = numberOfReviews;
    }

    @JsonProperty("primaryShelfId")
    public String getPrimaryShelfId() {
        return primaryShelfId;
    }

    @JsonProperty("primaryShelfId")
    public void setPrimaryShelfId(String primaryShelfId) {
        this.primaryShelfId = primaryShelfId;
    }

    @JsonProperty("ironbankCategory")
    public String getIronbankCategory() {
        return ironbankCategory;
    }

    @JsonProperty("ironbankCategory")
    public void setIronbankCategory(String ironbankCategory) {
        this.ironbankCategory = ironbankCategory;
    }

    @JsonProperty("sku")
    public String getSku() {
        return sku;
    }

    @JsonProperty("sku")
    public void setSku(String sku) {
        this.sku = sku;
    }

    @JsonProperty("model")
    public String getModel() {
        return model;
    }

    @JsonProperty("model")
    public void setModel(String model) {
        this.model = model;
    }

    @JsonProperty("karfMaximumOrderQuantity")
    public String getKarfMaximumOrderQuantity() {
        return karfMaximumOrderQuantity;
    }

    @JsonProperty("karfMaximumOrderQuantity")
    public void setKarfMaximumOrderQuantity(String karfMaximumOrderQuantity) {
        this.karfMaximumOrderQuantity = karfMaximumOrderQuantity;
    }

    @JsonProperty("merchandiseCommerceNumber")
    public String getMerchandiseCommerceNumber() {
        return merchandiseCommerceNumber;
    }

    @JsonProperty("merchandiseCommerceNumber")
    public void setMerchandiseCommerceNumber(String merchandiseCommerceNumber) {
        this.merchandiseCommerceNumber = merchandiseCommerceNumber;
    }

    @JsonProperty("pricePerUnitUom")
    public String getPricePerUnitUom() {
        return pricePerUnitUom;
    }

    @JsonProperty("pricePerUnitUom")
    public void setPricePerUnitUom(String pricePerUnitUom) {
        this.pricePerUnitUom = pricePerUnitUom;
    }

    @JsonProperty("pricePerUnitQuantity")
    public String getPricePerUnitQuantity() {
        return pricePerUnitQuantity;
    }

    @JsonProperty("pricePerUnitQuantity")
    public void setPricePerUnitQuantity(String pricePerUnitQuantity) {
        this.pricePerUnitQuantity = pricePerUnitQuantity;
    }

    @JsonProperty("primaryShelf")
    public String getPrimaryShelf() {
        return primaryShelf;
    }

    @JsonProperty("primaryShelf")
    public void setPrimaryShelf(String primaryShelf) {
        this.primaryShelf = primaryShelf;
    }

    @JsonProperty("karfMaximumQuantityFactor")
    public String getKarfMaximumQuantityFactor() {
        return karfMaximumQuantityFactor;
    }

    @JsonProperty("karfMaximumQuantityFactor")
    public void setKarfMaximumQuantityFactor(String karfMaximumQuantityFactor) {
        this.karfMaximumQuantityFactor = karfMaximumQuantityFactor;
    }

    @JsonProperty("karfIsAlcohol")
    public String getKarfIsAlcohol() {
        return karfIsAlcohol;
    }

    @JsonProperty("karfIsAlcohol")
    public void setKarfIsAlcohol(String karfIsAlcohol) {
        this.karfIsAlcohol = karfIsAlcohol;
    }

    @JsonProperty("karfSalesUnit")
    public String getKarfSalesUnit() {
        return karfSalesUnit;
    }

    @JsonProperty("karfSalesUnit")
    public void setKarfSalesUnit(String karfSalesUnit) {
        this.karfSalesUnit = karfSalesUnit;
    }

    @JsonProperty("karfPrimaryShelfId")
    public String getKarfPrimaryShelfId() {
        return karfPrimaryShelfId;
    }

    @JsonProperty("karfPrimaryShelfId")
    public void setKarfPrimaryShelfId(String karfPrimaryShelfId) {
        this.karfPrimaryShelfId = karfPrimaryShelfId;
    }

    @JsonProperty("karfPrimaryShelfTitle")
    public String getKarfPrimaryShelfTitle() {
        return karfPrimaryShelfTitle;
    }

    @JsonProperty("karfPrimaryShelfTitle")
    public void setKarfPrimaryShelfTitle(String karfPrimaryShelfTitle) {
        this.karfPrimaryShelfTitle = karfPrimaryShelfTitle;
    }

    @JsonProperty("karfPrimaryAisleId")
    public String getKarfPrimaryAisleId() {
        return karfPrimaryAisleId;
    }

    @JsonProperty("karfPrimaryAisleId")
    public void setKarfPrimaryAisleId(String karfPrimaryAisleId) {
        this.karfPrimaryAisleId = karfPrimaryAisleId;
    }

    @JsonProperty("karfPrimaryAisleTitle")
    public String getKarfPrimaryAisleTitle() {
        return karfPrimaryAisleTitle;
    }

    @JsonProperty("karfPrimaryAisleTitle")
    public void setKarfPrimaryAisleTitle(String karfPrimaryAisleTitle) {
        this.karfPrimaryAisleTitle = karfPrimaryAisleTitle;
    }

    @JsonProperty("karfPrimaryDepartmentId")
    public String getKarfPrimaryDepartmentId() {
        return karfPrimaryDepartmentId;
    }

    @JsonProperty("karfPrimaryDepartmentId")
    public void setKarfPrimaryDepartmentId(String karfPrimaryDepartmentId) {
        this.karfPrimaryDepartmentId = karfPrimaryDepartmentId;
    }

    @JsonProperty("karfPrimaryDepartmentTitle")
    public String getKarfPrimaryDepartmentTitle() {
        return karfPrimaryDepartmentTitle;
    }

    @JsonProperty("karfPrimaryDepartmentTitle")
    public void setKarfPrimaryDepartmentTitle(String karfPrimaryDepartmentTitle) {
        this.karfPrimaryDepartmentTitle = karfPrimaryDepartmentTitle;
    }

    @JsonProperty("hazardousMaterialsIndicator")
    public String getHazardousMaterialsIndicator() {
        return hazardousMaterialsIndicator;
    }

    @JsonProperty("hazardousMaterialsIndicator")
    public void setHazardousMaterialsIndicator(String hazardousMaterialsIndicator) {
        this.hazardousMaterialsIndicator = hazardousMaterialsIndicator;
    }

    @JsonProperty("controlledSubstance")
    public Boolean getControlledSubstance() {
        return controlledSubstance;
    }

    @JsonProperty("controlledSubstance")
    public void setControlledSubstance(Boolean controlledSubstance) {
        this.controlledSubstance = controlledSubstance;
    }

    @JsonProperty("cpscRegulatedIndicator")
    public String getCpscRegulatedIndicator() {
        return cpscRegulatedIndicator;
    }

    @JsonProperty("cpscRegulatedIndicator")
    public void setCpscRegulatedIndicator(String cpscRegulatedIndicator) {
        this.cpscRegulatedIndicator = cpscRegulatedIndicator;
    }

    @JsonProperty("pesticideIndicator")
    public String getPesticideIndicator() {
        return pesticideIndicator;
    }

    @JsonProperty("pesticideIndicator")
    public void setPesticideIndicator(String pesticideIndicator) {
        this.pesticideIndicator = pesticideIndicator;
    }

    @JsonProperty("chemicalIndicator")
    public String getChemicalIndicator() {
        return chemicalIndicator;
    }

    @JsonProperty("chemicalIndicator")
    public void setChemicalIndicator(String chemicalIndicator) {
        this.chemicalIndicator = chemicalIndicator;
    }

    @JsonProperty("fuelRestrictionIndicator")
    public String getFuelRestrictionIndicator() {
        return fuelRestrictionIndicator;
    }

    @JsonProperty("fuelRestrictionIndicator")
    public void setFuelRestrictionIndicator(String fuelRestrictionIndicator) {
        this.fuelRestrictionIndicator = fuelRestrictionIndicator;
    }

    @JsonProperty("color")
    public String getColor() {
        return color;
    }

    @JsonProperty("color")
    public void setColor(String color) {
        this.color = color;
    }

    @JsonProperty("aerosolIndicator")
    public String getAerosolIndicator() {
        return aerosolIndicator;
    }

    @JsonProperty("aerosolIndicator")
    public void setAerosolIndicator(String aerosolIndicator) {
        this.aerosolIndicator = aerosolIndicator;
    }

    @JsonProperty("hasMercury")
    public String getHasMercury() {
        return hasMercury;
    }

    @JsonProperty("hasMercury")
    public void setHasMercury(String hasMercury) {
        this.hasMercury = hasMercury;
    }

    @JsonProperty("temperatureSensitive")
    public Boolean getTemperatureSensitive() {
        return temperatureSensitive;
    }

    @JsonProperty("temperatureSensitive")
    public void setTemperatureSensitive(Boolean temperatureSensitive) {
        this.temperatureSensitive = temperatureSensitive;
    }

    @JsonProperty("varietyPack")
    public Boolean getVarietyPack() {
        return varietyPack;
    }

    @JsonProperty("varietyPack")
    public void setVarietyPack(Boolean varietyPack) {
        this.varietyPack = varietyPack;
    }

    @JsonProperty("multipackIndicator")
    public String getMultipackIndicator() {
        return multipackIndicator;
    }

    @JsonProperty("multipackIndicator")
    public void setMultipackIndicator(String multipackIndicator) {
        this.multipackIndicator = multipackIndicator;
    }

    @JsonProperty("batteriesIncluded")
    public String getBatteriesIncluded() {
        return batteriesIncluded;
    }

    @JsonProperty("batteriesIncluded")
    public void setBatteriesIncluded(String batteriesIncluded) {
        this.batteriesIncluded = batteriesIncluded;
    }

    @JsonProperty("hasStateRestrictions")
    public String getHasStateRestrictions() {
        return hasStateRestrictions;
    }

    @JsonProperty("hasStateRestrictions")
    public void setHasStateRestrictions(String hasStateRestrictions) {
        this.hasStateRestrictions = hasStateRestrictions;
    }

    @JsonProperty("alcohol")
    public Boolean getAlcohol() {
        return alcohol;
    }

    @JsonProperty("alcohol")
    public void setAlcohol(Boolean alcohol) {
        this.alcohol = alcohol;
    }

    @JsonProperty("priceDisplayCodes")
    public PriceDisplayCodes getPriceDisplayCodes() {
        return priceDisplayCodes;
    }

    @JsonProperty("priceDisplayCodes")
    public void setPriceDisplayCodes(PriceDisplayCodes priceDisplayCodes) {
        this.priceDisplayCodes = priceDisplayCodes;
    }

    @JsonProperty("priceMap")
    public PriceMap getPriceMap() {
        return priceMap;
    }

    @JsonProperty("priceMap")
    public void setPriceMap(PriceMap priceMap) {
        this.priceMap = priceMap;
    }

    @JsonProperty("shippingOptions")
    public List<ShippingOption> getShippingOptions() {
        return shippingOptions;
    }

    @JsonProperty("shippingOptions")
    public void setShippingOptions(List<ShippingOption> shippingOptions) {
        this.shippingOptions = shippingOptions;
    }

    @JsonProperty("pickupOptions")
    public List<PickupOption> getPickupOptions() {
        return pickupOptions;
    }

    @JsonProperty("pickupOptions")
    public void setPickupOptions(List<PickupOption> pickupOptions) {
        this.pickupOptions = pickupOptions;
    }

    @JsonProperty("freeShippingThresholdPrice")
    public FreeShippingThresholdPrice getFreeShippingThresholdPrice() {
        return freeShippingThresholdPrice;
    }

    @JsonProperty("freeShippingThresholdPrice")
    public void setFreeShippingThresholdPrice(FreeShippingThresholdPrice freeShippingThresholdPrice) {
        this.freeShippingThresholdPrice = freeShippingThresholdPrice;
    }

    @JsonProperty("highlightedPickupOption")
    public Integer getHighlightedPickupOption() {
        return highlightedPickupOption;
    }

    @JsonProperty("highlightedPickupOption")
    public void setHighlightedPickupOption(Integer highlightedPickupOption) {
        this.highlightedPickupOption = highlightedPickupOption;
    }

    @JsonProperty("upsellShippingOptionIndex")
    public Integer getUpsellShippingOptionIndex() {
        return upsellShippingOptionIndex;
    }

    @JsonProperty("upsellShippingOptionIndex")
    public void setUpsellShippingOptionIndex(Integer upsellShippingOptionIndex) {
        this.upsellShippingOptionIndex = upsellShippingOptionIndex;
    }

    @JsonProperty("highlightedShippingOption")
    public HighlightedShippingOption getHighlightedShippingOption() {
        return highlightedShippingOption;
    }

    @JsonProperty("highlightedShippingOption")
    public void setHighlightedShippingOption(HighlightedShippingOption highlightedShippingOption) {
        this.highlightedShippingOption = highlightedShippingOption;
    }

    @JsonProperty("shippable")
    public Boolean getShippable() {
        return shippable;
    }

    @JsonProperty("shippable")
    public void setShippable(Boolean shippable) {
        this.shippable = shippable;
    }

    @JsonProperty("pickupable")
    public Boolean getPickupable() {
        return pickupable;
    }

    @JsonProperty("pickupable")
    public void setPickupable(Boolean pickupable) {
        this.pickupable = pickupable;
    }

    @JsonProperty("pickupAvailable")
    public Boolean getPickupAvailable() {
        return pickupAvailable;
    }

    @JsonProperty("pickupAvailable")
    public void setPickupAvailable(Boolean pickupAvailable) {
        this.pickupAvailable = pickupAvailable;
    }

    @JsonProperty("offerId")
    public String getOfferId() {
        return offerId;
    }

    @JsonProperty("offerId")
    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    @JsonProperty("personalizationData")
    public PersonalizationData getPersonalizationData() {
        return personalizationData;
    }

    @JsonProperty("personalizationData")
    public void setPersonalizationData(PersonalizationData personalizationData) {
        this.personalizationData = personalizationData;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("upsellFulfillmentOption")
    public UpsellFulfillmentOption getUpsellFulfillmentOption() {
        return upsellFulfillmentOption;
    }

    @JsonProperty("upsellFulfillmentOption")
    public void setUpsellFulfillmentOption(UpsellFulfillmentOption upsellFulfillmentOption) {
        this.upsellFulfillmentOption = upsellFulfillmentOption;
    }

    @JsonProperty("shipAsIs")
    public Boolean getShipAsIs() {
        return shipAsIs;
    }

    @JsonProperty("shipAsIs")
    public void setShipAsIs(Boolean shipAsIs) {
        this.shipAsIs = shipAsIs;
    }

    @JsonProperty("shippingTier")
    public String getShippingTier() {
        return shippingTier;
    }

    @JsonProperty("shippingTier")
    public void setShippingTier(String shippingTier) {
        this.shippingTier = shippingTier;
    }

    @JsonProperty("offerPUTEligible")
    public Boolean getOfferPUTEligible() {
        return offerPUTEligible;
    }

    @JsonProperty("offerPUTEligible")
    public void setOfferPUTEligible(Boolean offerPUTEligible) {
        this.offerPUTEligible = offerPUTEligible;
    }

    @JsonProperty("internationalShippingEligible")
    public Boolean getInternationalShippingEligible() {
        return internationalShippingEligible;
    }

    @JsonProperty("internationalShippingEligible")
    public void setInternationalShippingEligible(Boolean internationalShippingEligible) {
        this.internationalShippingEligible = internationalShippingEligible;
    }

    @JsonProperty("sourcePickupDiscountEligible")
    public Boolean getSourcePickupDiscountEligible() {
        return sourcePickupDiscountEligible;
    }

    @JsonProperty("sourcePickupDiscountEligible")
    public void setSourcePickupDiscountEligible(Boolean sourcePickupDiscountEligible) {
        this.sourcePickupDiscountEligible = sourcePickupDiscountEligible;
    }

    @JsonProperty("mustShipAlone")
    public Boolean getMustShipAlone() {
        return mustShipAlone;
    }

    @JsonProperty("mustShipAlone")
    public void setMustShipAlone(Boolean mustShipAlone) {
        this.mustShipAlone = mustShipAlone;
    }

    @JsonProperty("hazardMaterial")
    public Boolean getHazardMaterial() {
        return hazardMaterial;
    }

    @JsonProperty("hazardMaterial")
    public void setHazardMaterial(Boolean hazardMaterial) {
        this.hazardMaterial = hazardMaterial;
    }

    @JsonProperty("ormd")
    public Boolean getOrmd() {
        return ormd;
    }

    @JsonProperty("ormd")
    public void setOrmd(Boolean ormd) {
        this.ormd = ormd;
    }

    @JsonProperty("storePickable")
    public Boolean getStorePickable() {
        return storePickable;
    }

    @JsonProperty("storePickable")
    public void setStorePickable(Boolean storePickable) {
        this.storePickable = storePickable;
    }

    @JsonProperty("airShippable")
    public Boolean getAirShippable() {
        return airShippable;
    }

    @JsonProperty("airShippable")
    public void setAirShippable(Boolean airShippable) {
        this.airShippable = airShippable;
    }

    @JsonProperty("geoItemClassification")
    public String getGeoItemClassification() {
        return geoItemClassification;
    }

    @JsonProperty("geoItemClassification")
    public void setGeoItemClassification(String geoItemClassification) {
        this.geoItemClassification = geoItemClassification;
    }

    @JsonProperty("availabilityStatus")
    public String getAvailabilityStatus() {
        return availabilityStatus;
    }

    @JsonProperty("availabilityStatus")
    public void setAvailabilityStatus(String availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    @JsonProperty("sellerId")
    public String getSellerId() {
        return sellerId;
    }

    @JsonProperty("sellerId")
    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    @JsonProperty("catalogSellerId")
    public String getCatalogSellerId() {
        return catalogSellerId;
    }

    @JsonProperty("catalogSellerId")
    public void setCatalogSellerId(String catalogSellerId) {
        this.catalogSellerId = catalogSellerId;
    }

    @JsonProperty("sellerName")
    public String getSellerName() {
        return sellerName;
    }

    @JsonProperty("sellerName")
    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    @JsonProperty("sellerDisplayName")
    public String getSellerDisplayName() {
        return sellerDisplayName;
    }

    @JsonProperty("sellerDisplayName")
    public void setSellerDisplayName(String sellerDisplayName) {
        this.sellerDisplayName = sellerDisplayName;
    }

    @JsonProperty("sellerType")
    public String getSellerType() {
        return sellerType;
    }

    @JsonProperty("sellerType")
    public void setSellerType(String sellerType) {
        this.sellerType = sellerType;
    }

    @JsonProperty("offerType")
    public String getOfferType() {
        return offerType;
    }

    @JsonProperty("offerType")
    public void setOfferType(String offerType) {
        this.offerType = offerType;
    }

    @JsonProperty("globalTaxCode")
    public String getGlobalTaxCode() {
        return globalTaxCode;
    }

    @JsonProperty("globalTaxCode")
    public void setGlobalTaxCode(String globalTaxCode) {
        this.globalTaxCode = globalTaxCode;
    }

    @JsonProperty("sellerOfferId")
    public String getSellerOfferId() {
        return sellerOfferId;
    }

    @JsonProperty("sellerOfferId")
    public void setSellerOfferId(String sellerOfferId) {
        this.sellerOfferId = sellerOfferId;
    }

    @JsonProperty("purchaseOption")
    public String getPurchaseOption() {
        return purchaseOption;
    }

    @JsonProperty("purchaseOption")
    public void setPurchaseOption(String purchaseOption) {
        this.purchaseOption = purchaseOption;
    }

    @JsonProperty("conditionType")
    public String getConditionType() {
        return conditionType;
    }

    @JsonProperty("conditionType")
    public void setConditionType(String conditionType) {
        this.conditionType = conditionType;
    }

    @JsonProperty("associateDiscountableInd")
    public Boolean getAssociateDiscountableInd() {
        return associateDiscountableInd;
    }

    @JsonProperty("associateDiscountableInd")
    public void setAssociateDiscountableInd(Boolean associateDiscountableInd) {
        this.associateDiscountableInd = associateDiscountableInd;
    }

    @JsonProperty("orderLimit")
    public Integer getOrderLimit() {
        return orderLimit;
    }

    @JsonProperty("orderLimit")
    public void setOrderLimit(Integer orderLimit) {
        this.orderLimit = orderLimit;
    }

    @JsonProperty("orderMinLimit")
    public Integer getOrderMinLimit() {
        return orderMinLimit;
    }

    @JsonProperty("orderMinLimit")
    public void setOrderMinLimit(Integer orderMinLimit) {
        this.orderMinLimit = orderMinLimit;
    }

    @JsonProperty("homeServiceEligible")
    public Boolean getHomeServiceEligible() {
        return homeServiceEligible;
    }

    @JsonProperty("homeServiceEligible")
    public void setHomeServiceEligible(Boolean homeServiceEligible) {
        this.homeServiceEligible = homeServiceEligible;
    }

    @JsonProperty("specifications")
    public List<Specification> getSpecifications() {
        return specifications;
    }

    @JsonProperty("specifications")
    public void setSpecifications(List<Specification> specifications) {
        this.specifications = specifications;
    }

    @JsonProperty("productHighlights")
    public List<ProductHighlight> getProductHighlights() {
        return productHighlights;
    }

    @JsonProperty("productHighlights")
    public void setProductHighlights(List<ProductHighlight> productHighlights) {
        this.productHighlights = productHighlights;
    }

    @JsonProperty("idmlLongDescription")
    public String getIdmlLongDescription() {
        return idmlLongDescription;
    }

    @JsonProperty("idmlLongDescription")
    public void setIdmlLongDescription(String idmlLongDescription) {
        this.idmlLongDescription = idmlLongDescription;
    }

    @JsonProperty("idmlShortDescription")
    public String getIdmlShortDescription() {
        return idmlShortDescription;
    }

    @JsonProperty("idmlShortDescription")
    public void setIdmlShortDescription(String idmlShortDescription) {
        this.idmlShortDescription = idmlShortDescription;
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
        return new ToStringBuilder(this).append("offerCount", offerCount).append("transactableOfferCount", transactableOfferCount).append("productId", productId).append("usItemId", usItemId).append("upc", upc).append("fetched", fetched).append("productSegment", productSegment).append("productType", productType).append("productTypeId", productTypeId).append("images", images).append("productName", productName).append("shortDescription", shortDescription).append("detailedDescription", detailedDescription).append("manufacturerProductId", manufacturerProductId).append("manufacturerName", manufacturerName).append("classType", classType).append("classId", classId).append("productCategory", productCategory).append("productClassification", productClassification).append("legalContent", legalContent).append("movieContent", movieContent).append("walmartItemNumber", walmartItemNumber).append("brand", brand).append("brandUrl", brandUrl).append("rhPath", rhPath).append("canonicalUrl", canonicalUrl).append("averageRating", averageRating).append("numberOfReviews", numberOfReviews).append("primaryShelfId", primaryShelfId).append("ironbankCategory", ironbankCategory).append("sku", sku).append("model", model).append("karfMaximumOrderQuantity", karfMaximumOrderQuantity).append("merchandiseCommerceNumber", merchandiseCommerceNumber).append("pricePerUnitUom", pricePerUnitUom).append("pricePerUnitQuantity", pricePerUnitQuantity).append("primaryShelf", primaryShelf).append("karfMaximumQuantityFactor", karfMaximumQuantityFactor).append("karfIsAlcohol", karfIsAlcohol).append("karfSalesUnit", karfSalesUnit).append("karfPrimaryShelfId", karfPrimaryShelfId).append("karfPrimaryShelfTitle", karfPrimaryShelfTitle).append("karfPrimaryAisleId", karfPrimaryAisleId).append("karfPrimaryAisleTitle", karfPrimaryAisleTitle).append("karfPrimaryDepartmentId", karfPrimaryDepartmentId).append("karfPrimaryDepartmentTitle", karfPrimaryDepartmentTitle).append("hazardousMaterialsIndicator", hazardousMaterialsIndicator).append("controlledSubstance", controlledSubstance).append("cpscRegulatedIndicator", cpscRegulatedIndicator).append("pesticideIndicator", pesticideIndicator).append("chemicalIndicator", chemicalIndicator).append("fuelRestrictionIndicator", fuelRestrictionIndicator).append("color", color).append("aerosolIndicator", aerosolIndicator).append("hasMercury", hasMercury).append("temperatureSensitive", temperatureSensitive).append("varietyPack", varietyPack).append("multipackIndicator", multipackIndicator).append("batteriesIncluded", batteriesIncluded).append("hasStateRestrictions", hasStateRestrictions).append("alcohol", alcohol).append("priceDisplayCodes", priceDisplayCodes).append("priceMap", priceMap).append("shippingOptions", shippingOptions).append("pickupOptions", pickupOptions).append("freeShippingThresholdPrice", freeShippingThresholdPrice).append("highlightedPickupOption", highlightedPickupOption).append("upsellShippingOptionIndex", upsellShippingOptionIndex).append("highlightedShippingOption", highlightedShippingOption).append("shippable", shippable).append("pickupable", pickupable).append("pickupAvailable", pickupAvailable).append("offerId", offerId).append("personalizationData", personalizationData).append("status", status).append("upsellFulfillmentOption", upsellFulfillmentOption).append("shipAsIs", shipAsIs).append("shippingTier", shippingTier).append("offerPUTEligible", offerPUTEligible).append("internationalShippingEligible", internationalShippingEligible).append("sourcePickupDiscountEligible", sourcePickupDiscountEligible).append("mustShipAlone", mustShipAlone).append("hazardMaterial", hazardMaterial).append("ormd", ormd).append("storePickable", storePickable).append("airShippable", airShippable).append("geoItemClassification", geoItemClassification).append("availabilityStatus", availabilityStatus).append("sellerId", sellerId).append("catalogSellerId", catalogSellerId).append("sellerName", sellerName).append("sellerDisplayName", sellerDisplayName).append("sellerType", sellerType).append("offerType", offerType).append("globalTaxCode", globalTaxCode).append("sellerOfferId", sellerOfferId).append("purchaseOption", purchaseOption).append("conditionType", conditionType).append("associateDiscountableInd", associateDiscountableInd).append("orderLimit", orderLimit).append("orderMinLimit", orderMinLimit).append("homeServiceEligible", homeServiceEligible).append("specifications", specifications).append("productHighlights", productHighlights).append("idmlLongDescription", idmlLongDescription).append("idmlShortDescription", idmlShortDescription).append("additionalProperties", additionalProperties).toString();
    }

}
