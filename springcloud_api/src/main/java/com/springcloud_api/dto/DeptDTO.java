package com.springcloud_api.dto;

public class DeptDTO {

    private Long    did;
    private String  dname;
    private String  dsource;

    @Override
    public String toString() {
        return "DeptDTO{" +
                "did=" + did +
                ", dname='" + dname + '\'' +
                ", dsource='" + dsource + '\'' +
                '}';
    }

    public Long getDid() {
        return did;
    }

    public void setDid(Long did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDsource() {
        return dsource;
    }

    public void setDsource(String dsource) {
        this.dsource = dsource;
    }
}
