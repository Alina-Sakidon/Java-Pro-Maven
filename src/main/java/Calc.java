import com.sun.scenario.effect.impl.sw.java.JSWBlend_EXCLUSIONPeer;

public class Calc {

    public int perform(int first, int second, Operator operator) {
        switch (operator) {
            case SUM:
                return first + second;
            case MINUS:
                return first - second;
            case DIVIDE:
                return first / second;
            case MULTIPLY:
                return first * second;
            default:
                throw new IllegalArgumentException("Wrong value");
        }
    }
}
