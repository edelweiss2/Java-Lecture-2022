package mysql.erd.bbs;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Model class of 게시판.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class Board implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** 글 아이디. */
	private Integer bid;

	/** 제목. */
	private String btitle;

	/** 본문. */
	private String bcontent;

	/** 사용자. */
	private Users users;

	/** 글 쓴 시간. */
	private Date modetime;

	/** 조회수. */
	private Integer viewcount;

	/** 댓글수. */
	private Integer replycount;

	/** The set of 댓글. */
	private Set<Reply> replySet;

	/**
	 * Constructor.
	 */
	public Board() {
		this.replySet = new HashSet<Reply>();
	}

	/**
	 * Set the 글 아이디.
	 * 
	 * @param bid
	 *            글 아이디
	 */
	public void setBid(Integer bid) {
		this.bid = bid;
	}

	/**
	 * Get the 글 아이디.
	 * 
	 * @return 글 아이디
	 */
	public Integer getBid() {
		return this.bid;
	}

	/**
	 * Set the 제목.
	 * 
	 * @param btitle
	 *            제목
	 */
	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}

	/**
	 * Get the 제목.
	 * 
	 * @return 제목
	 */
	public String getBtitle() {
		return this.btitle;
	}

	/**
	 * Set the 본문.
	 * 
	 * @param bcontent
	 *            본문
	 */
	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}

	/**
	 * Get the 본문.
	 * 
	 * @return 본문
	 */
	public String getBcontent() {
		return this.bcontent;
	}

	/**
	 * Set the 사용자.
	 * 
	 * @param users
	 *            사용자
	 */
	public void setUsers(Users users) {
		this.users = users;
	}

	/**
	 * Get the 사용자.
	 * 
	 * @return 사용자
	 */
	public Users getUsers() {
		return this.users;
	}

	/**
	 * Set the 글 쓴 시간.
	 * 
	 * @param modetime
	 *            글 쓴 시간
	 */
	public void setModetime(Date modetime) {
		this.modetime = modetime;
	}

	/**
	 * Get the 글 쓴 시간.
	 * 
	 * @return 글 쓴 시간
	 */
	public Date getModetime() {
		return this.modetime;
	}

	/**
	 * Set the 조회수.
	 * 
	 * @param viewcount
	 *            조회수
	 */
	public void setViewcount(Integer viewcount) {
		this.viewcount = viewcount;
	}

	/**
	 * Get the 조회수.
	 * 
	 * @return 조회수
	 */
	public Integer getViewcount() {
		return this.viewcount;
	}

	/**
	 * Set the 댓글수.
	 * 
	 * @param replycount
	 *            댓글수
	 */
	public void setReplycount(Integer replycount) {
		this.replycount = replycount;
	}

	/**
	 * Get the 댓글수.
	 * 
	 * @return 댓글수
	 */
	public Integer getReplycount() {
		return this.replycount;
	}

	/**
	 * Set the set of the 댓글.
	 * 
	 * @param replySet
	 *            The set of 댓글
	 */
	public void setReplySet(Set<Reply> replySet) {
		this.replySet = replySet;
	}

	/**
	 * Add the 댓글.
	 * 
	 * @param reply
	 *            댓글
	 */
	public void addReply(Reply reply) {
		this.replySet.add(reply);
	}

	/**
	 * Get the set of the 댓글.
	 * 
	 * @return The set of 댓글
	 */
	public Set<Reply> getReplySet() {
		return this.replySet;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bid == null) ? 0 : bid.hashCode());
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
		Board other = (Board) obj;
		if (bid == null) {
			if (other.bid != null) {
				return false;
			}
		} else if (!bid.equals(other.bid)) {
			return false;
		}
		return true;
	}

}
