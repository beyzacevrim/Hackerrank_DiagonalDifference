import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class sumOfSquareMatrixDiagonals {

    // Class to hold the static method for calculating the diagonal difference
    public static class Result {
        public static int diagonalDifference(List<List<Integer>> arr) {
            int sum = 0;
            for(int i = 0 ; i < arr.size() ; i++){
                for (int j = 0 ; j < arr.get(i).size() ; j++){
                    // If the element is on the main diagonal, add it to the sum
                    if(i == j) {
                        sum += arr.get(i).get(j);
                    }
                    // If the element is on the secondary diagonal, subtract it from the sum
                    if(j == arr.get(i).size() - 1 - i) {
                        sum -= arr.get(i).get(j);
                    }
                }
            }
            // Return the absolute value of the difference
            return Math.abs(sum);
        }
    }

    public static void main(String[] args) throws IOException {

        // Create a buffered reader to read input from the console
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Create a buffered writer to write output to the console
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        // Read the size of the matrix from the console
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        // Create a list of lists to hold the matrix elements
        List<List<Integer>> arr = new ArrayList<>();

        // Read each row of the matrix from the console and add it to the list of lists
        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        // Calculate the diagonal difference using the static method of the Result class
        int result = Result.diagonalDifference(arr);

        // Write the result to the console
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        // Close the readers and writers
        bufferedReader.close();
        bufferedWriter.close();
    }
}
