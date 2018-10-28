//0174934 张峻瑜
public  class Complex implements IComplex{
	private double real;//实部
	private double imag;//虚部
	public Complex(double real ,double imag){
		this.real = real;
		this.imag = imag;
	}
	
	public double getReal(){
		return real;
	}
	public void setReal(double real){
		this.real = real;
	}
	public double getImag() {
		return imag;
	}
	public void setImag(double imag) {
		this.imag = imag;
		
	}
	public void add(IComplex Z){
		if(Z!=null){
			real += Z.getReal();
			imag += Z.getImag();
		}
	}
	public void min(IComplex Z){
		if(Z!=null){
			real += -Z.getReal();
			imag += -Z.getImag();
		}
	}
	public void mutip(IComplex Z){
		if(Z!=null){
			double x = real;
			double y = imag;
			real = (x*Z.getReal())-(y*Z.getImag());
			imag = (x*Z.getImag())+(y*Z.getReal());
		}
			
	}
		
}
