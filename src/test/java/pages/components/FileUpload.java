package pages.components;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

public class FileUpload {

    public void uploadFile(String path){
        $("#uploadPicture").uploadFile(new File(path));
    }
}
