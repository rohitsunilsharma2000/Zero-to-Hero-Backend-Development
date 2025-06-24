
---

# 🧭 CKA Learning Roadmap (6 Weeks)

> 🧠 **Goal**: Become a hands-on Kubernetes Administrator — capable of deploying, troubleshooting, and managing clusters in production.

---

## 📚 **Preparation Summary**

| Requirement   | Description                            |
| ------------- | -------------------------------------- |
| 🎓 Background | Must know CKAD-level YAML, kubectl     |
| 🛠️ Tools     | Minikube, kubeadm, kubectl, k9s, helm  |
| 🧪 Exam Style | Hands-on, CLI-based (performance test) |
| 📅 Duration   | 2 hours, 15–20 tasks, 66%+ to pass     |

---

## 🗓️ Week 1 – **Cluster Architecture & Installation**

> 🎯 *Set up your cluster and understand the components*

### 🔧 Topics:

* Control plane: API server, etcd, kube-scheduler, kube-controller-manager
* kubelet, container runtime, kube-proxy
* Kubernetes networking model: CNI, kube-dns
* Install Kubernetes with `kubeadm`
* High Availability control plane (optional)

### 🔨 Tasks:

* Set up a 1-node Minikube and a 2-node kubeadm cluster
* Install a CNI plugin (e.g., Calico)
* Inspect kubelet, kube-proxy, systemd services

---

## 🗓️ Week 2 – **Workloads & Scheduling**

> 🎯 *Deploy apps and control where they run*

### 🔧 Topics:

* Deployments, StatefulSets, DaemonSets
* Rolling updates, rollbacks
* Resource requests/limits, affinity/anti-affinity
* Taints, tolerations, nodeSelector
* HorizontalPodAutoscaler

### 🔨 Tasks:

* Schedule DaemonSets on specific nodes
* Use nodeSelector and affinity to influence scheduling
* Configure HPA for a CPU-intensive app

---

## 🗓️ Week 3 – **Services & Networking**

> 🎯 *Expose apps and manage traffic in and out*

### 🔧 Topics:

* ClusterIP, NodePort, LoadBalancer
* Ingress & Ingress Controllers
* CoreDNS
* NetworkPolicies

### 🔨 Tasks:

* Deploy NGINX with Service and Ingress
* Write a NetworkPolicy to isolate traffic
* Debug DNS failures using `nslookup` inside pods

---

## 🗓️ Week 4 – **Storage**

> 🎯 *Persist your app data and understand volumes*

### 🔧 Topics:

* PersistentVolumes, PersistentVolumeClaims
* StorageClasses, dynamic provisioning
* Access modes, reclaim policies
* VolumeMounts and subPath

### 🔨 Tasks:

* Deploy an app with a PVC and dynamic provisioning
* Manually create PV+PVC with hostPath
* Test volume behavior on pod delete/restart

---

## 🗓️ Week 5 – **Troubleshooting & Logs**

> 🎯 *Become fast at fixing broken clusters and pods*

### 🔧 Topics:

* `kubectl describe`, `logs`, `exec`, `top`
* CrashLoopBackOff, OOMKilled, readiness/liveness issues
* Node status issues
* Debugging Services, Ingress, CoreDNS, and kubelet

### 🔨 Tasks:

* Deploy broken apps intentionally and fix:

  * Wrong image
  * Bad probes
  * Volume mounting errors
* Practice `kubectl debug`, rollout undo, event tracing

---

## 🗓️ Week 6 – **Mock Exams + Optimization**

> 🎯 *Simulate the real exam and improve your time*

### 🔧 Tasks:

* Complete both **killer.sh CKA simulations** (included in exam)
* Build a cheatsheet (`kubectl`, `etcdctl`, `crictl`, etc.)
* Use `kubectl explain`, dry-run, `apply -k`, etc.
* Automate common commands with Bash aliases/snippets

---

## 🧰 Tools You’ll Use

| Tool               | Purpose                       |
| ------------------ | ----------------------------- |
| `kubectl`          | CLI for Kubernetes            |
| `kubeadm`          | Cluster setup tool            |
| `k9s`              | Terminal UI for managing Pods |
| `crictl`           | Container runtime CLI         |
| `etcdctl`          | Etcd CLI for backups/restore  |
| `helm`/`kustomize` | Optional for components       |

---

## ✅ Weekly Milestone Tracker

| Week | Milestone                                | Output                          |
| ---- | ---------------------------------------- | ------------------------------- |
| 1    | Setup cluster + Understand internals     | kubeadm cluster                 |
| 2    | Workload deployment + scheduling configs | CPU-bound app + HPA             |
| 3    | Networking & Ingress                     | Working Ingress controller      |
| 4    | PV/PVC mastery                           | Stateful app w/ persistent data |
| 5    | Troubleshooting lab                      | Debug logs/events/probes        |
| 6    | Practice exam + review                   | 70%+ on killer.sh mock          |

---

