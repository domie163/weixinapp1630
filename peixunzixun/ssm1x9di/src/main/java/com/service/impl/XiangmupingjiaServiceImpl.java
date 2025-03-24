package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.XiangmupingjiaDao;
import com.entity.XiangmupingjiaEntity;
import com.service.XiangmupingjiaService;
import com.entity.vo.XiangmupingjiaVO;
import com.entity.view.XiangmupingjiaView;

@Service("xiangmupingjiaService")
public class XiangmupingjiaServiceImpl extends ServiceImpl<XiangmupingjiaDao, XiangmupingjiaEntity> implements XiangmupingjiaService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiangmupingjiaEntity> page = this.selectPage(
                new Query<XiangmupingjiaEntity>(params).getPage(),
                new EntityWrapper<XiangmupingjiaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiangmupingjiaEntity> wrapper) {
		  Page<XiangmupingjiaView> page =new Query<XiangmupingjiaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiangmupingjiaVO> selectListVO(Wrapper<XiangmupingjiaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiangmupingjiaVO selectVO(Wrapper<XiangmupingjiaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiangmupingjiaView> selectListView(Wrapper<XiangmupingjiaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiangmupingjiaView selectView(Wrapper<XiangmupingjiaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
