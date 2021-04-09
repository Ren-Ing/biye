package com.huang.bishe.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "sys_goods", schema = "wms", catalog = "")
@IdClass(SysGoodsEntityPK.class)
public class SysGoodsEntity {
    private int goodsId;
    private String goodsName;
    private Integer goodsNum;
    private Integer storeId;

    @Id
    @Column(name = "goods_id")
    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    @Id
    @Column(name = "goods_name")
    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
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
    @Column(name = "store_id")
    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysGoodsEntity that = (SysGoodsEntity) o;
        return goodsId == that.goodsId && Objects.equals(goodsName, that.goodsName) && Objects.equals(goodsNum, that.goodsNum) && Objects.equals(storeId, that.storeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(goodsId, goodsName, goodsNum, storeId);
    }
}
