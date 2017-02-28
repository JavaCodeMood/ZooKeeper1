package com.zookeeper2;

import org.I0Itec.zkclient.ZkClient;
import org.I0Itec.zkclient.serialize.SerializableSerializer;

//创建会话
public class CreateSession {
	public static void main(String[] args) {
		// zk集群的地址
		String ZKServers = "1.zk.cdel.local:2181,1.kafka.cdel.local:2181,1.cassandra.cdel.local:2181";

		// 创建会话 new SerializableSerializer()创建序列化接口，用来序列化和返序列化
		ZkClient zkClient = new ZkClient(ZKServers, 10000, 10000, new SerializableSerializer());

		System.out.println("conneted ok!");

	}

}
