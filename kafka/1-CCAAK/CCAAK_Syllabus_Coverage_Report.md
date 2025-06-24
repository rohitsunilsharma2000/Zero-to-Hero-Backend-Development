
---

# 🧾 **CCAAK\_Syllabus\_Coverage\_Report**

## 📘 Exam Domains & Project Mapping

| **Domain**                            | **Weight** | **Week Covered** | ✅ **Coverage Summary**                                                                           |
| ------------------------------------- | ---------- | ---------------- | ------------------------------------------------------------------------------------------------ |
| **Kafka Fundamentals**                | 15%        | Week 1           | Brokers, Zookeeper, partitions, ISR, producers/consumers, message flow                           |
| **Cluster Management & Optimization** | 30%        | Week 2           | Broker configs, topic tuning, partition balancing, cluster expansion, monitoring with Prometheus |
| **Kafka Security**                    | 15%        | Week 3           | TLS encryption, SASL/PLAIN, ACLs, key/cert generation, role-based access                         |
| **Troubleshooting & Integration**     | 40%        | Week 4           | Kafka Connect, Schema Registry, consumer lag, replica failure, controller failover, log analysis |

---

## ✅ Domain-Wise Coverage Details

### ✅ 1. Kafka Fundamentals (Week 1)

* Setup via Docker Compose
* Topic creation with replication/partition tuning
* Leader election, message delivery flow
* Observing producer → broker → consumer lifecycle

---

### ✅ 2. Cluster Management & Optimization (Week 2)

* Broker config tuning: `segment.ms`, `retention.ms`, `heap size`
* Adding/removing brokers, partition reassignment
* Monitoring: Prometheus + Grafana
* Detecting under-replicated partitions and ISR shrink

---

### ✅ 3. Kafka Security (Week 3)

* TLS encryption with `keytool` and OpenSSL
* SASL/PLAIN setup using JAAS configs
* ACL configuration for user-level access control
* Access denial simulation and audit

---

### ✅ 4. Troubleshooting, Design & Integration (Week 4)

* Kafka Connect: source/sink pipelines
* Schema Registry: Avro schema registration
* Consumer lag detection + recovery
* Simulated broker crashes and log analysis
* Testing topic compaction, segment corruption

---

## 🧰 Tools Used Across All Projects

| Category    | Tools / Commands                                                                   |
| ----------- | ---------------------------------------------------------------------------------- |
| CLI & Admin | `kafka-topics.sh`, `kafka-configs.sh`, `kafka-consumer-groups.sh`, `kafka-acls.sh` |
| Monitoring  | Prometheus, Grafana, JMX Exporter                                                  |
| Security    | OpenSSL, keytool, JAAS, TLS configs                                                |
| Connectors  | Kafka Connect REST API, JDBC, File                                                 |
| Schemas     | Schema Registry, Avro CLI                                                          |

---

## ✅ Final Verdict: **100% Domain Coverage Achieved**

| Area                           | Status | Notes                                              |
| ------------------------------ | ------ | -------------------------------------------------- |
| Kafka Core Operations          | ✅      | Full hands-on coverage                             |
| Scaling & Optimization         | ✅      | Real scenarios: rebalancing, tuning                |
| Security & Access Control      | ✅      | TLS, SASL, ACLs tested                             |
| Troubleshooting & Integrations | ✅      | DR scenarios, lag handling, Connect+SchemaRegistry |

---
