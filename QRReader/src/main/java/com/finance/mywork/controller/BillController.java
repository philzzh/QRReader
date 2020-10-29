package com.finance.mywork.controller;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.finance.mywork.entity.Bill;
import com.finance.mywork.service.BillService;

@RestController
@RequestMapping("/finance")	
public class BillController {
	@Autowired
    private BillService billService;
 
    @RequestMapping("/getBill")
    public List<Bill> getBill(){
        return billService.getBill();
    }
    
    @RequestMapping("/getBillbyId")
    public Bill getBillById(String id){
        return billService.getBillById(id);
    }
    
    @RequestMapping("/getBilltoIndex")
    public List<Bill> getBillByIndex(Integer index){
        return billService.getBillByIndex(index);
    }
    
    @GetMapping("/scan")
	public String scan(String reimburser , String id) {
		return billService.checkInsertBill(new Bill(id, reimburser, new Date()));
	}
    
    @RequestMapping("/getBillCount")
	public int getBillCount() {
		return billService.getBillCount();
	}
    
    @GetMapping("/delete")
	public void deleteBill(String id) {
		billService.deleteBillById(id);;
	}
}
