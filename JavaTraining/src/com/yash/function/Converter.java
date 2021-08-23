package com.yash.function;
@FunctionalInterface
public interface Converter<F,T> {
	public T convert(F from);

}
