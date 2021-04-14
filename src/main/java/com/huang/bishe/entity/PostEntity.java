package com.huang.bishe.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "post", schema = "wms", catalog = "")
public class PostEntity {
    private int postId;
    private String postName;
    private int postSort;

    @Id
    @Column(name = "post_id")
    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    @Basic
    @Column(name = "post_name")
    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    @Basic
    @Column(name = "post_sort")
    public int getPostSort() {
        return postSort;
    }

    public void setPostSort(int postSort) {
        this.postSort = postSort;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostEntity that = (PostEntity) o;
        return postId == that.postId && postSort == that.postSort && Objects.equals(postName, that.postName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postId, postName, postSort);
    }
}
