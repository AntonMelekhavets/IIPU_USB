package Executors;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class DeviceInformation {
	public StringProperty deviceName;
	public StringProperty diskName;
	public StringProperty allMemory;
	public StringProperty freeMemory;

	public DeviceInformation() {
		deviceName = null;
		diskName = null;
		allMemory = null;
		freeMemory = null;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = new SimpleStringProperty(deviceName);
	}

	public void setDiskName(String diskName) {
		this.diskName = new SimpleStringProperty(diskName);
	}

	public void setAllMemory(String allMemory) {
		this.allMemory = new SimpleStringProperty(allMemory);
	}

	public void setFreeMemory(String freeMemory) {
		this.freeMemory = new SimpleStringProperty(freeMemory);
	}
}
