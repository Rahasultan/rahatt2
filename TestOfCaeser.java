public class TestOfCaeser {
    public static void main(String[] args) {
        Caesarcipher cipher=new Caesarcipher(3);
        System.out.println("Encryption code="+new String(cipher.encoder));
        System.out.println("Decryption code="+new String(cipher.decoder));
        String message="THE EAGLE IS IN PLAY; MEET AT JOE's.";
        String coded=cipher.encrypt(message);
        System.out.println("Secret: "+coded);
        String answer=cipher.decrypt(coded);
        System.out.println("Massage: "+answer);
    }
}
