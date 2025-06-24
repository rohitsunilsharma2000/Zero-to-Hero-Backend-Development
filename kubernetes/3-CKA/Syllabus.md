
---

## 📝 CKA Exam Domains & Weights

### 1. **Cluster Architecture, Installation & Configuration – 25%**

* Install and configure Kubernetes clusters using **kubeadm**
* Manage control-plane nodes, **HA setup**, and **etcd**
* Prepare infrastructure, configure CNI, CSI, CRI, and extension interfaces
* Use **Helm or Kustomize** to install cluster components ([training.linuxfoundation.org][1])

### 2. **Workloads & Scheduling – 15%**

* Deploy/manage **Deployments**, **DaemonSets**, **StatefulSets**
* Configure **ConfigMaps**, **Secrets**, **resource requests/limits**
* Understand **self-healing**, rolling updates/rollbacks
* Set **node affinity**, taints/tolerations, autoscaling ([training.linuxfoundation.org][2], [whizlabs.com][3])

### 3. **Services & Networking – 20%**

* Understand Pod-to-Pod connectivity
* Use **Services** (ClusterIP, NodePort, LoadBalancer)
* Configure **Ingress**, **Gateway API**, and Ingress controllers
* Enforce **NetworkPolicies**, manage **CoreDNS** ([training.linuxfoundation.org][1])

### 4. **Storage – 10%**

* Use **StorageClasses**, dynamic provisioning
* Handle PV/PVC lifecycle, access modes, reclaim policies
* Attach storage to Pods and applications ([learnquest.com][4], [training.linuxfoundation.org][2], [firebrand.training][5])

### 5. **Troubleshooting – 30%**

* Debug cluster and node components
* Troubleshoot workload failures, network, service, DNS issues
* Analyze logs, resource usage, container output streams
* Use `kubectl describe`, `get events`, and `rollout undo` ([training.linuxfoundation.org][2])

---

## ⏱️ Exam Details

* **Format**: Performance-based (live CLI tasks)
* **Duration**: 2 hours (120 minutes) ([training.linuxfoundation.org][1], [webasha.com][6])
* **Passing Score**: \~66–67% ([firebrand.training][5])
* **Version**: Based on a recent Kubernetes minor version (e.g., v1.32+) ([training.linuxfoundation.org][1])
* **Validity**: 2 years
* **Cost**: US \$445 (includes one retake) ([cncf.io][7])

---

## ✅ Summary Table

| Domain (Weight)                              | Key Focus Areas                                                           |
| -------------------------------------------- | ------------------------------------------------------------------------- |
| **Cluster Architecture, Installation (25%)** | Kubeadm, HA control plane, etcd, CNI/CSI/CRI, Helm/Kustomize              |
| **Workloads & Scheduling (15%)**             | Deployments, DaemonSets, resource configs, autoscaling, self-healing      |
| **Services & Networking (20%)**              | Services, Ingress, Gateway API, NetworkPolicies, CoreDNS                  |
| **Storage (10%)**                            | StorageClasses, PV/PVC, dynamic provisioning, volume access types         |
| **Troubleshooting (30%)**                    | Debugging cluster, services, workloads, logs, DNS, rollbacks, node issues |

---

