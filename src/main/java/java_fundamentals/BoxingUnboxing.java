package java_fundamentals;

//boxing -> converting primitive data types to corresponding wrapper class(object type)
//unboxing -> converting an object of wrapper class back to its corresponding primitive type.

public class BoxingUnboxing{
    public static void main(String... args){
        boxing();
        unboxing();
    }

    private static void boxing(){
        int i1 = 65;
        Integer i2 = i1; //autoboxing
        System.out.println(i2);

        i2 = Integer.valueOf(i1);//boxing
        System.out.println(i2);

        Byte b = Byte.valueOf((byte)i1);
        System.out.println(b);

        Short s = Short.valueOf((short)i1);
        System.out.println(s);

        Float v = Float.valueOf((float)i1);
        System.out.println(v);

        Long l = Long.valueOf((long)i1);
        System.out.println(l);

        Double d = Double.valueOf((double)i1);
        System.out.println(d);
    }
}