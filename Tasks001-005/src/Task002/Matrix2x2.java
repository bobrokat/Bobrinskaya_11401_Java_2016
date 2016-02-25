package Task002;

/**
 * @autor Ekaterina Bobrinskaya
 * 401
 * 052
 */
public class Matrix2x2 {
    private double mas[][] = new double[2][2];

    public Matrix2x2 (){
        this(0.0);

    }

    public Matrix2x2(double k) {
        mas[0][0] = k;
        mas[0][1] = k;
        mas[1][0] = k;
        mas[1][1] = k;
    }

    public Matrix2x2(double [][] mas) {
        this.mas[0][0] = mas[0][0];
        this.mas[0][1] = mas[0][1];
        this.mas[1][0] = mas[1][0];
        this.mas[1][1] = mas[1][1];

    }

    public double [][]  getMas() {
        return mas;
    }


    public double get(int i, int j){
        return mas[i][j];
    }



    public  Matrix2x2 add( Matrix2x2 matrix2x21) {
        double mas2[][] = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                mas2[i][j] = this.mas[i][j] + matrix2x21.mas[i][j];
            }
        }
        Matrix2x2 matrix2x22 = new Matrix2x2(mas2);
        return matrix2x22;
    }

    public void add2(Matrix2x2 matrix2x21) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                this.mas[i][j] += matrix2x21.mas[i][j];
            }
        }
    }

    public  Matrix2x2 sub(Matrix2x2 matrix2x21) {
        double mas2[][] = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                mas2[i][j] = this.mas[i][j] - matrix2x21.mas[i][j];
            }
        }
        Matrix2x2 matrix2x22 = new Matrix2x2(mas2);
        return matrix2x22;
    }

    public void sub2(Matrix2x2 matrix2x21) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                this.mas[i][j] -= matrix2x21.mas[i][j];
            }
        }
    }

    public Matrix2x2 multNumber(double k) {
        double mas2[][] = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                mas2[i][j] = this.mas[i][j] * k;
            }
        }
        Matrix2x2 matrix2x22 = new Matrix2x2(mas2);
        return matrix2x22;
    }

    public void multNumber2(double k) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                this.mas[i][j] *= k;
            }
        }
    }

    public Matrix2x2 mult( Matrix2x2 matrix2x21) {
        double mas2[][] = new double[2][2];
        mas2[0][0] = this.mas[0][0] * matrix2x21.mas[0][0] + this.mas[0][1] * matrix2x21.mas[1][0];
        mas2[0][1] = this.mas[0][0] * matrix2x21.mas[0][1] + this.mas[0][1] * matrix2x21.mas[1][1];
        mas2[1][0] = this.mas[1][0] * matrix2x21.mas[0][0] + this.mas[1][1] * matrix2x21.mas[1][0];
        mas2[1][1] = this.mas[1][0] * matrix2x21.mas[0][1] + this.mas[1][1] * matrix2x21.mas[1][1];
        Matrix2x2 matrix2x22 = new Matrix2x2(mas2);
        return matrix2x22;

    }

    public void mult2(Matrix2x2 matrix2x21) {
        double a = this.mas[0][0];
        double b = this.mas[0][1];
        double c = this.mas[1][0];
        double d = this.mas[1][1];
        this.mas[0][0] = a * matrix2x21.mas[0][0] + b * matrix2x21.mas[1][0];
        this.mas[0][1] = a * matrix2x21.mas[0][1] + b * matrix2x21.mas[1][1];
        this.mas[1][0] = c * matrix2x21.mas[0][0] + d * matrix2x21.mas[1][0];
        this.mas[1][1] = c * matrix2x21.mas[0][1] + d * matrix2x21.mas[1][1];

    }

    public double det() {
        return this.mas[0][0] * this.mas[1][1] - this.mas[0][1] * this.mas[1][0];
    }

    public void transpon() {
        double a = this.mas[1][0];
        this.mas[1][0] = this.mas[0][1];
        this.mas[0][1] = a;
    }

    public Matrix2x2 inverseMatrix() {
        double g = this.det();
        if (g == 0) {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    this.mas[i][j] = 0;
                }
            }
        } else {
            this.transpon();
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    this.mas[i][j] *= 1 / g;
                }
            }
        }
        return this;
    }

    public Matrix2x2 equivalentDiagonal() {
        double a = this.mas[0][0];
        double b = this.mas[0][1];
        double c = this.mas[1][0];
        for (int j = 0; j < 2; j++) {
            this.mas[0][j] *= c;
            this.mas[1][j] *= a;
        }
        for (int j = 0; j < 2; j++) {
            this.mas[1][j] -= this.mas[0][j];
        }
        this.mas[0][0] = a;
        this.mas[0][1] = b;
        double d = this.mas[1][1];
        for (int j = 0; j < 2; j++) {
            this.mas[0][j] *= d;
            this.mas[1][j] *= b;
        }
        for (int j = 0; j < 2; j++) {
            this.mas[0][j] -= this.mas[1][j];
        }

        return this;
    }

    public Vector2D multVector2D (Vector2D vector2D){
        Vector2D vector2D1 = new Vector2D();
        vector2D1.setX(this.mas[0][0] * vector2D.getX() + this.mas[0][1] * vector2D.getY() );
        vector2D1.setY(this.mas[1][0] * vector2D.getX() + this.mas[1][1] * vector2D.getY() );
        return vector2D1;



    }
}

