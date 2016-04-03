import java.awt.*;


public class LogicBoard {

	}


class Interfejs{
	private String portcomname;
	private int baudrate;
	private int databits;
	private int stopbits;
	private int parity;
		
	public Interfejs(){
		
	}
	
	public Interfejs(String portcomname,int baudrate){
	this.portcomname = portcomname;
	this.baudrate = baudrate;
	
	}
		
	public String getportcomname(){
	return portcomname;	
	}
	public int getbaudrate(){
	return baudrate;
	}
	public int getdatabits(){
	return databits;
	}
	public int getstopbits(){
	return stopbits;
	}
	public int getparity(){
	return parity;
	}

	public void setbaudrate(int baudrate){
	this.baudrate = baudrate;
	}
	public void setdatabits(int databits){
		this.databits = databits;
		}
	public void setstopbits(int stopbits){
		this.stopbits = stopbits;
		}
	public void setparity(int parity){
		this.parity = parity;
		}
	public void setportcomname(String portcomname){
	this.portcomname = portcomname;
	}

	public void wyswietl(){
		System.out.println("Podłączony do portu: "+this.getportcomname());
		System.out.println("Predkosc Baud: "+this.getbaudrate());
		System.out.println("Ilość databits: "+this.getdatabits());
		System.out.println("Ilość stopbits: "+this.getstopbits());
		System.out.println("Parzystość: "+this.getparity());
	}









}