package com.company;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

public class TestTx {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("47.98.237.5", 6379);

        Transaction transaction = jedis.multi();

        try {
            transaction.set("user3", String.valueOf(1));

            int a=1/0;
            transaction.exec();
        }catch (Exception e){
            transaction.discard();
            e.printStackTrace();
        }
        finally {
            //jedis.get("user1");
            System.out.println(jedis.get("user3"));
            jedis.close();
        }
    }
}
