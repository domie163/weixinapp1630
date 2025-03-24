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


import com.dao.ZixunxiangmuDao;
import com.entity.ZixunxiangmuEntity;
import com.service.ZixunxiangmuService;
import com.entity.vo.ZixunxiangmuVO;
import com.entity.view.ZixunxiangmuView;

@Service("zixunxiangmuService")
public class ZixunxiangmuServiceImpl extends ServiceImpl<ZixunxiangmuDao, ZixunxiangmuEntity> implements ZixunxiangmuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZixunxiangmuEntity> page = this.selectPage(
                new Query<ZixunxiangmuEntity>(params).getPage(),
                new EntityWrapper<ZixunxiangmuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZixunxiangmuEntity> wrapper) {
		  Page<ZixunxiangmuView> page =new Query<ZixunxiangmuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZixunxiangmuVO> selectListVO(Wrapper<ZixunxiangmuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZixunxiangmuVO selectVO(Wrapper<ZixunxiangmuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZixunxiangmuView> selectListView(Wrapper<ZixunxiangmuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZixunxiangmuView selectView(Wrapper<ZixunxiangmuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
