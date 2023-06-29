package powerpackage;

public class PowerFinder {
    private final int base;
    private final int power;

    public PowerFinder(int base, int power) {
        this.base = base;
        this.power = power;
    }

    public int findPowerOf() {
        if(this.power == 0)
            return this.base;
        int result = 1;
        for (int i = 0; i < this.power; i++) {
            result *= this.base;
        }
        return result;
    }


    public Boolean isResultCorrect(int value, int comparableValue) {
        return value == comparableValue;
    }
}
