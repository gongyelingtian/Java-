package xiangmu4;

import xiangmu4v1.CPU;
import xiangmu4v1.HardDisk;

public class Test {
	public static void main(String[] args){
		CPU cpu=new CPU(2200,4);
		cpu.setSpeed(2200);
		HardDisk HD=new HardDisk(200,HardDiskType.SSD);
		HD.setAmount(200);
		PC pc=new PC(cpu,HD);
		pc.setCPU(cpu);
		pc.setHardDisk(HD);
		pc.show();
	}
}
