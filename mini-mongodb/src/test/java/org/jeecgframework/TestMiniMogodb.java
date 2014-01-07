package org.jeecgframework;

import java.util.List;
import java.util.Map;

public class TestMiniMogodb {
	private static final String uuid  = "068523e5-bc85-4c08-85a7-dc7a84735f7b";
	private static final String database_name  = "mini-mongodb.xml";
	
	public static void main(String[] args) {
		//new TestMiniMogodb().createDatabse();//创建数据库
		new TestMiniMogodb().insertData();//插入数据
		//new TestMiniMogodb().updateData();//修改数据
		//new TestMiniMogodb().deleteData();//删除数据
		//new TestMiniMogodb().listAll();//列表数据
	}
	
	
	/**
	 * 创建数据库
	 */
	public void createDatabse(){
		try {
			MiniMogodb dao = new MiniMogodb();
			dao.createDataBase(database_name);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 插入数据
	 */
	public void insertData(){
		Person po = new Person();
		po.setName("lisan");
		po.setAge(20);
		po.setMoney(2000.98);
		po.setSex("男");
		try {
			MiniMogodb dao = new MiniMogodb();
			dao.addData(database_name,"test",po);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 修改数据
	 */
	public void updateData(){
		Person po = new Person();
		po.set_uuid(uuid);
		po.setName("张代浩");
		po.setAge(28);
		try {
			MiniMogodb dao = new MiniMogodb();
			dao.updateData(database_name,"test",po);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * 删除数据
	 */
	public void deleteData(){
		Person po = new Person();
		po.set_uuid(uuid);
		try {
			MiniMogodb dao = new MiniMogodb();
			dao.deleteData(database_name,"test",po);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 获取所有数据
	 */
	public void listAll(){
		try {
			MiniMogodb dao = new MiniMogodb();
			List<Map> list = dao.loadTableDatas(database_name,"test");
			System.out.println(list.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
