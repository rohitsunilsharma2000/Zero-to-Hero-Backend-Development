
---

# 🧭 **CCDAK Learning Roadmap (4 Weeks – Full Syllabus)**

> 🎯 Goal: Become a confident **Kafka developer** with strong command over producer, consumer APIs, serialization, and Kafka Streams.

---

## 📘 CCDAK Exam Domains & Coverage

| Domain                                    | Weight | Covered in Week |
| ----------------------------------------- | ------ | --------------- |
| Kafka Core Concepts                       | 25%    | Week 1          |
| Kafka Producer & Consumer APIs            | 20%    | Week 2          |
| Kafka Streams & ksqlDB                    | 20%    | Week 3          |
| Schema Management (Avro, Registry)        | 10%    | Week 3          |
| Message Delivery Semantics & Transactions | 15%    | Week 4          |
| Topic Design & Best Practices             | 10%    | Week 4          |

---

## 🗓️ Week 1 – Kafka Core Concepts & CLI Basics

> 📘 Domain: **Kafka Core (25%)**

### ✅ Topics:

* Kafka architecture: brokers, partitions, replication, offset
* Log retention, compaction, consumer groups
* Topic configuration: replication.factor, cleanup.policy
* CLI: produce/consume, topic create/list/delete, partitions

### 💻 Practice Project: **"CLI-Based Newsfeed Publisher"**

* Create topic with log compaction
* Use CLI producer to simulate publishing
* Use CLI consumer to read data from start and latest offset

📦 Tools: Docker Compose, `kafka-topics.sh`, `kafka-console-producer.sh`, `kafka-console-consumer.sh`

---

## 🗓️ Week 2 – Kafka Java Producer & Consumer APIs

> 📘 Domain: **Producer/Consumer APIs (20%)**

### ✅ Topics:

* Java Producer config: acks, key/value, partitioner, retries
* Java Consumer config: group.id, auto.offset.reset, poll loop
* Manual commit, rebalance, and error handling

### 💻 Practice Project: **"Order System – Producer/Consumer App"**

* Java Producer publishes order events with key (orderId)
* Java Consumer reads orders and logs them grouped by orderId
* Implements manual offset commit and retry logic

📦 Tools: Java, Kafka client lib (`org.apache.kafka:kafka-clients`), IntelliJ/Maven/Gradle

---

## 🗓️ Week 3 – Kafka Streams & Schema Registry (Avro)

> 📘 Domain: **Kafka Streams (20%) + Schema Registry (10%)**

### ✅ Topics:

* Kafka Streams DSL: `map`, `groupByKey`, `aggregate`, `join`
* Avro serialization with Confluent Schema Registry
* SerDes and schema evolution basics

### 💻 Practice Project: **"Clickstream Aggregator with Avro"**

* Use Kafka Streams to count pageviews per user
* Avro-based message structure
* Schema Registry integration and backward compatible schema update

📦 Tools: Kafka Streams, Avro, Schema Registry, Confluent CLI

---

## 🗓️ Week 4 – Message Semantics, Transactions & Topic Design

> 📘 Domain: **Message Guarantees + Design (25%)**

### ✅ Topics:

* Message delivery semantics: at-most-once, at-least-once, exactly-once
* Idempotent producer & transactions
* Topic design: partition count, compaction vs delete
* Consumer offset reset strategies

### 💻 Practice Project: **"Bank Transaction System – Exactly-Once Demo"**

* Idempotent Kafka producer
* Use transactional producer with multiple topics
* Discuss impact on delivery semantics and latency

📦 Tools: Kafka producer API with transactions, `enable.idempotence=true`

---

## 🧰 Tools & Skills You’ll Learn

| Category      | Tools / Libraries                      |
| ------------- | -------------------------------------- |
| CLI + Admin   | Kafka CLI, Docker Compose              |
| Development   | Java SDK, Kafka Producer/Consumer APIs |
| Serialization | Avro, Confluent Schema Registry        |
| Streaming     | Kafka Streams DSL                      |
| Testing       | Embedded Kafka, Testcontainers         |

---

## 🏁 Final Review Checklist (Last 2 Days)

* [ ] Understand all 3 delivery guarantees + scenarios
* [ ] Practice Avro schema evolution and compaction
* [ ] Review Streams joins vs aggregations
* [ ] Take 2 mock exams (e.g., Udemy by Stephane Maarek)
* [ ] Review key producer/consumer configs (`acks`, `enable.auto.commit`, `max.poll.interval.ms`)

---
