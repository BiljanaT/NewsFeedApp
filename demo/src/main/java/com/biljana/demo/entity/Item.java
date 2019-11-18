package com.biljana.demo.entity;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.biljana.demo.model.Enclosure;
import com.biljana.demo.util.ZonedDateTimeAdapter;

@Entity
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Item implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String guid;

	@Column(nullable = false)
	private String title;

	@Column(nullable = false)
	private String link;

	@Lob
	@Column(nullable = false)
	private String description;

	@Column(nullable = false)
	private String imageUrl;

	@Column(nullable = false)
	private String imageContentType;

	@Transient
	private Enclosure enclosure;

	@Column(nullable = false)
	@XmlJavaTypeAdapter(ZonedDateTimeAdapter.class)
	private ZonedDateTime pubDate;

	public Item() {

	}

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public ZonedDateTime getPubDate() {
		return pubDate;
	}

	public void setPubDate(ZonedDateTime pubDate) {
		this.pubDate = pubDate;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getImageContentType() {
		return imageContentType;
	}

	public void setImageContentType(String imageContentType) {
		this.imageContentType = imageContentType;
	}

	public Enclosure getEnclosure() {
		return enclosure;
	}

	public void setEnclosure(Enclosure enclosure) {
		this.enclosure = enclosure;
	}

	@Override
	public int hashCode() {
		return Objects.hash(guid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return Objects.equals(guid, other.guid);
	}

	@Override
	public String toString() {
		return "Item [guid=" + guid + ", title=" + title + ", link=" + link + ", description=" + description
				+ ", imageUrl=" + imageUrl + ", imageContentType=" + imageContentType + ", pubDate=" + pubDate + "]";
	}
}
