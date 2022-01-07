import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.SubScene;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javafx.geometry.Pos;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import java.time.format.DateTimeFormatter;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("simple form");
        BorderPane bordr = new BorderPane();

        MenuBar menubar = new MenuBar();
        Menu FileMenu = new Menu("File");
        MenuItem filemenu1 = new MenuItem("Form");
        MenuItem filemenu2 = new MenuItem("Clear");
        bordr.setTop(menubar);
        FileMenu.getItems().addAll(filemenu1, filemenu2);
        menubar.getMenus().addAll(FileMenu);

        Text txt = new Text("Name");
        txt.setFont(Font.font("Verdana", 20));
        txt.setStroke(Color.WHITESMOKE);
        TextField name = new TextField();

        Text txt1 = new Text("Relationship");
        txt1.setFont(Font.font("Verdana", 20));
        txt1.setStroke(Color.WHITESMOKE);
        ChoiceBox relation = new ChoiceBox();
        relation.getItems().addAll("Wife", "Father", "Mother", "Sister", "Brother", "Grandpa", "Grandma", "Son",
                "Daughter");

        Text txt2 = new Text("DOB");
        txt2.setFont(Font.font("Verdana", 20));
        txt2.setStroke(Color.WHITESMOKE);
        DatePicker dob = new DatePicker();

        Text txt3 = new Text("Favourite color");
        txt3.setFont(Font.font("Verdana", 20));
        txt3.setStroke(Color.WHITESMOKE);
        ChoiceBox choiceBox1 = new ChoiceBox();
        choiceBox1.getItems().addAll("red", "Black", "Blue", "Yellow", "Green", "Gray", "Silver");

        Text text3 = new Text("Favourite_Place");
        text3.setFont(Font.font("Verdana", 20));
        text3.setStroke(Color.WHITESMOKE);
        ChoiceBox box = new ChoiceBox();
        box.getItems().addAll("Kashmir", "Haryana", "Mumbai", "Jaipur", "Delhi", "Vellore");

        Text text4 = new Text("Phone Number");
        text4.setFont(Font.font("Verdana", 20));
        text4.setStroke(Color.WHITESMOKE);
        TextField phone = new TextField();

        Text text5 = new Text("Favourite food");
        text5.setFont(Font.font("Verdana", 20));
        text5.setStroke(Color.WHITESMOKE);
        TextField textField1 = new TextField();

        Text text6 = new Text("Your Dream");
        text6.setFont(Font.font("Verdana", 20));
        text6.setStroke(Color.WHITESMOKE);
        TextField dream = new TextField();

        Button button1 = new Button("Submit");
        button1.setShape(new Circle(50));
        button1.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                button1.setStyle("-fx-background-color: green; -fx-text-fill: white;");

            }
        });
        ((MenuItem) filemenu2).setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent Event) {
                name.clear();
                phone.clear();
                textField1.clear();
                dream.clear();

            }
        });

        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String n1 = name.getText();
                String n2 = (String) relation.getValue();
                String n3 = dob.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                String n4 = (String) choiceBox1.getValue();
                String n5 = (String) box.getValue();
                String n6 = phone.getText();
                String n7 = (String) textField1.getText();
                String n8 = (String) dream.getText();
                System.out.println(n1);
                System.out.println(n2);
                System.out.println(n3);
                System.out.println(n4);
                System.out.println(n5);
                System.out.println(n6);
                System.out.println(n7);

                System.out.println(n8);
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    String url = "jdbc:mysql://localhost:3306/javafx";
                    String username = "root";
                    String password = "";
                    Connection con = DriverManager.getConnection(url, username, password);
                    String query = "insert into anish20bce2893 values('" + n1 + "','" + n2 + "','" + n3 + "','" + n4
                            + "','" + n5 + "','" + n6 + "','" + n7 + "','" + n8 + "');";
                    Statement stmt = con.createStatement();
                    stmt.executeUpdate(query);
                    System.out.println("success");
                    con.close();
                } catch (Exception e) {
                    System.out.println("Exception !! be careful");
                }
            }
        });
        GridPane pane = new GridPane();
        pane.setVgap(10);
        pane.setHgap(10);
        pane.setAlignment(Pos.CENTER);
        pane.addRow(0, txt, name);
        pane.addRow(1, txt1, relation);
        pane.addRow(2, txt2, dob);
        pane.addRow(3, txt3, choiceBox1);
        pane.addRow(4, text3, box);
        pane.addRow(5, text4, phone);
        pane.addRow(6, text5, textField1);
        pane.addRow(7, text6, dream);
        pane.addRow(8, button1);
        pane.setStyle("-fx-background-color: #015a57");
        SubScene subone = new SubScene(bordr, 400, 20);
        SubScene subtwo = new SubScene(pane, 600, 600);
        VBox root = new VBox(10);

        root.getChildren().addAll(subone, subtwo);
        Scene scene = new Scene(root, 600, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
