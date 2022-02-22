package ru.netology.sqr;

public class SQRService {
    public int numberSquaresOfRange(int startRange, int endRange) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= startRange & i * i <= endRange) {
                count++;
            }
        }
        return count;
    }
}
