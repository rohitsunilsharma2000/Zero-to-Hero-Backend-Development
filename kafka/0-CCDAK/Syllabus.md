

---

## 📘 CCDAK Exam Domains & Weights

Based on official Confluent guidance and community sources:

| Domain                      | Weight | Key Topics                                                                                                                                                                                                                       |
| --------------------------- | ------ | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **1. Application Design**   | 40%    | Kafka CLI tools; Pub/Sub fundamentals; architecture; message metadata & serialization; system metrics; schema management ([skillcertpro.com][1])                                                                                 |
| **2. Domain Development**   | 30%    | Producer/Consumer APIs (configs, offsets, commits); performance, throughput, latency; delivery guarantees; serialization/deserialization; partitioning; consumer groups, rebalance strategies; co-partitioning & data retention  |
| **3. Deployment / Testing** | 30%    | Application deployment; security fundamentals; Kafka Streams & ksqlDB; connector basics; Schema Registry; REST Proxy usage                                                                                                       |

Hence, the CCDAK focuses heavily on developer-related topics—Kafka core, client APIs, streams, schema, and deployment integrations.

---

## 📚 Detailed Topic Breakdown

### ✅ **1. Application Design (40%)**

* `kafka-topics.sh`, producer/consumer CLIs, metadata tools
* Understanding partitions, replication factor, brokers, topics
* Message anatomy: keys vs payloads, metadata, headers
* Monitoring: metrics, latency, throughput
* Schema Registry concepts (Avro/JSON schemas)

---

### ✅ **2. Domain Development (30%)**

* Producer configuration (`acks`, `retry`, `linger.ms`, `idempotence`)
* Consumer configuration (`group.id`, offset commit types, `max.poll.interval`)
* Exactly-once vs at-least-once vs at-most-once delivery
* Message ordering within partitions
* Partition assignment and rebalancing
* Data retention and cleanup policies

---

### ✅ **3. Deployment / Testing (30%)**

* Kafka Streams basics: map, aggregate, windowing, joins
* Manipulating via ksqlDB
* Use of Schema Registry and compatibility modes
* Kafka Connect source/sink architecture
* Application deployment options (bare metal, containers, cloud)
* Basic Kafka security: authentication, access control
* Use of REST Proxy for producing/consuming

---

## 🕒 Exam Format

* 60 multiple-choice/multiple-response questions
* Duration: 90 minutes
* Passing Score: \~70%
* Validity: 2 years ([engineeringfordatascience.com][2], [suryateja9618.medium.com][3], [medium.com][4], [medium.com][5], [reddit.com][6])

---

## ✅ Summary

> 🎯 You should deeply understand Kafka core concepts, developer APIs, and client-side stream processing, with significant emphasis on hands-on client development and deployment/testing scenarios.

---


[1]: https://skillcertpro.com/product/ccdak-exam-questions/?utm_source=chatgpt.com "Confluent Developer for Apache Kafka (CCDAK) Exam Questions ..."
[2]: https://engineeringfordatascience.com/posts/kafka-developer-certificate/?utm_source=chatgpt.com "How to Prepare and Pass the Confluent Certified Developer for ..."
[3]: https://suryateja9618.medium.com/my-journey-towards-confluent-certified-developer-for-apache-kafka-ccdak-certification-044c10b23f4c?utm_source=chatgpt.com "My Journey towards Confluent Certified Developer for Apache Kafka ..."
[4]: https://medium.com/%40stephane.maarek/how-to-prepare-for-the-confluent-certified-developer-for-apache-kafka-ccdak-exam-ab081994da78?utm_source=chatgpt.com "How to Prepare for the Confluent Certified Developer for Apache ..."
[5]: https://medium.com/geekculture/guide-to-confluent-certified-developer-for-apache-kafka-exam-5b38d1bfe007?utm_source=chatgpt.com "Guide to Confluent Certified Developer for Apache Kafka exam"
[6]: https://www.reddit.com/r/apachekafka/comments/1fv0x8j/confluent_certified_developer_for_apache_kafka/?utm_source=chatgpt.com "Confluent Certified Developer for Apache Kafka CCDAK prep and ..."
