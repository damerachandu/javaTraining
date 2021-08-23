package com.yash.lambda;

public class ComputeInterfaceImpl implements ComputeInterface {

	@Override
	public int compute(int no1, int no2) {
		// TODO Auto-generated method stub
		return no1+no2;
	}
	
	class ComputeInterfaceInnerImpl implements ComputeInterface{
		
		@Override
		public int compute(int no1, int no2) {
			// TODO Auto-generated method stub
			return no1-no2;
		}
		
	}
	
	public static void main(String args[]) {
		ComputeInterfaceImpl outer=new ComputeInterfaceImpl();
		outer.compute(10, 20);
		
		ComputeInterfaceImpl.ComputeInterfaceInnerImpl inner=outer.new ComputeInterfaceInnerImpl();
		inner.compute(20,30);
		
		ComputeInterface annoymous=new ComputeInterface() {
			@Override
			public int compute(int no1, int no2) {
				// TODO Auto-generated method stub
				return no1-no2;
			}
		};
		
		annoymous.compute(34, 90);
		
		ComputeInterface lambda1=(no1,no2)->{
			return no1*no2;
		};
		
		lambda1.compute(2, 3);
		
		ComputeInterface lambda2=(no1,no2)->no1-no2;
		lambda2.compute(3, 9);
		
	}

}
