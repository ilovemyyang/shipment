package com.madjava.micro.convert;

public interface Converter<MODEL, DATA> {
	
	public DATA convertModelToData(MODEL source);
	
	public MODEL convertDataToModel(DATA source);

}
