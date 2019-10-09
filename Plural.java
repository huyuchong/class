/*实现复数的加减乘除以及复数和整数的加减乘除
*	z = a + bi;
*
*/
package overload;

public class Plural{
	private double real,image;	//实部 虚部
	
	Plural(double real,double image){		//带参构造函数
		this.real = real;
		this.image = image;
	}
	
	public Plural() {
		//无参构造函数
	}
	
	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		
		this.real = real;
	}

	public double getImage() {
		return image;
	}

	public void setImage(double image) {
		
		this.image = image;
	}
	
	Plural add(Plural a) {	//复数相加
		double 	real2 =a.getReal();
		double 	image2=a.getImage();
		double newReal= real +real2;
		double newImage=image+image2;
		Plural result = new Plural(newReal,newImage);
		return result;
	}
	
	Plural sub(Plural a) {	//复数相减
		double 	real2 =a.getReal();
		double 	image2=a.getImage();
		double newReal= real -real2;
		double newImage=image-image2;
		Plural result = new Plural(newReal,newImage);
		return result;
	}
	
	Plural mul(Plural a) {	//复数相乘
		double 	real2 =a.getReal();
		double 	image2=a.getImage();
		double newReal= real *real2-image*image2;
		double newImage=real*image2+image*real2;
		Plural result = new Plural(newReal,newImage);
		return result;
	}
	
	
	Plural div(Plural a) {	//复数相除
		double 	real2 =a.getReal();
		double 	image2=a.getImage();
		double newReal= (real*real2+image*image2)/(real2*real2+image2*image2);
		double newImage=(image*real2-real*image2)/(real2*real2+image2*image2);
		Plural result = new Plural(newReal,newImage);
		return result;
	}
	
	Plural add(double a) {	//复数加整数
		double 	real2 =a;
		double newReal= real +real2;
		double newImage=image;
		Plural result = new Plural(newReal,newImage);
		return result;
	}
	
	Plural sub(double a) {	//复数整数相减
		double 	real2 =a;
		double newReal= real -real2;
		double newImage=image;
		Plural result = new Plural(newReal,newImage);
		return result;
	}
	
	Plural mul(double a) {	//复数实数相乘
		double 	real2 =a;
		double newReal= real *real2;
		double newImage=image*real2;
		Plural result = new Plural(newReal,newImage);
		return result;
	}
	
	
	Plural div(double a) {	//复数相除
		double 	real2 =a;
		double newReal= real/real2;
		double newImage=image/real2;
		Plural result = new Plural(newReal,newImage);
		return result;
	}
	
	public void prin() {	//输出函数
		if(image>0) {
			System.out.println(real+"+"+image+"i");
		}else if(image<0) {
			System.out.println(real+""+image+"i");
		}else {
			System.out.println(real);
		}
	}
	


public static void talk(String data1_1,String data1_2,String data2_2,String data2_1,String oper) {
	//格式转换
	
	double dat1_1=Double.parseDouble(data1_1);
	double dat1_2=Double.parseDouble(data1_2.substring(0,data1_2.length()-1));	//虚部
	double dat2_1=Double.parseDouble(data2_1);
	double dat2_2=Double.parseDouble(data2_2.substring(0,data2_2.length()-1));
	
	Plural num1 = new Plural(dat1_1,dat1_2);
	Plural num2 = new Plural(dat2_1,dat2_2);
	
	Plural result;
	int a,b;
	
	if(oper.equals("+")) {	//相加
		result = num1.add(num2);
		result.prin();
	}
	
	if(oper.equals("1")) {	//相减
		result = num1.sub(num2);
		result.prin();
	}
	
	if(oper.equals("*")) {	//相乘
		result = num1.mul(num2);
		result.prin();
	}
	
	if(oper.equals("/")) {	//相除
		
		if(num2.real*num2.real+num2.image*num2.image!=0) {
			result = num1.div(num2);
			result.prin();
		}else {
			System.out.println("运算出错，除法运算除数不能为0，请重新输入！");
		}
		
	}
}




}









