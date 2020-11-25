package M1SIR.Projet_AGL;

public class Calculator {
	//Somme
	public int sum(int a,int b){
		int sum=a+b;
		return sum;
	}
	public int minus(int a,int b){
		return a- b;
	}
	public int divide(int a,int b) throws Exception{
		if(b==0){
			throw new Exception("la valeur de b ne doit pas etre nulle");
		}else{
			return a/b;
		}
	}
	public int multiply(int a,int b){
		return a*b;
	}
	public int min(int a,int b){
		return Math.min(a, b);
	}
	public int max(int a,int b){
		return Math.max(a, b);
	}
	public int minElement(int list[]){
		int min=0;
		for (int i = 0; i < list.length; i++) {
			min=min(min,list[i]);
		}
		return min;
	}
	public int maxElement(int list[]){
		int max=0;
		for (int i = 0; i < list.length; i++) {
			max=max(max,list[i]);
		}
		return max;
	}


}
