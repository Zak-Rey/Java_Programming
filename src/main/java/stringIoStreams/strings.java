package stringIoStreams;

public class strings {
    public static void main(String... args){
        //class string methods

        equals();
        contains();
        startsEndsWith();
        length();
        indexOf();
        substring();
        concat();
        join();
        compareTo();
        matches();
        format();
        replace();
        toLowerCase();
        toUpperCase();
        split();
        isEmpty();
        valueOf();
        repeat();
        isBlank();
        strip();
        lines();

        //String utils
        trim();
    }

    private static void equals() {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = "acb";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println("abc".equals(s2));
        System.out.println("abc".equals(s3));

        String s4 = "ezekiel";
        String s5 = "Ezekiel";

        System.out.println(s4.equalsIgnoreCase(s5));
        System.out.println(s4.equals(s5));
    }

    private static void contains(){
        String s6 = "abc43%";
        String s7 = "43";
        String s8 = "xyz";
        System.out.println(s6.contains(s7));
        System.out.println(s6.contains(s8));
    }
}
