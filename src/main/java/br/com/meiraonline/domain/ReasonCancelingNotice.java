package br.com.meiraonline.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ReasonCancelingNotice implements Serializable{

	private static final long serialVersionUID = -6998282821648804633L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;

	public ReasonCancelingNotice() {
		super();
	}

	public ReasonCancelingNotice(String name) {
		super();
		this.name = name;
	}

	public ReasonCancelingNotice(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
