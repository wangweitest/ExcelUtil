/**
 * @author SargerasWang
 */
package com.sargeraswang.util.ExcelUtil;

import java.util.Date;

/**
 * The <code>Model</code>
 * 
 * @author SargerasWang Created at 2014年8月7日 下午5:09:29
 */
public class Model2 {
    @ExcelCell(index = 0)
    private String lineTitle;
    @ExcelCell(index = 1)
    private Date planDate;
    @ExcelCell(index = 2)
    private String sAdultPrice;
    @ExcelCell(index = 3)
    private String sChildPrice;
    @ExcelCell(index = 4)
    private String adultPrice;
    @ExcelCell(index = 5)
    private String childPrice;
    @ExcelCell(index = 6)
    private String remark;
	public String getLineTitle() {
		return lineTitle;
	}
	public void setLineTitle(String lineTitle) {
		this.lineTitle = lineTitle;
	}
	public Date getPlanDate() {
		return planDate;
	}
	public void setPlanDate(Date planDate) {
		this.planDate = planDate;
	}
	public String getsAdultPrice() {
		return sAdultPrice;
	}
	public void setsAdultPrice(String sAdultPrice) {
		this.sAdultPrice = sAdultPrice;
	}
	public String getsChildPrice() {
		return sChildPrice;
	}
	public void setsChildPrice(String sChildPrice) {
		this.sChildPrice = sChildPrice;
	}
	public String getAdultPrice() {
		return adultPrice;
	}
	public void setAdultPrice(String adultPrice) {
		this.adultPrice = adultPrice;
	}
	public String getChildPrice() {
		return childPrice;
	}
	public void setChildPrice(String childPrice) {
		this.childPrice = childPrice;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Model2(String lineTitle, Date planDate, String sAdultPrice, String sChildPrice, String adultPrice,
			String childPrice, String remark) {
		super();
		this.lineTitle = lineTitle;
		this.planDate = planDate;
		this.sAdultPrice = sAdultPrice;
		this.sChildPrice = sChildPrice;
		this.adultPrice = adultPrice;
		this.childPrice = childPrice;
		this.remark = remark;
	}
	public Model2() {
		super();
	}

}
