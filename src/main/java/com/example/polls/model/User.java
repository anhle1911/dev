package com.example.polls.model;

import com.example.polls.model.audit.DateAudit;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.Id;

/**
 * Created by rajeevkumarsingh on 01/08/17.
 */

@Entity
@Table(name = "sd_user")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String emailstatus;

    private String email;

    private String username;
    @Column(name = "mobilePhone")
    private String phone;

    private String password; // Số người vay lại
    @Column(name= "businessPwd")
    private String businessPwd; // Tổng vay
    @Column(name ="vipStatus")
    private Integer vipStatus; // số người đăng kí vay

    private Integer changejkts; //đéo hiểu là gì

    private Integer changejktscopy; //đéo hiểu là gì

    private Integer changemoney; //đéo hiểu là gì

    private Integer shownofition; // 0: false, 1: true

    private Integer enable;

    private String dealpwd;

    private String refferee;
    private Integer rating;
    private Integer creditrating;
    @Column(name ="lastIP")
    private String lastIP;
    @Column(name ="lastDate")
    private String lastDate;
    @Column(name ="vipCreateTime")
    private Date vipCreateTime;
    @Column(name ="creditLimit")
    private String creditLimit;
    private String showtitle;
    private String yearmonthday;
    @Column(name ="createTime")
    private String createTime;
    private String content;
    @Column(name ="usableSum")
    private Double usableSum;
    @Column(name ="freezeSum")
    private Double freezeSum;
    @Column(name ="dueinSum")
    private Double dueinSum;
    @Column(name ="dueoutSum")
    private Double dueoutSum;
    @Column(name ="kefuId")
    @NonNull
    private Long kefuId ;
    @Column(name= "adminId")
    private Long adminId;
    @Column(name ="groupId")
    private Long groupId;
    @Column(name ="usableCreditLimit")
    private Long usableCreditLimit;

    private Long creditlimtor;
    @Column(name= "feeStatus")
    private Integer feeStatus;
    @Column(name ="loginCount")
    private Integer loginCount;
    @Column(name ="lockTime")
    private Date lockTime;
    @Column(name ="cashStatus")
    private Integer cashStatus;
    private Integer oldyonghu;
    private Double x;
    private Double xmin;
    @Column(name ="isFirstVip")
    private Integer isFirstVip;
    @Column(name="vipType")
    private Integer vipType =0;
    @Column(name="portMerBillNo")
    private String portMerBillNo;
    @Column(name="pIpsBillNo")
    private String pIpsBillNo;
    @Column(name="isAdmin")
    private Integer isAdmin;
    private String wxid;
    @Column(name="GesturePwd")
    private String GesturePwd;
    private Integer gesturestatus;
    private Integer hongb;
    private Integer tzstatus;
    private Integer tztime;
    private Integer jlstatus;
    private Date jltime;
    private Integer dcstatus;
    @Column(name="isShenfen")
    private Integer isShenfen;
    @Column(name="isJop")
    private Integer isJop;
    @Column(name="isLianxi")
    private Integer isLianxi;
    @Column(name="isFacebook")
    private Integer isFacebook;
    private Integer yhbd;
    private Double tjjj;
    @Column(name="isSchool")
    private Integer isSchool;
    private Integer heihu_zt;
    private Integer shibai_cs;
    private Integer chenggong_cs;
    private Double yuq_lx;
    private Integer yuq_ts;
    private String blackremark;
    private Integer yuq_cd;
    private Integer yyshang;
    private Integer taobaoyz;
    private Integer jingdongyz;
    private Integer sfzmrz;
    private Integer invest_status;
    private Integer profession;
    private Integer isshebao;
    private Integer iseducation;
    private String registration_id;
    private Integer thjlbl;
    private Integer txlbl;
    private Integer smsbl;
    private Integer sjxt;
    private Integer hongbao;
    private Integer fxhongbao;
    private String fxtime;
    private Integer appflyer;
    private String pingjiguize;
    private String tokenhtml;

}