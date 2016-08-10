package org.fp.interfaces;

public class DefaultMethodDemo {

    private final Formula formula = new Formula() {
        @Override
        public double calculate(double value) {
            return doDouble(value) / 2d;
        }
    };

    public double callImpl(double value) {
        return formula.calculate(value);
    }

    public double callDefault(double value) {
        return formula.doDouble(value);
    }
}
