import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;

public class JSample1_1 extends JFrame {
	static int count = 0;
	static JLabel countLabel = new JLabel(count + "回");

	
	
	public static void main(String args[]){
	    JSample1_1 frame = new JSample1_1("MyTitle");
	    frame.setVisible(true);
	  }
	
	  JSample1_1(String title){
	    setTitle(title);
	    setBounds(100, 100, 600, 400);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	    JButton button1 = new JButton("カウントアップ");
	    JButton button2 = new JButton("リセット");
	    button1.addActionListener(new myListener1());
	    button2.addActionListener(new myListener2());
	    
	    
	
	    JPanel p1 = new JPanel();
	    JPanel p2 = new JPanel();
	    p1.add(button1);
	    p1.add(button2);
	    p2.add(countLabel);
	    
	    Container contentPane = getContentPane();
	    contentPane.add(p1, BorderLayout.NORTH);
	    contentPane.add(p2, BorderLayout.CENTER);
	  }

	public class myListener1 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO 自動生成されたメソッド・スタブ
			
			count++;
			countLabel.setText(count + "回");
		}
	}
	public class myListener2 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO 自動生成されたメソッド・スタブ
			count = 0;
			countLabel.setText(count + "回");
		}
	}

}