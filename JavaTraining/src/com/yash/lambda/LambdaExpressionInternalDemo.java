package com.yash.lambda;

import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaConversionException;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class LambdaExpressionInternalDemo {

	
	public static int computeVal(int...n) {
		int sum=0;
		for(int i:n) {
			sum+=i;
		}
		return sum;
	}
	public static void main(String[] args) throws Throwable {

		ComputeInterface1 lambda=(n)->{
			int sum=0;
			for(int i:n) {
				sum+=i;
			}
			return sum;
		};
		
		System.out.println("Implict:"+lambda.compute(10,20,30));
		
		//Explict
		
		MethodHandles.Lookup caller=MethodHandles.lookup();
		MethodType methodType=MethodType.methodType(int.class,int[].class);
		
		MethodType invokedType=MethodType.methodType(ComputeInterface1.class);
		
		CallSite site=LambdaMetafactory.metafactory(caller, "compute", invokedType, methodType,
				caller.findStatic(LambdaExpressionInternalDemo.class,"computeVal",
						MethodType.methodType(int.class,int[].class)), methodType);
		
		MethodHandle factory=site.getTarget();
		ComputeInterface1 computeInterface1=(ComputeInterface1)factory.invoke();
		System.out.println("Explict:"+computeInterface1.compute(10,20,30));
		
		
		
		
		
		
	}

}
