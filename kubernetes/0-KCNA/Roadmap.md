---

## 📍 **KCNA Learning Roadmap (4 Weeks)**

### ✅ Prerequisites (Before Starting)

* Basic **Linux CLI** skills (cd, ls, curl, grep, vim)
* Understanding of **Docker** and containers
* Familiarity with YAML syntax

---

### 🗓️ **Week 1: Kubernetes & Container Basics**

#### 🎯 Goal: Understand core Kubernetes concepts and container orchestration

| Topics                                                | Resources                                                                       |
| ----------------------------------------------------- | ------------------------------------------------------------------------------- |
| 🔹 What is Kubernetes?                                | [Kubernetes Official Docs](https://kubernetes.io/docs/concepts/overview/)       |
| 🔹 Core objects: Pod, Deployment, ReplicaSet, Service | Katacoda Labs or [Play with Kubernetes](https://labs.play-with-k8s.com/)        |
| 🔹 kubectl basics (get, describe, logs, exec)         | [kubectl Cheat Sheet](https://kubernetes.io/docs/reference/kubectl/cheatsheet/) |
| 🔹 Container fundamentals (image, volume, lifecycle)  | Docker CLI, [Play with Docker](https://labs.play-with-docker.com/)              |

🧪 **Practice**: Deploy a simple NGINX app with `kubectl run`, scale with `kubectl scale`, expose with `kubectl expose`.

---

### 🗓️ **Week 2: Kubernetes Architecture & Internals**

#### 🎯 Goal: Dive deeper into how Kubernetes works internally

| Topics                                                      | Resources                                      |
| ----------------------------------------------------------- | ---------------------------------------------- |
| 🧠 Control plane: API Server, Scheduler, Controller Manager | CNCF KCNA PDF or YouTube (TechWorld with Nana) |
| ⚙️ Worker node: kubelet, kube-proxy, container runtime      | Official Docs                                  |
| 🔄 Scheduling and node selection                            | `nodeSelector`, taints, tolerations            |
| 🔐 RBAC, ServiceAccounts, Secrets, ConfigMaps               | KodeKloud or FreeCodeCamp K8s course           |

🧪 **Practice**: Create a deployment with custom environment variables, ConfigMap, and Secrets.

---

### 🗓️ **Week 3: Cloud Native Ecosystem**

#### 🎯 Goal: Learn surrounding tools and architecture concepts

| Topics                                 | Tools                                          |
| -------------------------------------- | ---------------------------------------------- |
| 📦 Helm Basics                         | Install Helm, `helm install`, `helm upgrade`   |
| 🔁 GitOps                              | Understand ArgoCD, Flux                        |
| 🔍 Observability                       | Basics of Prometheus, Grafana, logging         |
| 📡 CNIs, CSIs, CRIs                    | Understand what each interface handles         |
| 🛡️ Security                           | RBAC, namespaces, minimal container privileges |
| ⚙️ Application Delivery (CI/CD basics) | GitHub Actions or Jenkins overview             |

🧪 **Practice**: Deploy a Helm chart (e.g., Prometheus) and visualize metrics.

---

### 🗓️ **Week 4: Revision & Mock Exams**

#### 🎯 Goal: Solidify concepts and simulate exam conditions

| Task                                   | Purpose                                          |
| -------------------------------------- | ------------------------------------------------ |
| 🧠 Revise all KCNA syllabus areas      | Use KCNA curriculum PDF from CNCF                |
| 📝 Take 2–3 mock exams                 | Try Udemy, Killer.sh, or Linux Foundation sample |
| ⚠️ Focus weak areas                    | Use reports from mock tests                      |
| 🤖 Setup local cluster (minikube/kind) | Run end-to-end scenario deployments              |

---

## 🧰 Tools You’ll Use

* **kubectl**
* **Minikube / Kind**
* **Helm**
* **Prometheus / Grafana**
* **Docker CLI**
* **VS Code + YAML extension**

---

## 📚 Free Learning Resources

| Resource                                                                                        | Description                            |
| ----------------------------------------------------------------------------------------------- | -------------------------------------- |
| [CNCF KCNA Curriculum PDF](https://github.com/cncf/certification/blob/main/kcna_curriculum.pdf) | Official syllabus                      |
| [KubeAcademy by VMware](https://kube.academy/)                                                  | Free high-quality Kubernetes courses   |
| [KodeKloud KCNA Labs](https://kodekloud.com/p/kubernetes-cloud-native-associate)                | Interactive labs                       |
| [TechWorld with Nana (YouTube)](https://www.youtube.com/c/TechWorldwithNana)                    | Beginner-friendly DevOps & K8s content |

---

## 🏁 Final Tip

> 💡 **KCNA is conceptual — not hands-on like CKA. Focus on *understanding* core ideas across Kubernetes, containers, observability, and the CNCF landscape.**

