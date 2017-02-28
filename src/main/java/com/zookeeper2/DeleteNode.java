package com.zookeeper2;

import org.I0Itec.zkclient.ZkClient;
import org.I0Itec.zkclient.serialize.SerializableSerializer;

//删除节点
public class DeleteNode {
	public static void main(String[] args) {
		// zk集群的地址
		String ZKServers = "1.zk.cdel.local:2181,1.kafka.cdel.local:2181,1.cassandra.cdel.local:2181";
		ZkClient zkClient = new ZkClient(ZKServers, 10000, 10000, new SerializableSerializer());
		System.out.println("conneted ok!");
		
		//删除单独一个节点，返回true表示成功
		boolean bool = zkClient.delete("/testUserNode");
		//删除含有子节点的节点
		boolean bool1 = zkClient.deleteRecursive("/test");
		//返回true表示节点删除成功，false表示删除失败
		System.out.println("节点删除是否成功：" + bool);
		System.out.println("子节点删除是否成功：" + bool1);

	}

}
