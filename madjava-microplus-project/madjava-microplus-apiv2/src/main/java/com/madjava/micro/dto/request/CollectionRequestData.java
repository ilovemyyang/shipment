package com.madjava.micro.dto.request;

import java.io.Serializable;
import java.util.Collection;

import lombok.Data;

@Data
public class CollectionRequestData<T> implements Serializable{
	private static final long serialVersionUID = -4751660998062230854L;
	
	private Collection<T> datas;
}
