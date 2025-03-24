package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiangmugoumaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiangmugoumaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiangmugoumaiView;


/**
 * 项目购买
 *
 * @author 
 * @email 
 * @date 2021-05-02 01:18:52
 */
public interface XiangmugoumaiService extends IService<XiangmugoumaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiangmugoumaiVO> selectListVO(Wrapper<XiangmugoumaiEntity> wrapper);
   	
   	XiangmugoumaiVO selectVO(@Param("ew") Wrapper<XiangmugoumaiEntity> wrapper);
   	
   	List<XiangmugoumaiView> selectListView(Wrapper<XiangmugoumaiEntity> wrapper);
   	
   	XiangmugoumaiView selectView(@Param("ew") Wrapper<XiangmugoumaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiangmugoumaiEntity> wrapper);
   	
}

