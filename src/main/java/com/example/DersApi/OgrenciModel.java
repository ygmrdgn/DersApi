package com.example.DersApi;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name= "ogrenciTA")
public class OgrenciModel {
	
	
	@Id
	@GeneratedValue(generator= "ogrenciGenerator")
	@SequenceGenerator(
			
			name="ogrenciGenerator",
			sequenceName="ogrenciSequence"
			
			)
	private Long ogrenciTc;
	
	@NotBlank
	@Column(columnDefinition = "text")
	private String ogrenciAdi;
	@Column(columnDefinition = "text")
	private String ogrenciSoyadi;
	
	
	//************ManyToMany************ ders-ogrenci**************
	
	@ManyToMany
	@JoinTable(name="ogrenciTc ")
	public Set<DersModel> getDersId()
	{  return getDersId(); }
	
//	
//	    @ManyToMany(fetch = FetchType.LAZY)
//	    @JoinColumn(name = "ders_Id", nullable = false)
//	    @OnDelete(action = OnDeleteAction.CASCADE)
//	    @JsonIgnore
//	    private DersModel ders;


		public Long getOgrenciTc() {
			return ogrenciTc;
		}


		public void setOgrenciTc(Long ogrenciTc) {
			this.ogrenciTc = ogrenciTc;
		}


		public String getOgrenciAdi() {
			return ogrenciAdi;
		}


		public void setOgrenciAdi(String ogrenciAdi) {
			this.ogrenciAdi = ogrenciAdi;
		}


		public String getOgrenciSoyadi() {
			return ogrenciSoyadi;
		}


		public void setOgrenciSoyadi(String ogrenciSoyadi) {
			this.ogrenciSoyadi = ogrenciSoyadi;
		}


//		public DersModel getDers() {
//			return ders;
//		}
//
//
//		public void setDers(DersModel ders) {
//			this.ders = ders;
//		}

	

}
