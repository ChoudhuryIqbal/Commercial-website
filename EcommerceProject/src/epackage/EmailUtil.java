package epackage;

public class EmailUtil {
	private static final String SMTP_HOST_NAME="smtp.gmail.com";
	private static final String SMTP_AUTH_USER="userid";
	private static final String SMTP_AUTH_PWD="pass";
	
	private static final String emailMsgTxt="Orders List i CSV formatted file";
	private static final String emailSubjectTxt="Orders list in csv formatted file";
	private static final String emailFromAddress="userid@gmail.com";
	
	//Add List of Email address to who email needs to be sent to 
	private static final String[] emailList={"supportw11@axyz.com","BMX97@tpg.com"};
	
	private static String sFileName=null;
	public static void emailUtil(String vFilename) {
		sFileName=vFilename;
		EmailUtil smtpMailSender=new EmailUtil();
		smtpMailSender.postMail(emailList,emailSubjectTxt,emailMsgTxt,emailFromAddress);
		
		
		
	}

}
