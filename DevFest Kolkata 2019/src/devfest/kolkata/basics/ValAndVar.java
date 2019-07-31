package devfest.kolkata.basics;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

public class ValAndVar {

    public static void main(String[] args) {
        ValAndVarKt.user3 = null;
        ValAndVarKt.setUser3(null);
//        System.out.println(ValAndVarKt.getUser3());
        System.out.println(ValAndVarKt.user3);
    }

    private static final Function0<Unit> printKotlin = new Function0<Unit>() {
        @Override
        public Unit invoke() {
            System.out.println("Hello Kotlin");
            return Unit.INSTANCE;
        }
    };

}
