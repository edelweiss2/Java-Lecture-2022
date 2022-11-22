package mysql.shopping;

import java.io.Serializable;

/**
 * Model class of 카트 테이블.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class Cart implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** 주문 테이블. */
	private Orders orders;

	/** 상품 테이블. */
	private Products products;

	/** 수량. */
	private Integer quantity;

	/**
	 * Constructor.
	 */
	public Cart() {
	}

	/**
	 * Set the 주문 테이블.
	 * 
	 * @param orders
	 *            주문 테이블
	 */
	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	/**
	 * Get the 주문 테이블.
	 * 
	 * @return 주문 테이블
	 */
	public Orders getOrders() {
		return this.orders;
	}

	/**
	 * Set the 상품 테이블.
	 * 
	 * @param products
	 *            상품 테이블
	 */
	public void setProducts(Products products) {
		this.products = products;
	}

	/**
	 * Get the 상품 테이블.
	 * 
	 * @return 상품 테이블
	 */
	public Products getProducts() {
		return this.products;
	}

	/**
	 * Set the 수량.
	 * 
	 * @param quantity
	 *            수량
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	/**
	 * Get the 수량.
	 * 
	 * @return 수량
	 */
	public Integer getQuantity() {
		return this.quantity;
	}


}
