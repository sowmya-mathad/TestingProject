package Misc;

class Demo{

    public static void main(String[] args) {
//        int x=100;
//        int y=x;
//        x++;
//        int z=y;
//        z++;
//        System.out.println(y);

        int m = 1;
        int n = ++m + m++ + --m;
        System.out.println(n);

        boolean a= true;
        boolean b=!true;
        boolean c= a|b;
        boolean d=a&b;
        boolean e= d?b:c;
        System.out.println(d+""+e);

        boolean x = true;
        boolean y = false;

        System.out.println(!(x && y));
        System.out.println(x&&y);
        System.out.println(x||y);
    }
}