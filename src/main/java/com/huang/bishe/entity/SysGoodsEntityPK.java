package com.huang.bishe.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class SysGoodsEntityPK implements Serializable {
    private int goodsId;
    private String goodsName;

    @Column(name = "goods_id")
    @Id
    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    @Column(name = "goods_name")
    @Id
    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysGoodsEntityPK that = (SysGoodsEntityPK) o;
        return goodsId == that.goodsId && Objects.equals(goodsName, that.goodsName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(goodsId, goodsName);
    }
}
