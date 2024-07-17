package com.oop.project.mindunits;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class DesignpageController
{
    @javafx.fxml.FXML
    private TextField modelNameTextField;
    @javafx.fxml.FXML
    private TextField designLinkTextField;
    @javafx.fxml.FXML
    private TableColumn designLinkCol;
    @javafx.fxml.FXML
    private TableView carModelTableView;
    @javafx.fxml.FXML
    private TableColumn carModelCol;
    @javafx.fxml.FXML
    private TableColumn designDateCol;
    @javafx.fxml.FXML
    private DatePicker dateDatepicker;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void saveProgressButtonOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void insertModelButtonOnClick(ActionEvent actionEvent) {
    }
}