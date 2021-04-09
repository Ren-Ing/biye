package com.huang.bishe.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class SysStoreEntityPK implements Serializable {
    private int storeId;
    private String storeName;

    @Column(name = "store_id")
    @Id
    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    @Column(name = "store_name")
    @Id
    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysStoreEntityPK that = (SysStoreEntityPK) o;
        return storeId == that.storeId && Objects.equals(storeName, that.storeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storeId, storeName);
    }
}
