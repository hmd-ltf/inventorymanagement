module com.hmdprojects.inventorymanagement {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.hmdprojects.inventorymanagement to javafx.fxml;
    exports com.hmdprojects.inventorymanagement;
}