package Task002;

import org.junit.*;

import static org.mockito.Mockito.mock;

/**
 * Created by Ekaterina on 22.02.2016.
 */
public class Matrix2x2Test {
    private static final double EPS = 1e-9;
    public static Matrix2x2 zeroMatrix;
    public static Matrix2x2 matrix2x21;
    public static Matrix2x2 matrix2x22;
    public static double mas[][];
    public static double k;

    @Before
    public void before() {
        matrix2x22 = new Matrix2x2(k);
        matrix2x21 = new Matrix2x2(new double[][]{{1, 2}, {3, 4}});
        mas = new double[2][2];
        zeroMatrix = new Matrix2x2();

    }

    @Test
    public void zeroMatrixShouldBeZero (){
        Assert.assertEquals(zeroMatrix.get(0, 0), 0, EPS);
    }

    @Test
    public void kMatrixShouldBeK (){
        Assert.assertArrayEquals(matrix2x22.getMas(), new double[][]{{k, k}, {k, k}});
    }

    @Test
    public void matrixConstructorShouldWorkCorrect (){
        Assert.assertArrayEquals(matrix2x21.getMas(),new double[][]{{1, 2}, {3, 4}} );
    }
    @Test
    public void getShouldWorkCorrect(){
        Assert.assertEquals(matrix2x21.get(0, 1), 2, EPS);
    }

    @Test
    public void getMasShouldWorkCorrect(){
        mas = new double[][] {{1, 2}, {3, 4}};
        Assert.assertArrayEquals(mas, matrix2x21.getMas());
    }
    @Test
    public void addShouldWorkCorrect() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                mas[i][j] = matrix2x21.get(i, j) + matrix2x22.get(i, j);
            }
        }
        Assert.assertArrayEquals(mas, matrix2x21.add(matrix2x22).getMas());
    }

    @Test
    public void add2ShouldWorkCorrect() {
        mas = matrix2x21.add(matrix2x22).getMas();
        matrix2x21.add2(matrix2x22);
        Assert.assertArrayEquals(mas, matrix2x21.getMas() );
    }

    @Test
    public void subShouldWorkCorrect() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                mas[i][j] = matrix2x21.get(i, j) - matrix2x22.get(i, j);
            }
        }
       Assert.assertArrayEquals(mas, matrix2x21.sub(matrix2x22).getMas());
    }

    @Test
    public void sub2ShouldWorkCorrect() {
        mas = matrix2x21.sub(matrix2x22).getMas();
        matrix2x21.sub2(matrix2x22);
        Assert.assertArrayEquals(mas, matrix2x21.getMas() );
    }

    @Test
    public void multNumberShouldWorkCorrect() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                mas[i][j] = mas[i][j] * k;
            }
        }
        Assert.assertArrayEquals(mas, matrix2x21.multNumber(k).getMas() );

    }

    @Test
    public void multNumber2ShouldWorkCorrect() {
        mas = matrix2x21.multNumber(k).getMas();
        matrix2x21.multNumber2(k);
        Assert.assertArrayEquals(mas, matrix2x21.getMas() );

    }

    @Test
    public void multShouldWorkCorrect() {
        mas[0][0] = matrix2x21.get(0, 0) * matrix2x22.get(0, 0) + matrix2x21.get(0, 1) * matrix2x22.get(1, 0);
        mas[0][1] = matrix2x21.get(0, 0) * matrix2x22.get(0, 1) + matrix2x21.get(0, 1) * matrix2x22.get(1, 1);
        mas[1][0] = matrix2x21.get(1, 0) * matrix2x22.get(0, 0) + matrix2x21.get(1, 1) * matrix2x22.get(1, 0);
        mas[1][1] = matrix2x21.get(1, 0) * matrix2x22.get(0, 1) + matrix2x21.get(1, 1) * matrix2x22.get(1, 1);

        Assert.assertArrayEquals(mas, matrix2x21.mult(matrix2x22).getMas() );
    }

    @Test
    public void mult2ShouldWorkCorrect() {
        mas = matrix2x21.mult(matrix2x22).getMas();
        matrix2x21.mult2(matrix2x22);
        Assert.assertArrayEquals( mas, matrix2x21.getMas());

    }

    @Test
    public void detShouldWorkCorrect() {
        Assert.assertEquals(matrix2x21.get(0, 0) * matrix2x21.get(1, 1) - matrix2x21.get(0, 1) * matrix2x21.get(1, 0), matrix2x21.det(), EPS);
    }

    @Test
    public void transponShouldWorkCorrect() {
        mas = matrix2x21.getMas();
        double a = mas[1][0];
        mas[1][0] = mas[0][1];
        mas[0][1] = a;
        matrix2x21.transpon();
        Assert.assertArrayEquals(mas, matrix2x21.getMas());
    }

    @Test
    public void inverseMatrixShouldWorkCorrect() {
        Matrix2x2 matrix = matrix2x21;
        double g = matrix.det();
        matrix.transpon();
        mas = matrix.getMas();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                mas[i][j] *= 1 / g;
            }
        }
        Assert.assertArrayEquals(mas, matrix2x21.inverseMatrix().getMas() );

    }

    @Test
    public void inverseMatrixCaseZeroDetShouldWorkCorrect() {
        Matrix2x2 matrix = new Matrix2x2(new double[][]{{1,2},{1, 2}});
        mas = new double[][]{{0,0},{0,0}};
        Assert.assertArrayEquals(mas, matrix.inverseMatrix().getMas() );

    }

    @Test
    public void equivalentDiagonalShouldWorkCorrect() {
        mas = new double[][]{{-2, 0},{0, -4}};
        Assert.assertArrayEquals(mas, matrix2x21.equivalentDiagonal().getMas() );

    }

    @Test
    public void multVector2DShouldWorkCorrect(){
        Vector2D vector2D = mock(Vector2D.class);
        Assert.assertEquals(matrix2x21.multVector2D(vector2D).getX(), matrix2x21.get(0,0) * vector2D.getX() + matrix2x21.get(0, 1) * vector2D.getY(), EPS);
        Assert.assertEquals(matrix2x21.multVector2D(vector2D).getY(), matrix2x21.get(1,0) * vector2D.getX() + matrix2x21.get(1, 1) * vector2D.getY(), EPS);

    }
}
