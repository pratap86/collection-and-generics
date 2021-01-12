package com.pratap.generics.method;

import java.util.List;

public class GenericMethod {

	public <T> T showItem(T t) {
		System.out.println("The item is : "+t.toString());
		return t;
	}
	
	public <T> List<Bucket<T>> addStore(T t, List<Bucket<T>> buckets){
		Bucket<T> bucket = new Bucket<>();
		bucket.setItem(t);
		buckets.add(bucket);
		return buckets;
	}
}
