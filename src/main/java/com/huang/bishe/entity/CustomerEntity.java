package com.huang.bishe.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "customer", schema = "wms", catalog = "")
public class CustomerEntity {
    private int customerId;
    private String customerName;
    private Integer goodsId;
    private Integer goodsNum;
    private String customerTel;

    @Id
    @Column(name = "customer_id")
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Basic
    @Column(name = "customer_name")
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Basic
    @Column(name = "goods_id")
    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    @Basic
    @Column(name = "goods_num")
    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    @Basic
    @Column(name = "customer_tel")
    public String getCustomerTel() {
        return customerTel;
    }

    public void setCustomerTel(String customerTel) {
        this.customerTel = customerTel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerEntity that = (CustomerEntity) o;
        return customerId == that.customerId && Objects.equals(customerName, that.customerName) && Objects.equals(goodsId, that.goodsId) && Objects.equals(goodsNum, that.goodsNum) && Objects.equals(customerTel, that.customerTel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, customerName, goodsId, goodsNum, customerTel);
    }
}
