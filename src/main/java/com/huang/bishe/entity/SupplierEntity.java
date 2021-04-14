package com.huang.bishe.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "supplier", schema = "wms", catalog = "")
public class SupplierEntity {
    private int supplierId;
    private String suppilierName;
    private Byte supplierType;
    private String supplierAddr;
    private String supplierTel;
    private String bankName;
    private String bankAccount;
    private Byte status;

    @Id
    @Column(name = "supplier_id")
    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    @Basic
    @Column(name = "suppilier_name")
    public String getSuppilierName() {
        return suppilierName;
    }

    public void setSuppilierName(String suppilierName) {
        this.suppilierName = suppilierName;
    }

    @Basic
    @Column(name = "supplier_type")
    public Byte getSupplierType() {
        return supplierType;
    }

    public void setSupplierType(Byte supplierType) {
        this.supplierType = supplierType;
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

    @Basic
    @Column(name = "bank_name")
    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @Basic
    @Column(name = "bank_account")
    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Basic
    @Column(name = "status")
    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SupplierEntity that = (SupplierEntity) o;
        return supplierId == that.supplierId && Objects.equals(suppilierName, that.suppilierName) && Objects.equals(supplierType, that.supplierType) && Objects.equals(supplierAddr, that.supplierAddr) && Objects.equals(supplierTel, that.supplierTel) && Objects.equals(bankName, that.bankName) && Objects.equals(bankAccount, that.bankAccount) && Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(supplierId, suppilierName, supplierType, supplierAddr, supplierTel, bankName, bankAccount, status);
    }
}
