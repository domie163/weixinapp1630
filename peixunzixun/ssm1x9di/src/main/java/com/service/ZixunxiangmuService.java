package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZixunxiangmuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZixunxiangmuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZixunxiangmuView;


/**
 * 咨询项目
 *
 * @author 
 * @email 
 * @date 2021-05-02 01:18:52
 */
public interface ZixunxiangmuService extends IService<ZixunxiangmuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZixunxiangmuVO> selectListVO(Wrapper<ZixunxiangmuEntity> wrapper);
   	
   	ZixunxiangmuVO selectVO(@Param("ew") Wrapper<ZixunxiangmuEntity> wrapper);
   	
   	List<ZixunxiangmuView> selectListView(Wrapper<ZixunxiangmuEntity> wrapper);
   	
   	ZixunxiangmuView selectView(@Param("ew") Wrapper<ZixunxiangmuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZixunxiangmuEntity> wrapper);
   	
}

