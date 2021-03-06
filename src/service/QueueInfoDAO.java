package service;

import java.util.List;

import entity.QueueInfo;
import entity.ResourceInfo;
import entity.UserInfo;

public interface QueueInfoDAO {
	
	public boolean addQueue(QueueInfo q);
	
	public boolean updateQueueCapacity(String name,double capacity,double maxcapacity,double usedcapacity,int memoryUnit,int vcoreUnit);
	
	public QueueInfo findQueue(String name);

	public List<String> showQueue();
	
	public List<QueueInfo> showQueues();
	
	public String queryQueueByUser(String user);
	
	public long querySum();
}
