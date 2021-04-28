package com.xiangwen.model;

public class Dept {
    private Integer bumentableid;

    private String bumentablename;

    private String bumentableaddress;

    public Integer getBumentableid() {
        return bumentableid;
    }

    public void setBumentableid(Integer bumentableid) {
        this.bumentableid = bumentableid;
    }

    public String getBumentablename() {
        return bumentablename;
    }

    public void setBumentablename(String bumentablename) {
        this.bumentablename = bumentablename == null ? null : bumentablename.trim();
    }

    public String getBumentableaddress() {
        return bumentableaddress;
    }

    public void setBumentableaddress(String bumentableaddress) {
        this.bumentableaddress = bumentableaddress == null ? null : bumentableaddress.trim();
    }
}