public class Main {
    static class Complex{
        int real;
        int imaginary;
        public int getImaginary() {
            return imaginary;
        }

        public int getReal() {
            return real;
        }

        public void setImaginary(int imaginary) {
            this.imaginary = imaginary;
        }

        public void setReal(int real) {
            this.real = real;
        }
        static Complex sum (Complex n1, Complex n2){
            Complex temp = new Complex();
            temp.real = n1.real+n2.real;
            temp.imaginary = n1.imaginary+n2.imaginary;
            return temp;
        }
        public void showSum(){
            System.out.println("The sum of the two complex numbers is : "+this.real+" + "+this.imaginary+"i");
        }
        static Complex multiply(Complex n1,Complex n2){
            Complex temp = new Complex();
            temp.real = ((n1.real*n2.real)-(n1.imaginary*n2.imaginary));
            temp.imaginary = (n1.real*n2.imaginary)+(n1.imaginary*n2.real);
            return  temp;
        }
        public void showMultiple(){
            System.out.println("The product of the two complex numbers is : "+this.real+" + "+this.imaginary+"i");
        }
    }
    public static void main(String[] args) {
        Complex complexNumber1 = new Complex();
        Complex complexNumber2 = new Complex();
        complexNumber2.setReal(40);
        complexNumber2.setImaginary(50);
        complexNumber1.setImaginary(60);
        complexNumber1.setReal(70);
        complexNumber1.showSum();
        complexNumber2.showSum();
        Complex n1 = Complex.sum(complexNumber1,complexNumber2);
        n1.showSum();
    }
}