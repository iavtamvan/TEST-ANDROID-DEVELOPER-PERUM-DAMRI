package com.ariavgroup.damri.model;

import com.google.gson.annotations.SerializedName;

public class DataItem{

	@SerializedName("asal")
	private String asal;

	@SerializedName("latloc")
	private String latloc;

	@SerializedName("nm_asal")
	private String nmAsal;

	@SerializedName("nm_kota")
	private String nmKota;

	@SerializedName("longloc")
	private String longloc;

	@SerializedName("alamat")
	private String alamat;

	public void setAsal(String asal){
		this.asal = asal;
	}

	public String getAsal(){
		return asal;
	}

	public void setLatloc(String latloc){
		this.latloc = latloc;
	}

	public String getLatloc(){
		return latloc;
	}

	public void setNmAsal(String nmAsal){
		this.nmAsal = nmAsal;
	}

	public String getNmAsal(){
		return nmAsal;
	}

	public void setNmKota(String nmKota){
		this.nmKota = nmKota;
	}

	public String getNmKota(){
		return nmKota;
	}

	public void setLongloc(String longloc){
		this.longloc = longloc;
	}

	public String getLongloc(){
		return longloc;
	}

	public void setAlamat(String alamat){
		this.alamat = alamat;
	}

	public String getAlamat(){
		return alamat;
	}
}