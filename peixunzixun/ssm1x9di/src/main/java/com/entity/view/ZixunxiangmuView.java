package com.entity.view;

import com.entity.ZixunxiangmuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 咨询项目
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-02 01:18:52
 */
@TableName("zixunxiangmu")
public class ZixunxiangmuView  extends ZixunxiangmuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZixunxiangmuView(){
	}
 
 	public ZixunxiangmuView(ZixunxiangmuEntity zixunxiangmuEntity){
 	try {
			BeanUtils.copyProperties(this, zixunxiangmuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
