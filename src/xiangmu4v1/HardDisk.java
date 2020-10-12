package xiangmu4v1;

import xiangmu4.HardDiskType;

public class HardDisk {
	private int amount;
	private HardDiskType type;
	public HardDisk(){
	}
	public HardDisk(int amount,HardDiskType type){
		this.amount=amount;
		this.type=type;
	}
	public HardDiskType getType(){
		return type;
	}
	public void setType(HardDiskType type){
		this.type=type;
	}
	public int getAmount(){
		return amount;
	}
	public void setAmount(int m){
		amount=m;
	}
}
