package com.pratap.generics.boundedtype;

public class BoundedType {

	public <T extends Comparable<T>> T calculateMin(T t1, T t2) {
		
		return t1.compareTo(t2) < 0 ? t1 :t2;
	}
}
