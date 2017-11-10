package GUI;

import Executors.DeviceInformation;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ControllerOfBaseWindow {
	
	@FXML
	private Button ejectButton;
	@FXML
	private Button exitButton;
	@FXML
	private TableView<DeviceInformation> table;
	@FXML
	private TableColumn<DeviceInformation, String> diskColumn;
	@FXML
	private TableColumn<DeviceInformation, String> nameColumn;
	@FXML
	private TableColumn<DeviceInformation, String> allSpaceColumn;
	@FXML
	private TableColumn<DeviceInformation, String> freeSpaceColumn;
	
	
}
