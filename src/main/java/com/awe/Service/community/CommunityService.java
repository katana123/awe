package com.awe.Service.community;

import com.awe.Entity.CCinfo;
import com.awe.Entity.CUlink;
import com.awe.Repositry.community.communityRepositry;
import com.awe.Repositry.community.culinkRepositry;
import com.awe.Repositry.register.ccusersRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;
import java.util.List;

@Service
public class CommunityService {

    @Autowired
    private communityRepositry communityRepositry;
    @Autowired
    private culinkRepositry culinkRepositry;
    @Autowired
    private ccusersRepositry ccusersRepositry;

    //获取学社关联的用户数量
    @Transactional
    public BigInteger membernum(Long ccid) {
        return ccusersRepositry.membernum(ccid);
    }

    //删除学社关联的用户
    @Transactional
    public void deleteLinkedMember(Long ccid, Long cuid) {
        culinkRepositry.deleteLinkedMember(ccid, cuid);
    }

    //获取学社关联的用户
    @Transactional
    public List<Object> linkedCCusers(Integer ccid) {
        return ccusersRepositry.findJoinedMembers(ccid);
    }

    //一个学社只能添加同一个用户一次
    @Transactional(readOnly = true)
    public CUlink linkOnce(Long ccid, Long cuid) {
        return culinkRepositry.findByCcidAndCuid(ccid, cuid);
    }

    //学社添加成员
    @Transactional
    public void addMember(CUlink cUlink) {
        culinkRepositry.saveAndFlush(cUlink);
    }

    //保存和修改
    @Transactional
    public void save(CCinfo cCinfo) {
        communityRepositry.saveAndFlush(cCinfo);
    }

    //获取一个学社对象
    @Transactional(readOnly = true)
    public CCinfo get(Integer ccid) {
        return communityRepositry.findOne(ccid);
    }


    //获取官方学社
    @Transactional(readOnly = true)
    public List<CCinfo> getAuthorityCommunities() {
        return communityRepositry.getByCleve((long) 0);
    }

}
