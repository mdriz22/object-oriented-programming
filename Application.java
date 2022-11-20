import javafx.scene.layoutHBox;
import javafx.stage.Stage;
public class MenuButtonExample extends Application 
{
@Override
public void start(Stage stage) {
MenuButton menu = new MenuButton("Technology");
menu.setMnemonicParsing(true);
MenuItem item1 = new MenuItem("Java");
MenuItem item2 = new MenuItem("Python");
MenuItem item3 = new MenuItem("C++");
MenuItem item4 = new MenuItem("Big Data");
MenuItem item5 = new MenuItem("Machine Learning");
menu.getItems().addAll(item1, item2, item3, item4, item5);
HBox layout = new HBox(25);
layout.getChildren().addAll(menu);
layout.setPadding(new Insets(15, 50, 50, 150));
layout.setStyle("-fx-background-color: BEIGE");
Scene scene = new Scene(layout, 595, 200);
stage.setTitle("Menu Button");
stage.setScene(scene);
stage.show();
}
public static void main(String args[]){
launch(args);
}
}