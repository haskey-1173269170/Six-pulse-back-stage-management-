//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.jk.goods.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Commodity implements Serializable {
    private static final long serialVersionUID = 3710566741481066951L;
    private Integer productId;
    private String productName;
    private String productIntroduction;
    private Integer productState;
    private Integer commodityPrice;
    private Integer productVersionid;
    private String productVersionname;
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

    public Commodity() {
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

    public Integer getProductState() {
        return this.productState;
    }

    public void setProductState(Integer productState) {
        this.productState = productState;
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

    public String getProductVersionname() {
        return this.productVersionname;
    }

    public void setProductVersionname(String productVersionname) {
        this.productVersionname = productVersionname;
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

    public String getOperatingSystemName() {
        return this.operatingSystemName;
    }

    public void setOperatingSystemName(String operatingSystemName) {
        this.operatingSystemName = operatingSystemName;
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

    public String toString() {
        return "Commodity{productId=" + this.productId + ", productName='" + this.productName + '\'' + ", productIntroduction='" + this.productIntroduction + '\'' + ", productState=" + this.productState + ", commodityPrice=" + this.commodityPrice + ", productVersionid=" + this.productVersionid + ", productVersionname='" + this.productVersionname + '\'' + ", productColorId=" + this.productColorId + ", productCpuId=" + this.productCpuId + ", productCpuname='" + this.productCpuname + '\'' + ", productWeight=" + this.productWeight + ", productOriginId=" + this.productOriginId + ", productOriginname='" + this.productOriginname + '\'' + ", homeScreenSize='" + this.homeScreenSize + '\'' + ", whetherTheHot=" + this.whetherTheHot + ", numberOfCameras='" + this.numberOfCameras + '\'' + ", operatingSystem='" + this.operatingSystem + '\'' + ", hotspot='" + this.hotspot + '\'' + ", gamePerformance='" + this.gamePerformance + '\'' + ", aspectRatio='" + this.aspectRatio + '\'' + ", upAndDownTime=" + this.upAndDownTime + ", timeToMarket=" + this.timeToMarket + ", theNetModel='" + this.theNetModel + '\'' + ", resolutionRatio='" + this.resolutionRatio + '\'' + ", theStandbyTime='" + this.theStandbyTime + '\'' + ", commoditySales='" + this.commoditySales + '\'' + ", charger='" + this.charger + '\'' + ", wirelessCharging='" + this.wirelessCharging + '\'' + ", packing='" + this.packing + '\'' + ", productBrand=" + this.productBrand + ", productBrandname='" + this.productBrandname + '\'' + '}';
    }
}
