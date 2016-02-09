
public class GSM {
	String model;
	boolean hasSimCard;
	String simMobileNumber;
	double outGoingCallsDuration;
	Call lastIncomingCall = new Call();
	Call lastOutgoingCall = new Call();
	void insertSimCard(String simMobileNumber){
		if(simMobileNumber.length() == 10 && simMobileNumber.startsWith("08")){
			this.simMobileNumber = simMobileNumber;
			hasSimCard = true;
		}
	}
	void removeSimCard(){
		hasSimCard = false;
		this.simMobileNumber = " ";
	}
	void call(GSM other,double duration){
		if(duration > 0 && (other.hasSimCard) && (this.hasSimCard) 
				&& (!(this.simMobileNumber.equals(other.simMobileNumber)))){
			this.lastOutgoingCall.caller = this.simMobileNumber;
			this.lastOutgoingCall.reciever = other.simMobileNumber;
			this.lastOutgoingCall.duration = duration;
			other.lastIncomingCall.caller = this.simMobileNumber;
			other.lastIncomingCall.reciever = other.simMobileNumber;
			other.lastIncomingCall.duration = duration;
			this.outGoingCallsDuration += duration;
		}
	
		
	}
	double getSumForCall(){
		return outGoingCallsDuration * Call.priceForAMinute;
		
	}
	void printInfoForTheLastIncomingCall(){
		if(this.lastIncomingCall.duration != 0){
			System.out.println("Info for the last incoming call: \n caller: " + this.lastIncomingCall.caller
					+ "\n reciever: " + this.lastIncomingCall.reciever + "\n duration: " + this.lastIncomingCall.duration);
		}
	}
	void printInfoForTheLastOutgoingCall(){
		if(this.lastOutgoingCall.duration != 0){
			System.out.println("Info for the last outgoing call: \n caller:  " + this.lastOutgoingCall.caller
					+ "\n reciever: " + this.lastOutgoingCall.reciever + "\n duration: " + this.lastOutgoingCall.duration);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GSM	gsm1 = new GSM();
		GSM gsm2 = new GSM();
	    gsm1.insertSimCard("0884443156");
		System.out.println(gsm1.simMobileNumber);
		gsm2.insertSimCard("0882502683");
		gsm1.call(gsm2,1.5);
		System.out.println(gsm1.outGoingCallsDuration);

		gsm1.printInfoForTheLastIncomingCall();
		gsm1.printInfoForTheLastOutgoingCall();
		gsm2.printInfoForTheLastIncomingCall();
		gsm2.printInfoForTheLastOutgoingCall();
	}

}
