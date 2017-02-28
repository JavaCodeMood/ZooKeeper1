package com.zookeeper2;

import org.I0Itec.zkclient.ZkClient;
import org.I0Itec.zkclient.serialize.SerializableSerializer;

//更新节点数据
public class UpdateNode {
	public static void main(String[] args) {
		// zk集群的地址
		String ZKServers = "1.zk.cdel.local:2181,1.kafka.cdel.local:2181,1.cassandra.cdel.local:2181";
		ZkClient zkClient = new ZkClient(ZKServers, 10000, 10000, new SerializableSerializer());
		System.out.println("conneted ok!");
		
		User user = new User();
		user.setId(2);
		user.setName("testUser2");
		/*
		 * testUserNode:节点的路径
		 * user:传入的数据对象
		 */
		zkClient.writeData("/testUserNode1", user);
        System.out.println("节点更新成功！");
	}

}
