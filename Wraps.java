// what can a wrapper class do compared to the real deal?

class Wraps{
    public static void main(String[] args) {
        Integer x = new Integer(10);
        Integer z = new Integer(10);
        Short a = 20;
        Short b = 20;
        
        // comparing with == vs .equals, and chached values
        System.out.println(x == z);
        System.out.println(x.equals(z));


        // .valueof instances with values between -12X and 12X are chached, and reused
        System.out.println(a == b);
        System.out.println(a.equals(b));
        
        // can stand-in as returntype, arg, and value to return
        System.out.println(IntsOnly(x));

        // can do arithmic operations
        System.out.println("Incrementing Integer " + x + " with ++unary comes to " + ++x);
        System.out.println("Modulo 4 on Integer " + x + " comes to " + (x%4));
        System.out.println("Multiplying Integer " + x + " by 2 comes to " + x*2);
        System.out.println("It is " + (new Integer(10) >= new Integer(2)) + " that Integers can compare size");
        

        // notice how modulo does not reflect change
        int y = 4;
        System.out.println(y%2);
        System.out.println(y);


        System.out.println();
    }

    static int IntsOnly(int i){
        Integer r = 5;
        System.out.println("About to return an " + r.getClass().getSimpleName());
        return r;
    }

    static Integer IntsOnly(Integer i){
        System.out.println("In the Integer version in IntsOnly");
        Integer r = 2;
        return r;
    }
}