package devfest.kolkata.functions;

import kotlin.jvm.functions.Function2;

public class LambdaFunctionsExample {

    Function2<Integer, Integer, Integer> fun = new Function2<>() {
        @Override
        public Integer invoke(Integer integer, Integer integer2) {
            return 100;
        }
    };
}
