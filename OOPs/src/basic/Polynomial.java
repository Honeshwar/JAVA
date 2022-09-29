package basic;

public class Polynomial {
	// degree as index
private	Dynamic_Array degree;
	
public Polynomial() {
	degree=new Dynamic_Array();// constructor call int[6];
}
	public void setCoefficient(int degree,int coeff) {
		for(int i=0;i<=degree;i++) {//degree 4,3,10--between element we set to zero
			
				this.degree.add(i);//to set coefficient in degree index
		}
		this.degree.set(degree,coeff);
	}
	
	int size() {
	return	this.degree.size();
	}
	public void print() {
		if(degree.size()==0) {
			return ;
		}
	for(int i=0;i<degree.size();i++) {
		if(degree.get(i)==0) {
			continue;
		}else {
			//degree.get(i) give coefficient value and i give degree
		System.out.println(degree.get(i)+"x^"+i+"+");
	}
	}
}
	
	//add two polynomial and return value in 
	 public   Polynomial add(Polynomial p) {
/*		 
		 int max=Math.max(degree.size(), p.size());
		 for(int i=0;i<max;i++) {
			 if(this.degree==p.degree) {
				int n1 =this.degree.get(i)+p.degree.get(i);
				degree.set(i, n1);
			 }}
			 Polynomial p1=new Polynomial();
			 for(int j=0;j<degree.size();j++) {
				 p1.setCoefficient(j, this.degree.get(j));
				// p1=this;
			 }
		 */
		 Polynomial p1=new Polynomial();
		 int max=Math.max(degree.size(), p.size());
		 for(int i=0;i<max;i++) {
			 if(this.degree.get(i)==0&& p.getCoefficient(i)==0) {
				 continue;
			 }
				int n1 =this.degree.get(i)+p.getCoefficient(i);//p.degree.get(i);
				p1.setCoefficient(i, n1);
			 //}
		 }
		 
		 
		return p1;
	}

	 public  Polynomial subtract(Polynomial p) {	
		 Polynomial p1=new Polynomial();
		 int max=Math.max(degree.size(), p.size());
		 for(int i=0;i<max;i++) {
			 if(this.degree.get(i)==0&& p.getCoefficient(i)==0) {
				 continue;
			 }
				int n1 =this.degree.get(i)- p.getCoefficient(i);
				p1.setCoefficient(i, n1);
			 }
		 
//					 for(int j=0;j<degree.size();j++) {
//				 p1.setCoefficient(j, this.degree.get(j));
//				// p1=this;
			 
		 
		 
		return p1;
	 }
	 public boolean isEmpty(int i) {
		 return this.degree.get(i)==0;
	 }
	 public  Polynomial multiply(Polynomial p) {
		 Polynomial p1=new Polynomial();
		 int max=Math.max(degree.size(), p.size());
		 for(int i=0;i<max;i++) {
			 for(int j=0;j<p.size();j++) {
				 
				int n1 =this.degree.get(i)*p.degree.get(j);
				if(p1.isEmpty(j)) {
				p1.setCoefficient(j, n1);
				}else {
					int n2=p1.getCoefficient(j)*n1;
					p1.setCoefficient(j, n2);				}
			 }
			 }
		 
		 
		return p1;
	 }
	 
	 public int getCoefficient(int degree) {
		 return this.degree.get(degree);
	 }

	}
