package com.sam.modules.entity;

import java.util.Date;

public class Userinfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.userinfo.serno
     *
     * @mbggenerated Thu Jun 11 13:10:13 CST 2015
     */
    private Long serno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.userinfo.usertype
     *
     * @mbggenerated Thu Jun 11 13:10:13 CST 2015
     */
    private Integer usertype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.userinfo.userid
     *
     * @mbggenerated Thu Jun 11 13:10:13 CST 2015
     */
    private String userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.userinfo.timecreate
     *
     * @mbggenerated Thu Jun 11 13:10:13 CST 2015
     */
    private Date timecreate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.userinfo.serno
     *
     * @return the value of public.userinfo.serno
     *
     * @mbggenerated Thu Jun 11 13:10:13 CST 2015
     */
    public Long getSerno() {
        return serno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.userinfo.serno
     *
     * @param serno the value for public.userinfo.serno
     *
     * @mbggenerated Thu Jun 11 13:10:13 CST 2015
     */
    public void setSerno(Long serno) {
        this.serno = serno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.userinfo.usertype
     *
     * @return the value of public.userinfo.usertype
     *
     * @mbggenerated Thu Jun 11 13:10:13 CST 2015
     */
    public Integer getUsertype() {
        return usertype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.userinfo.usertype
     *
     * @param usertype the value for public.userinfo.usertype
     *
     * @mbggenerated Thu Jun 11 13:10:13 CST 2015
     */
    public void setUsertype(Integer usertype) {
        this.usertype = usertype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.userinfo.userid
     *
     * @return the value of public.userinfo.userid
     *
     * @mbggenerated Thu Jun 11 13:10:13 CST 2015
     */
    public String getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.userinfo.userid
     *
     * @param userid the value for public.userinfo.userid
     *
     * @mbggenerated Thu Jun 11 13:10:13 CST 2015
     */
    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.userinfo.timecreate
     *
     * @return the value of public.userinfo.timecreate
     *
     * @mbggenerated Thu Jun 11 13:10:13 CST 2015
     */
    public Date getTimecreate() {
        return timecreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.userinfo.timecreate
     *
     * @param timecreate the value for public.userinfo.timecreate
     *
     * @mbggenerated Thu Jun 11 13:10:13 CST 2015
     */
    public void setTimecreate(Date timecreate) {
        this.timecreate = timecreate;
    }
}