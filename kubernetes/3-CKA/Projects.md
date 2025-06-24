

---

# 🧩 **CKA Learning Task Plan with Projects (4 Weeks – Full Syllabus)**

> 🧠 Aligned with CNCF's official domains — with **bonus projects** for Helm/Kustomize and HA cluster setup

---

## 📚 CKA Syllabus Domains Covered

| Domain                                         | Covered In | Notes                         |
| ---------------------------------------------- | ---------- | ----------------------------- |
| 📦 Cluster Architecture, Installation & Config | Week 1     | Full                          |
| 🚀 Workloads & Scheduling                      | Week 2     | Full                          |
| 🌐 Services & Networking                       | Week 2–3   | Full                          |
| 💾 Storage                                     | Week 3     | Full                          |
| 🔧 Troubleshooting                             | Week 4     | Full                          |
| 📦 Helm/Kustomize (Optional)                   | 🟡 Bonus   | Optional (Week 4 Extension)   |
| 🏛️ High Availability Setup (Optional)         | 🟡 Bonus   | Optional (Bonus Project Week) |

---

## 🗓️ **Week 1 – Cluster Setup & Core Configuration**

> 🎯 Install and configure a production-like Kubernetes cluster

### ✅ Tasks:

* Bootstrap cluster with `kubeadm`
* Configure CRI (containerd), CNI (Calico/Weave)
* SystemD: kubelet, kube-proxy, etcd
* `etcdctl` backup/restore
* View pod logs, validate cluster state

### 💻 **Project: Production-Ready Cluster Setup**

📂 `/cka-week1-cluster-setup/`

---

## 🗓️ **Week 2 – Workloads, Scheduling, and RBAC**

> 🎯 Master deployments, resource management, and node scheduling

### ✅ Tasks:

* Deployments, StatefulSets, DaemonSets
* Probes, resource limits, restart policies
* NodeAffinity, taints/tolerations
* Create Roles, Bindings, ServiceAccounts

### 💻 **Project: Resilient Node-Aware App**

📂 `/cka-week2-workloads/`

---

## 🗓️ **Week 3 – Services, Ingress, Storage**

> 🎯 Connect apps and manage persistent volumes

### ✅ Tasks:

* Services (ClusterIP, NodePort, LoadBalancer)
* Deploy Ingress Controller (NGINX)
* Define NetworkPolicies for traffic control
* Create StorageClasses, PVCs, reclaim policies

### 💻 **Project: E-Commerce App with Ingress + Storage**

📂 `/cka-week3-network-storage/`

---

## 🗓️ **Week 4 – Troubleshooting + Final Review**

> 🎯 Debug workloads, nodes, and network issues

### ✅ Tasks:

* Investigate: CrashLoopBackOff, DNS, failed mounts
* Use `kubectl logs`, `describe`, `exec`, `debug`
* Simulate failed rollouts and recover
* Take **killer.sh mock exam**

### 💻 **Project: CKA Troubleshooting Lab**

📂 `/cka-week4-troubleshooting/`

---

## 🟡 **Optional Bonus 1 – Helm & Kustomize Practice**

> 🔧 Not required, but helpful for production

### ✅ Tasks:

* Install Helm chart (e.g., Ghost/NGINX)
* Modify values via `values.yaml`
* Patch manifests using `kustomize`

📂 `/cka-bonus-helm-kustomize/`

---

## 🟡 **Optional Bonus 2 – High Availability Cluster Setup**

> 🏛️ Required for advanced real-world setups, not exam-critical

### ✅ Tasks:

* Set up 3 control-plane nodes with external etcd
* Configure HAProxy or kube-vip
* Validate failover and cluster health

📂 `/cka-bonus-ha-cluster/`

---

## 🧪 Tools Used Throughout

| Tool                 | Purpose                      |
| -------------------- | ---------------------------- |
| `kubectl`            | CLI for cluster operations   |
| `kubeadm`            | Cluster setup + upgrade      |
| `etcdctl`            | Backup/restore control-plane |
| `crictl`             | Inspect containers           |
| `k9s` (optional)     | TUI for managing pods        |
| `helm` & `kustomize` | Bonus deployment tooling     |
| `kubectl debug`      | Real-time troubleshooting    |

---
