package com.mobileservice.api.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mobileservice.api.entity.File;

@RepositoryRestResource(collectionResourceRel = "file", path = "file")
public interface FileRepo extends MongoRepository<File, String> {

	public List<File> findAll();
	
	public List<File> findByName(String name);
	
	public List<File> findByUniqueName(String uniqueName);

	public File findOneById(String id);

}
