package com.pritish.session1.service;

import java.util.Optional;

import com.pritish.session1.model.Image;

public interface ImageService {
	public Iterable<Image> getAllImage();

	public Optional<Image> createImage(Image image);

	public Optional<Image> deleteImage(Image image);

	public Optional<Image> updateImage(Image image);
}
