package com.huang.bishe.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class SupplierEntityPK implements Serializable {
    private int supplierId;
    private String suppilierName;

    @Column(name = "supplier_id")
    @Id
    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    @Column(name = "suppilier_name")
    @Id
    public String getSuppilierName() {
        return suppilierName;
    }

    public void setSuppilierName(String suppilierName) {
        this.suppilierName = suppilierName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SupplierEntityPK that = (SupplierEntityPK) o;
        return supplierId == that.supplierId && Objects.equals(suppilierName, that.suppilierName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(supplierId, suppilierName);
    }
}
