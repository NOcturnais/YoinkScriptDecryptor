package fr.noctu.decryptor;

public class Decryptor {
    private static String alphabet = "abcdefghijklmnopqrstuvwxyz ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890,?&é\"'(-è_çà)=°+~#{[|`\\^@]}^$ù*;:!¨£%µ§/.";
    private static String encryptedAlphabet = "YoinkEncryptلمنΔγسعفΛصλβηΓκقθιشΘثζخذظφಢYoinkEncryptಡςಜσಗಫΨಥಠτμಛಖψυονξಪತಟΠΞπρΣYoinkEncryptಮನಣεΦಞಙಭಧχಅಓYoinkEncrypt&éದكಘΩèωçàಒಏYoinkEncrypt°ೠYoinkEncrypt~#ಉಊ|`ಕ^@ಎಈYoinkEncrypt^$ù*ಐಋ!¨£%µ§ಚಇ".replaceAll("YoinkEncrypt", "");

    public static String decrypt(String encrypted){
        StringBuilder sb = new StringBuilder();
        BetterString betterString = new BetterString(encrypted);

        //Decrypt
        removeWatermark(betterString);
        String noWM = betterString.getString();

        for(char c : betterString.getString().toCharArray()){
            if(encryptedAlphabet.contains(String.valueOf(c))){
                for(int i = 0; i<encryptedAlphabet.length(); i++){
                    if(encryptedAlphabet.charAt(i) == c)
                        noWM = noWM.replace(c, alphabet.charAt(i));
                }
            }
        }

        return sb.append(noWM).toString();
    }

    private static void removeWatermark(BetterString encrypted){
        encrypted.delete("YoinkEncrypt");
    }
}
