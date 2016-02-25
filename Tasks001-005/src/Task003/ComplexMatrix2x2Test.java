package Task003;

import org.junit.Before;
import org.junit.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Ekaterina on 22.02.2016.
 */
public class ComplexMatrix2x2Test {
    public static ComplexMatrix2x2 simpleComplexMatrix2x2 = new ComplexMatrix2x2();
    public static ComplexMatrix2x2 complexMatrix1;
    public static ComplexMatrix2x2 complexMatrix2;
    public static ComplexMatrix2x2 fakematrix;
    public static ComplexVector2D fakevector;
@BeforeClass
public static void beforeclass(){
     fakevector = mock(ComplexVector2D.class);
    ComplexNumber fakeX = mock(ComplexNumber.class);
    ComplexNumber fakeY = mock(ComplexNumber.class);
    when(fakeX.getRe()).thenReturn(1.0);
    when(fakeX.getIm()).thenReturn(1.0);
    when(fakeY.getRe()).thenReturn(2.0);
    when(fakeY.getIm()).thenReturn(2.0);
    when(fakevector.getComplexNumberX()).thenReturn(fakeX);
    when(fakevector.getComplexNumberY()).thenReturn(fakeY);
}

    @Before
    public void before() {
        complexMatrix1 = new ComplexMatrix2x2(new ComplexNumber(1, 1), new ComplexNumber(2, 2), new ComplexNumber(3, 3), new ComplexNumber(4, 4));
        complexMatrix2 = new ComplexMatrix2x2(new ComplexNumber(1, 1));
        fakematrix = mock(ComplexMatrix2x2.class);
        when(fakematrix.get(0, 0)).thenReturn(new ComplexNumber(1, 1));
        when(fakematrix.get(0, 1)).thenReturn(new ComplexNumber(1, 1));
        when(fakematrix.get(1, 0)).thenReturn(new ComplexNumber(1, 1));
        when(fakematrix.get(1, 1)).thenReturn(new ComplexNumber(1, 1));
    }

    @Test
    public void getShouldWorkCorrect() {
        Assert.assertTrue(complexMatrix1.get(0, 0).equals(new ComplexNumber(1, 1)));

    }


    @Test
    public void complexNumberMasEqualsShouldWorkCorrect() {
        Assert.assertTrue(complexMatrix1.complexNumberMasEquals(complexMatrix1.getMas()));
    }

    @Test
    public void zeroComplexMatrix2x2ShouldBeZero() {
        Assert.assertTrue(simpleComplexMatrix2x2.complexNumberMasEquals(new ComplexNumber[][]{{new ComplexNumber(), new ComplexNumber()}, {new ComplexNumber(), new ComplexNumber()}}));
    }

    @Test
    public void oneComplexNumberConstructorShouldWorkCorrect() {
        Assert.assertTrue(complexMatrix2.complexNumberMasEquals(new ComplexNumber[][]{{new ComplexNumber(1, 1), new ComplexNumber(1, 1)}, {new ComplexNumber(1, 1), new ComplexNumber(1, 1)}}));
    }

    @Test
    public void fourComplexNumberConstructorShouldWorkCorrect() {
        Assert.assertTrue(complexMatrix1.complexNumberMasEquals(new ComplexNumber[][]{{new ComplexNumber(1, 1), new ComplexNumber(2, 2)}, {new ComplexNumber(3, 3), new ComplexNumber(4, 4)}}));
    }

    @Test
    public void detShouldWorkCorrect() {
        ComplexNumber det = mock(ComplexNumber.class);
        when(det.getRe()).thenReturn(0.0);
        when(det.getIm()).thenReturn(-4.0);

        Assert.assertTrue(complexMatrix1.det().equals(det));
    }

    @Test
    public void addShoulWorkCorrect() {
        Assert.assertTrue(complexMatrix1.add(fakematrix).complexNumberMasEquals(new ComplexNumber[][]{{new ComplexNumber(2, 2), new ComplexNumber(3, 3)}, {new ComplexNumber(4, 4), new ComplexNumber(5, 5)}}));
    }

    @Test
    public void multShouldWorkCorrect() {
        Assert.assertTrue(complexMatrix1.mult(fakematrix).complexNumberMasEquals(new ComplexNumber[][]{{new ComplexNumber(0, 6), new ComplexNumber(0, 6)}, {new ComplexNumber(0, 14), new ComplexNumber(0, 14)}}));
    }

    @Test
    public void multVectorShouldWorkCorrect() {


        Assert.assertTrue(complexMatrix1.multVector(fakevector).equals(new ComplexVector2D(new ComplexNumber(0, 0), new ComplexNumber(0, 0))));
    }

    @Test
    public void equalsComplexVectorShouldWorkCorrect(){
        ComplexVector2D complexVector2D = new ComplexVector2D(new ComplexNumber(1,1), new ComplexNumber(1,1));
        Assert.assertFalse(complexVector2D.equals(fakevector));

    }


}
