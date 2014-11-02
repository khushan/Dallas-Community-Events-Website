package webTest;

import java.util.ArrayList;

public class EventDataBean {
private String eventId;
private String eventName;
private String date;
private ArrayList<String> eventList;
public String getEventId() {
	return eventId;
}
public void setEventId(String eventId) {
	this.eventId = eventId;
}
public String getEventName() {
	return eventName;
}
public void setEventName(String eventName) {
	this.eventName = eventName;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public ArrayList<String> getEventList() {
	return eventList;
}
public void setEventList(ArrayList<String> eventList) {
	this.eventList = eventList;
}


}
