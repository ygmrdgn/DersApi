package com.example.DersApi;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface DersRepository extends JpaRepository<DersModel, Long> {
	
//	List<DersModel> findByOgretmenTc(Long ogretmenTc);
//	List<DersModel> findByOgrenciTc(Long ogrenciTc);

	

}
