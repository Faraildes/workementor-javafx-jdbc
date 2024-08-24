package gui;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.entities.Teacher;

public class TeacherListController implements Initializable {
	
	@FXML
	private TableView<Teacher> tableViewTeacher;
	
	@FXML
	private TableColumn<Teacher, Integer> tableColumnId;
	
	@FXML
	private TableColumn<Teacher, Integer> tableColumnName;
	
	@FXML
	private TableColumn<Teacher, Integer> tableColumnAdmissionDate;
	
	@FXML
	private TableColumn<Teacher, Integer> tableColumnCpf;
	
	@FXML
	private TableColumn<Teacher, Integer> tableColumnPhone;
	
	@FXML
	private TableColumn<Teacher, Integer> tableColumnPeriod;

	@FXML
	private Button btNew;
	
	@FXML
	private void onBtNewAction() {
		System.out.println("onBtNewAction");
	}
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		initializeNodes();
				
	}
	
	private void initializeNodes() {
		tableColumnId.setCellValueFactory(new PropertyValueFactory<>("id"));
		tableColumnId.setCellValueFactory(new PropertyValueFactory<>("name"));
		tableColumnId.setCellValueFactory(new PropertyValueFactory<>("admissionDate"));
		tableColumnId.setCellValueFactory(new PropertyValueFactory<>("cpf"));
		tableColumnId.setCellValueFactory(new PropertyValueFactory<>("phone"));
		tableColumnId.setCellValueFactory(new PropertyValueFactory<>("period"));
		
		Stage stage = (Stage)Main.getMainScene().getWindow();
		tableViewTeacher.prefHeightProperty().bind(stage.heightProperty());
	}
	
}
