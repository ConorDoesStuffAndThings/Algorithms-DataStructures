import java.lang.*;

public class Encrypter {
    public static String encrypt(String plaintext, int numColumns){
        /*
        Remove spaces from plaintext
        Calculate numRows required for plaintext
        If plaintext doesn’t fit exactly, pad it with Xs
        String: ciphertext = ""
        For col = 0 To numColumns - 1
            Integer: index = col
            For row = 0 To numRows - 1
                ciphertext = ciphertext + plaintext[index]
                index += numColumns
            Next row
        Next col
         */

        String textNoSpaces="";
        int numRows=0;
        String ciphertext = "";

        for(int i = 0; i < plaintext.length(); i++){
            if(Character.isLetter(plaintext.charAt(i))){
                textNoSpaces+=plaintext.charAt(i);
            }
        }

        int lengthOfText = textNoSpaces.length();

        if(lengthOfText % numColumns == 0){
            numRows = lengthOfText/numColumns;
        }

        else{
            numRows = lengthOfText/numColumns + 1;
        }

        int numXs = numRows*numColumns - textNoSpaces.length();

        for(int i = 0; i <= numXs; i++){
            textNoSpaces += "x";
        }

        for(int i = 0; i <= numColumns-1; i++){
            int j = i;
            for(int row = 0; row <= numRows-1; row++){
                ciphertext = ciphertext + textNoSpaces.charAt(j);
                j += numColumns;
            }
        }



        return ciphertext;
    }

    public static String decrypt(String ciphertext, int numColumns){
        String decryptText="";



        return decryptText;
    }
}
