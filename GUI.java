import javax.swing.JOptionPane;
public class GUI {
    public static void main(String[] args){
        String name= JOptionPane.showInputDialog(null, "What is your name");
        JOptionPane.showMessageDialog(null, "hello,How are you"+name);
        //String your= JOptionPane.showInputDialog(null, "What is your future goal");
        //JOptionPane.showMessageDialog(null, "You will be acchieving goal soon.....Work hard"+name);
       int age=Integer.parseInt(JOptionPane.showInputDialog(null, "What is your Age: "));
        JOptionPane.showMessageDialog(null,"You are"+age+"years old");
        double Height=Double.parseDouble(JOptionPane.showInputDialog(null, "What is your Height"));
        JOptionPane.showMessageDialog(null, "Your are"+Height+"cms");
    }
}
