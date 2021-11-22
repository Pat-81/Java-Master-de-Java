package TypesPrimitifs;

public class TypesPrimitifsFloat {
    public static void main(String[] args) {

        float numberFloat = (float)3.4028235E38D;
        System.out.println("nombreFloat : " + numberFloat );
        System.out.println("nombreFloatMini : " + Float.MIN_VALUE );
        System.out.println("nombreFloatMax : " + Float.MAX_VALUE );

        double numberDouble = 1.7976931348623157E308;
        System.out.println("nombreDouble : " + numberDouble );
        System.out.println("nombreDoubleMini : " + Double.MIN_VALUE );
        System.out.println("nombreDoubleMax : " + Double.MAX_VALUE );
    }
}
