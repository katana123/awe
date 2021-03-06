package com.awe.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


@Table( name = "c_cusers")
@Entity
public class CCusers {

  private long cuid;
  private String cusername;
  private String cpwd;
  private String cimei;
  private String cimsi;
  private String cxlh;
  private String cright;
  private String cud;
  private String cuname;
  private String cupn;
  private String cidc;
  private String cunit;
  private long cmos;
  private long cssid;
  private String cemail;
  private long ccid;
  private long cqqid;
    private Collection<CUlink> cUlink = new ArrayList<>();
    private String district;
    private String breifIntro;

    @Override
    public String toString() {
        return "CCusers{" +
                "cuid=" + cuid +
                ", cusername='" + cusername + '\'' +
                ", cpwd='" + cpwd + '\'' +
                ", cimei='" + cimei + '\'' +
                ", cimsi='" + cimsi + '\'' +
                ", cxlh='" + cxlh + '\'' +
                ", cright='" + cright + '\'' +
                ", cud='" + cud + '\'' +
                ", cuname='" + cuname + '\'' +
                ", cupn='" + cupn + '\'' +
                ", cidc='" + cidc + '\'' +
                ", cunit='" + cunit + '\'' +
                ", cmos=" + cmos +
                ", cssid=" + cssid +
                ", cemail='" + cemail + '\'' +
                ", ccid=" + ccid +
                ", cqqid=" + cqqid +
                ", cUlink=" + cUlink +
                ", district='" + district + '\'' +
                ", breifIntro='" + breifIntro + '\'' +
                '}';
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getBreifIntro() {
        return breifIntro;
    }

    public void setBreifIntro(String breifIntro) {
        this.breifIntro = breifIntro;
    }

    @OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER, mappedBy = "cCusers")
    public Collection<CUlink> getcUlink() {
        return cUlink;
    }

    public void setcUlink(Collection<CUlink> cUlink) {
        this.cUlink = cUlink;
    }

  @GeneratedValue
  @Id
  public long getCuid() {
    return cuid;
  }

  public void setCuid(long cuid) {
    this.cuid = cuid;
  }


  public String getCusername() {
    return cusername;
  }

  public void setCusername(String cusername) {
    this.cusername = cusername;
  }


  public String getCpwd() {
    return cpwd;
  }

  public void setCpwd(String cpwd) {
    this.cpwd = cpwd;
  }


  public String getCimei() {
    return cimei;
  }

  public void setCimei(String cimei) {
    this.cimei = cimei;
  }


  public String getCimsi() {
    return cimsi;
  }

  public void setCimsi(String cimsi) {
    this.cimsi = cimsi;
  }


  public String getCxlh() {
    return cxlh;
  }

  public void setCxlh(String cxlh) {
    this.cxlh = cxlh;
  }


  public String getCright() {
    return cright;
  }

  public void setCright(String cright) {
    this.cright = cright;
  }


  public String getCud() {
    return cud;
  }

  public void setCud(String cud) {
    this.cud = cud;
  }


  public String getCuname() {
    return cuname;
  }

  public void setCuname(String cuname) {
    this.cuname = cuname;
  }


  public String getCupn() {
    return cupn;
  }

  public void setCupn(String cupn) {
    this.cupn = cupn;
  }


  public String getCidc() {
    return cidc;
  }

  public void setCidc(String cidc) {
    this.cidc = cidc;
  }


  public String getCunit() {
    return cunit;
  }

  public void setCunit(String cunit) {
    this.cunit = cunit;
  }


  public long getCmos() {
    return cmos;
  }

  public void setCmos(long cmos) {
    this.cmos = cmos;
  }


  public long getCssid() {
    return cssid;
  }

  public void setCssid(long cssid) {
    this.cssid = cssid;
  }


  public String getCemail() {
    return cemail;
  }

  public void setCemail(String cemail) {
    this.cemail = cemail;
  }


  public long getCcid() {
    return ccid;
  }

  public void setCcid(long ccid) {
    this.ccid = ccid;
  }


  public long getCqqid() {
    return cqqid;
  }

  public void setCqqid(long cqqid) {
    this.cqqid = cqqid;
  }

}
