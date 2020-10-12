package xiangmu4;

import xiangmu4v1.CPU;
import xiangmu4v1.HardDisk;

public class PC {
	private CPU cpu;
	private HardDisk HD;
	public PC(){
	}
	public PC(CPU cpu,HardDisk HD){
		this.cpu=cpu;
		this.HD=HD;
	}
	public void setCPU(CPU c){
		cpu=c;
	}
	public void setHardDisk(HardDisk h){
		HD=h;
	}
	public void show(){
		System.out.println("CPU�ٶ�"+cpu.getSpeed());
		System.out.println("Ӳ������"+HD.getAmount());
		System.out.println("CPU������"+cpu.getCores());
		System.out.println("Ӳ������"+HD.getType());
	}
}
