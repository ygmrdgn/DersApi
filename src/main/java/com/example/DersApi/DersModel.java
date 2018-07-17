package com.example.DersApi;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.example.DersApi.OgretmenModel;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name= "dersTA")
public class DersModel extends DenetimModel {
	
	@Id
	@GeneratedValue(generator="dersGenerator")
	@SequenceGenerator(
			name="dersGenerator",
			sequenceName="dersSequence",
			initialValue=1
			)
	private Long dersId;
	

    @Column(columnDefinition = "text")
    private String dersAdi;
    
    	// ************ManyToOne***********ders-ogretmen*************
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ogretmen_tc", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private OgretmenModel ogretmen;
    
    //************ManyToMany************ ders-ogrenci**************
    
    @ManyToMany(mappedBy="dersim")
    public Set<OgrenciModel> getOgrenciTc()
    { return getOgrenciTc(); }

//    
//    @ManyToMany(fetch = FetchType.LAZY)
//    @JoinColumn(name = "ogrenci_tc", nullable = false)
//    @OnDelete(action = OnDeleteAction.CASCADE)
//    @JsonIgnore
//    private OgrenciModel ogrenci;

	public Long getDersId() {
		return dersId;
	}


	public void setDersId(Long dersId) {
		this.dersId = dersId;
	}


	public String getDersAdi() {
		return dersAdi;
	}


	public void setDersAdi(String dersAdi) {
		this.dersAdi = dersAdi;
	}


	public OgretmenModel getOgretmen() {
		return ogretmen;
	}


	public void setOgretmen(OgretmenModel ogretmen) {
		this.ogretmen = ogretmen;
	}


//	public OgrenciModel getOgrenci() {
//		return ogrenci;
//	}
//
//
//	public void setOgrenci(OgrenciModel ogrenci) {
//		this.ogrenci = ogrenci;
//	}
    
    

}
