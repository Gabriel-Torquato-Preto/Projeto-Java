import javax.swing.*;
import javax.swing.border.AbstractBorder;
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

        public void setEndereco(String text){ endereco.add(
                text);}

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

        public static class Panel extends JPanel{


         Panel(){

             this.setBackground(Color.WHITE);

         }



        }
    }
    static class RoundBorder extends AbstractBorder
    {
        public void paintBorder(Component c, Graphics g,
                                int x, int y,
                                int width, int height) {
            Color oldColor = g.getColor();

            g.setColor(Color.black);
            g.dispose();
            g.drawRoundRect(x, y, width - 1, height - 1,
                    20, 20);

            g.setColor(oldColor);
        }

        public Insets getBorderInsets(Component c) {
            return new Insets(10, 10, 10, 10);
        }

        public Insets getBorderInsets(Component c, Insets insets) {
            insets.left = insets.top = insets.right = insets.bottom = 10;
            return insets;
        }

    }

    public static class CadastrarRes{
        public ArrayList<String> cnpj = new ArrayList<>();
        public ArrayList<String> endereco = new ArrayList<>();
        public ArrayList<String> nome = new ArrayList<>();


        public void setCnpj(String text) {
            //int i = cnpj.size();
                cnpj.add((cnpj.size()),text);

        }
        public void setEndereco(String text) {

            int i = endereco.size();

            endereco.add(i,text);
        }
        public void setNome(String text) {

            int i = nome.size();

            nome.add(i,text);
        }

        public ArrayList<String> getCnpj() {
            return cnpj;
        }

        public ArrayList<String> getEndereco() {
            return endereco;
        }

        public ArrayList<String> getNome() {
            return nome;
        }
    }

    public static class CadastroLanche{
        public ArrayList<String> nome = new ArrayList<>();
        public ArrayList<String> tipo = new ArrayList<>();
        public ArrayList<String> preco = new ArrayList<>();

        public void setNome(String text) {
            nome.add(text);
        }
        public void setPreco(String text) {
            preco.add(text);
        }
        public void setTipo(String text){
            tipo.add(text);
        }

        public ArrayList<String> getNome() {
            return nome;
        }

        public ArrayList<String> getPreco() {
            return preco;
        }

        public ArrayList<String> getTipo() {
            return tipo;
        }
    }

}
