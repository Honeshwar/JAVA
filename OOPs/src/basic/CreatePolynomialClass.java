package basic;

public class CreatePolynomialClass {
private int [] poly;
private int degreeMax;//degree=max index so that we will not iterate entire loop
 public CreatePolynomialClass() {
	poly=new int[10];
	degreeMax=0;
}
 public CreatePolynomialClass(int degree)
 {
     poly = new int[degree];
     degreeMax=degree-1;
 }
void print() {
	
	for(int i=0;i<this.poly.length;i++) {
		if(poly[i]!=0) {
		System.out.print(this.poly[i]+"x"+i+" ");
	}}
}
 
 
 
 void setCoef(int degree,int coef) {//degree=index
	 if(degree>this.poly.length-1) {
		 doubleCapacity();
	 }
	 if(degreeMax<degree) {
		 degreeMax=degree;
	 }
	 this.poly[degree]=coef;// in array , degree=index and coef=value
 }
int getCoef(int degree) {
	if(degree>poly.length-1
			||degree<0) {	try {
	
		throw new Exception();
		
	}catch(Exception e) {
		System.out.print("invalid index ");
	}
			}else {
	return this.poly[degree];}
	return -1;
}

  private void doubleCapacity() {
	int temp[]=this.poly;
	this.poly=new int[2*this.poly.length];//dynamic array
	for(int i=0;i<temp.length;i++) {
		poly[i]=temp[i];
	}
	
}
  public CreatePolynomialClass plus(CreatePolynomialClass c1) {
	  int n1=this.poly.length;
	  int n2=c1.poly.length;
	  int size;
	  if(n1>=n2)
		  size=n1;
	  else
		  size=n2;
	  CreatePolynomialClass c=new CreatePolynomialClass();
	  c.poly=new int[size];
	  for(int i=0;i<size;i++) {
		  c.poly[i]=this.poly[i]+c1.poly[i];
	  }
	  return c;
  }
 
  
  public CreatePolynomialClass subtract(CreatePolynomialClass c1) {
	  int n1=this.poly.length-1;
	  int n2=c1.poly.length-1;
	  int size;
	  if(n1>=n2)
		  size=n1;
	  else
		  size=n2;
	  CreatePolynomialClass c=new CreatePolynomialClass();
	  c.poly=new int[size+1];
	  for(int i=0;i<=size;i++) {
		  c.poly[i]=this.poly[i]-c1.poly[i];
	  }
	  return c;
  }
 
  
  public CreatePolynomialClass multiply(CreatePolynomialClass c1) {
	  int n1=this.poly.length;
	  int n2=c1.poly.length;
	  int size;
	  if(n1>=n2)
		  size=n1;
	  else
		  size=n2;
	  CreatePolynomialClass c=new CreatePolynomialClass();
	  c.poly=new int[size];
//	  for (int i=0;i<=this.degreeMax;i++)
//      {
//          int product=0;
//          for (int j=0;j<=c1.degreeMax;j++)
//          {
//        	  if(i+j>=c.poly.length) {
//        		  doubleCapacity();
//        	  }
//              product=c.poly[i+j];
//              product=product+(this.poly[i]*c1.poly[j]);
//              c.setCoef(i+j,product);
//          }
//          
//          
//      }
//		
//      return c;
		

	  
	  if(n1>=n2) {
	  for (int i=0;i<=this.degreeMax;i++)
	      {
       // int product=0;
        for (int j=0;j<=c1.degreeMax;j++){
        {
				  doubleCapacity();}
			  int temp1=0;
			  try {
			  if(c.poly[i*j]!=0) {
			   temp1=c.poly[i*j];
		  }
			  if(c1.poly[j]!=0||this.poly[i]!=0) {
			  c.poly[i*j]=this.poly[i]*c1.poly[j];
			  c.poly[i*j]=c.poly[i*j]*temp1;}
			  }catch(Exception e) { System.out.println("error "+i*j);}
			  
		  }
		  }
	  }else {
		  for (int i=0;i<=this.degreeMax;i++)
		      {
//		          int product=0;
		          for (int j=0;j<=c1.degreeMax;j++)
		          {
				  int temp2=0;
				  if(c.poly[i*j]!=0) {
				   temp2=c.poly[i*j];
			  }
				  c.poly[i*j]=this.poly[i]*c1.poly[j];
				  c.poly[i*j]=c.poly[i*j]+temp2;
		
			  }
		  }
		  }
	  return c;
	  }
		 
	  }

