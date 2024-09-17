package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.Image;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Random;

public class SampleController {
    @FXML
    private WebView webView;
    @FXML
    private Button juegoButton,video_dos;
    @FXML 
    private Button video_uno;
    @FXML
    private Hyperlink proyecto,proyectodos;
    private boolean juego_iniciado;
    private boolean inicia_ventana;
    @FXML
    void proyecto_web_2(ActionEvent event)throws URISyntaxException,IOException {
    	Desktop.getDesktop().browse(new URI("https://elevenlabs.io/"));
    }
    
    public static void main(String[] args) {
    	String url;
    }
    @FXML
    void set_video1() {
    	initialize("https://www.youtube.com/embed/kAbrnfx7axc");
    }
    
    
    @FXML
    void set_video2() {
    	initialize("https://www.youtube.com/embed/7kcF9v4oo7M");
    }
    
    
    @FXML
    void proyecto_web(ActionEvent event) throws URISyntaxException,IOException{
    	Desktop.getDesktop().browse(new URI("https://colab.research.google.com/drive/1dygH6NjFvrz2Slhufk2ilNR_kD5C48as"));
    }
    @FXML
    public void initialize(String url) {
        String youtubeEmbedUrl = "https://www.youtube.com/embed/kAbrnfx7axc";
        webView.getEngine().load(url);
    }
    @FXML
    private void iniciarJuego() {

        juego_iniciado=true;
        if(juego_iniciado) {
        	int a, b, c, d, e, ini;

            Random ran = new Random();

            a = ran.nextInt(1, 5);
            b = ran.nextInt(1, 5);
            c = ran.nextInt(1, 5);
            d = ran.nextInt(1, 5);

            String[] opciones = {"arriba", "abajo", "izquierda", "derecha"};

            while (true) {

                JOptionPane.showMessageDialog(null, "Bienvenido a laberinto", "Juego", JOptionPane.PLAIN_MESSAGE);
                JOptionPane.showMessageDialog(null, "Comenzamos", "Juego", JOptionPane.PLAIN_MESSAGE);

                switch (a) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Primer movimiento: arriba", "Juego", JOptionPane.PLAIN_MESSAGE);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Primer movimiento: abajo", "Juego", JOptionPane.PLAIN_MESSAGE);
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Primer movimiento: izquierda", "Juego", JOptionPane.PLAIN_MESSAGE);
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Primer movimiento: derecha", "Juego", JOptionPane.PLAIN_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Primer movimiento: error", "Juego", JOptionPane.PLAIN_MESSAGE);
                        break;
                }

                switch (b) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Segundo movimiento: arriba", "Juego", JOptionPane.PLAIN_MESSAGE);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Segundo movimiento: abajo", "Juego", JOptionPane.PLAIN_MESSAGE);
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Segundo movimiento: izquierda", "Juego", JOptionPane.PLAIN_MESSAGE);
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Segundo movimiento: derecha", "Juego", JOptionPane.PLAIN_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Segundo movimiento: error", "Juego", JOptionPane.PLAIN_MESSAGE);
                        break;
                }

                switch (c) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Tercer movimiento: arriba", "Juego", JOptionPane.PLAIN_MESSAGE);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Tercer movimiento: abajo", "Juego", JOptionPane.PLAIN_MESSAGE);
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Tercer movimiento: izquierda", "Juego", JOptionPane.PLAIN_MESSAGE);
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Tercer movimiento: derecha", "Juego", JOptionPane.PLAIN_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Tercer movimiento: error", "Juego", JOptionPane.PLAIN_MESSAGE);
                        break;
                }

                switch (d) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Cuarto movimiento: arriba", "Juego", JOptionPane.PLAIN_MESSAGE);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Cuarto movimiento: abajo", "Juego", JOptionPane.PLAIN_MESSAGE);
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Cuarto movimiento: izquierda", "Juego", JOptionPane.PLAIN_MESSAGE);
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Cuarto movimiento: derecha", "Juego", JOptionPane.PLAIN_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Cuarto movimiento: error", "Juego", JOptionPane.PLAIN_MESSAGE);
                        break;
                }

                ini = JOptionPane.showOptionDialog(null, "¿Cuál era la primera?", "Juego",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[1]);

                if (ini == (a - 1)) {
                    JOptionPane.showMessageDialog(null, "¡Bien! Sigamos", "Juego", JOptionPane.PLAIN_MESSAGE);

                    ini = JOptionPane.showOptionDialog(null, "¿Cuál era la segunda?", "Juego",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[1]);

                    if (ini == (b - 1)) {
                        JOptionPane.showMessageDialog(null, "¡Bien! Sigamos", "Juego", JOptionPane.PLAIN_MESSAGE);

                        ini = JOptionPane.showOptionDialog(null, "¿Cuál era la tercera?", "Juego",
                                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[1]);

                        if (ini == (c - 1)) {
                            JOptionPane.showMessageDialog(null, "¡Bien! Ahora", "Juego", JOptionPane.PLAIN_MESSAGE);

                            ini = JOptionPane.showOptionDialog(null, "¿Cuál era la cuarta?", "Juego",
                                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[1]);

                            if (ini == (d - 1)) {
                                JOptionPane.showMessageDialog(null, "¡Felicidades! Has ganado", "Juego", JOptionPane.PLAIN_MESSAGE);
                                e = JOptionPane.showConfirmDialog(null,"quieres un nivel mas?","juego",JOptionPane.YES_NO_OPTION);
                                if (e == JOptionPane.YES_OPTION) {
                                    
                                    JOptionPane.showMessageDialog(null, "coming soon", "juego" ,JOptionPane.PLAIN_MESSAGE);
                                    break;
                                }
                                else{

                                JOptionPane.showMessageDialog(null, "adios", "juego" ,JOptionPane.PLAIN_MESSAGE);

                                break;   
                                }
                                
                            } else {
                                JOptionPane.showMessageDialog(null, "Perdiste en la cuarta opción\nLa respuesta correcta era: " + opciones[d - 1], "Juego", JOptionPane.PLAIN_MESSAGE);
                                break;
                            }

                        } else {
                            JOptionPane.showMessageDialog(null, "Perdiste en la tercera opción\nLa respuesta correcta era: " + opciones[c - 1], "Juego", JOptionPane.PLAIN_MESSAGE);
                            break;
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Perdiste en la segunda opción\nLa respuesta correcta era: " + opciones[b - 1], "Juego", JOptionPane.PLAIN_MESSAGE);
                        break;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Perdiste en la primera opción\nLa respuesta correcta era: " + opciones[a - 1], "Juego", JOptionPane.PLAIN_MESSAGE);
                    break;
                }
            }
        }
    }   
    public boolean getjuegoiniciado() {
    	return juego_iniciado;
    }
    public boolean getinicia_ventana() {
    	return inicia_ventana;
    }
    @FXML    
    private void nueva_ventana() {
        	try {
        		Parent root = FXMLLoader.load(getClass().getResource("preguntas.fxml"));
        		Stage preguntas = new Stage();
        		preguntas.setTitle("Juegos locos franklin");
                Image icono = new Image(getClass().getResourceAsStream("TECHCOM.png"));
                preguntas.getIcons().add(icono);
        		Scene juegos_locos_franklin = new Scene(root,800,600);
        		preguntas.setScene(juegos_locos_franklin);
                juegos_locos_franklin.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
        		preguntas.show();
        	}
        		catch(Exception e){
        			JOptionPane.showMessageDialog(null,e);
        		}
        }
    // Franklin's games/methods for the project
}
