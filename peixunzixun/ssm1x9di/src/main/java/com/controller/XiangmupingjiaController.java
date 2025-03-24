package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.XiangmupingjiaEntity;
import com.entity.view.XiangmupingjiaView;

import com.service.XiangmupingjiaService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 项目评价
 * 后端接口
 * @author 
 * @email 
 * @date 2021-05-02 01:18:52
 */
@RestController
@RequestMapping("/xiangmupingjia")
public class XiangmupingjiaController {
    @Autowired
    private XiangmupingjiaService xiangmupingjiaService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XiangmupingjiaEntity xiangmupingjia, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("shangjia")) {
			xiangmupingjia.setShangjiazhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			xiangmupingjia.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<XiangmupingjiaEntity> ew = new EntityWrapper<XiangmupingjiaEntity>();
		PageUtils page = xiangmupingjiaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xiangmupingjia), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XiangmupingjiaEntity xiangmupingjia, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("shangjia")) {
			xiangmupingjia.setShangjiazhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			xiangmupingjia.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<XiangmupingjiaEntity> ew = new EntityWrapper<XiangmupingjiaEntity>();
		PageUtils page = xiangmupingjiaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xiangmupingjia), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XiangmupingjiaEntity xiangmupingjia){
       	EntityWrapper<XiangmupingjiaEntity> ew = new EntityWrapper<XiangmupingjiaEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xiangmupingjia, "xiangmupingjia")); 
        return R.ok().put("data", xiangmupingjiaService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XiangmupingjiaEntity xiangmupingjia){
        EntityWrapper< XiangmupingjiaEntity> ew = new EntityWrapper< XiangmupingjiaEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xiangmupingjia, "xiangmupingjia")); 
		XiangmupingjiaView xiangmupingjiaView =  xiangmupingjiaService.selectView(ew);
		return R.ok("查询项目评价成功").put("data", xiangmupingjiaView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XiangmupingjiaEntity xiangmupingjia = xiangmupingjiaService.selectById(id);
        return R.ok().put("data", xiangmupingjia);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XiangmupingjiaEntity xiangmupingjia = xiangmupingjiaService.selectById(id);
        return R.ok().put("data", xiangmupingjia);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XiangmupingjiaEntity xiangmupingjia, HttpServletRequest request){
    	xiangmupingjia.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xiangmupingjia);

        xiangmupingjiaService.insert(xiangmupingjia);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XiangmupingjiaEntity xiangmupingjia, HttpServletRequest request){
    	xiangmupingjia.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xiangmupingjia);
    	xiangmupingjia.setUserid((Long)request.getSession().getAttribute("userId"));

        xiangmupingjiaService.insert(xiangmupingjia);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody XiangmupingjiaEntity xiangmupingjia, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xiangmupingjia);
        xiangmupingjiaService.updateById(xiangmupingjia);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xiangmupingjiaService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<XiangmupingjiaEntity> wrapper = new EntityWrapper<XiangmupingjiaEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("shangjia")) {
			wrapper.eq("shangjiazhanghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = xiangmupingjiaService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
