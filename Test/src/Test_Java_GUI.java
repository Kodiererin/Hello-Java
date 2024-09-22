

import java.awt.*;

public class Test_Java_GUI 
{
    static  int count=0;

    public static void main(String[] args) 
    {
        Frame f=new Frame();
        f.setTitle("My First Window App");
        Button b=new Button("Click Me");
        f.add(b);
        TextField tf=new TextField(20);
        f.add(tf);
        
        b.addActionListener((e)->tf.setText("Clicked "+count++));
        
        f.setLayout(new FlowLayout());
        f.setSize(1000,500);
        f.setVisible(true);
        
    }
    
}