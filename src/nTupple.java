import java.util.Arrays;
import java.util.stream.IntStream;

public class nTupple {
    public static void main(String[] args) {
        int[] input = {0,0,0,2};
        ducciSequence(input);
    }
    private static void ducciSequence(int[] tab){
        int[] input = tab.clone();
        int[] output = input.clone();
        int steps = 1;
        System.out.println(Arrays.toString(output));

        while(IntStream.of(output).sum() != 0) {
            for (int i = 0; i < input.length; i++) {
                if (i < input.length - 1) {
                    output[i] = compute(input[i], input[i + 1]);
                } else output[i] = compute(input[i], input[0]);
            }
            input = output.clone();
            steps++;
            System.out.println(Arrays.toString(output));
        }
        System.out.println(steps);
    }

    private static int compute(int x, int y){
        int out = y - x;
        return( out > 0 ? out : -1 * out);
    }
}
