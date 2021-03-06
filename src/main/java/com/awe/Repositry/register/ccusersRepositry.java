package com.awe.Repositry.register;

import com.awe.Data.InstitutionMembers;
import com.awe.Entity.CCusers;
import com.awe.Data.CommunityMembers;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;
import java.util.List;

@Repository
public interface ccusersRepositry extends JpaRepository<CCusers, Integer>, JpaSpecificationExecutor<CCusers> {

    CCusers getByCuid(Long cuid);

    CCusers getByCusername(String cuserName);

    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(value = "update c_cusers u set u.cemail =?1 where u.cuid = ?2",nativeQuery = true)
    int updateEmailByCuid( String cemail,  Long cuid);

    List<CCusers> getByCusernameAndCpwd(String cuserName, String cPwd);

    CCusers getByCupn(String cupn);

    /*@Query(value = "select u.cuid,u.cusername,u.cqqid,u.cupn,cu.jointime "
            +"from c_cusers u right join c_ulink cu on u.cuid = cu.cuid where cu.roleid>1 and cu.ccid =?1 order by u.cuid group by u", nativeQuery = true)*/
    @Override
    Page<CCusers> findAll(Specification<CCusers> cCusersSpecification, Pageable pageable);

    @Query(value = "select u.cuid,u.cusername,u.cqqid,u.cupn,cu.jointime from c_cusers u right join c_ulink cu on u.cuid = cu.cuid where cu.roleid>1 and cu.ccid =?1", nativeQuery = true)
    List<InstitutionMembers> findInstitutionMembers(Integer ccid);

    @Query(value = "select count(*) membernum from c_cusers u right join c_ulink cu on u.cuid = cu.cuid where cu.roleid>1 and cu.ccid = ?1", nativeQuery = true)
    BigInteger membernum(Long ccid);

    @Query(value = "select cuid from c_cusers where cusername=?1", nativeQuery = true)
    int getCuidbyCusername(String cusername);

    @Query(value = "select u.cuid,u.cusername,u.cqqid,u.cupn,cu.jointime from c_cusers u right join c_ulink cu on u.cuid = cu.cuid where cu.ccid = ?1", nativeQuery = true)
    List<CommunityMembers> findCommunityMembers(Integer ccid);

    @Query(value = "select u.cuid,u.cusername,u.cqqid,u.cupn,cu.jointime from c_cusers u right join c_ulink cu on u.cuid = cu.cuid where cu.ccid =?2 and u.cusername=?1", nativeQuery = true)
    List<CommunityMembers> findOneCommunityMemberByCusernameAndCcid(String cuserName,Integer ccid);

    @Query(value = "select count(*) membernum from c_cusers u right join c_ulink cu on u.cuid = cu.cuid where cu.roleid = ?2 and cu.ccid = ?1", nativeQuery = true)
    BigInteger authorityMemberNum(Long ccid,Long roleid);

    @Query(value = "select u.cusername,u.cqqid,u.cuid from c_cusers u right join C_ulink cu on u.cuid = cu.cuid where cu.roleid = ?2 and cu.ccid = ?1", nativeQuery = true)
    List<Object> authorityMemberList(Long ccid,Long roleid);
}
