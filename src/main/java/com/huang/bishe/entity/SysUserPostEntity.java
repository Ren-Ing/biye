package com.huang.bishe.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "sys_user_post", schema = "wms", catalog = "")
@IdClass(SysUserPostEntityPK.class)
public class SysUserPostEntity {
    private int userId;
    private int postId;

    @Id
    @Column(name = "user_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Id
    @Column(name = "post_id")
    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysUserPostEntity that = (SysUserPostEntity) o;
        return userId == that.userId && postId == that.postId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, postId);
    }
}
