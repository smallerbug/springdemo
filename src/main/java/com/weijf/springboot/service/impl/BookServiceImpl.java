/******************************************************************
 *
 *
 *    Package:     com.weijf.springboot.service.impl
 *
 *    Filename:    BookServiceImpl.java
 *
 *    Description: TODO(用一句话描述该文件做什么)
 *
 *
 *    @author:     Smallbug
 *
 *    @version:    1.0.0
 *
 *    Create at:   2017年3月22日 下午11:01:37
 *
 *    Revision:
 *
 *    2017年3月22日 下午11:01:37
 *        - first revision
 *
 *****************************************************************/
package com.weijf.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weijf.springboot.dao.BookMapper;
import com.weijf.springboot.model.Book;

/**
 * @ClassName BookServiceImpl
 * @Description TODO(这里用一句话描述这个类的作用)
 */
@Service
public class BookServiceImpl {

	@Autowired
	BookMapper bookMapper;

	public void getBookById(int id) {
		
		Book b = bookMapper.selectByPrimaryKey(id);
		System.out.println(b.getBookName());
	}
}
