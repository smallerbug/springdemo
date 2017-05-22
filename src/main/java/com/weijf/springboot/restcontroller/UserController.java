/******************************************************************
 *
 *
 *    Package:     com.weijf.springboot.restcontroller
 *
 *    Filename:    UserController.java
 *
 *    Description: TODO(用一句话描述该文件做什么)
 *
 *
 *    @author:     Smallbug
 *
 *    @version:    1.0.0
 *
 *    Create at:   2017年3月9日 下午10:22:47
 *
 *    Revision:
 *
 *    2017年3月9日 下午10:22:47
 *        - first revision
 *
 *****************************************************************/
package com.weijf.springboot.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.weijf.springboot.model.User;
import com.weijf.springboot.service.UserService;

/**
 * @ClassName UserController
 * @Description TODO(这里用一句话描述这个类的作用)
 */

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public User getUserByid(@PathVariable("id") int id) {
		User u = new User();
		u = userService.getUserByid(id);
		
		System.out.println("----"+u.getUserName());
		return u;
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public User addUser(User user) {
		System.out.println(user.getId() + user.getUserName() + user.getUserPass());
		User u = new User();
		u.setId(15);
		u.setUserName("weijf");
		System.out.println("----");
		return u;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public User deleteUserByid(@PathVariable("id") int id) {
		User u = new User();
		u.setId(id);
		u.setUserName("wei");
		System.out.println("--1--");
		return u;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public User setUserByid(@PathVariable("id") int id, User user) {
		System.out.println(id + "======" + user.getId() + user.getUserName() + user.getUserPass());
		User u = new User();
		u.setId(17);
		u.setUserName("weijf233");
		System.out.println("--put--");
		return u;
	}

}
