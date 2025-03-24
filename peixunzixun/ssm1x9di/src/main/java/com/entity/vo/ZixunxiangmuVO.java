package com.entity.vo;

import com.entity.ZixunxiangmuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 咨询项目
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-02 01:18:52
 */
public class ZixunxiangmuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 咨询类别
	 */
	
	private String zixunleibie;
		
	/**
	 * 咨询师介绍
	 */
	
	private String zixunshijieshao;
		
	/**
	 * 咨询时长
	 */
	
	private String zixunshizhang;
		
	/**
	 * 咨询对象
	 */
	
	private String zixunduixiang;
		
	/**
	 * 项目收费
	 */
	
	private Integer xiangmushoufei;
		
	/**
	 * 项目介绍
	 */
	
	private String xiangmujieshao;
		
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 商家账号
	 */
	
	private String shangjiazhanghao;
		
	/**
	 * 商家姓名
	 */
	
	private String shangjiaxingming;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：咨询类别
	 */
	 
	public void setZixunleibie(String zixunleibie) {
		this.zixunleibie = zixunleibie;
	}
	
	/**
	 * 获取：咨询类别
	 */
	public String getZixunleibie() {
		return zixunleibie;
	}
				
	
	/**
	 * 设置：咨询师介绍
	 */
	 
	public void setZixunshijieshao(String zixunshijieshao) {
		this.zixunshijieshao = zixunshijieshao;
	}
	
	/**
	 * 获取：咨询师介绍
	 */
	public String getZixunshijieshao() {
		return zixunshijieshao;
	}
				
	
	/**
	 * 设置：咨询时长
	 */
	 
	public void setZixunshizhang(String zixunshizhang) {
		this.zixunshizhang = zixunshizhang;
	}
	
	/**
	 * 获取：咨询时长
	 */
	public String getZixunshizhang() {
		return zixunshizhang;
	}
				
	
	/**
	 * 设置：咨询对象
	 */
	 
	public void setZixunduixiang(String zixunduixiang) {
		this.zixunduixiang = zixunduixiang;
	}
	
	/**
	 * 获取：咨询对象
	 */
	public String getZixunduixiang() {
		return zixunduixiang;
	}
				
	
	/**
	 * 设置：项目收费
	 */
	 
	public void setXiangmushoufei(Integer xiangmushoufei) {
		this.xiangmushoufei = xiangmushoufei;
	}
	
	/**
	 * 获取：项目收费
	 */
	public Integer getXiangmushoufei() {
		return xiangmushoufei;
	}
				
	
	/**
	 * 设置：项目介绍
	 */
	 
	public void setXiangmujieshao(String xiangmujieshao) {
		this.xiangmujieshao = xiangmujieshao;
	}
	
	/**
	 * 获取：项目介绍
	 */
	public String getXiangmujieshao() {
		return xiangmujieshao;
	}
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：商家账号
	 */
	 
	public void setShangjiazhanghao(String shangjiazhanghao) {
		this.shangjiazhanghao = shangjiazhanghao;
	}
	
	/**
	 * 获取：商家账号
	 */
	public String getShangjiazhanghao() {
		return shangjiazhanghao;
	}
				
	
	/**
	 * 设置：商家姓名
	 */
	 
	public void setShangjiaxingming(String shangjiaxingming) {
		this.shangjiaxingming = shangjiaxingming;
	}
	
	/**
	 * 获取：商家姓名
	 */
	public String getShangjiaxingming() {
		return shangjiaxingming;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
