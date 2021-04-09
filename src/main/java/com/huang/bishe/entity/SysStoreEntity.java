package com.huang.bishe.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "sys_store", schema = "wms", catalog = "")
@IdClass(SysStoreEntityPK.class)
public class SysStoreEntity {
    private int storeId;
    private String storeName;

    @Id
    @Column(name = "store_id")
    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    @Id
    @Column(name = "store_name")
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
        SysStoreEntity that = (SysStoreEntity) o;
        return storeId == that.storeId && Objects.equals(storeName, that.storeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storeId, storeName);
    }
}
