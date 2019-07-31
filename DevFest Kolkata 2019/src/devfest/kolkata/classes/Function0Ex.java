package devfest.kolkata.classes;

import kotlin.Lazy;
import kotlin.LazyKt;

public class Function0Ex {

    public static void main(String[] args) {
        Lazy lazy = LazyKt.lazy(() -> 10);
        lazy.getValue();
    }
}
