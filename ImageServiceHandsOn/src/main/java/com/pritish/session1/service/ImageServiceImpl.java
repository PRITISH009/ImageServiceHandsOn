package com.pritish.session1.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.pritish.session1.dao.ImageDao;
import com.pritish.session1.model.Image;

@Service
@EnableTransactionManagement
public class ImageServiceImpl implements ImageService{
	private ImageDao dao;
	
	@Autowired
	public ImageServiceImpl(ImageDao dao) {
		this.dao = dao;
	}
	
	@Override
	@Transactional
	public Iterable<Image> getAllImage() {
		return dao.findAll();
	}

	@Override
	@Transactional
	public Optional<Image> createImage(Image image) {
		dao.save(image);
		return Optional.of(image);
	}

	@Override
	@Transactional
	public Optional<Image> deleteImage(Image image) {
		dao.delete(image);
		return Optional.of(image);
	}

	@Override
	public Optional<Image> updateImage(Image image) {
		dao.save(image);
		return Optional.of(image);
	}
	
	
}
