package rocks.zipcode.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 21/12/2018.
 */
public class Calculator {
    public static Double squareRoot(Double value) {

        return Math.sqrt(value);
    }

    public static Double square(Double value) {

        return value * value;
    }

    public static Double[] squareRoots(Double... value) {
        List<Double> array = new ArrayList<>();
        Double[] result = new Double[0];

        for(Double each : value){
            array.add(Math.sqrt(each));
        }
        return array.toArray(result);
    }

    public static Double[] squares(Double... values) {
        List<Double> array = new ArrayList<>();
        Double[] result = new Double[0];

        for(Double each : values){
            array.add(each * each);
        }
        return array.toArray(result);
    }

    public static Double add(Double value1, Double value2) {

        return value1 + value2;
    }

    public static Double subtract(Double value1, Double value2) {

        return value1 - value2;
    }


    public static Double divide(Double divisor, Double dividend) {

        if (dividend == 0){
            return 0.0;
        }
        return divisor/dividend;
    }
}
