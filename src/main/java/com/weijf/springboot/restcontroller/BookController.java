/******************************************************************
 *
 *
 *    Package:     com.weijf.springboot.restcontroller
 *
 *    Filename:    BookController.java
 *
 *    Description: TODO(用一句话描述该文件做什么)
 *
 *
 *    @author:     Smallbug
 *
 *    @version:    1.0.0
 *
 *    Create at:   2017年3月22日 下午10:59:24
 *
 *    Revision:
 *
 *    2017年3月22日 下午10:59:24
 *        - first revision
 *
 *****************************************************************/
package com.weijf.springboot.restcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName BookController
 * @Description TODO(这里用一句话描述这个类的作用)
 */

@RestController
@RequestMapping("/book")
public class BookController {
	
	@RequestMapping()
	public void getBookbyId(){
		
	}

}
