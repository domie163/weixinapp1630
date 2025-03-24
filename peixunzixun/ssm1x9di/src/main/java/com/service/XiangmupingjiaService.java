package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiangmupingjiaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiangmupingjiaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiangmupingjiaView;


/**
 * 项目评价
 *
 * @author 
 * @email 
 * @date 2021-05-02 01:18:52
 */
public interface XiangmupingjiaService extends IService<XiangmupingjiaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiangmupingjiaVO> selectListVO(Wrapper<XiangmupingjiaEntity> wrapper);
   	
   	XiangmupingjiaVO selectVO(@Param("ew") Wrapper<XiangmupingjiaEntity> wrapper);
   	
   	List<XiangmupingjiaView> selectListView(Wrapper<XiangmupingjiaEntity> wrapper);
   	
   	XiangmupingjiaView selectView(@Param("ew") Wrapper<XiangmupingjiaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiangmupingjiaEntity> wrapper);
   	
}

