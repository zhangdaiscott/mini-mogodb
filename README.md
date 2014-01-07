mini-mongodb
===========

       模仿mongodb采用Xml+json实现小型数据库;
        1.实现数据库创建
        2.表的创建
        3.表数据的增、删、改、查
        
        供大家参考学习使用，有助于更好的了解MongoDB的实现原理！


-----------------------------------
       使用方法：
       1、首先导入该XmlDAO.Jar包
       2、导入Jdom包,提供解析xml文件功能
       3、导入Gson包,提供解析json文件功能
       4、用XmlDAO类里的方法生成一个xml的数据库文件
       5、测试表数据的增、删、改、查功能
       
       
       -----------------------------------
       <?xml version="1.0" encoding="UTF-8"?>
       <database>
	<table name="test">
		<data>{"sex":"男","age":20.0,"name":"lisan","money":2000.98,"_uuid":"a2b64d1a-63ea-4a1b-b1e3-67adcc687c0a"         }
		</data>
	</table>
	<table name="system.indexs" />
	<table name="system.users" />
       </database>




-----------------------------------
       * 作者：     张代浩
       * 技术论坛：[www.jeecg.org](http://www.jeecg.org)
       * 邮箱：  jeecg@sina.com
       * 交流群：325978980，143858350
