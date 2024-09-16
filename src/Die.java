
public class Die {

    private int num;

    public Die() {
        this.num = (int) (Math.random() * 6 + 1);
    }

    public void roll() {
        this.num = (int) (Math.random() * 6 + 1);
    }

    public int getNum() {
        return this.num;
    }

    public long isGreaterThen(Die other) {
        double diff = this.num - other.num;
        double posDiff = Math.abs(diff);
        //int res = (int)Math.round(diff/posDiff);

        int res = (int) Math.round(diff / posDiff);

        if (diff == 0 && res != 0) {
            System.out.println("CALCULATION ERROR 1 !!");
        }
        if ((diff > 0 && res <= 0) || (diff < 0 && res >= 0)) {
            System.out.println("CALCULATION ERROR 2 !!");
        }

        return res;

    }

    @Override
    public String toString() {
        return "The number is :" + this.num;
    }

}
