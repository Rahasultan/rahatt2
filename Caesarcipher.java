public class Caesarcipher {
    char[]encoder=new char[26];
    char[]decoder=new char[26];
    public Caesarcipher (int rotation){
        for (int i = 0; i <26 ; i++) {
            encoder[i]=(char) ('A'+(i+rotation)%26);
            decoder[i]=(char) ('A'+(i-rotation+26)%26);

        }
    }
    public String encrypt(String message){
        return transform(message,encoder);
    }
    public String decrypt(String secret){
        return transform(secret,decoder);
    }
    public String transform(String original, char[]code){
        char[]msg=original.toCharArray();
        for (int i = 0; i <msg.length ; i++) {
            if (Character.isUpperCase(msg[i])){
                int j=msg[i]-'A';
                msg[i]=code[j];
            }


        }
        return new String(msg);

    }
}
