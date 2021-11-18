package use_a;

public class Complex {
		private double real; // 실수
		private double imag; // 허수
		
		// 생성자
		// setter, getter
		// toString, equals
		
		// 생성자
		public Complex() {
			
		}
		public Complex(double real, double imag) {
			this.real = real;
			this.imag = imag;
		}
		
		// setter, getter
		public double getReal() {
			return real;
		}
		public void setReal(double real) {
			this.real = real;
		}
		public double getImag() {
			return imag;
		}
		public void setImag(double imag) {
			this.imag = imag;
		}
		
		// 사용 관계
		// (3 + 5i) + (4 + 2i) == (3 + 4) + (5 + 2)i
		// c1.add(c2)
		
		public Complex add(Complex c) {
			return new Complex((this.real + c.real), (this.imag + c.imag));
		}
		
		// (3 + 5i) - (4 + 2i) == (3 - 4) + (5 - 2)i
		// c1.sub(c2)
		
		public Complex sub(Complex c) {
			return new Complex((this.real - c.real), (this.imag - c.imag));
		}
		
		// toString
		@Override
		public String toString() {
			return String.format("real : %5.2f, iamg : %5.2fi", real, imag);
		}
		
		// equals
		@Override
		public boolean equals(Object o) {
			return this.real == ((Complex)o).real && this.imag == ((Complex)o).imag;
		}
}


