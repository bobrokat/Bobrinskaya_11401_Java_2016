package Task003;


/**
 * @autor Ekaterina Bobrinskaya
 * 401
 * 056
 */
public class ComplexMatrix2x2 {

    private ComplexNumber mas[][] = new ComplexNumber[2][2];
    private ComplexNumber mas00, mas01, mas10, mas11;


    public ComplexMatrix2x2() {
        this(new ComplexNumber(), new ComplexNumber(), new ComplexNumber(), new ComplexNumber());
    }

    public ComplexMatrix2x2(ComplexNumber complexNumber) {
        this(complexNumber, complexNumber, complexNumber, complexNumber);

    }

    public ComplexMatrix2x2(ComplexNumber mas00, ComplexNumber mas01, ComplexNumber mas10, ComplexNumber mas11) {

        this.mas[0][0] = mas00;
        this.mas[0][1] = mas01;
        this.mas[1][0] = mas10;
        this.mas[1][1] = mas11;

    }

    public ComplexNumber get(int i, int j) {
        return this.mas[i][j];
    }

    public ComplexNumber[][] getMas() {
        return this.mas;
    }

    public boolean complexNumberMasEquals(ComplexNumber[][] mas) {
        boolean flag = true;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
              }
        }
        return flag;
    }


    public ComplexMatrix2x2 add(ComplexMatrix2x2 complexMatrix2x21) {
        ComplexMatrix2x2 complexMatrix2x22 = new ComplexMatrix2x2();
        complexMatrix2x22.mas[0][0] = this.get(0, 0).add(complexMatrix2x21.get(0, 0));
        complexMatrix2x22.mas[0][1] = this.get(0, 1).add(complexMatrix2x21.get(0, 1));
        complexMatrix2x22.mas[1][0] = this.get(1, 0).add(complexMatrix2x21.get(1, 0));
        complexMatrix2x22.mas[1][1] = this.get(1, 1).add(complexMatrix2x21.get(1, 1));
        return complexMatrix2x22;
    }

    public ComplexMatrix2x2 mult(ComplexMatrix2x2 complexMatrix2x21) {
        ComplexMatrix2x2 complexMatrix2x22 = new ComplexMatrix2x2();
        complexMatrix2x22.mas[0][0] = this.get(0, 0).mult(complexMatrix2x21.get(0, 0)).add(this.get(0, 1).mult(complexMatrix2x21.get(1, 0)));
        complexMatrix2x22.mas[0][1] = this.get(0, 0).mult(complexMatrix2x21.get(0, 1)).add(this.get(0, 1).mult(complexMatrix2x21.get(1, 1)));
        complexMatrix2x22.mas[1][0] = this.get(1, 0).mult(complexMatrix2x21.get(0, 0)).add(this.get(1, 1).mult(complexMatrix2x21.get(1, 0)));
        complexMatrix2x22.mas[1][1] = this.get(1, 0).mult(complexMatrix2x21.get(0, 1)).add(this.get(1, 1).mult(complexMatrix2x21.get(1, 1)));
        return complexMatrix2x22;
    }

    public ComplexNumber det() {
        return this.mas[0][0].mult(this.mas[1][1]).sub(this.mas[1][0].mult(this.mas[0][1]));
    }

    public ComplexVector2D multVector(ComplexVector2D complexVector2D) {
        ComplexVector2D complexVector2D1 = new ComplexVector2D();
        complexVector2D1.setComplexNumberX(this.mas[0][0].mult(complexVector2D.getComplexNumberX()).add(this.mas[0][1].mult(complexVector2D.getComplexNumberY())));
        complexVector2D1.setComplexNumberY(this.mas[1][0].mult(complexVector2D.getComplexNumberX()).add(this.mas[1][1].mult(complexVector2D.getComplexNumberY())));
        return complexVector2D1;

    }


}
