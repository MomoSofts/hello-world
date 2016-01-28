import java.io.File;
import java.net.MalformedURLException;

import javax.swing.ImageIcon;

import javax.swing.JLabel;
import javax.swing.JWindow;
import javax.swing.SwingConstants;

import com.momosofts.demoproj.constants.Fichiers;

import java.io.*;


public class Index {
   public static void main(String[] ar) throws MalformedURLException{
	   JWindow window = new JWindow();
	   window.getContentPane().add(
	       new JLabel("", new ImageIcon(System.getProperty("user.dir") + File.separator + 
	    		   "src" + File.separator + "images"  +  File.separator + "splash.png"
	    		 
	    		   ), SwingConstants.CENTER));
	   
	   window.setBounds(500, 270, 336, 298);
	   window.setVisible(true);
	   try {
	       Thread.sleep(5000);
	   } catch (InterruptedException e) {
	       e.printStackTrace();
	   }
	   window.setVisible(false);
	     System.out.println(new File(Fichiers.CLASSPATH.getPath()).exists());
		 //  new JIFrameDemo();
	  
   }
   
   
  

	}
