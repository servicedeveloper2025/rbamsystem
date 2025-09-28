package com.n6n.service;

import com.n6n.request.CustRequestVO;

public interface CustService {
	
	 String getAppointment(CustRequestVO reqvo);
	 String confirmAppointment(CustRequestVO reqvo);

}
