package com.biljana.demo.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Rss implements Serializable {

	private static final long serialVersionUID = 1L;

	private Channel channel;

	public Rss() {

	}

	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}

}
