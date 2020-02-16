public class Encrypter {
    public static String encryptSimpleSubstitution(String plaintext, String mapping){
        String textNoSpaces="";
        String ciphertext = "";

        for(int i = 0; i < plaintext.length(); i++){
            if(Character.isLetter(plaintext.charAt(i))){
                textNoSpaces+=plaintext.charAt(i);
            }
        }

        for(int i = 0; i < textNoSpaces.length(); i++){
            char ch = textNoSpaces.charAt(i);
            int index = ch - 'A';
            ciphertext+=mapping.charAt(index);
        }

        return ciphertext;
    }
}
