package com.pritish.session1.dao;

import java.util.UUID;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.pritish.session1.model.Image;

@Repository
public interface ImageDao extends CrudRepository<Image, UUID>{

}
