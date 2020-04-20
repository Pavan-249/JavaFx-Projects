package sample;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class Main extends Application{

    public void start(Stage primaryStage) throws Exception
    {
        BorderPane pane=new BorderPane();
        Scene scene1=new Scene(pane,100,100);
        BackgroundFill bg=new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY);
        Background bg1=new Background(bg);
        pane.setBackground(bg1);
        File ftr=new File("S:\\Movies");
        String slim[]=ftr.list();
        for(String ltr:slim)
        {
            System.out.println(ltr);
        }
        Scanner input=new Scanner(System.in);
        String name= input.nextLine();
        input.close();
        String s="S:\\Movies\\"+name;
        Media m1=new Media(new File(s).toURI().toString());
        MediaPlayer m2=new MediaPlayer(m1);
        MediaView m3=new MediaView(m2);
        m3.setFitHeight(1600);
        m3.setFitWidth(1200);
        pane.setBottom(bar(m2,m3,primaryStage,m1,pane));
        pane.setCenter(m3);
        pane.setTop(men(primaryStage,m2));
        pane.setRight(upn());
        pane.setLeft(ding(m2));
        m2.setAutoPlay(true);
        primaryStage.setTitle("Blizzard");
        FileInputStream fir=new FileInputStream("D:\\javafx logos\\edits\\213866-Shining-Snowflake.jpg");
        Image irc=new Image(fir);
        ImageView tc=new ImageView(irc);
        /*
        EventHandler<KeyEvent>enot=new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                    if (keyEvent.getCode() == KeyCode.SPACE) {
                        m2.pause();
                    }
            }

        };
        primaryStage.addEventHandler(KeyEvent.ANY,enot);
        */primaryStage.getIcons().add(irc);
        primaryStage.setScene(scene1);
        primaryStage.show();
    }
    public static void main(String args[])
    {
        Application.launch(args);
    }

    private GridPane bar(MediaPlayer m2,MediaView m3,Stage primaryStage,Media m1,BorderPane pane) throws Exception
    {
        GridPane hb=new GridPane();
        hb.setPrefSize(3,3);
        hb.setScaleY(0.75);
    hb.setStyle("-fx-background-color:CORNFLOWERBLUE");
        FileInputStream f=new FileInputStream("D:\\javafx logos\\edits\\u2.png");
        FileInputStream f1=new FileInputStream("D:\\javafx logos\\log19.png");
        Image img=new Image(f);
        ImageView img1=new ImageView(img);
        Image imga=new Image(f1);
        ImageView imga1=new ImageView(imga);
        Button play=new Button();
        Button pause1=new Button();
        pause1.setBorder(Border.EMPTY);
        img1.setFitWidth(25);
        img1.setFitHeight(32);
        imga1.setFitHeight(30);
        imga1.setFitWidth(25);
        pause1.setGraphic(imga1);
        play.setBorder(Border.EMPTY);
        play.setGraphic(img1);
        Double d=m1.getDuration().toMinutes();
        Circle clr=new Circle(0,100,5);
        m2.setOnReady(new Runnable() {
            @Override
            public void run() {
                TranslateTransition tr=new TranslateTransition() ;
                tr.setByX(1500);
                tr.setDuration(m1.getDuration());
                tr.setCycleCount(1);
                clr.setFill(Color.AQUA);
                Label las=new Label(d.toString());
                tr.setNode(clr);
                tr.play();
            }
        });
        EventHandler<MouseEvent>e1=new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                m2.pause();
            }
        };
        EventHandler<MouseEvent>e2=new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                m2.play();
            }
        };
        pause1.addEventHandler(MouseEvent.MOUSE_CLICKED,e1);
        play.addEventHandler(MouseEvent.MOUSE_CLICKED,e2);
       Button bass=new Button();
       FileInputStream fty=new FileInputStream("D:\\javafx logos\\edits\\alpa.png");
       Image ilo=new Image(fty);
       ImageView kilo=new ImageView(ilo);
       kilo.setFitWidth(23);
       kilo.setFitHeight(33);
       bass.setGraphic(kilo);
       EventHandler<MouseEvent>ev=new EventHandler<MouseEvent>() {
           @Override
           public void handle(MouseEvent mri) {
               m2.seek(Duration.seconds(5+m2.getCurrentTime().toSeconds()));
           }
       };
       bass.addEventHandler(MouseEvent.MOUSE_CLICKED,ev);
        Button size=new Button();
        FileInputStream ft=new FileInputStream("D:\\javafx logos\\logo2.png");
        Image im4=new Image(ft);
        ImageView im5=new ImageView(im4);
        im5.setFitWidth(25);
        im5.setFitHeight(30);
        size.setGraphic(im5);

        EventHandler<MouseEvent>e3=new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                primaryStage.setFullScreen(true);
            }
        };
        /*er.setVisible(false);*/
        size.addEventHandler(MouseEvent.MOUSE_CLICKED,e3);
        Button size1=new Button();
        FileInputStream fta=new FileInputStream("D:\\javafx logos\\edits\\alto.png");
        Image im42=new Image(fta);
        ImageView im5w=new ImageView(im42);
        im5w.setFitHeight(35);
        im5w.setFitWidth(23);
        im5.setFitWidth(25);
        im5.setFitHeight(30);
        size1.setGraphic(im5w);
        EventHandler<MouseEvent>e34=new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                m2.seek(Duration.seconds(m2.getCurrentTime().toSeconds()-5));

            }

        };
        size1.addEventHandler(MouseEvent.MOUSE_CLICKED,e34);
        hb.add(play,0,0);
        hb.add(pause1,1,0);
        hb.add(size,2,0);
        hb.add(size1,3,0);
        hb.add(bass,4,0);
        /*hb.add(er,5,0);*/
        hb.addRow(1,clr);
        hb.setPadding(new Insets(5));
        hb.setHgap(5);
        hb.setVgap(0.5);
        return hb;
    }
    private HBox men(Stage primaryStage,MediaPlayer m2)
    {   HBox hb1=new HBox(1);
        MenuBar mb=new MenuBar();
        Menu mb1=new Menu("File");
        MenuItem i1=new MenuItem("New");
        MenuItem i2=new MenuItem("Open");
        i2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                    {   FileChooser fil=new FileChooser();
                        fil.showOpenDialog(primaryStage);
                    }
            }
        });
        Button opn=new Button("Open");
        EventHandler<MouseEvent>e12=new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent)
            {   FileChooser fil=new FileChooser();
                fil.showOpenDialog(primaryStage);
            }
        };
        opn.addEventHandler(MouseEvent.MOUSE_CLICKED,e12);
        mb1.getItems().addAll(i1,i2);
        hb1.setStyle("-fx-background-color:CORNFLOWERBLUE");
        mb.getMenus().add(mb1);
        hb1.getChildren().addAll(mb,opn);
    return hb1;
    }
    private VBox upn() throws Exception
    {   VBox vb=new VBox(4);
        File ftr=new File("S:\\Movies");
        String slim[]=ftr.list();
        MenuBar mbr=new MenuBar();
        Menu mla=new Menu("Up NEXT....");
        mbr.setMaxHeight(30);
        FileInputStream fs=new FileInputStream("D:\\javafx logos\\edits\\al.jpg");
        Image imq=new Image(fs);
        ImageView imv=new ImageView(imq);
        mla.setGraphic(imv);
        mbr.setStyle("-fx-background-color:DARKVIOLET");
        for(String ser:slim)
        {
            mla.getItems().add(new MenuItem(ser));
        }
        mbr.getMenus().add(mla);
        vb.getChildren().add(mbr);
    return vb;
    }
    private StackPane ding(MediaPlayer m2)
    {
        StackPane vi=new StackPane();
        vi.setPadding(new Insets(20,0,0,0));
        Rectangle rts=new Rectangle();
        rts.setHeight(680);
        rts.setStroke(Color.HOTPINK);
        rts.setWidth(50);
        rts.setX(5);
        rts.setY(300);
        rts.setFill(Color.CORNFLOWERBLUE);
        Circle cr=new Circle(10,10,20);
        vi.setAlignment(Pos.TOP_LEFT);
        cr.setFill(Color.DEEPPINK);
        TranslateTransition tru=new TranslateTransition();
        tru.setByY(640);
        tru.setDuration(Duration.seconds(1));
        tru.setCycleCount(1000000);
        tru.setAutoReverse(true);
        tru.setNode(cr);
        tru.play();
        vi.getChildren().addAll(rts,cr);
   return vi;
    }

}