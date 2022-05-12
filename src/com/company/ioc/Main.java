package com.company.ioc;

public class Main {

    public static void main(String[] args) {
        String url = "www.naver.com/books/it?page=10&name=spring-boot";

        //Base64 encoding
        // url encoding

        //main에서 원하는 부분만 수정해주면 된다.
        //Encoder encoder = new Encoder(new UrlEncoder());
        Encoder encoder = new Encoder(new Base64Encoder());
        String result = encoder.encode(url);
        System.out.println(result);
    }
}
