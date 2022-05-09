module com.stav.libraryfrontend {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.json;
    requires com.fasterxml.jackson.annotation;

    opens com.stav.libraryfrontend to javafx.fxml;
    opens com.stav.libraryfrontend.controllers.models to javafx.fxml; // Förklarar för controller klasser vart FXML filer finns (typ)
    opens com.stav.libraryfrontend.controllers.models.books to javafx.fxml;
    opens com.stav.libraryfrontend.controllers.models.myPage to javafx.fxml;
    opens com.stav.libraryfrontend.controllers.models.staffPage to javafx.fxml;
    exports com.stav.libraryfrontend;
    opens com.stav.libraryfrontend.controllers.models.staffPage.books to javafx.fxml;
    opens com.stav.libraryfrontend.controllers.models.myPage.loanedBooks to javafx.fxml;
}