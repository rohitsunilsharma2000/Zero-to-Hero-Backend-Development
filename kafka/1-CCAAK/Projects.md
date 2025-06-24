
---

# 🧩 **CCAAK Learning Task Plan with Projects (4 Weeks – Full Syllabus)**  
> 🎯 **Goal**: Master Apache Kafka cluster administration across core concepts, security, performance, and troubleshooting

---

## 📘 Official Domains Coverage

| Domain                                | Weight | Covered In |
|--------------------------------------|--------|------------|
| Kafka Fundamentals                   | 15%    | Week 1     |
| Cluster Management & Optimization    | 30%    | Week 2     |
| Kafka Security                       | 15%    | Week 3     |
| Troubleshooting & Integration        | 40%    | Week 4     |

---

## 🗓️ Week 1 – Kafka Core Fundamentals
> 📘 Domain: **Kafka Fundamentals (15%)**

### ✅ Tasks:
- Understand broker, producer, consumer, topic, partition, ISR
- Create topics with custom partitions and replication
- Test durability and replication
- Visualize producer → broker → consumer flow

### 💻 **Project: Basic Kafka Setup + Topic Simulation**

📂 `/ccak-week1-kafka-basics/`
- Docker Compose setup (Zookeeper + Kafka)
- CLI to create topics, describe, alter configs
- Simulate message flow: producer → 3-partition topic → multiple consumers
- Observe leader election when broker goes down

---

## 🗓️ Week 2 – Cluster Management & Optimization
> 📘 Domain: **Cluster Scaling + Performance (30%)**

### ✅ Tasks:
- Configure brokers with JVM, disk, retention tuning
- Add/remove brokers dynamically
- Rebalance partitions
- Analyze under-replicated partitions, ISR issues
- Use JMX/Prometheus to monitor key metrics

### 💻 **Project: Performance-Tuned Kafka Cluster**

📂 `/ccak-week2-cluster-management/`
- Configure `log.retention.ms`, `segment.bytes`, `num.io.threads`
- Add 2nd broker and balance topics
- Monitor using Prometheus + Grafana
- Detect and resolve under-replicated partitions

---

## 🗓️ Week 3 – Kafka Security (Auth, TLS, ACLs)
> 📘 Domain: **Kafka Security (15%)**

### ✅ Tasks:
- Enable TLS between brokers and clients
- Setup SASL/PLAIN authentication
- Configure ACLs for producers and consumers
- Test secure topic access and denied access

### 💻 **Project: Kafka Secure Channel Simulation**

📂 `/ccak-week3-security/`
- Generate certs and keys using OpenSSL
- Configure Kafka for TLS and SASL
- Create ACLs for topic-specific read/write
- Attempt unauthorized access and observe logs

---

## 🗓️ Week 4 – Troubleshooting, Connect, Schema Registry
> 📘 Domain: **Design, Troubleshooting & Integration (40%)**

### ✅ Tasks:
- Install and configure Kafka Connect (source/sink)
- Register Avro schema using Schema Registry
- Simulate consumer lag + monitor group offsets
- Analyze Kafka logs for controller failover, rebalance
- Troubleshoot disk pressure, ISR shrinkage, replica throttling

### 💻 **Project: Kafka Integration Lab + Incident Simulation**

📂 `/ccak-week4-troubleshooting/`
- Deploy FileStream → Kafka → Elasticsearch pipeline
- Configure Avro messages with Schema Registry
- Simulate broker crash and consumer lag
- View and resolve topic compaction errors

---

## 🧰 Tools Used Throughout

| Category      | Tools |
|---------------|-------|
| Kafka CLI     | `kafka-topics.sh`, `kafka-configs.sh`, `kafka-consumer-groups.sh`, `kafka-acls.sh` |
| Monitoring    | JMX Exporter, Prometheus, Grafana |
| Security      | OpenSSL, JAAS, TLS keystores |
| Integration   | Kafka Connect, Schema Registry |
| Troubleshooting | Broker logs, controller logs, under-replicated partition alerts |

---

## ✅ Bonus (Advanced Optional Tasks)

| Task | Domain |
|------|--------|
| Multi-DC DR with MirrorMaker2 | Integration |
| Audit log rotation + disk alert handling | Troubleshooting |
| Deploy Kafka on Kubernetes using Strimzi | Bonus (real-world ready) |

---
