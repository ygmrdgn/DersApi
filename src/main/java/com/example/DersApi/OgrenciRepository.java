package com.example.DersApi;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OgrenciRepository extends JpaRepository<OgrenciModel, Long> {
	
	//List<OgrenciModel> findByDersId(Long dersId);

}
