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

    @Transactional(readOnly = true)
    public List<CCinfo> getByCcname(String ccname) {
        return createRepository.getByCcname(ccname);
    }


    //插入添加一个学社对象
    @Transactional
    public void insert(CCinfo ccinfo) {
        createRepository.saveAndFlush(ccinfo);
    }
}
