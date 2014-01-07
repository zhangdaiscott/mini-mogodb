package org.jeecgframework;

import java.util.List;
import java.util.Map;

public class TestMiniMogodb {
	private static final String uuid  = "289aeda6-9f6b-459d-8a3f-70cf4fc1d524";
	public static void main(String[] args) {
		new TestMiniMogodb().deleteData();
	}
	
	
	/**
	 * 创建数据库
	 */
	public void createDatabse(){
		try {
			MiniMogodb dao = new MiniMogodb();
			dao.createDataBase("mogodb.xml");
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
			dao.addData("mogodb.xml","test",po);
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
			dao.updateData("mogodb.xml","test",po);
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
			dao.deleteData("mogodb.xml","test",po);
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
			List<Map> list = dao.loadTableDatas("mogodb.xml","test");
			System.out.println(list.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
