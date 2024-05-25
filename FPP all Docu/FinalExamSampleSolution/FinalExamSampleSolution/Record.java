package June2022;

public class Record {
	private String recordId;
	private String data;
	
	public Record(String id, String data) {
		this.recordId = id;
		this.data = data;
	}
	
	public String getRecordId() {
		return recordId;
	}	

	public String getData() {
		return data;
	}

	@Override
	public String toString() {
		return "Record [recordId=" + recordId + ", data=" + data + "]";
	}
}
