package com.dao;

import com.entity.XiangmupingjiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiangmupingjiaVO;
import com.entity.view.XiangmupingjiaView;


/**
 * 项目评价
 * 
 * @author 
 * @email 
 * @date 2021-05-02 01:18:52
 */
public interface XiangmupingjiaDao extends BaseMapper<XiangmupingjiaEntity> {
	
	List<XiangmupingjiaVO> selectListVO(@Param("ew") Wrapper<XiangmupingjiaEntity> wrapper);
	
	XiangmupingjiaVO selectVO(@Param("ew") Wrapper<XiangmupingjiaEntity> wrapper);
	
	List<XiangmupingjiaView> selectListView(@Param("ew") Wrapper<XiangmupingjiaEntity> wrapper);

	List<XiangmupingjiaView> selectListView(Pagination page,@Param("ew") Wrapper<XiangmupingjiaEntity> wrapper);
	
	XiangmupingjiaView selectView(@Param("ew") Wrapper<XiangmupingjiaEntity> wrapper);
	
}
