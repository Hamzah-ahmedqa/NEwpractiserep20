package com.javaCode_0703;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetIpAddress {

	
	public static void main(String[] args)throws UnknownHostException {
		

			InetAddress localHostOfHumza = InetAddress. getLocalHost();
			System.out.println(localHostOfHumza. getHostAddress());
		
		
		
		
		
	}

}
