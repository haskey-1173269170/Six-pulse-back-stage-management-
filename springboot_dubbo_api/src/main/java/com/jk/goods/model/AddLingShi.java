//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.jk.goods.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class AddLingShi implements Serializable {
    private static final long serialVersionUID = -454170663236878773L;
    private Integer productId;
    private String productName;
    private String productIntroduction;
    private Integer commodityPrice;
    private Integer productVersionid;
    private Integer productColorId;
    private Integer productCpuId;
    private String productCpuname;
    private Double productWeight;
    private Integer productOriginId;
    private String productOriginname;
    private String homeScreenSize;
    private Integer whetherTheHot;
    private String numberOfCameras;
    private String operatingSystem;
    private String operatingSystemName;
    private String hotspot;
    private String gamePerformance;
    private String aspectRatio;
    @DateTimeFormat(
            pattern = "yyyy-MM-dd"
    )
    private Date upAndDownTime;
    @DateTimeFormat(
            pattern = "yyyy-MM-dd"
    )
    private Date timeToMarket;
    private String theNetModel;
    private String resolutionRatio;
    private String theStandbyTime;
    private String commoditySales;
    private String charger;
    private String wirelessCharging;
    private String packing;
    private Integer productBrand;
    private String productBrandname;
    private List<Image> image;
    private List<Productversion> version;

    public AddLingShi() {
    }

    public Integer getProductId() {
        return this.productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductIntroduction() {
        return this.productIntroduction;
    }

    public void setProductIntroduction(String productIntroduction) {
        this.productIntroduction = productIntroduction;
    }

    public Integer getCommodityPrice() {
        return this.commodityPrice;
    }

    public void setCommodityPrice(Integer commodityPrice) {
        this.commodityPrice = commodityPrice;
    }

    public Integer getProductVersionid() {
        return this.productVersionid;
    }

    public void setProductVersionid(Integer productVersionid) {
        this.productVersionid = productVersionid;
    }

    public Integer getProductColorId() {
        return this.productColorId;
    }

    public void setProductColorId(Integer productColorId) {
        this.productColorId = productColorId;
    }

    public Integer getProductCpuId() {
        return this.productCpuId;
    }

    public void setProductCpuId(Integer productCpuId) {
        this.productCpuId = productCpuId;
    }

    public String getProductCpuname() {
        return this.productCpuname;
    }

    public void setProductCpuname(String productCpuname) {
        this.productCpuname = productCpuname;
    }

    public Double getProductWeight() {
        return this.productWeight;
    }

    public void setProductWeight(Double productWeight) {
        this.productWeight = productWeight;
    }

    public Integer getProductOriginId() {
        return this.productOriginId;
    }

    public void setProductOriginId(Integer productOriginId) {
        this.productOriginId = productOriginId;
    }

    public String getProductOriginname() {
        return this.productOriginname;
    }

    public void setProductOriginname(String productOriginname) {
        this.productOriginname = productOriginname;
    }

    public String getHomeScreenSize() {
        return this.homeScreenSize;
    }

    public void setHomeScreenSize(String homeScreenSize) {
        this.homeScreenSize = homeScreenSize;
    }

    public Integer getWhetherTheHot() {
        return this.whetherTheHot;
    }

    public void setWhetherTheHot(Integer whetherTheHot) {
        this.whetherTheHot = whetherTheHot;
    }

    public String getNumberOfCameras() {
        return this.numberOfCameras;
    }

    public void setNumberOfCameras(String numberOfCameras) {
        this.numberOfCameras = numberOfCameras;
    }

    public String getOperatingSystem() {
        return this.operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getOperatingSystemName() {
        return this.operatingSystemName;
    }

    public void setOperatingSystemName(String operatingSystemName) {
        this.operatingSystemName = operatingSystemName;
    }

    public String getHotspot() {
        return this.hotspot;
    }

    public void setHotspot(String hotspot) {
        this.hotspot = hotspot;
    }

    public String getGamePerformance() {
        return this.gamePerformance;
    }

    public void setGamePerformance(String gamePerformance) {
        this.gamePerformance = gamePerformance;
    }

    public String getAspectRatio() {
        return this.aspectRatio;
    }

    public void setAspectRatio(String aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    public Date getUpAndDownTime() {
        return this.upAndDownTime;
    }

    public void setUpAndDownTime(Date upAndDownTime) {
        this.upAndDownTime = upAndDownTime;
    }

    public Date getTimeToMarket() {
        return this.timeToMarket;
    }

    public void setTimeToMarket(Date timeToMarket) {
        this.timeToMarket = timeToMarket;
    }

    public String getTheNetModel() {
        return this.theNetModel;
    }

    public void setTheNetModel(String theNetModel) {
        this.theNetModel = theNetModel;
    }

    public String getResolutionRatio() {
        return this.resolutionRatio;
    }

    public void setResolutionRatio(String resolutionRatio) {
        this.resolutionRatio = resolutionRatio;
    }

    public String getTheStandbyTime() {
        return this.theStandbyTime;
    }

    public void setTheStandbyTime(String theStandbyTime) {
        this.theStandbyTime = theStandbyTime;
    }

    public String getCommoditySales() {
        return this.commoditySales;
    }

    public void setCommoditySales(String commoditySales) {
        this.commoditySales = commoditySales;
    }

    public String getCharger() {
        return this.charger;
    }

    public void setCharger(String charger) {
        this.charger = charger;
    }

    public String getWirelessCharging() {
        return this.wirelessCharging;
    }

    public void setWirelessCharging(String wirelessCharging) {
        this.wirelessCharging = wirelessCharging;
    }

    public String getPacking() {
        return this.packing;
    }

    public void setPacking(String packing) {
        this.packing = packing;
    }

    public Integer getProductBrand() {
        return this.productBrand;
    }

    public void setProductBrand(Integer productBrand) {
        this.productBrand = productBrand;
    }

    public String getProductBrandname() {
        return this.productBrandname;
    }

    public void setProductBrandname(String productBrandname) {
        this.productBrandname = productBrandname;
    }

    public List<Image> getImage() {
        return this.image;
    }

    public void setImage(List<Image> image) {
        this.image = image;
    }

    public List<Productversion> getVersion() {
        return this.version;
    }

    public void setVersion(List<Productversion> version) {
        this.version = version;
    }
}
