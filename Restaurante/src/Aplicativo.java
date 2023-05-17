import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Aplicativo {
    public class Panel extends JPanel {

    }
    public static class MainWindow extends JFrame {

        public MainWindow(String title) {
            super(title);
            Components.Buttons button = new Components.Buttons("Login");
            Components.Buttons button2 = new Components.Buttons("Cadastro");
            Components.Labels label = new Components.Labels("Bem-vindo ao Tonhão Delivery");
            this.setSize(600, 600);
            getContentPane().setBackground(new Color(50, 50, 50));

            label.setSize(300, 100);
            label.setLocation(150, 100);

            button.setLocation(250, 400);
            button2.setLocation(250, 475);

            this.setLayout(null);
            this.add(button);
            this.add(button2);
            this.add(label);

            button.addActionListener(e -> {
                Login janela = new Login("Login");
                this.setVisible(false);
                janela.setVisible(true);
            });
            button2.addActionListener(e -> {
                Cadastro janela = new Cadastro("Cadastro");
                this.setVisible(false);
                janela.setVisible(true);

            });

        }
    }
    public static class Login extends JFrame{
        public Login(String title){
            super(title);
            this.setSize(600,600);
            getContentPane().setBackground(new Color(50, 50, 50));
            this.setLayout(null);
//          -----------------------------------------------------------------------

//          Componentes
            Components.TextFiled text = new Components.TextFiled("");
            Components.TextFiled text2 = new Components.TextFiled("");
            Components.Labels label = new Components.Labels("Login");
            Components.Labels label2 = new Components.Labels("cpf");
            Components.Labels label3 = new Components.Labels("nome");
            Components.Password password = new Components.Password();
            Components.Buttons button = new Components.Buttons("enviar");
//          -----------------------------------------------------------------------

//          Propriedades dos componentes
            label.setLocation(250, 10);
            label2.setLocation(100,230);
            label3.setLocation(100, 130);
            label.setSize(100, 100);
            label2.setSize(100, 100);
            label3.setSize(100, 100);
            text.setLocation(100, 300);
            text2.setLocation(100, 200);
            password.setLocation(100, 400);
            button.setLocation(200, 400);
            button.addActionListener(e -> {


            });
//          -------------------------------------------------------------------------

//          adicionando os componentes na tela
            this.add(text);
            this.add(text2);
            this.add(label);
            this.add(label2);
            this.add(button);
            this.add(label3);
            ;
//          --------------------------------------------------------------------------


        }

    }
    public static class Cadastro extends JFrame{

        public Cadastro(String title){

//          Tela
            super(title);
            this.setSize(600,600);
            getContentPane().setBackground(new Color(50, 50, 50));
            this.setLayout(null);
//          -----------------------------------------------------------------------

//          Componentes
            Components.TextFiled text = new Components.TextFiled("");
            Components.TextFiled text2 = new Components.TextFiled("");
            Components.Labels label = new Components.Labels("Cadastro");
            Components.Labels label2 = new Components.Labels("cpf");
            Components.Labels label3 = new Components.Labels("nome");
            Components.Password password = new Components.Password();
            Components.Buttons button = new Components.Buttons("enviar");
//          -----------------------------------------------------------------------

//          Propriedades dos componentes
            label.setLocation(250, 10);
            label2.setLocation(100,230);
            label3.setLocation(100, 130);
            label.setSize(100, 100);
            label2.setSize(100, 100);
            label3.setSize(100, 100);
            text.setLocation(100, 300);
            text2.setLocation(100, 200);
            password.setLocation(100, 400);
            button.setLocation(200, 400);
            button.addActionListener(e -> {
                Components.Cadastro cad = new Components.Cadastro();
                cad.setCpf(text2.getText());
                cad.setNome(text.getText());
                Login tela = new Login("Login");
                this.setVisible(false);
                tela.setVisible(true);


            });
//          -------------------------------------------------------------------------

//          adicionando os componentes na tela
            this.add(text);
            this.add(text2);
            this.add(label);
            this.add(label2);
            this.add(button);
            this.add(label3);
//          --------------------------------------------------------------------------

        }

    }

    }

