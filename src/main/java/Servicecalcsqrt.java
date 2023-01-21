public class Servicecalcsqrt {
    public int calcsqrt(int min, int max) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            i = i*i;
            if (min <= i & i >= max) {
                counter++;

            }
        return counter;
        }


    return -1;
    }
}
