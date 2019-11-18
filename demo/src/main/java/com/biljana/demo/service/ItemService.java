package com.biljana.demo.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.biljana.demo.model.Rss;
import com.biljana.demo.repository.ItemRepository;

@Service
public class ItemService {

	private static final long INTERVAL = 1000 * 60 * 5;

	private static final String URL = "http://feeds.nos.nl/nosjournaal?format=xml";

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private ItemRepository itemRepository;

	@Scheduled(fixedDelay = INTERVAL)
	public void update() throws IOException {
		Rss rss = restTemplate.getForObject(URL, Rss.class);

		rss.getChannel().getItem().forEach(i -> {
			i.setImageUrl(i.getEnclosure().getUrl());
			i.setImageContentType(i.getEnclosure().getType());
		});

		itemRepository.saveAll(rss.getChannel().getItem());
	}

}
