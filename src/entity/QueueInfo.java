package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class QueueInfo {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column(length=32)
	private String QueueName;
	private double Capacity;
	private double MaxCapacity;
	private double UsedCapacity;
	private long ParentQueue;
	private char IsLeafQueue;
	@Column(length=32)
	private String ResourceLimit;
	private char Enable;
	private int MaxWaitingTime;
	
	public QueueInfo(){}

	public QueueInfo(long id, String queueName, double capacity,
			double maxCapacity, double usedCapacity, long parentQueue,
			char isLeafQueue, String resourceLimit, char enable,
			int maxWaitingTime) {
		this.id = id;
		QueueName = queueName;
		Capacity = capacity;
		MaxCapacity = maxCapacity;
		UsedCapacity = usedCapacity;
		ParentQueue = parentQueue;
		IsLeafQueue = isLeafQueue;
		ResourceLimit = resourceLimit;
		Enable = enable;
		MaxWaitingTime = maxWaitingTime;
	}

	public QueueInfo(String queueName, double capacity, double maxCapacity,
			double usedCapacity, String resourceLimit, char enable,
			int maxWaitingTime) {
		QueueName = queueName;
		Capacity = capacity;
		MaxCapacity = maxCapacity;
		UsedCapacity = usedCapacity;
		ResourceLimit = resourceLimit;
		Enable = enable;
		MaxWaitingTime = maxWaitingTime;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getQueueName() {
		return QueueName;
	}

	public void setQueueName(String queueName) {
		QueueName = queueName;
	}

	public double getCapacity() {
		return Capacity;
	}

	public void setCapacity(double capacity) {
		Capacity = capacity;
	}

	public long getParentQueue() {
		return ParentQueue;
	}

	public void setParentQueue(long parentQueue) {
		ParentQueue = parentQueue;
	}

	public char getIsLeafQueue() {
		return IsLeafQueue;
	}

	public void setIsLeafQueue(char isLeafQueue) {
		IsLeafQueue = isLeafQueue;
	}

	public String getResourceLimit() {
		return ResourceLimit;
	}

	public void setResourceLimit(String resourceLimit) {
		ResourceLimit = resourceLimit;
	}

	public char getEnable() {
		return Enable;
	}

	public void setEnable(char enable) {
		Enable = enable;
	}

	public int getMaxWaitingTime() {
		return MaxWaitingTime;
	}

	public void setMaxWaitingTime(int maxWaitingTime) {
		MaxWaitingTime = maxWaitingTime;
	}

	public double getMaxCapacity() {
		return MaxCapacity;
	}

	public void setMaxCapacity(double maxCapacity) {
		MaxCapacity = maxCapacity;
	}

	public double getUsedCapacity() {
		return UsedCapacity;
	}

	public void setUsedCapacity(double usedCapacity) {
		UsedCapacity = usedCapacity;
	}

}
