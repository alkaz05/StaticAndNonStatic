public class Main {
    public static void main(String[] args) {
        System.out.println("поле x в классе доступно без создания объекта ");
        System.out.println(A.x);
        A.x++;
        System.out.println(A.x);
        System.out.println("поле y требует создания объекта ");
        A a1 = new A();
        System.out.println(a1.y);
        a1.y -=15;
        System.out.println(a1.y);
        A a2 = new A();
        System.out.println(a2.y);
        a2.y+=30;
        System.out.println(a1.y + "  "+a2.y);

        B.say1(123);
        //B.say2();   //ошибка. обращение к нестатическому методу без указания объекта
        B b1 = new B();
        b1.say2(345);
        b1.z = 600;
        b1.say2(345);
    }
}

class A{
    static int x = 15;
    int y = 26;
}

class B{
    int z;
    public static void say1(int q)
    {
        System.out.println("Это статический метод. Он видит свой параметр");
        System.out.println("q = "+q);
        System.out.println("но не видит нестатического поля z");
        //System.out.println("z = "+z);
    }

    public  void say2(int p)
    {
        System.out.println("Это нестатический метод. Он видит свой параметр");
        System.out.println("p = "+p);
        System.out.println("И видит нестатическое поле z");
        System.out.println("z = "+z);
    }
}