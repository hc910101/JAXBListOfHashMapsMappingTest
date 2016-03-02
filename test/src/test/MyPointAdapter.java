package test;
import java.awt.Point; 
import javax.xml.bind.annotation.adapters.XmlAdapter; 
public class MyPointAdapter extends XmlAdapter<MyPoint, Point> {
 /* * Java => XML */ 
 public MyPoint marshal(Point val) throws Exception 
 { 
	return new MyPoint((int) val.getX(), (int) val.getY()); 
 } /* * XML => Java */ 
 public Point unmarshal(MyPoint val) throws Exception 
 { 
 //return new Point(val.getX(), val.getY()); 
	 System.out.println(val);
	 return new Point(val.getX(), val.getY()); 
 } 
 } 