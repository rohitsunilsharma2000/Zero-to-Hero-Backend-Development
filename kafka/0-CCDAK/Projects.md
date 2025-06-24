
---

# 🧩 **CCDAK Learning Task Plan with Projects (4 Weeks – Full Syllabus)**

> 🎯 Goal: Become a production-ready Kafka developer with strong grasp of Producer/Consumer APIs, Kafka Streams, Schema Registry, and deployment best practices.

---

## 📘 Domain-to-Week Mapping

| Week       | Focus Area                                    | Domain Weight        |
| ---------- | --------------------------------------------- | -------------------- |
| 1️⃣ Week 1 | Kafka Core & CLI Tools                        | 40% (Design)         |
| 2️⃣ Week 2 | Kafka Java Producer/Consumer APIs             | 30% (Development)    |
| 3️⃣ Week 3 | Streams, ksqlDB, Schema Registry              | 30% (Testing/Deploy) |
| 4️⃣ Week 4 | Delivery Guarantees, Transactions, REST Proxy | Bonus + Review       |

---

## 🗓️ Week 1 – Kafka Core, Topics & CLI Tools

> 📘 Domain: **Application Design (40%)**

### ✅ Learning Topics:

* Kafka architecture (brokers, partitions, logs, replication)
* Kafka CLI tools: topic creation, configuration, partitions
* Retention policies, compaction, replication factor
* Kafka message format: key, value, timestamp, headers

### 💻 **Project: Newsfeed Event Publisher CLI**

📂 `/ccdak-week1-cli-newsfeed/`

* Set up Kafka via Docker Compose
* Create a topic with compaction and 3 partitions
* Simulate CLI-based message publishing and consumption
* Validate log retention and compaction behavior

---

## 🗓️ Week 2 – Kafka Java Producer & Consumer APIs

> 📘 Domain: **Domain Development (30%)**

### ✅ Learning Topics:

* Producer configs: `acks`, `linger.ms`, retries, keys
* Consumer configs: `auto.offset.reset`, `max.poll.records`, manual commit
* Partitioning strategies, group rebalancing
* Deserializers and error handling

### 💻 **Project: Order Management Microservice**

📂 `/ccdak-week2-order-service/`

* Java-based OrderProducer sends keyed order events
* OrderConsumer groups them by customer ID
* Implements manual offset commit, retry loop, error recovery
* Partition assignment and rebalancing simulations

---

## 🗓️ Week 3 – Kafka Streams, ksqlDB & Schema Registry

> 📘 Domain: **Deployment & Testing (30%)**

### ✅ Learning Topics:

* Kafka Streams DSL: map, filter, groupByKey, aggregate, joins
* Avro + Confluent Schema Registry integration
* ksqlDB queries: windowed aggregations, joins, filtering
* Compatibility checks & schema evolution

### 💻 **Project: Clickstream Aggregator with Avro + Streams**

📂 `/ccdak-week3-clickstream-analytics/`

* Generate Avro-encoded click events
* Use Streams to count clicks per session/user
* Register schema with Schema Registry
* Add ksqlDB query to extract top 5 users

---

## 🗓️ Week 4 – Delivery Guarantees, REST Proxy, Transactions

> 📘 Domains: **All + Bonus Topics**

### ✅ Learning Topics:

* At-most-once, at-least-once, exactly-once semantics
* Idempotent producers, transactions
* REST Proxy for external apps (non-Java)
* Integration testing + REST-based ingestion

### 💻 **Project: Transactional Bank Transfer System**

📂 `/ccdak-week4-bank-transfer-exactly-once/`

* Simulate two-topic transaction: debit + credit
* Use `KafkaProducer.beginTransaction()`, `commitTransaction()`
* Create a lightweight UI or REST client via REST Proxy
* Visualize idempotence and recovery

---

## ✅ Bonus Projects (Optional but Recommended)

| Name                          | Focus               |
| ----------------------------- | ------------------- |
| **Kafka Connect + JDBC Sink** | Integration         |
| **Schema Evolution Test**     | Avro Versioning     |
| **Consumer Lag Dashboard**    | Monitoring          |
| **Embedded Kafka JUnit Test** | Local testing setup |

---

## ✅ Weekly Outcomes Summary

| Week | Project Folder                           | Outcome                            |
| ---- | ---------------------------------------- | ---------------------------------- |
| 1️⃣  | `ccdak-week1-cli-newsfeed`               | CLI mastery, Kafka core confidence |
| 2️⃣  | `ccdak-week2-order-service`              | Strong API dev, consumer offsets   |
| 3️⃣  | `ccdak-week3-clickstream-analytics`      | Streaming + Schema Registry        |
| 4️⃣  | `ccdak-week4-bank-transfer-exactly-once` | Transactions, REST Proxy, testing  |

---

## 🛠️ Tools Covered

* ✅ Kafka CLI tools (topics, config, groups)
* ✅ Java `kafka-clients`, `kafka-streams`
* ✅ Avro, Schema Registry
* ✅ Kafka Connect (JDBC)
* ✅ ksqlDB
* ✅ REST Proxy
* ✅ Docker Compose for local testing

---
