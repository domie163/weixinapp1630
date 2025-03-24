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

import com.entity.ZixunxiangmuEntity;
import com.entity.view.ZixunxiangmuView;

import com.service.ZixunxiangmuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 咨询项目
 * 后端接口
 * @author 
 * @email 
 * @date 2021-05-02 01:18:52
 */
@RestController
@RequestMapping("/zixunxiangmu")
public class ZixunxiangmuController {
    @Autowired
    private ZixunxiangmuService zixunxiangmuService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZixunxiangmuEntity zixunxiangmu, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("shangjia")) {
			zixunxiangmu.setShangjiazhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZixunxiangmuEntity> ew = new EntityWrapper<ZixunxiangmuEntity>();
		PageUtils page = zixunxiangmuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zixunxiangmu), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZixunxiangmuEntity zixunxiangmu, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("shangjia")) {
			zixunxiangmu.setShangjiazhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZixunxiangmuEntity> ew = new EntityWrapper<ZixunxiangmuEntity>();
		PageUtils page = zixunxiangmuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zixunxiangmu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZixunxiangmuEntity zixunxiangmu){
       	EntityWrapper<ZixunxiangmuEntity> ew = new EntityWrapper<ZixunxiangmuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zixunxiangmu, "zixunxiangmu")); 
        return R.ok().put("data", zixunxiangmuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZixunxiangmuEntity zixunxiangmu){
        EntityWrapper< ZixunxiangmuEntity> ew = new EntityWrapper< ZixunxiangmuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zixunxiangmu, "zixunxiangmu")); 
		ZixunxiangmuView zixunxiangmuView =  zixunxiangmuService.selectView(ew);
		return R.ok("查询咨询项目成功").put("data", zixunxiangmuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZixunxiangmuEntity zixunxiangmu = zixunxiangmuService.selectById(id);
		zixunxiangmu.setClicknum(zixunxiangmu.getClicknum()+1);
		zixunxiangmu.setClicktime(new Date());
		zixunxiangmuService.updateById(zixunxiangmu);
        return R.ok().put("data", zixunxiangmu);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZixunxiangmuEntity zixunxiangmu = zixunxiangmuService.selectById(id);
		zixunxiangmu.setClicknum(zixunxiangmu.getClicknum()+1);
		zixunxiangmu.setClicktime(new Date());
		zixunxiangmuService.updateById(zixunxiangmu);
        return R.ok().put("data", zixunxiangmu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZixunxiangmuEntity zixunxiangmu, HttpServletRequest request){
    	zixunxiangmu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zixunxiangmu);

        zixunxiangmuService.insert(zixunxiangmu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZixunxiangmuEntity zixunxiangmu, HttpServletRequest request){
    	zixunxiangmu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zixunxiangmu);
    	zixunxiangmu.setUserid((Long)request.getSession().getAttribute("userId"));

        zixunxiangmuService.insert(zixunxiangmu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ZixunxiangmuEntity zixunxiangmu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zixunxiangmu);
        zixunxiangmuService.updateById(zixunxiangmu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zixunxiangmuService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<ZixunxiangmuEntity> wrapper = new EntityWrapper<ZixunxiangmuEntity>();
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

		int count = zixunxiangmuService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,ZixunxiangmuEntity zixunxiangmu, HttpServletRequest request,String pre){
        EntityWrapper<ZixunxiangmuEntity> ew = new EntityWrapper<ZixunxiangmuEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicknum");
        
        params.put("order", "desc");
		PageUtils page = zixunxiangmuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zixunxiangmu), params), params));
        return R.ok().put("data", page);
    }


}
