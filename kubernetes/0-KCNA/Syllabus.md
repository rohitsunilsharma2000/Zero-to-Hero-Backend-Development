
---

## 📝 KCNA Exam Domains & Weights

1. **Kubernetes Fundamentals** – 46%

   * **Core Kubernetes resources**: Pods, Deployments, ReplicaSets, Services (ClusterIP, NodePort, LoadBalancer, headless) ([training.linuxfoundation.org][1], [dev.to][2])
   * **Kubernetes architecture**: Control plane vs worker nodes, API server, kube-scheduler, kubelet, etc. ([pluralsight.com][3])
   * **Kubernetes API usage** (incl. kubectl basics) ([trainingportal.linuxfoundation.org][4])
   * **Containers**: concepts, images, container runtimes ([udemy.com][5])
   * **Scheduling**: Pod-to-node scheduling, scheduler framework ([dev.to][2])

2. **Container Orchestration** – 22%

   * Orchestration fundamentals and Kubernetes role ([training.linuxfoundation.org][1])
   * **Container runtime & CRI** (Container Runtime Interface) ([dev.to][2])
   * **Security**: Basics of Kubernetes security (RBAC, best practices) ([dev.to][2])
   * **Networking**: Kubernetes networking, Services, Service Mesh (Istio/Envoy) ([training.linuxfoundation.org][1])
   * **Storage**: Persistent volumes, CSI (Container Storage Interface) ([github.com][6])

3. **Cloud Native Architecture** – 16%

   * Core architecture ideas, autoscaling, serverless, community/governance, personas, open standards ([training.linuxfoundation.org][1])

4. **Cloud Native Observability** – 8%

   * Telemetry, observability fundamentals, Prometheus, cost-management ([training.linuxfoundation.org][1])

5. **Cloud Native Application Delivery** – 8%

   * Application delivery essentials, GitOps, CI/CD, Helm, ArgoCD/Flux etc. ([training.linuxfoundation.org][1])

---

## 📊 Exam Format & Logistics

* **Format**: \~60 multiple-choice questions, online, proctored
* **Duration**: 90 minutes
* **Passing Score**: \~75%
* **Number of Attempts**: 2 (one included retake)
* **Validity**: Certification valid for **3 years** ([dev.to][2], [pluralsight.com][3])
* **Cost**: US \$250 (bundles with course options available) ([training.linuxfoundation.org][1])
* **Target audience**: Beginners—no prerequisites; vendor-neutral foundation&#x20;

---

## 📚 Official Curriculum Link

The CNCF officially maintains the exam curriculum — including learning objectives and recommended resources — in a publicly accessible document via GitHub (search for *KCNA\_Curriculum.pdf*). ([wrijugh.github.io][7])

---

### ✅ Next Steps for Preparation

| Action                                                         | Why It Helps                                       |
| -------------------------------------------------------------- | -------------------------------------------------- |
| 🔗 Read the **official CNCF curriculum PDF**                   | It details the objectives per domain               |
| 📺 Watch intro videos/courses                                  | e.g. Pluralsight (by Will Boyd), free CNCF content |
| 🧰 Practice on **kubectl** and core APIs                       | For Fundamentals section                           |
| 🔒 Review **security best practices**, CRI, CNI, CSI standards | For Container Orchestration                        |
| 📈 Explore Prometheus, telemetry, autoscaling concepts         | For Observability and Architecture sections        |
| 🛠️ Experiment with **GitOps/CI-CD tools**                     | Especially Helm, Flux, ArgoCD                      |
| 📝 Use practice exams (Udemy, Linux Direct)                    | To simulate actual exam conditions                 |

---

If you'd like direct links to resources (curriculum PDF, practice tests, or learning paths), just let me know—I can guide you to the best ones!

[1]: https://training.linuxfoundation.org/certification/kubernetes-cloud-native-associate/?utm_source=chatgpt.com "Kubernetes and Cloud Native Associate (KCNA) - Linux Foundation"
[2]: https://dev.to/borhanitrash/kubernetes-and-cloud-native-associate-kcna-exam-guide-2e6c?utm_source=chatgpt.com "Kubernetes and Cloud Native Associate (KCNA) Exam Guide"
[3]: https://www.pluralsight.com/resources/blog/cloud/impressions-of-the-kubernetes-and-cloud-native-associate-kcna-certification-exam?utm_source=chatgpt.com "Impressions of the Kubernetes and Cloud Native Associate (KCNA ..."
[4]: https://trainingportal.linuxfoundation.org/courses/kubernetes-and-cloud-native-associate-exam-kcna?utm_source=chatgpt.com "Kubernetes and Cloud Native Associate Exam (KCNA)"
[5]: https://www.udemy.com/course/kubernetes-and-cloud-native-associate-kcna-exam-tests/?srsltid=AfmBOorTOtGJF6Ta5nKT0imezSFCWrYK77GD7njhtHx6Cw3Owent0DiH&utm_source=chatgpt.com "Kubernetes and Cloud Native Associate (KCNA) Exam Questions"
[6]: https://github.com/moabukar/Kubernetes-and-Cloud-Native-Associate-KCNA?utm_source=chatgpt.com "moabukar/Kubernetes-and-Cloud-Native-Associate-KCNA - GitHub"
[7]: https://wrijugh.github.io/kcna/?utm_source=chatgpt.com "Exam Prep Guide for KCNA"
