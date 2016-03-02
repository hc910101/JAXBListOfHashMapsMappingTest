package test;

import java.awt.Point; 
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
 @XmlRootElement(name="Zone")
 public class Zone 
 { 
 private String name; 

 private Point startCoord; 
 
 private Point endCoord;
 
 @XmlElement
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@XmlJavaTypeAdapter(MyPointAdapter.class) 
//@XmlElement
public Point getStartCoord() {
	return startCoord;
}

public void setStartCoord(Point startCoord) {
	this.startCoord = startCoord;
}

//@XmlElement
@XmlJavaTypeAdapter(MyPointAdapter.class) 
public Point getEndCoord() {
	return endCoord;
}

public void setEndCoord(Point endCoord) {
	this.endCoord = endCoord;
}

@Override
public String toString() {
	return "Zone [name=" + name + ", startCoord=" + startCoord + ", endCoord=" + endCoord + "]";
}

 } 