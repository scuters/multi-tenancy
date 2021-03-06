package entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class ResourceInfo {

	@Id
	@GeneratedValue(generator="id")
	@GenericGenerator(name="id",strategy="assigned")
	private long id;
	private int AppLimit;
	private int CurrentAppCount;
	@Column(length=200)
	private String HDFSDirectory;
	private long HDFSDirectoryQuota;
	private long HDFSDirectoryRemaining;
	private int Queue;
	private Date CreateTime;
	private long CreateUserID;
	private char Expired;
	private int SubmitJobTimes;
	private Date LastSubmitTime;
	
	public ResourceInfo(){}

	public ResourceInfo(long id, int appLimit, int currentAppCount,
			String hDFSDirectory, long hDFSDirectoryQuota,
			long hDFSDirectoryRemaining, int queue, Date createTime,
			long createUserID, char expired, int submitJobTimes,
			Date lastSubmitTime) {
		this.id = id;
		AppLimit = appLimit;
		CurrentAppCount = currentAppCount;
		HDFSDirectory = hDFSDirectory;
		HDFSDirectoryQuota = hDFSDirectoryQuota;
		HDFSDirectoryRemaining = hDFSDirectoryRemaining;
		Queue = queue;
		CreateTime = createTime;
		CreateUserID = createUserID;
		Expired = expired;
		SubmitJobTimes = submitJobTimes;
		LastSubmitTime = lastSubmitTime;
	}

	public ResourceInfo(int appLimit, int currentAppCount,
			String hDFSDirectory, long hDFSDirectoryQuota,
			long hDFSDirectoryRemaining, int queue, Date createTime,
			long createUserID, char expired, int submitJobTimes,
			Date lastSubmitTime) {
		AppLimit = appLimit;
		CurrentAppCount = currentAppCount;
		HDFSDirectory = hDFSDirectory;
		HDFSDirectoryQuota = hDFSDirectoryQuota;
		HDFSDirectoryRemaining = hDFSDirectoryRemaining;
		Queue = queue;
		CreateTime = createTime;
		CreateUserID = createUserID;
		Expired = expired;
		SubmitJobTimes = submitJobTimes;
		LastSubmitTime = lastSubmitTime;
	}

	public ResourceInfo(int appLimit, int currentAppCount,
			long hDFSDirectoryQuota, long hDFSDirectoryRemaining) {
		AppLimit = appLimit;
		CurrentAppCount = currentAppCount;
		HDFSDirectoryQuota = hDFSDirectoryQuota;
		HDFSDirectoryRemaining = hDFSDirectoryRemaining;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getAppLimit() {
		return AppLimit;
	}

	public void setAppLimit(int appLimit) {
		AppLimit = appLimit;
	}

	public int getCurrentAppCount() {
		return CurrentAppCount;
	}

	public void setCurrentAppCount(int currentAppCount) {
		CurrentAppCount = currentAppCount;
	}

	public String getHDFSDirectory() {
		return HDFSDirectory;
	}

	public void setHDFSDirectory(String hDFSDirectory) {
		HDFSDirectory = hDFSDirectory;
	}

	public long getHDFSDirectoryQuota() {
		return HDFSDirectoryQuota;
	}

	public void setHDFSDirectoryQuota(long hDFSDirectoryQuota) {
		HDFSDirectoryQuota = hDFSDirectoryQuota;
	}

	public long getHDFSDirectoryRemaining() {
		return HDFSDirectoryRemaining;
	}

	public void setHDFSDirectoryRemaining(long hDFSDirectoryRemaining) {
		HDFSDirectoryRemaining = hDFSDirectoryRemaining;
	}

	public int getQueue() {
		return Queue;
	}

	public void setQueue(int queue) {
		Queue = queue;
	}

	public Date getCreateTime() {
		return CreateTime;
	}

	public void setCreateTime(Date createTime) {
		CreateTime = createTime;
	}

	public long getCreateUserID() {
		return CreateUserID;
	}

	public void setCreateUserID(long createUserID) {
		CreateUserID = createUserID;
	}

	public char getExpired() {
		return Expired;
	}

	public void setExpired(char expired) {
		Expired = expired;
	}

	public int getSubmitJobTimes() {
		return SubmitJobTimes;
	}

	public void setSubmitJobTimes(int submitJobTimes) {
		SubmitJobTimes = submitJobTimes;
	}

	public Date getLastSubmitTime() {
		return LastSubmitTime;
	}

	public void setLastSubmitTime(Date lastSubmitTime) {
		LastSubmitTime = lastSubmitTime;
	}

	
}
