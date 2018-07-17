package com.example.DersApi;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;


@Entity
@Table(name = "ogretmenTA")    
public class OgretmenModel {
	
	@Id
	@GeneratedValue(generator ="ogretmenGenerator")
	@SequenceGenerator(
			name= "ogretmenGenerator",
			sequenceName="ogretmenSequence"
			
			)
	private Long ogretmenTc;
	
	@NotBlank
	@Column(columnDefinition = "text")
	private String ogretmenAdi;
	@Column(columnDefinition = "text")
	private String ogretmenSoyadi;
	
	
	public long getOgretmenTc() {
		return ogretmenTc;
	}
	public void setOgretmenTc(long ogretmenTc) {
		this.ogretmenTc = ogretmenTc;
	}
	public String getOgretmenAdi() {
		return ogretmenAdi;
	}
	public void setOgretmenAdi(String ogretmenAdi) {
		this.ogretmenAdi = ogretmenAdi;
	}
	public String getOgretmenSoyadi() {
		return ogretmenSoyadi;
	}
	public void setOgretmenSoyadi(String ogretmenSoyadi) {
		this.ogretmenSoyadi = ogretmenSoyadi;
	}
	

}
