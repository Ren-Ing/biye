package com.huang.bishe.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "supplier", schema = "wms", catalog = "")
@IdClass(SupplierEntityPK.class)
public class SupplierEntity {
    private int supplierId;
    private String suppilierName;
    private Integer goodsId;
    private String supplierAddr;
    private String supplierTel;

    @Id
    @Column(name = "supplier_id")
    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    @Id
    @Column(name = "suppilier_name")
    public String getSuppilierName() {
        return suppilierName;
    }

    public void setSuppilierName(String suppilierName) {
        this.suppilierName = suppilierName;
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
    @Column(name = "supplier_addr")
    public String getSupplierAddr() {
        return supplierAddr;
    }

    public void setSupplierAddr(String supplierAddr) {
        this.supplierAddr = supplierAddr;
    }

    @Basic
    @Column(name = "supplier_tel")
    public String getSupplierTel() {
        return supplierTel;
    }

    public void setSupplierTel(String supplierTel) {
        this.supplierTel = supplierTel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SupplierEntity that = (SupplierEntity) o;
        return supplierId == that.supplierId && Objects.equals(suppilierName, that.suppilierName) && Objects.equals(goodsId, that.goodsId) && Objects.equals(supplierAddr, that.supplierAddr) && Objects.equals(supplierTel, that.supplierTel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(supplierId, suppilierName, goodsId, supplierAddr, supplierTel);
    }
}
