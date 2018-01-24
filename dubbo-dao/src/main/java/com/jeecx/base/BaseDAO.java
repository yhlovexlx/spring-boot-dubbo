package com.jeecx.base;

import com.jeecx.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

/**
 * ===========================
 * Created with IntelliJ IDEA.
 * User：yanghl
 * Date：2018/1/21
 * Time：18:52
 * ===========================
 */
@NoRepositoryBean
public interface BaseDAO extends JpaRepository<User,Integer>,JpaSpecificationExecutor<User>,Serializable{

}
