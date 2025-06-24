
---

# 🧭 CCAAK Learning Roadmap (4 Weeks – Full Syllabus)

> 🎯 Goal: Master Apache Kafka administration in a **real-world, production-grade setup**, including tuning, security, and troubleshooting.

---

## ✅ Weekly Plan Overview

| Week       | Focus Domain(s)               | Primary Topics                          |
| ---------- | ----------------------------- | --------------------------------------- |
| 1️⃣ Week 1 | Kafka Fundamentals            | Architecture, replication, message flow |
| 2️⃣ Week 2 | Cluster Management            | Setup, optimization, monitoring         |
| 3️⃣ Week 3 | Security & Access             | SASL, TLS, ACLs, Encryption             |
| 4️⃣ Week 4 | Troubleshooting & Integration | Connect, Streams, DR, Schema Registry   |

---

## 🗓️ Week 1 – Kafka Architecture & Core Fundamentals

> 📘 Domain: Kafka Fundamentals (15%)

### ✅ Topics:

* Kafka components: Broker, Producer, Consumer, Zookeeper
* Message flow: producer → broker → partition → consumer
* Replication, leader election, in-sync replicas (ISR)
* Log structure, offsets, record batches
* Exactly-once semantics, delivery guarantees

### 💻 Practice:

* Deploy Kafka + Zookeeper using Docker Compose
* Create test topics with replication/partition settings
* Send/consume messages using CLI
* Simulate leader failover

📦 Tools: Kafka CLI, Confluent Platform, JMX, Docker

---

## 🗓️ Week 2 – Cluster Management & Optimization

> 📘 Domain: Cluster Management & Performance (30%)

### ✅ Topics:

* Broker configs: heap size, segment.ms, retention.ms, log dirs
* Load balancing: partitions, producer keying, broker addition
* Recovery: under-replicated partitions, ISR, topic reassignments
* Metrics: CPU, memory, disk usage, log segment size
* Monitoring: JMX exporters, Prometheus/Grafana

### 💻 Practice:

* Tune log retention/segment settings
* Configure broker JVM options for performance
* Monitor broker health using JMX or Prometheus

📦 Tools: kafka-topics.sh, kafka-configs.sh, Prometheus, Grafana, kafka-reassign-partitions.sh

---

## 🗓️ Week 3 – Kafka Security: Auth, ACLs, TLS

> 📘 Domain: Kafka Security (15%)

### ✅ Topics:

* Enable TLS between brokers and clients
* Setup mutual TLS (mTLS)
* Enable and test SASL/PLAIN or SASL/SCRAM
* Configure ACLs for topics, groups, and users
* Troubleshoot common TLS and ACL failures

### 💻 Practice:

* Generate keystore/truststore using OpenSSL or Java `keytool`
* Enable TLS on Kafka and ZooKeeper
* Create ACLs for a test user and verify access controls

📦 Tools: OpenSSL, keytool, JAAS config, kafka-acls.sh

---

## 🗓️ Week 4 – Integration, DR, and Troubleshooting

> 📘 Domain: Design, Integration & Troubleshooting (40%)

### ✅ Topics:

* Kafka Connect architecture: source/sink, converters, configs
* Kafka Streams & ksqlDB intro
* Schema Registry + Avro
* Fault tolerance: multi-region replication, topic mirroring
* Log compaction, segment cleanup, retention
* Detect & solve: high consumer lag, disk pressure, ISR shrink

### 💻 Practice:

* Deploy Kafka Connect with JDBC or File source connector
* Configure Schema Registry and send Avro messages
* Simulate slow consumer and monitor lag with CLI

📦 Tools: Kafka Connect REST API, ksqlDB, MirrorMaker 2, kafka-consumer-groups.sh, schema-registry

---

## ✅ Tools You Should Know

| Purpose           | Tools / Commands                                                  |
| ----------------- | ----------------------------------------------------------------- |
| Kafka CLI         | `kafka-topics.sh`, `kafka-configs.sh`, `kafka-consumer-groups.sh` |
| Monitoring        | JMX Exporter, Prometheus, Grafana                                 |
| Security          | `kafka-acls.sh`, `keytool`, JAAS                                  |
| Connect & Streams | Kafka Connect REST API, `ksql`                                    |
| DR & Recovery     | MirrorMaker 2, partition reassignment                             |

---

## 🏁 Final Week – Mock Test & Readiness Review

* [ ] Take 2–3 full **practice exams** (Udemy by Stephane Maarek)
* [ ] Review your weak areas by domain weight
* [ ] Revisit Kafka logs and troubleshooting scenarios
* [ ] Simulate failure scenarios: broker crash, log disk full

---
