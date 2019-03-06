public class CalculateNumbers {
    public  int CalculateElements(int limit){
        int sumOfTheSquares = 0;
        int sumElements2 = 0;
        int squareOfTheSum = 0;
        int result = 0;

        for (int i = 1; i <= limit; i++) {
            sumOfTheSquares += (int) Math.pow(i, 2);
        }
        for (int j = 1; j <= limit; j++) {
            sumElements2 += j;
        }
        squareOfTheSum = (int) Math.pow(sumElements2, 2);
        result = squareOfTheSum-sumOfTheSquares;
        System.out.println(result);
    return result;
    }
}
