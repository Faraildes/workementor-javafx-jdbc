package gui;

import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.entities.Teacher;

public class TeacherFormController implements Initializable{
	
	private Teacher entity; 

	@FXML
	private TextField txtId;
		
	@FXML
	private TextField txtName;
	
	@FXML
	private TextField txtAdmissionDate;
	
	@FXML
	private TextField txtCpf;
	
	@FXML
	private TextField txtPhone;
	
	@FXML
	private TextField txtSalary;
	
	@FXML
	private Label labelErrorName;
	
	@FXML
	private Label labelErrorAdmissionDate;
	
	@FXML
	private Label labelErrorCpf;
	
	@FXML
	private Label labelErrorPhone;
	
	@FXML
	private Label labelErrorSalary;
	
	@FXML
	private Button btSave;
	
	@FXML
	private Button btCancel;
	
	public void setTeacher(Teacher entity) {
		this.entity = entity;
	}
	
	@FXML
	public void onBtSaveAction() {
		System.out.println("onBtSaveAction");
	}
	
	@FXML
	public void onBtCancelAction() {
		System.out.println("onBtCancelAction");
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {		
		initializeNodes();
	}
	
	private void initializeNodes() {
		Constraints.setTextFieldInteger(txtId);
		Constraints.setTextFieldMaxLength(txtName, 30);
		Constraints.setTextFieldMaxLength(txtPhone, 13);
		Constraints.setTextFieldMaxLength(txtCpf, 11);
		Constraints.setTextFieldMaxLength(txtPhone, 13);
		Constraints.setTextFieldDouble(txtSalary);		
	}		
	
	public void updateFormData() {
		if(entity == null) {
			throw new IllegalStateException("Entity was null!");
		}
		txtId.setText(String.valueOf(entity.getId()));
		txtName.setText(entity.getName());
		txtAdmissionDate.setText(String.valueOf(entity.getAdmissionDate()));
		txtCpf.setText(entity.getCpf());
		txtPhone.setText(entity.getPhone());
		txtSalary.setText(String.valueOf(entity.getSalary()));
	}
}