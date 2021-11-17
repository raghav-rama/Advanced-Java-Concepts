package operation;

import main.SetData;

import java.math.BigDecimal;

public class DataRemover {
    public static void remove(int index, SetData data) {
//        Collection C = data.numbers.subList(index, index+1);
//        data.numbers.removeAll(C);
        data.numbers.remove(index+1);
        data.operations.remove(index);
    }
}
