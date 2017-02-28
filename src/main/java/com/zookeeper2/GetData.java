package com.zookeeper2;

import org.I0Itec.zkclient.ZkClient;
import org.I0Itec.zkclient.serialize.SerializableSerializer;
import org.apache.zookeeper.data.Stat;

//获取节点中的数据
public class GetData {
	public static void main(String[] args) {
		// zk集群的地址
		String ZKServers = "1.zk.cdel.local:2181,1.kafka.cdel.local:2181,1.cassandra.cdel.local:2181";
		ZkClient zkClient = new ZkClient(ZKServers, 10000, 10000, new SerializableSerializer());
		System.out.println("conneted ok!");
		
		Stat stat = new Stat();
		//获取节点中的对象
		User user = zkClient.readData("/testUserNode1",stat);
		System.out.println(user.getName());
		System.out.println(stat);

	}

}
