package es.urjc.videotranscoding.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.urjc.videotranscoding.entities.ConversionVideo;
import es.urjc.videotranscoding.repository.ConversionVideoRepository;
import es.urjc.videotranscoding.service.ConversionVideoService;

@Service
public class ConversionVideoServiceImpl implements ConversionVideoService {
	@Autowired
	private ConversionVideoRepository conversionVideoRepository;

	public void save(ConversionVideo video) {
		conversionVideoRepository.save(video);
	}

	public void delete(ConversionVideo video) {
		conversionVideoRepository.delete(video);
	}

	public void delete(long id) {
		conversionVideoRepository.delete(id);
	}

}