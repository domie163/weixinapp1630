package com.dao;

import com.entity.ZixunxiangmuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZixunxiangmuVO;
import com.entity.view.ZixunxiangmuView;


/**
 * 咨询项目
 * 
 * @author 
 * @email 
 * @date 2021-05-02 01:18:52
 */
public interface ZixunxiangmuDao extends BaseMapper<ZixunxiangmuEntity> {
	
	List<ZixunxiangmuVO> selectListVO(@Param("ew") Wrapper<ZixunxiangmuEntity> wrapper);
	
	ZixunxiangmuVO selectVO(@Param("ew") Wrapper<ZixunxiangmuEntity> wrapper);
	
	List<ZixunxiangmuView> selectListView(@Param("ew") Wrapper<ZixunxiangmuEntity> wrapper);

	List<ZixunxiangmuView> selectListView(Pagination page,@Param("ew") Wrapper<ZixunxiangmuEntity> wrapper);
	
	ZixunxiangmuView selectView(@Param("ew") Wrapper<ZixunxiangmuEntity> wrapper);
	
}
