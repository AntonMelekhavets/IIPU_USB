import java.io.IOException;

import GUI.ControllerOfBaseWindow;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

	private Stage baseStage;
	private AnchorPane root;

	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage baseStage) throws Exception {
		this.baseStage = baseStage;
		initRootLayouts();
	}

	public void initRootLayouts() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("GUI/Window.fxml"));
		root = (AnchorPane) loader.load();

		Scene scene = new Scene(root);
		baseStage.setScene(scene);
		baseStage.show();
		
		ControllerOfBaseWindow controller = loader.getController();
	}
}
