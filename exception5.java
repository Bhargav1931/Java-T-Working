/* To open a website using java */
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;

public class OpenVLCPlayer {

 /**
  * @website: www.instanceofjava.com
  * @category: how to open a webpage in browser using java code
  */
 
 public static void main(String[] args)  {
  
    
  try {
   
   URI uri= new URI("http://www.instanceofjava.com");
   
   java.awt.Desktop.getDesktop().browse(uri);
    System.out.println("Web page opened in browser");
 
  } catch (Exception e) {
   
   e.printStackTrace();
  }
 }

}
