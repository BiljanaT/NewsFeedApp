package com.biljana.demo.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.biljana.demo.entity.Item;

@XmlRootElement
public class Channel implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Item> item = new ArrayList<>();

	public Channel() {

	}

	public List<Item> getItem() {
		return item;
	}

	public void setItem(List<Item> item) {
		this.item = item;
	}

}