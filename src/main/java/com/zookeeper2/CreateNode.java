package com.zookeeper2;

import org.I0Itec.zkclient.ZkClient;
import org.I0Itec.zkclient.serialize.SerializableSerializer;
import org.apache.zookeeper.CreateMode;

public class CreateNode {
	public static void main(String[] args) {
		// zk集群的地址
		String ZKServers = "1.zk.cdel.local:2181,1.kafka.cdel.local:2181,1.cassandra.cdel.local:2181";
		ZkClient zkClient = new ZkClient(ZKServers,10000,10000,new SerializableSerializer());
		System.out.println("conneted ok!");
		
		User user = new User();
		user.setId(1);
		user.setName("testUser1");
		
		/*
		 * /testUserNodd1:节点的地址
		 * user:数据的对象
		 * CreateMode.PERSISTENT: 创建的节点类型
		 * 注意创建的节点不能重复
		 */
		String path = zkClient.create("/testUserNode1",user,CreateMode.PERSISTENT);
		//输出创建节点的路径
		System.out.println("created path:" + path);
	}

}
