package mysql.shopping;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Model class of 사용자.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class Users implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** uid. */
	private String uid;

	/** 사용자 명. */
	private String uname;

	/** 전화번호. */
	private String tel;

	/** 주소. */
	private String addr;

	/** The set of 주문 테이블. */
	private Set<Orders> ordersSet;

	/**
	 * Constructor.
	 */
	public Users() {
		this.ordersSet = new HashSet<Orders>();
	}

	/**
	 * Set the uid.
	 * 
	 * @param uid
	 *            uid
	 */
	public void setUid(String uid) {
		this.uid = uid;
	}

	/**
	 * Get the uid.
	 * 
	 * @return uid
	 */
	public String getUid() {
		return this.uid;
	}

	/**
	 * Set the 사용자 명.
	 * 
	 * @param uname
	 *            사용자 명
	 */
	public void setUname(String uname) {
		this.uname = uname;
	}

	/**
	 * Get the 사용자 명.
	 * 
	 * @return 사용자 명
	 */
	public String getUname() {
		return this.uname;
	}

	/**
	 * Set the 전화번호.
	 * 
	 * @param tel
	 *            전화번호
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}

	/**
	 * Get the 전화번호.
	 * 
	 * @return 전화번호
	 */
	public String getTel() {
		return this.tel;
	}

	/**
	 * Set the 주소.
	 * 
	 * @param addr
	 *            주소
	 */
	public void setAddr(String addr) {
		this.addr = addr;
	}

	/**
	 * Get the 주소.
	 * 
	 * @return 주소
	 */
	public String getAddr() {
		return this.addr;
	}

	/**
	 * Set the set of the 주문 테이블.
	 * 
	 * @param ordersSet
	 *            The set of 주문 테이블
	 */
	public void setOrdersSet(Set<Orders> ordersSet) {
		this.ordersSet = ordersSet;
	}

	/**
	 * Add the 주문 테이블.
	 * 
	 * @param orders
	 *            주문 테이블
	 */
	public void addOrders(Orders orders) {
		this.ordersSet.add(orders);
	}

	/**
	 * Get the set of the 주문 테이블.
	 * 
	 * @return The set of 주문 테이블
	 */
	public Set<Orders> getOrdersSet() {
		return this.ordersSet;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((uid == null) ? 0 : uid.hashCode());
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
		Users other = (Users) obj;
		if (uid == null) {
			if (other.uid != null) {
				return false;
			}
		} else if (!uid.equals(other.uid)) {
			return false;
		}
		return true;
	}

}