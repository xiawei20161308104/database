package com.xw.database.bean;

import java.util.Date;

public class cOrderDeliveryDetail {
    private Long id;

    private String code;

    private Date createTime;

    private String creator;

    private Date updateTime;

    private String updater;

    private Boolean valid;

    private Integer version;

    private String bar;

    private String cSkuCode;

    private String cSkuName;

    private String cSpuCode;

    private Integer count;

    private String goodsCode;

    private Long markingPrice;

    private String orderCode;

    private String orderDeliveryCode;

    private String orderNo;

    private Long retailPrice;

    private Long salePrice;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater == null ? null : updater.trim();
    }

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getBar() {
        return bar;
    }

    public void setBar(String bar) {
        this.bar = bar == null ? null : bar.trim();
    }

    public String getcSkuCode() {
        return cSkuCode;
    }

    public void setcSkuCode(String cSkuCode) {
        this.cSkuCode = cSkuCode == null ? null : cSkuCode.trim();
    }

    public String getcSkuName() {
        return cSkuName;
    }

    public void setcSkuName(String cSkuName) {
        this.cSkuName = cSkuName == null ? null : cSkuName.trim();
    }

    public String getcSpuCode() {
        return cSpuCode;
    }

    public void setcSpuCode(String cSpuCode) {
        this.cSpuCode = cSpuCode == null ? null : cSpuCode.trim();
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode == null ? null : goodsCode.trim();
    }

    public Long getMarkingPrice() {
        return markingPrice;
    }

    public void setMarkingPrice(Long markingPrice) {
        this.markingPrice = markingPrice;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    public String getOrderDeliveryCode() {
        return orderDeliveryCode;
    }

    public void setOrderDeliveryCode(String orderDeliveryCode) {
        this.orderDeliveryCode = orderDeliveryCode == null ? null : orderDeliveryCode.trim();
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public Long getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(Long retailPrice) {
        this.retailPrice = retailPrice;
    }

    public Long getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Long salePrice) {
        this.salePrice = salePrice;
    }
}