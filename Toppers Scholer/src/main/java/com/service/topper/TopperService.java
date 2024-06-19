package com.service.topper;

import java.util.List;

import com.duo.topper.DuolayerToppers;
import com.model.topper.Toppers;

public class TopperService {
	public String CreateToppers(Toppers abc) {
		DuolayerToppers dd=new DuolayerToppers();
		return dd.creatTop(abc);
	}
	public List<Toppers> getAllDa(){
		DuolayerToppers dd=new DuolayerToppers();
		return dd.getAlldata();
	}
	public String updateData(Toppers abc) {
		DuolayerToppers dd=new DuolayerToppers();
		return dd.updateDat(abc);
	}
	public String deleteById(int deleteid) {
		DuolayerToppers dd=new DuolayerToppers();
		return dd.deleteId(deleteid);
	}
	public Toppers getByID(int getbyid) {
		DuolayerToppers dd=new DuolayerToppers();
		return dd.getid(getbyid);
	}
}
