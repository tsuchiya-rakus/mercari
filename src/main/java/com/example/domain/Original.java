package com.example.domain;

public class Original {
	/**
	 * id
	 */
	private Integer trainId;
	/**
	 * 商品名
	 */
	private String name;
	/**
	 * 商品状態
	 */
	private Integer itemConditionId;
	/**
	 * カテゴリー名
	 */
	private String categoryName;
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

	public Integer getTrainId() {
		return trainId;
	}

	public void setTrainId(Integer trainId) {
		this.trainId = trainId;
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

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
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

	@Override
	public String toString() {
		return "Original [trainId=" + trainId + ", name=" + name + ", itemConditionId=" + itemConditionId
				+ ", categoryName=" + categoryName + ", brandName=" + brandName + ", price=" + price + ", shipping="
				+ shipping + ", itemDescription=" + itemDescription + "]";
	}

}
