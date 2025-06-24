
---

# 🧾 **CCDAK_Syllabus_Coverage_Report**

---

## 📘 Exam Domains & Week Mapping

| **Domain**                             | **Weight** | **Covered In** | ✅ **Coverage Summary** |
|----------------------------------------|------------|----------------|--------------------------|
| 1️⃣ Application Design                | 40%        | Week 1         | Kafka architecture, message format, CLI tools, log retention, compaction, topic configs |
| 2️⃣ Domain Development               | 30%        | Week 2         | Java Producer/Consumer APIs, partitions, offsets, rebalancing, performance, delivery guarantees |
| 3️⃣ Deployment & Testing            | 30%        | Week 3 & 4     | Kafka Streams, Schema Registry, ksqlDB, REST Proxy, testing, transactions |

---

## ✅ Detailed Domain Coverage

---

### 🔹 1. Application Design – **40%**  
📍 **Covered in**: **Week 1**

**Topics Covered:**
- Kafka core concepts: brokers, partitions, topics, offsets
- CLI commands: `kafka-topics.sh`, `kafka-console-producer.sh`, etc.
- Topic design: replication, cleanup policies, compaction
- Message anatomy: key/value/headers
- System metrics and logs

💻 **Project**: `ccdak-week1-cli-newsfeed`  
Simulated CLI publishing, partitioned topics, log compaction

---

### 🔹 2. Domain Development – **30%**  
📍 **Covered in**: **Week 2**

**Topics Covered:**
- Kafka Java Producer & Consumer APIs
- Producer configs: `acks`, retries, idempotence
- Consumer configs: `group.id`, `auto.offset.reset`, manual commit
- Rebalancing, partition assignment
- Deserializers, error handling

💻 **Project**: `ccdak-week2-order-service`  
End-to-end order event simulation with retries, manual commit, offset tracking

---

### 🔹 3. Deployment & Testing – **30%**  
📍 **Covered in**: **Week 3 & 4**

**Topics Covered:**
- Kafka Streams API: `map`, `aggregate`, `join`
- Schema Registry with Avro serialization
- ksqlDB stream queries (joins, filters)
- REST Proxy usage (read/write messages via HTTP)
- Transactions and delivery semantics
- Unit testing using embedded Kafka (optional)

💻 **Projects**:
- `ccdak-week3-clickstream-analytics`: Streams + Schema Registry
- `ccdak-week4-bank-transfer-exactly-once`: Transactions + REST Proxy

---

## 🧰 Tools Used Across All Weeks

| Tool / Library              | Use Case                                |
|-----------------------------|-----------------------------------------|
| Kafka CLI Tools             | Topic/Group management, test events     |
| Java Kafka Clients          | Producer/Consumer APIs                  |
| Kafka Streams DSL           | Stream processing                       |
| Confluent Schema Registry   | Avro serialization & schema evolution   |
| REST Proxy                  | External integrations (HTTP)            |
| Docker Compose              | Local multi-broker Kafka cluster        |
| ksqlDB CLI/UI               | Stream SQL operations                   |
| Optional: Testcontainers    | Integration/unit tests (mock Kafka)     |

---

## ✅ Final Verdict

| Area                        | Status | Notes |
|-----------------------------|--------|-------|
| Kafka Core                  | ✅     | Covered in Week 1 |
| Producer/Consumer APIs      | ✅     | Covered in Week 2 |
| Partitioning & Rebalancing  | ✅     | Project-based simulation |
| Schema Registry & Avro      | ✅     | Covered in Week 3 |
| Kafka Streams + ksqlDB      | ✅     | DSL + SQL workflows in Week 3 |
| REST Proxy + Transactions   | ✅     | Demonstrated in Week 4 |

✅ **Complete syllabus coverage achieved. You’re exam-ready!**

---
