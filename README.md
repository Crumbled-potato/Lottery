# Lottery

抽奖系统项目是一款互联网面向C端人群营销活动类的抽奖系统，可以提供抽奖活动玩法策略的创建、参与、记账、发奖等逻辑功能。在使用的过程中运营人员通过创建概率类奖品的抽奖玩法，对用户进行拉新、促活、留存，通常这样的系统会用在电商、外卖、出行、公众号运营等各类场景中。

## 运行依赖

### 1.运行Kafka(windows)

```bash
cd D:\Study\XFG\kafka_2.13-2.8.0
#启动zookeeper：
cd D:\Study\XFG\kafka_2.13-2.8.0
bin\windows\zookeeper-server-start.bat  config\zookeeper.properties
#关闭zookeeper
bin\windows\zookeeper-server-stop.bat  config\zookeeper.properties
#启动kafka：
cd D:\Study\XFG\kafka_2.13-2.8.0
bin\windows\kafka-server-start.bat  config\server.properties
#关闭kafka：
bin\windows\kafka-server-stop.bat config\server.properties
#创建topic：
cd D:\Study\XFG\kafka_2.13-2.8.0
bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic lottery_invoice
bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic lottery_activity_partake
#查看topic：
bin\windows\kafka-topics.bat --list --zookeeper localhost:2181
#发送消息
bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic lottery_invoice
#监听消息
cd D:\Study\XFG\kafka_2.13-2.8.0
bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic lottery_invoice --from-beginning
bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic lottery_activity_partake --from-beginning
```

### 2.运行XXX-JOB

