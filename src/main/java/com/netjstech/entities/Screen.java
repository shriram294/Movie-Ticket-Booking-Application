package com.netjstech.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

@Table(name="screen")
public class Screen {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="screen_id")
	private int screenid;
	
	@Column(name="screen_name")
	private String screenname;
	
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="theatre_id",nullable=false)
	private Theatre theatre;
	
	@OneToMany(mappedBy="show",fetch=FetchType.LAZY)
	private List<Show>showList;

	public int getScreenid() {
		return screenid;
	}

	public void setScreenid(int screenid) {
		this.screenid = screenid;
	}

	public String getScreenname() {
		return screenname;
	}

	public void setScreenname(String screenname) {
		this.screenname = screenname;
	}

	public Theatre getTheatre() {
		return theatre;
	}

	public void setTheatre(Theatre theatre) {
		this.theatre = theatre;
	}

	public List<Show> getShowList() {
		return showList;
	}

	public void setShowList(List<Show> showList) {
		this.showList = showList;
	}

	
	
	
}
