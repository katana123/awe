package com.awe.Service.community;

import com.awe.Entity.CCinfo;
import com.awe.Entity.CCusers;
import com.awe.Repositry.community.CreateRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CreateService {
    @Autowired
    private CreateRepository createRepository;

    //检查社团名称是否重复
    @Transactional(readOnly = true)
    public CCinfo getByCcname(String ccname) {
        return createRepository.getByCcname(ccname);
    }

    //检查机构名称是否重复
    @Transactional(readOnly = true)
    public CCinfo getByCccname(String cccname) {
        return createRepository.getByCccname(cccname);
    }

    //更新一个学社对象的类型
    @Transactional
    public void updatecct(String cct, Integer ccid) {
        createRepository.updatCcinfoByCcid(cct, ccid);
    }

    //插入添加一个学社对象
    @Transactional
    public void update(CCinfo ccinfo) {
        createRepository.saveAndFlush(ccinfo);
    }

    //插入添加一个学社对象
    @Transactional
    public void insert(CCinfo ccinfo) {
        createRepository.saveAndFlush(ccinfo);
    }
}
