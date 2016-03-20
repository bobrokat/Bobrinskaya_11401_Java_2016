package Task009;

/**
 * @autor Ekaterina Bobrinskaya
 * 401
 * 051
 */
public class ComplexNumber {
    private double re;
    private double im;

    public ComplexNumber () {
        this(0,0);
    }


    public ComplexNumber (double re, double im){

        this.re = re;
        this.im = im;
    }

    public double getRe (){
        return re;
    }

    public double getIm (){
        return im;
    }





    public ComplexNumber add( ComplexNumber complexNumber1) {
        ComplexNumber complexNumber3 = new ComplexNumber();
        complexNumber3.re = this.re + complexNumber1.re;
        complexNumber3.im = this.im + complexNumber1.im;
        return ( complexNumber3);
    }



    public ComplexNumber sub ( ComplexNumber complexNumber1){
        ComplexNumber complexNumber3 = new ComplexNumber();
        complexNumber3.re = this.re - complexNumber1.re;
        complexNumber3.im = this.im - complexNumber1.im;
        return ( complexNumber3);
    }



    public ComplexNumber mult ( ComplexNumber complexNumber1) {
        ComplexNumber complexNumber3 = new ComplexNumber();
        complexNumber3.re = this.re * complexNumber1.re - this.im * complexNumber1.im;
        complexNumber3.im = this.im * complexNumber1.re + this.re * complexNumber1.im ;
        return ( complexNumber3);

    }



    public  boolean equals ( ComplexNumber complexNumber1) {
        return (this.re == complexNumber1.getRe()) && (this.im == complexNumber1.getIm());
    }


}
