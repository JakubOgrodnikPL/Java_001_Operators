public class Operators {
    public static void main(String[] args) {
        double a=4;
        double b=3;
        double c=a+b;
        double d=a-b;
        double e=a*b;
        double f=a/b;
        int x=4;
        int y=3;
        int g=x%y;
        String s1="4";
        String s2="3";
        String s3=s1+s2;
        String s4="pomidor1";
        String s5="pomidor2";
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(s3); //Konkatenacja
        System.out.println("x > y: "+x+" > "+y);
        System.out.println("x > y: "+(x>y));
        System.out.println("x < y: "+(x<y));
        System.out.println("x >= y: "+(x>=y));
        System.out.println("x <= y: "+(x<=y));
        System.out.println("x = y: "+(x==y));
        System.out.println("x != y: "+(x!=y));
        System.out.println("s4.equals(s5)"+s4.equals(s5));
        System.out.println("!s4.equals(s5)"+!s4.equals(s5));
        System.out.println(b1&&b2);
        System.out.println(b1||b2);
        System.out.println(!b1);
        System.out.println(!b2);
        y += 2;
        x -= 3;
        System.out.println(y);
        System.out.println(x);
        y++;
        x--;
        System.out.println(y);
        System.out.println(x);
        System.out.println("-----------");
        System.out.println(y);
        System.out.println(y++);
        System.out.println(y);
        System.out.println("-----------");
        System.out.println(x);
        System.out.println(++x);
        System.out.println(x);

    }
}
