package com.example.myapp.subway.bean;

public class Subway_show {
    /**
     * searchValue : null
     * createBy : admin
     * createTime : 2021-04-08 21:12:59
     * updateBy : admin
     * updateTime : 2021-05-12 09:06:47
     * remark : null
     * params : {}
     * id : 11
     * appType : metro
     * status : 1
     * sort : 1
     * advTitle : 地铁广告1
     * advImg : /prod-api/profile/upload/image/2021/05/12/a2f1ed87-6d72-49e5-b749-a7277321bae6.jpg
     * servModule : 新闻资讯
     * targetId : 78
     * type : 2
     */

    private Object searchValue;
    private String createBy;
    private String createTime;
    private String updateBy;
    private String updateTime;
    private Object remark;
    private ParamsBean params;
    private int id;
    private String appType;
    private String status;
    private int sort;
    private String advTitle;
    private String advImg;
    private String servModule;
    private int targetId;
    private String type;

    public Object getSearchValue() {
        return searchValue;
    }

    public void setSearchValue(Object searchValue) {
        this.searchValue = searchValue;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Object getRemark() {
        return remark;
    }

    public void setRemark(Object remark) {
        this.remark = remark;
    }

    public ParamsBean getParams() {
        return params;
    }

    public void setParams(ParamsBean params) {
        this.params = params;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAppType() {
        return appType;
    }

    public void setAppType(String appType) {
        this.appType = appType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public String getAdvTitle() {
        return advTitle;
    }

    public void setAdvTitle(String advTitle) {
        this.advTitle = advTitle;
    }

    public String getAdvImg() {
        return advImg;
    }

    public void setAdvImg(String advImg) {
        this.advImg = advImg;
    }

    public String getServModule() {
        return servModule;
    }

    public void setServModule(String servModule) {
        this.servModule = servModule;
    }

    public int getTargetId() {
        return targetId;
    }

    public void setTargetId(int targetId) {
        this.targetId = targetId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static class ParamsBean {
    }
}
