/******************************************************************
 *
 *
 *    Package:     com.weijf.springboot.service
 *
 *    Filename:    UserService.java
 *
 *    Description: TODO(用一句话描述该文件做什么)
 *
 *
 *    @author:     Smallbug
 *
 *    @version:    1.0.0
 *
 *    Create at:   2017年3月22日 下午11:23:05
 *
 *    Revision:
 *
 *    2017年3月22日 下午11:23:05
 *        - first revision
 *
 *****************************************************************/
package com.weijf.springboot.service;

import com.weijf.springboot.model.User;

/**
 * @ClassName UserService
 * @Description TODO(这里用一句话描述这个类的作用)
 */
public interface UserService {
	public User getUserByid(int id);
}
