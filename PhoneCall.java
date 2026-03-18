class MobilePhone{
	private boolean isCallAllowed;
	private boolean isTextAllowed;
	private boolean isNetworkAvailable;
	
	public MobilePhone(boolean isCallAllowed,boolean isTextAllowed,boolean isNetworkAvailable){
		this.isCallAllowed=isCallAllowed;
		this.isTextAllowed=isTextAllowed;
		this.isNetworkAvailable=isNetworkAvailable;
	}
	
	public String makeCall(String phoneNumber) throws CallFailedException,NetworkErrorException{
		if(!isCallAllowed){
			throw new CallFailedException("Call feature is currently disabled.");
		}
		if(!isNetworkAvailable){
			throw new NetworkErrorException("Network not available. Cannot make a call.");
		}
		return "Calling "+phoneNumber+"...";
	}
	
	public String sendText(String phoneNumber, String message) throws MessageFailedException,NetworkErrorException{
		if(!isTextAllowed){
			throw new MessageFailedException("Text messaging feature is currently disabled.");
		}
		if(!isNetworkAvailable){
			throw new NetworkErrorException("Network not available. Cannot send a text message.");
		}
		return "Sending text message to "+phoneNumber+":"+message;
	}
	
}
class NetworkErrorException extends Exception{
	public NetworkErrorException(String message){
		super(message);
	}
}

class MessageFailedException extends Exception{
	public MessageFailedException(String message){
		super(message);
	}
}

class CallFailedException extends Exception{
	public CallFailedException(String message){
		super(message);
	}
}

class PhoneCall{
	public static void main(String[] args){
		try{
			MobilePhone phone1=new MobilePhone(true,true,true);
			MobilePhone phone2=new MobilePhone(false,true,false);
			System.out.println(phone1.makeCall("1234567890"));
			System.out.println(phone1.sendText("9876543210","Hello"));
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}