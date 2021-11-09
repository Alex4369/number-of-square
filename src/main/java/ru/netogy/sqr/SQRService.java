package ru.netogy.sqr;

public class SQRService {

    public static void main(String[] args) {
        for (int i = 10; i <= 18; i++) {
            if (i * i >= 200)
                if (i * i <= 400) {

                    System.out.println(i);
                }
        }
    }
}
