package com.zookeeper2;

import org.I0Itec.zkclient.ZkClient;
import org.I0Itec.zkclient.serialize.SerializableSerializer;

//判断节点是否存在
public class ExistsNode {
	public static void main(String[] args) {
		// zk集群的地址
		String ZKServers = "1.zk.cdel.local:2181,1.kafka.cdel.local:2181,1.cassandra.cdel.local:2181";
		ZkClient zkClient = new ZkClient(ZKServers, 10000, 10000, new SerializableSerializer());
		System.out.println("conneted ok!");
        
		boolean bool = zkClient.exists("/testUserNode3");
		//返回true表示节点存在，false表示节点不存在
		System.out.println("节点是否存在："+bool);
	}

}
