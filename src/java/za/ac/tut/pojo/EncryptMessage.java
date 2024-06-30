/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.pojo;

/**
 *
 * @author Jeanette
 */
public class EncryptMessage {

    public  String encrypt(String message) {

        //convert to lower case
        message = message.toLowerCase();

        char[] encryptedChars = new char[message.length()];

        for (int i = 0; i < message.length(); i++) {

            char ch = message.charAt(i);

            if (Character.isLowerCase(ch)) {
                switch (ch) {
                    case 'x':
                        encryptedChars[i] = 'a';
                        break;
                    case 'y':
                        encryptedChars[i] = 'b';
                        break;
                    case 'z':
                        encryptedChars[i] = 'c';
                        break;
                    default:
                        encryptedChars[i] = (char) (ch + 3);
                }
            } else {
                encryptedChars[i] = ch;
            }
        }

        return new String(encryptedChars);
    }
}
