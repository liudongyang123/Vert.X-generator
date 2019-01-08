package com.szmirren.models;

/**
 * SQL的配置信息
 * 
 * @author duhua
 *
 */
public class SQLConfig {

	private boolean isInsertBatch = false;
	private boolean isDelOldFile = true;
	private String funInsertBatch = "insert{C}Batch";

	public SQLConfig() {
		super();
	}

	public SQLConfig(boolean isInsertBatch, boolean isDelOldFile, String funInsertBatch) {
		super();
		this.isInsertBatch = isInsertBatch;
		this.isDelOldFile = isDelOldFile;
		this.funInsertBatch = funInsertBatch;
	}

	public boolean isDelOldFile() {
		return isDelOldFile;
	}

	public void setDelOldFile(boolean isDelOldFile) {
		this.isDelOldFile = isDelOldFile;
	}

	public boolean isInsertBatch() {
		return isInsertBatch;
	}

	public void setInsertBatch(boolean isInsertBatch) {
		this.isInsertBatch = isInsertBatch;
	}

	public String getFunInsertBatch() {
		return funInsertBatch;
	}

	public void setFunInsertBatch(String funInsertBatch) {
		this.funInsertBatch = funInsertBatch;
	}

}
