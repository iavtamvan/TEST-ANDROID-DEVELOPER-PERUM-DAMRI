package com.ariavgroup.damri.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Root{

	@SerializedName("response_code")
	private String responseCode;

	@SerializedName("data")
	private ArrayList<DataItem> data;

	@SerializedName("status")
	private String status;

	public void setResponseCode(String responseCode){
		this.responseCode = responseCode;
	}

	public String getResponseCode(){
		return responseCode;
	}

	public void setData(ArrayList<DataItem> data){
		this.data = data;
	}

	public ArrayList<DataItem> getData(){
		return data;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}
}