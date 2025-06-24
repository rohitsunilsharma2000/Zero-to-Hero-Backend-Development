

---

# 🧩 **CKAD Learning Task Plan with Projects (4 Weeks — Full Syllabus)**

> 💯 Covers all 5 domains of the CKAD exam including Helm/Kustomize (optional)

---

## 🗓️ **Week 1 – Core Resources + kubectl Mastery**

> 🔍 *Focus: Deployments, Services, YAML, and fast kubectl usage*

### ✅ Tasks:

* Practice creating: Pods, Deployments, ReplicaSets
* Use `kubectl run`, `kubectl apply`, `kubectl edit`
* Work across Namespaces
* Create Services (ClusterIP, NodePort)
* Use `kubectl explain`, `logs`, `exec`

### 💻 **Mini Project: HelloApp Deployer**

* Deploy a Node or Flask-based app
* Expose using NodePort
* Organize resources in dev/staging namespaces

📂 Deliverables:

* `deployment.yaml`, `service.yaml`, `namespace.yaml`

---

## 🗓️ **Week 2 – Config, Volumes, Jobs, Probes**

> 🔍 *Focus: Configuration, persistence, batch jobs, and health checks*

### ✅ Tasks:

* Use ConfigMaps + Secrets (env + file mount)
* Add liveness/readiness/startup probes
* Use `emptyDir`, `hostPath`, and PVCs
* Create Jobs and CronJobs
* Practice YAML patching (`kubectl patch`)

### 💻 **Project: Metrics Exporter + Cleaner**

* App uses probes and PVC for log storage
* Logging sidecar stores data in shared volume
* CronJob to delete logs every 5 minutes

📂 Deliverables:

* `deployment.yaml`, `cronjob.yaml`, `configmap.yaml`, `secret.yaml`, `probes.yaml`

---

## 🗓️ **Week 3 – RBAC, Multi-Container Pods, SecurityContext**

> 🔍 *Focus: Access control, multi-container patterns, resource quotas*

### ✅ Tasks:

* Use ServiceAccount, Role, RoleBinding
* Set SecurityContext (runAsUser, non-root)
* Add resource requests and limits
* Use Init, Sidecar, and Ambassador containers

### 💻 **Project: Secure Notes API**

* API with:

  * Init container (wait for DB)
  * Sidecar (log watcher)
* Secure Pod with custom SA + non-root user
* Role with `get` and `list` access only

📂 Deliverables:

* `pod-multi.yaml`, `securitycontext.yaml`, `role.yaml`, `rolebinding.yaml`, `serviceaccount.yaml`

---

## 🗓️ **Week 4 – Ingress, NetworkPolicy, Helm & Kustomize**

> 🔍 *Focus: App exposure, traffic control, and advanced deployment tools*

### ✅ Tasks:

* Use IngressController + Ingress rules (host/path)
* Create NetworkPolicies (allow frontend → backend)
* Use existing Helm charts (e.g., Ghost/WordPress)
* Deploy modified resources with Kustomize patches

### 💻 **Project: Ecommerce + Blog Helm Stack**

1. **Ecommerce App**

   * Frontend + backend + DB services
   * Ingress rule for `/frontend` and `/api`
   * Restrict backend access via NetworkPolicy

2. **Blog App via Helm + Kustomize**

   * Deploy Ghost blog using Helm
   * Modify replica count via `values.yaml`
   * Deploy same config using Kustomize overlay

📂 Deliverables:

* `ingress.yaml`, `networkpolicy.yaml`, `helm/values.yaml`, `kustomization.yaml`, `patch.yaml`

---

## 🧪 Final Review (Optional 1–2 Days)

* ✅ Run Killer.sh simulator twice (provided free with CKAD)
* ✅ Revisit weak areas using `kubectl run`, `edit`, and YAML drills
* ✅ Practice working in multiple namespaces and with time limits (\~2h)

---

## 📊 Summary of CKAD Syllabus Coverage

| Domain                                  | Covered | Weeks        |
| --------------------------------------- | ------- | ------------ |
| Application Design & Build              | ✅       | Week 1, 2, 3 |
| Application Deployment                  | ✅       | Week 1, 2, 4 |
| Application Observability & Maintenance | ✅       | Week 2       |
| Environment, Configuration & Security   | ✅       | Week 2, 3    |
| Services & Networking                   | ✅       | Week 1, 4    |
| Helm & Kustomize (Optional)             | ✅       | Week 4       |

---

