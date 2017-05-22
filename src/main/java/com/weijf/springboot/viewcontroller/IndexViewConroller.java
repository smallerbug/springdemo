/******************************************************************
 *
 *
 *    Package:     com.weijf.springboot.viewcontroller
 *
 *    Filename:    IndexViewConroller.java
 *
 *    Description: TODO(用一句话描述该文件做什么)
 *
 *
 *    @author:     Smallbug
 *
 *    @version:    1.0.0
 *
 *    Create at:   2017年3月9日 下午10:45:44
 *
 *    Revision:
 *
 *    2017年3月9日 下午10:45:44
 *        - first revision
 *
 *****************************************************************/
package com.weijf.springboot.viewcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName IndexViewConroller
 * @Description TODO(这里用一句话描述这个类的作用)
 */

@Controller
public class IndexViewConroller {

	@RequestMapping("/")
	public String index() {
		System.out.println("===index view====");
		return "index";
	}
}
