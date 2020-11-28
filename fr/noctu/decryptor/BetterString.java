package fr.noctu.decryptor;

public class BetterString {
    private String string;

    public BetterString(String s){
        this.string = s;
    }

    public String getString(){
        return string;
    }

    public void delete(String charSequence){
        this.string = string.replace(charSequence, "");
    }
}
