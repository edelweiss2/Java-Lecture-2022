package mysql.shopping;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Model class of 상품 테이블.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class Products implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** 상품 아이디. */
	private Integer pid;

	/** 상품명. */
	private String pname;

	/** 도입 가격. */
	private Integer cost;

	/** 판매 가격. */
	private Integer price;

	/** The set of 카트 테이블. */
	private Set<Cart> cartSet;

	/**
	 * Constructor.
	 */
	public Products() {
		this.cartSet = new HashSet<Cart>();
	}

	/**
	 * Set the 상품 아이디.
	 * 
	 * @param pid
	 *            상품 아이디
	 */
	public void setPid(Integer pid) {
		this.pid = pid;
	}

	/**
	 * Get the 상품 아이디.
	 * 
	 * @return 상품 아이디
	 */
	public Integer getPid() {
		return this.pid;
	}

	/**
	 * Set the 상품명.
	 * 
	 * @param pname
	 *            상품명
	 */
	public void setPname(String pname) {
		this.pname = pname;
	}

	/**
	 * Get the 상품명.
	 * 
	 * @return 상품명
	 */
	public String getPname() {
		return this.pname;
	}

	/**
	 * Set the 도입 가격.
	 * 
	 * @param cost
	 *            도입 가격
	 */
	public void setCost(Integer cost) {
		this.cost = cost;
	}

	/**
	 * Get the 도입 가격.
	 * 
	 * @return 도입 가격
	 */
	public Integer getCost() {
		return this.cost;
	}

	/**
	 * Set the 판매 가격.
	 * 
	 * @param price
	 *            판매 가격
	 */
	public void setPrice(Integer price) {
		this.price = price;
	}

	/**
	 * Get the 판매 가격.
	 * 
	 * @return 판매 가격
	 */
	public Integer getPrice() {
		return this.price;
	}

	/**
	 * Set the set of the 카트 테이블.
	 * 
	 * @param cartSet
	 *            The set of 카트 테이블
	 */
	public void setCartSet(Set<Cart> cartSet) {
		this.cartSet = cartSet;
	}

	/**
	 * Add the 카트 테이블.
	 * 
	 * @param cart
	 *            카트 테이블
	 */
	public void addCart(Cart cart) {
		this.cartSet.add(cart);
	}

	/**
	 * Get the set of the 카트 테이블.
	 * 
	 * @return The set of 카트 테이블
	 */
	public Set<Cart> getCartSet() {
		return this.cartSet;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pid == null) ? 0 : pid.hashCode());
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Products other = (Products) obj;
		if (pid == null) {
			if (other.pid != null) {
				return false;
			}
		} else if (!pid.equals(other.pid)) {
			return false;
		}
		return true;
	}

}
