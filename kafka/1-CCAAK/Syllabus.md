

---

## 📚 CCAAK Exam Domains & Weights

Based on the Confluent exam specification (source: Confluent PDF) ([scribd.com][1]):

| **Domain**                                                                                         | **Weight** |
| -------------------------------------------------------------------------------------------------- | ---------- |
| **1. Kafka Fundamentals** – architecture, producers/consumers, brokers                             | 15%        |
| **2. Cluster Management & Optimization** – scaling, configuration, performance Tuning              | 30%        |
| **3. Kafka Security** – authentication, authorization, TLS encryption, ACLs                        | 15%        |
| **4. Design, Troubleshooting & Integration** – connectors, streams, retention, DR, troubleshooting | 40%        |

---

### 🔍 Domain Breakdown

#### 1. **Kafka Fundamentals (15%)**

* Architecture components: broker, Zookeeper, partitioning, controllers
* Role of producers/consumers, **immutable logs**
* Leader/follower replication and controller behavior
* Exactly-once semantics, message structure, commit logic ([koenig-solutions.com][2], [scribd.com][1])

---

#### 2. **Cluster Management & Optimization (30%)**

* Setup and maintenance of a Kafka cluster
* Partition count trade-offs, throughput vs latency
* Resource sizing: brokers, RAM, CPU, storage
* ISR, under-replicated partitions, data balancing
* Batch tuning, quotas, broker failures and replication recovery
* Monitoring via JMX, metrics, log retention policies ([scribd.com][1], [suryateja9618.medium.com][3], [udemy.com][4])

---

#### 3. **Kafka Security (15%)**

* Authentication (SASL, TLS) and client authorization
* ACL implementation and troubleshooting, wildcard rules
* In-transit encryption, keystores/truststores
* At-rest encryption practices ([udemy.com][5], [scribd.com][1])

---

#### 4. **Design, Troubleshooting & Integration (40%)**

* Kafka Connect (source/sink), Schema Registry usage
* Stream processing fundamentals (ksqlDB, Kafka Streams)
* Fault tolerance: replication, rack awareness, DR
* Broker configuration, rolling upgrades, disaster recovery
* Consumer lag, leader election, under-replicated partitions
* Resource management: disk retention, GC, segment sizing ([medium.com][6], [scribd.com][1])

---

## ⏱️ Exam Format & Details

* **Questions**: \~55 multiple-choice/multi-select
* **Duration**: 90 minutes
* **Passing Score**: \~70%
* **Cost**: USD 150
* **Validity**: 2 years ([datacamp.com][7], [vmexam.com][8], [suryateja9618.medium.com][3])

---

## ✅ Summary

The CCAAK exam emphasizes real-world **Kafka operations**, focusing on your ability to:

* **Configure and scale clusters** effectively
* **Secure Kafka for production** (TLS, SASL, ACLs)
* **Troubleshoot complex issues** and integrate with Connect, Streams, and Schema Registry

---




[1]: https://www.scribd.com/document/642699844/20200820-Exam-Confluent-Certified-Administrator-pdf?utm_source=chatgpt.com "20200820-Exam-Confluent Certified Administrator PDF - Scribd"
[2]: https://www.koenig-solutions.com/confluent-certified-administrator-apache-kafka-language-course?utm_source=chatgpt.com "Confluent Certified Administrator for Apache Kafka Training"
[3]: https://suryateja9618.medium.com/confluent-certified-administrator-for-apache-kafka-ccaak-experience-d57f4edeb97d?utm_source=chatgpt.com "Confluent Certified Administrator for Apache Kafka(CCAAK ..."
[4]: https://www.udemy.com/course/confluent-certified-administrator-apache-kafka-practice-test/?srsltid=AfmBOopS9t8S5iHU1QE13EcgYSgdIzjKxmecUFADr44PQmxC_B4DW4tL&utm_source=chatgpt.com "Confluent Certified Administrator Apache Kafka Practice Test | Udemy"
[5]: https://www.udemy.com/course/confluent-certified-administrator-apache-kafka-practice-test/?srsltid=AfmBOopU2jqnUEqfzkbq5Vu8PuPmv6RYIeTaKoMlG2IQ7nndfkGuHTAc&utm_source=chatgpt.com "Confluent Certified Administrator Apache Kafka Practice Test | Udemy"
[6]: https://medium.com/apache-kafka-official/how-did-i-pass-confluent-certified-administrator-for-apache-kafka-ccaak-at-the-first-try-eee2f423d562?utm_source=chatgpt.com "How did I Pass Confluent Certified Administrator for Apache Kafka ..."
[7]: https://www.datacamp.com/blog/kafka-certifications?utm_source=chatgpt.com "The Kafka Certification Guide for Data Professionals - DataCamp"
[8]: https://www.vmexam.com/confluent/confluent-apache-kafka-administrator-certification-exam-syllabus?utm_source=chatgpt.com "Confluent Apache Kafka Administrator Certification Exam Syllabus"
