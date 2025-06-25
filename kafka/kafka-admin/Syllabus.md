
---

## 🧾 **Confluent Kafka Administrator Syllabus (CCAAK)**

---

### 📘 **1. Kafka Core Architecture**

* Kafka Components: Broker, Producer, Consumer, Topic, Partition
* Kafka Clusters and High Availability
* Replication, ISR (In-Sync Replicas), Leader Election
* Kafka APIs: Producer API, Consumer API, Admin API

🛠️ **Hands-on**: Start a local Kafka cluster using Docker or Confluent Platform.

---

### 📗 **2. Kafka Installation & Configuration**

* Install Kafka (Confluent OSS or Enterprise)
* ZooKeeper vs KRaft mode
* Broker configuration (e.g., `server.properties`)
* Topic-level configuration (e.g., `retention.ms`, `cleanup.policy`)

🛠️ **Hands-on**: Set up a multi-broker Kafka cluster with custom configs.

---

### 🔐 **3. Kafka Security**

* Authentication: SSL, SASL (PLAIN, SCRAM, Kerberos)
* Authorization: ACLs
* Encryption: TLS for encryption-in-transit
* Role-Based Access Control (RBAC – Confluent Enterprise)

🛠️ **Hands-on**: Configure SSL for Kafka clients and apply ACLs.

---

### 📊 **4. Kafka Monitoring & Alerting**

* JMX metrics, Kafka metrics
* Prometheus + Kafka Exporter
* Grafana dashboard setup
* Consumer lag monitoring
* JVM & OS-level metrics (CPU, Memory)

🛠️ **Hands-on**: Integrate Kafka with Prometheus and Grafana for monitoring.

---

### 🧰 **5. Kafka Administration Tasks**

* Topic creation, deletion, configuration
* Partition reassignment and balancing
* Consumer group management
* Lag troubleshooting
* Data retention, compaction, and cleanup
* Log segment tuning

🛠️ **Hands-on**: Use Kafka CLI and Admin API for full topic and group lifecycle.

---

### 🔁 **6. Kafka Data Reliability & Performance**

* Replication factor and durability
* Message delivery semantics (at-most-once, at-least-once, exactly-once)
* Idempotent producer and Kafka Transactions
* Compression (gzip, snappy, lz4)
* Batch settings, linger.ms, buffer.memory

🛠️ **Hands-on**: Tune producer/consumer for low latency and high throughput.

---

### 🛠️ **7. Kafka Automation & Scripting**

* Use **Python** (confluent-kafka) or **Shell scripts**
* Automate topic creation, ACLs, backups
* Use Kafka REST Proxy
* Apache Kafka AdminClient

🛠️ **Hands-on**: Write a Python script to create and monitor Kafka topics.

---

### ⚙️ **8. Kafka Connect & Schema Registry**

* Kafka Connect Basics (source, sink connectors)
* Standalone vs Distributed modes
* Avro Serialization & Confluent Schema Registry
* Connector configuration (e.g., MongoDB, JDBC)

🛠️ **Hands-on**: Set up a JDBC Source and Sink connector.

---

### 📡 **9. Kafka REST Proxy & Confluent Tools**

* Kafka REST Proxy basics
* Confluent CLI for admin tasks
* Confluent Control Center overview
* Kafka ksqlDB overview

🛠️ **Hands-on**: Produce and consume messages using REST Proxy.

---

### ☁️ **10. Kafka in the Cloud & Kubernetes**

* Kafka on Confluent Cloud
* Kafka on Kubernetes (Helm, Strimzi, Confluent Operator)
* Terraform + Kafka cluster provisioning
* Kafka cluster scaling (horizontal/vertical)

🛠️ **Hands-on**: Deploy Kafka using Helm on Minikube or EKS.

---

### 📜 **11. Backup, Recovery & Disaster Recovery**

* Topic replication across clusters (MirrorMaker 2.0, Cluster Linking)
* Backup strategies
* Broker recovery process
* Partition rebalancing

🛠️ **Hands-on**: Use MirrorMaker 2.0 for cross-cluster sync.

---

### 📦 **12. Certification Preparation**

* Review of Confluent documentation
* Kafka CLI cheat sheet
* Sample scenario-based questions
* Troubleshooting mock exercises
* System architecture Q\&A

🛠️ **Resources**:

* [Confluent Docs](https://docs.confluent.io/)
* [Kafka GitHub](https://github.com/apache/kafka)
* [CCAAK Sample Questions](https://www.confluent.io/certification/administrator/)

---

