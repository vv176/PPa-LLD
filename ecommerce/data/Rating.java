package ecommerce.data;

public enum Rating {
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5);

    public int getVal() {
        return val;
    }

    private final int val;

    private Rating(int val) {
        this.val = val;
    }
}
