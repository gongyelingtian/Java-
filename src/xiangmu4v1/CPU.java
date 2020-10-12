package xiangmu4v1;

public class CPU {
	private int speed;
	private int cores;
	public CPU(){
	}
	public CPU(int speed,int cores){
		this.speed=speed;
		setCores(cores);
	}
	public int getCores(){
		return cores;
	}
	public void setCores(int cores){
		if(cores<1)cores=1;
		this.cores=cores;
	}
	public int getSpeed(){
		return speed;
	}
	public void setSpeed(int m){
		speed=m;
	}
}
