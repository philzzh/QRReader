package com.finance.mywork.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.finance.mywork.entity.Bill;

@Repository
public interface BillMapper {
	
	Bill selectBillById(String id);
	
	void insertBill(Bill bill);
	
	List<Bill> selectBill();
	
	List<Bill> selectBillByIndex(Integer index);
	
	void deleteBillById(String id);
	
	int selectBillCount();
	
}
