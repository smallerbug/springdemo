/******************************************************************
 *
 *
 *    Package:     com.weijf.springboot.service.impl
 *
 *    Filename:    UserServiceImpl.java
 *
 *    Description: TODO(用一句话描述该文件做什么)
 *
 *
 *    @author:     Smallbug
 *
 *    @version:    1.0.0
 *
 *    Create at:   2017年3月22日 下午11:19:56
 *
 *    Revision:
 *
 *    2017年3月22日 下午11:19:56
 *        - first revision
 *
 *****************************************************************/
package com.weijf.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weijf.springboot.dao.UserMapper;
import com.weijf.springboot.model.User;
import com.weijf.springboot.service.UserService;

/**
 * @ClassName UserServiceImpl
 * @Description TODO(这里用一句话描述这个类的作用)
 */
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserMapper userMapper;

	public User getUserByid(int id) {
		User user = userMapper.selectByPrimaryKey(id);
		return user;
	}
}
