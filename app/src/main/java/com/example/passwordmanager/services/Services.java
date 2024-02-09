package com.example.passwordmanager.services;

public class Services {
    public String generatePassoword() {
        int maxChars = 12;
        String[] chars = {"0", "1", "b", "2", "4", "5", "6", "7", "8",
                "9", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
                "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w",
                "x", "y", "z","+","-","/","*","_","!","@","$","%","&"};

        StringBuilder password = new StringBuilder();

        for(int i = 0; i < maxChars; i++) {
            int position = (int) (Math.random() * chars.length);
            password.append(chars[position]);
        }

        return password.toString();
    }
}
