public class lambda {
    interface TwoStringPredicate{
        boolean twoString (String one, String two);
    }

    public static void main(String[] args) {
        String string1 = "hej";
        String string2 = "hello";
        
        betterString(string1, string2, );

    }

    static void betterString(String s1, String s2, TwoStringPredicate t1){
        t1.twoString(s1, s2);
    }
}
