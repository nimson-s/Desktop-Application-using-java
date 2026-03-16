import java.awt.*;

 class  Login_Demo{
    public static void main(String args[])
 {
      Frame f =new Frame();
      f.setTitle("login page");
      f.setSize(500,500);
      f.setVisible(true);

      Label l1 =new Label("user name");
      f.add(l1);
      TextField t1 =new TextField(20);
      f.add(t1);
      Label l2 =new Label("passward");
      f.add(l2);
      TextField t2 =new TextField(20);
      f.add(t2);
      Button b1= new Button("login");
      f.add(b1);
      Button b2= new Button("logout");
      f.add(b2);

    }
}