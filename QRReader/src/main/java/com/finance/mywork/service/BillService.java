package com.finance.mywork.service;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finance.mywork.entity.Bill;
import com.finance.mywork.mapper.BillMapper;

@Service
public class BillService {
	
	@Autowired
    BillMapper billMapper;
	
    public String checkInsertBill(Bill bill){
    	Bill resBill = billMapper.selectBillById(bill.getId());
         if(resBill==null) {
        	 billMapper.insertBill(bill);
        	 return "未报销";
         }
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
		return resBill.getReimburser()+"已于"+sdf.format(resBill.getRdate())+"报销";
    }
    
    public Bill getBillById(String id) {
    	return billMapper.selectBillById(id);
    }
    
    public List<Bill> getBill() {
    	return billMapper.selectBill();
    }
    
    public void deleteBillById(String id) {
    	billMapper.deleteBillById(id);
    }
    
}
