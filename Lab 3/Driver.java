public class Driver {
    public static void main(String[] args) {
        String mapping = "RAHJMYUWKXNFQGEBOPZSDCTVLI";
        String plaintext = "SECRET MESSAGE"; //expect zmhpmsqmzzrnm
        String ciphertext = Encrypter.encryptSimpleSubstitution(plaintext, mapping);
        System.out.println(ciphertext);
    }
}
