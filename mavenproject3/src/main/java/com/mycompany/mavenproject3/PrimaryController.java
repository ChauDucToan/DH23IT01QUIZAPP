package com.mycompany.mavenproject3;

import com.cdt.utils.MyAlert;
import com.cdt.utils.MyStage;
import java.io.IOException;
import javafx.event.ActionEvent;

public class PrimaryController {
    
    public void HandleNoMay(ActionEvent event) {
        MyAlert.getInstance().showMsg("Comming soon enough!");
    }
    
    public void HandleQuanLyCauHoi(ActionEvent event) throws IOException {
        MyStage.getInstance().showStage("QuanLyCauHoi.fxml");
    }
}
