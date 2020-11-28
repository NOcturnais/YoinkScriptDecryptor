package fr.noctu.decryptor.gui;

import fr.noctu.decryptor.Decryptor;
import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;

public class Controller {
    public TextArea encrypted;
    public TextArea decrypted;

    public void onDecryptIsClicked(ActionEvent actionEvent) {
        String encryptedText = encrypted.getText();
        if(!encryptedText.isEmpty())
            decrypted.setText(Decryptor.decrypt(encryptedText));
    }
}
