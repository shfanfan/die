public class Main {
    public static void main(String[] args)
    {
        Die d1 = new Die();
        Die d2 = new Die();
        System.out.println(d1.getNum());
        System.out.println(d2.getNum());
        System.out.println(d1.getNum()<d2.getNum());
        d1.roll();
        d2.roll();
        System.out.print(d1.getNum());
        System.out.print("-");
        System.out.println(d2.getNum());
        System.out.println(d1.getNum()+d2.getNum());
        System.out.println(d1.getNum()+","+d2.getNum());
    }
}
