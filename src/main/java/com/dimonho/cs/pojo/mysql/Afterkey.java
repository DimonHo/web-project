package com.dimonho.cs.pojo.mysql;

public class Afterkey {
    private String id;

    private String afterkey;

    private Integer count;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getAfterkey() {
        return afterkey;
    }

    public void setAfterkey(String afterkey) {
        this.afterkey = afterkey == null ? null : afterkey.trim();
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}