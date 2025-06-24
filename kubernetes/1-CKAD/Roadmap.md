
---

## 🗺️ Certified Kubernetes Application Developer (CKAD) – Learning Roadmap

### 🧰 Prerequisites

* Comfortable with **Linux command-line**
* Understand **YAML**, **Docker**, and **basic Kubernetes objects**
* Can use `kubectl` efficiently

---

## 🗓️ **Week 1: Kubernetes Core & kubectl Speed**

> 🔍 *Goal: Get fast with kubectl and YAML, practice Pod basics and Deployments*

### ✅ Topics:

* Creating Pods, Deployments, Services
* Using `kubectl` efficiently (imperative + declarative)
* YAML structure for all core objects
* Namespace management

### 💻 Mini Project:

**"Hello App" Deployment**

* Create a simple NGINX Deployment
* Add Service (ClusterIP)
* Expose externally using NodePort

---

## 🗓️ **Week 2: Application Deployment & Configuration**

> 🔍 *Goal: Master ConfigMaps, Secrets, and deployment strategies*

### ✅ Topics:

* Deployments (scale, rollout, rollback)
* Blue-Green and Rolling Updates
* ConfigMaps & Secrets
* Resource requests and limits

### 💻 Mini Project:

**Configurable Weather API**

* Deploy weather API app with environment-specific values via ConfigMap & Secret
* Perform rollout with `kubectl rollout`
* Simulate failure and rollback

---

## 🗓️ **Week 3: Probes, Jobs, Volumes**

> 🔍 *Goal: Add robustness to your app with probes, batch jobs, and volumes*

### ✅ Topics:

* Liveness, Readiness, Startup probes
* Jobs, CronJobs
* Volumes: `emptyDir`, `hostPath`, `persistentVolumeClaim`

### 💻 Mini Project:

**Health-Checked Blog App**

* Deploy app with readiness + liveness probes
* Attach `emptyDir` as temporary storage
* Add a scheduled `CronJob` to clean logs

---

## 🗓️ **Week 4: Security, RBAC & Multi-Container Pods**

> 🔍 *Goal: Harden and structure your app using security features and patterns*

### ✅ Topics:

* RBAC: Roles, RoleBindings, ServiceAccounts
* SecurityContext, runAsUser, readOnlyRootFilesystem
* Init Containers, Sidecars, Ambassador Pattern
* Resource quotas and limits

### 💻 Mini Project:

**Secure Notes App**

* Init Container to initialize DB
* Secure backend with a custom ServiceAccount and PodSecurityContext
* Sidecar for logging

---

## 🗓️ **Week 5: Networking & Ingress**

> 🔍 *Goal: Expose and control traffic to your application*

### ✅ Topics:

* Services: ClusterIP, NodePort, LoadBalancer
* Ingress Controllers & Rules
* NetworkPolicies (restrict internal traffic)

### 💻 Mini Project:

**Multi-Service Ecommerce App**

* Frontend + backend + database
* Ingress rule to expose frontend
* NetworkPolicy to allow frontend → backend only

---

## 🗓️ **Week 6: Mock Exam & Final Review**

> 🔍 *Goal: Simulate real exam and fill gaps*

### ✅ Tasks:

* Complete **Killer.sh** simulator twice
* Review official **CKAD curriculum**
* Practice all kubectl commands in `alias` or shorthand
* Revisit topics you scored low on in mocks

---

## 🔧 Tools You’ll Use

| Tool                   | Purpose                          |
| ---------------------- | -------------------------------- |
| `kubectl`              | CLI management                   |
| `k9s`                  | Visual kubectl                   |
| `minikube` / `kind`    | Local K8s                        |
| `Helm` or `Kustomize`  | Optional for advanced templating |
| `VSCode` + YAML plugin | YAML speed                       |
| `tmux`                 | Multitasking in exam mode        |

---

## 🧪 Practice Platforms

* [Killer.sh](https://killer.sh/) – *Realistic exam simulator (2 free with exam)*
* [KodeKloud CKAD Labs](https://kodekloud.com/p/kubernetes-ckad) – *Hands-on labs*
* [Katacoda CKAD Playground](https://katacoda.com) – *Browser-based scenarios*

---
