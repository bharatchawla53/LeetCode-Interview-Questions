package com.company;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.CryptoPrimitive;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class If_else {
    private static final Scanner scanner = new Scanner(System.in);



    public static void main(String[] args) throws UnsupportedEncodingException {
        int N = scanner.nextInt();

        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        LocalDate ld = LocalDate.of(2,2, 1);
        ld.getDayOfWeek().toString();
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        //NumberFormat.getCurrencyInstance(Locale.FR).format();
        String a = "He is a very very good boy, isn't he?";

        Map<Character, Integer> anagrams = new HashMap<>(); //to process stream of string 
        IntStream.range(0, a.length()).forEach(i -> {
            if (!anagrams.containsKey(a.charAt(i))){
                anagrams.put(a.charAt(i), 1);
            } else {
                Integer f = anagrams.get(a.charAt(i));
                anagrams.put(a.charAt(i), ++f);
            }
        });

        //anagrams.forEach((chars, integer) -> System.out.println(chars + integer));

        String[] res = a.trim().split("[!,?._'@\\s]+");
        System.out.println(res.length);
        Stream.of(res).forEach(System.out::println);

        Pattern compile = Pattern.compile("([A-Z])(.+)");

        Pattern pattern = Pattern.compile("[(\\\\d{1,2}|[01]\\\\d{2}|2[0-4]\\\\d|25[0-5])]");
        Matcher m = pattern.matcher("000.12.12.034");
       // if (!m.matches()) return false;
      /*  Arrays.sort(res, Collections.reverseOrder(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1 == null || o2 == null)
                return 0;
                BigDecimal v1 = new BigDecimal(o1);
                BigDecimal v2 = new BigDecimal(o2);
                return v1.compareTo(v2);
            }
        }));*/
        String num = "19";

        BigInteger num1 = new BigInteger(num);
        num1.isProbablePrime(N);


        if (N % 2 == 1 || (N >= 6 && N <= 20 )) {
            System.out.println("Weird");
        } else {
                System.out.println("Not Weird");
        }

        //got number of rows
       /* ArrayList<ArrayList<Integer>> rows = new ArrayList(5);
        //read each row
        for (int i = 0; i < N; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            int n = scanner.nextInt();
            for (int l = 0; l < n; l++){
                row.add(scanner.nextInt());
            }
            rows.add(row);
        }

        //number of queries
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(rows.get(x - 1).get(y-1));
        }*/


       /* int l = scanner.nextInt();
        List<Integer> list = new ArrayList<>(l);
        for (int i = 0; i < l; i++) {
            int n = scanner.nextInt();
            list.add(n);
        }

        int queries = scanner.nextInt();
        for (int i = 0; i < queries; i++) {
            String queryW = scanner.next();
            if (queryW.equalsIgnoreCase("Insert")) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                list.add(x, y);
            } else {
                int x = scanner.nextInt();
                list.remove(x);
            }
        }

        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        Map<String, Integer> phoneDirectory = new HashMap<>(); //map to store name and phone values
        int n=scanner.nextInt();
        scanner.nextLine();
        for(int i=0;i<n;i++)
        {
            String name=scanner.nextLine();
            int phone=scanner.nextInt();
            phoneDirectory.put(name, phone);
            scanner.nextLine();
        }
        while(scanner.hasNext())
        {
            String s=scanner.nextLine();
            if (phoneDirectory.get(s) != null){
                System.out.println(s + "=" + phoneDirectory.get(s));
            } else {
                System.out.println("Not Found");
            }
        }*/

        Deque<Character> stack = new ArrayDeque<>();
        String input = "{}()";
        for(int i = 0; i < input.length(); i++) {
            char mc = '.';
            switch (input.charAt(i)) {
                case '(':
                case '{':
                case '[':
                    stack.addFirst(input.charAt(i));
                    break;

                case ')': mc = '(';
                case '}': if (mc == '.') mc = '{';
                case ']': if (mc == '.') mc = '[';
                    if (stack.isEmpty() || stack.removeFirst() != mc) {
                        System.out.println(false);
                }
                    break;

                default: System.out.println(false);
            }
        }

        Checker checker = new Checker();
        Player[] players = new Player[2];
        players[0] = new Player("Bharat", 80);
        players[1] = new Player("Chadwick", 90);
        Arrays.sort(players, checker);

        String word = "HelloWorld";
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(word.getBytes());
            byte[] digest = md.digest();

            for (byte b : digest) {
                System.out.printf("%02x", b);
            }

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(word.getBytes());
            byte[] digest = md.digest();

            for (byte b : digest) {
                System.out.printf("%02x", b);
            }

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }


        scanner.close();

    }

}

class Player {
    String name;
    int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class Checker implements Comparator<Player> {

    @Override
    public int compare(Player o1, Player o2) {
        if (o1.score > o2.score) {
            return 1;
        } else if (o1.score == o2.score) {
            return o1.name.compareTo(o2.name);
        }
        return 0;
    }
}


class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }

}

interface AdvancedArithmetic{
    int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {

    @Override
    public int divisor_sum(int n) {
        return IntStream.range(1, n).filter(value -> n % value == 0)
                .sum();

    }
}









