package org.jeecgframework;


public class Person {
	private String _uuid;
	private String name;
	private String sex;
	private int age;
	private double money;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String get_uuid() {
		return _uuid;
	}

	public void set_uuid(String _uuid) {
		this._uuid = _uuid;
	}
}