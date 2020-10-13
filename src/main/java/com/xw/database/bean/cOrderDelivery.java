package com.xw.database.bean;

import java.util.Date;

public class cOrderDelivery {
    private Long id;

    private String code;

    private Date createTime;

    private String creator;

    private Date updateTime;

    private String updater;

    private Boolean valid;

    private Integer version;

    private String cMemberCode;

    private String cOrderDeliveryerCode;

    private String cOrderReceiverCode;

    private String cashTradeCode;

    private String companyCode;

    private String deptCode;

    private Long favourMoney;

    private String memberMobile;

    private String memberName;

    private String orderCode;

    private String orderDeliveryerName;

    private String orderNo;

    private String orderReceiverName;

    private Long payMoney;

    private Date payTime;

    private String payTypeName;

    private String payType;

    private Long totalMoney;

    private Long freightMoney;

    private String orderReceiveDeptCode;

    private String payeeDeptCode;

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

    public String getcMemberCode() {
        return cMemberCode;
    }

    public void setcMemberCode(String cMemberCode) {
        this.cMemberCode = cMemberCode == null ? null : cMemberCode.trim();
    }

    public String getcOrderDeliveryerCode() {
        return cOrderDeliveryerCode;
    }

    public void setcOrderDeliveryerCode(String cOrderDeliveryerCode) {
        this.cOrderDeliveryerCode = cOrderDeliveryerCode == null ? null : cOrderDeliveryerCode.trim();
    }

    public String getcOrderReceiverCode() {
        return cOrderReceiverCode;
    }

    public void setcOrderReceiverCode(String cOrderReceiverCode) {
        this.cOrderReceiverCode = cOrderReceiverCode == null ? null : cOrderReceiverCode.trim();
    }

    public String getCashTradeCode() {
        return cashTradeCode;
    }

    public void setCashTradeCode(String cashTradeCode) {
        this.cashTradeCode = cashTradeCode == null ? null : cashTradeCode.trim();
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode == null ? null : companyCode.trim();
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode == null ? null : deptCode.trim();
    }

    public Long getFavourMoney() {
        return favourMoney;
    }

    public void setFavourMoney(Long favourMoney) {
        this.favourMoney = favourMoney;
    }

    public String getMemberMobile() {
        return memberMobile;
    }

    public void setMemberMobile(String memberMobile) {
        this.memberMobile = memberMobile == null ? null : memberMobile.trim();
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    public String getOrderDeliveryerName() {
        return orderDeliveryerName;
    }

    public void setOrderDeliveryerName(String orderDeliveryerName) {
        this.orderDeliveryerName = orderDeliveryerName == null ? null : orderDeliveryerName.trim();
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getOrderReceiverName() {
        return orderReceiverName;
    }

    public void setOrderReceiverName(String orderReceiverName) {
        this.orderReceiverName = orderReceiverName == null ? null : orderReceiverName.trim();
    }

    public Long getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(Long payMoney) {
        this.payMoney = payMoney;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public String getPayTypeName() {
        return payTypeName;
    }

    public void setPayTypeName(String payTypeName) {
        this.payTypeName = payTypeName == null ? null : payTypeName.trim();
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    public Long getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Long totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Long getFreightMoney() {
        return freightMoney;
    }

    public void setFreightMoney(Long freightMoney) {
        this.freightMoney = freightMoney;
    }

    public String getOrderReceiveDeptCode() {
        return orderReceiveDeptCode;
    }

    public void setOrderReceiveDeptCode(String orderReceiveDeptCode) {
        this.orderReceiveDeptCode = orderReceiveDeptCode == null ? null : orderReceiveDeptCode.trim();
    }

    public String getPayeeDeptCode() {
        return payeeDeptCode;
    }

    public void setPayeeDeptCode(String payeeDeptCode) {
        this.payeeDeptCode = payeeDeptCode == null ? null : payeeDeptCode.trim();
    }
}