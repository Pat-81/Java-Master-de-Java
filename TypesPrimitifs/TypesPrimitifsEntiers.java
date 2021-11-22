package TypesPrimitifs;

public class TypesPrimitifsEntiers {
    public static void main(String[] args) {
        byte nombreByte = (byte)129;
        System.out.println(nombreByte);
        System.out.println("Valeur mini = " + Byte.MIN_VALUE );
        System.out.println("Valeur mini = " + Byte.MAX_VALUE );

        short nombreShort = (short)32768;
        System.out.println(nombreShort);
        System.out.println("Valeur mini = " + Short.MIN_VALUE );
        System.out.println("Valeur mini = " + Short.MAX_VALUE );

        int nombreInt = (int)2147483648L;
        System.out.println(nombreInt);
        System.out.println("Valeur mini = " + Integer.MIN_VALUE );
        System.out.println("Valeur mini = " + Integer.MAX_VALUE );

        long nombreLong = 9223372036854775807L;
        System.out.println(nombreLong);
        System.out.println("Valeur mini = " + Long.MIN_VALUE );
        System.out.println("Valeur mini = " + Long.MAX_VALUE );
    }
}
