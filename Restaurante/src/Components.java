import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Components {
    public static class Buttons extends JButton{
        protected Buttons(String title){
            super(title);
            this.setSize(100, 50);
            this.setForeground(Color.blue);


        }

    }
    public static class Labels extends JLabel{
        protected Labels(String text){
            super(text);
            this.setFont(new Font("Arial", Font.BOLD, 20));
            this.setForeground(Color.WHITE);

        }
    }
    public static class Labels2 extends JLabel{
        protected Labels2(String text){
            super(text);
            this.setFont(new Font("Arial", Font.BOLD, 20));
            this.setForeground(Color.WHITE);

        }


    }
    public static class Cadastro{
        public ArrayList<String> cpf = new ArrayList<String>();
        public ArrayList<String> nome = new ArrayList<String>();

        public ArrayList<String> endereco = new ArrayList<>();
        public void setCpf(String text){
            cpf.add(text);
        }
        public  ArrayList<String> getCpf(){
            return cpf;
        }
        public void setNome(String text){
            nome.add(text);
        }
        public  ArrayList<String> getNome(){
            return nome;
        }

        public void setEndereco(String text){ endereco.add(text);}

        public ArrayList<String> getEndereco(){return endereco;}
    }
    public static class TextFiled extends JTextField{
        public TextFiled(){
            this.setSize(200,35);
        }
    }

    public static class Password extends JPasswordField{

        public Password(){
            this.setLayout(null);
            this.setSize(200,35);

        }



    }

}
