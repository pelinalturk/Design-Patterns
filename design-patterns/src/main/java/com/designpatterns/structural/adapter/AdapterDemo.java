package com.designpatterns.structural.adapter;

public class AdapterDemo {
    public static void main(String[] args) {

        Crypt crypt = new CryptA();
        crypt.encrypt("CryptA test");
        crypt.decrypt("Crypt A test");

        System.out.println("-------------");

        crypt = new CryptB();
        crypt.encrypt("CryptB test");
        crypt.decrypt("CryptB test");

        System.out.println("-------------");

        CodeX codeX = new CodeX();

        crypt = new CodeXAdapter(codeX);
        crypt.encrypt("CodeX test");
        crypt.decrypt("CodeX test");
    }
}
