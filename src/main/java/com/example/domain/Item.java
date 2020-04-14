package com.example.domain;

public class Item {
	/**
	 * 商品id
	 */
	private Integer id;
	/**
	 * 商品名
	 */
	private String name;
	/**
	 * 商品状態
	 */
	private Integer itemConditionId;
	/**
	 * 商品カテゴリー
	 */
	private Integer categoryId;
	/**
	 * ブランド名
	 */
	private String brandName;
	/**
	 * 値段
	 */
	private Double price;
	/**
	 * 送料が出品者負担かどうか(出品者負担: 1、購入者負担: 0)
	 */
	private Integer shipping;
	/**
	 * 商品説明
	 */
	private String itemDescription;

	@Override
	public String toString() {
		return "Items [id=" + id + ", name=" + name + ", itemConditionId=" + itemConditionId + ", categoryId="
				+ categoryId + ", brandName=" + brandName + ", price=" + price + ", shipping=" + shipping
				+ ", itemDescription=" + itemDescription + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getItemConditionId() {
		return itemConditionId;
	}

	public void setItemConditionId(Integer itemConditionId) {
		this.itemConditionId = itemConditionId;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getShipping() {
		return shipping;
	}

	public void setShipping(Integer shipping) {
		this.shipping = shipping;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
}
