/** 
 * <pre>项目名称:phone_cht 
 * 文件名称:PageModel.java 
 * 包名:com.jk.util 
 * 创建日期:2018-9-6上午9:46:26 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.goodssolr.util;

import java.util.List;

/**
 * @Description <分页插件>
 * @Param
 * @Return 
 * @Author liushuxin
 * @Date 2019/11/21 19:07
 **/
public class PageModel {
		
	private Integer pageNow;  //当前页
	private Integer pageCount; //每页条数
	private Integer pageSum;  //总条数
	private Integer pageSize; //总页数
	
	private List list;  //分页查询的结果集
	

	public Integer getPageNow() {
		return pageNow;
	}
	public void setPageNow(Integer pageNow) {
		this.pageNow = pageNow;
	}
	public Integer getPageCount() {
		return pageCount;
	}
	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}
	public Integer getPageSum() {
		return pageSum;
	}
	public void setPageSum(Integer pageSum) {
		this.pageSum = pageSum;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}

	
	
	    //自定义有参构造方法，传入页数和条数  (总条数，当前页，每页条数)
		public PageModel(Integer pageSum, Integer pageNow, Integer pageCount) {
			super();
			
			this.pageNow = pageNow == null ? 1 : pageNow ;
			this.pageCount = pageCount == null ? 8 : pageCount ;
			this.pageSum = pageSum <= 0 ? 1 : pageSum ;
			//计算总页数
			this.pageSize = (this.pageSum-1) / this.pageCount + 1;
			
			//纠正有可能出现错误的参数
			if(this.pageNow > this.pageSize){
				this.pageNow = this.pageSize;
			}
			
			if(this.pageNow < 1 ){
				this.pageNow = 1;
			}

		}
		
		//分页方法：设置起始条数
		public Integer getFirstResultCount(){
			
			Integer firstResultCount = ( getPageNow() - 1 ) * getPageCount();
			
			return firstResultCount;
		}
		   
		/**    
		 * <pre>创建一个新的实例 PageModel.    
		 *    </pre>    
		 */
		public PageModel() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
}
