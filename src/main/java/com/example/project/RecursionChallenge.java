    package com.example.project;

    public class RecursionChallenge {

            public static int bunnyEars(int n){
                if (n > 0) {
                    return 2 + bunnyEars(n - 1);
                } else {
                    return 0;
                }
            }
        
            public static int factorial(int n){
                if (n > 1) {
                    return n * factorial(n - 1);
                } else {
                    return 1;
                }
            }

            public static int sumNumbers(int n){
                if (n > 1) {
                    return n + sumNumbers(n - 1);
                } else {
                    return 1;
                }
            }

            public static String countDown(int n){
                if (n > 0) {
                    System.out.print(n + ",");
                    countDown(n - 1);
                }
                return "Blast Off!";
            }

            public static int power(int x, int n){
                if (n > 0) {
                    return x * power(x, n - 1);
                } else {
                    return 1;
                }
            }

            public static int fib(int n){
                if (n > 1) {
                    return fib(n - 2) + fib(n - 1);
                } else if (n == 1) {
                    return 1;
                } else {
                    return 0;
                }
            }

            public static int countX(String s){
                if (s.length() == 1) {
                    if (s.equals("x")) {
                        return 1;
                    } else {
                        return 0;
                    }
                }
                if (s.length() == 0) {
                    return 0;
                }
                return countX(s.substring(0, s.length()/2)) + countX(s.substring(s.length()/2));
            }

            public static String changePi(String s){
                if (s.length() == 1 || s.length() == 0){
                    return s;
                }
                else if (s.startsWith("pi") && s.length() <= 2){
                    return "3.14";
                }
                else {
                    if (s.startsWith("pi")){
                        return "3.14" + changePi(s.substring(2));
                    } else {
                        return s.substring(0,1) + changePi(s.substring(1));
                    }
                }
            }


            public static String reverse(String s){
                int n = s.length();
                if (n<= 1){
                    return s;
                    
                }
                String lower = reverse(s.substring(0, n/2));
                String upper = reverse(s.substring(n/2));
                return upper + lower;
            }

            public static Boolean isPalindrome(String s){
                if (s.length() == 1 || (s.length() == 0)){
                    return true;
                }
                if (s.substring(0,1).equals(s.substring(s.length() - 1))){
                    return isPalindrome(s.substring(1, s.length() - 1));
                }
                return false;
            }

    }