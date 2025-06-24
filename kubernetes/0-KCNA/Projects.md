

---

## 🧩 **KCNA Learning Task Plan with Projects (4 Weeks)**

### 🗓️ Week 1 – **Kubernetes & Container Basics**

> 🔍 *Goal: Understand core Kubernetes objects, containerization, and kubectl usage*

#### 📘 Tasks:

1. ✅ Install Docker & Kubernetes (Minikube or Kind)
2. ✅ Learn kubectl commands: `get`, `describe`, `create`, `apply`, `delete`, `logs`, `exec`
3. ✅ Learn YAML structure (Pod, Deployment, Service)
4. ✅ Understand container lifecycle and image layers

#### 💻 Mini Project: **Kube-Served Portfolio Site**

* Dockerize a personal portfolio (HTML/CSS/Node app)
* Deploy on Kubernetes via `Deployment + Service`
* Add ConfigMap for site title and environment

📂 Files to include:

* `Dockerfile`
* `deployment.yaml`
* `service.yaml`
* `configmap.yaml`

---

### 🗓️ Week 2 – **Kubernetes Internals & Security**

> 🔍 *Goal: Dive deeper into control plane, networking, and access control*

#### 📘 Tasks:

1. ✅ Learn architecture: API server, etcd, scheduler, controller manager, kubelet
2. ✅ Learn about namespaces, RBAC (roles, rolebindings)
3. ✅ Learn `nodeSelector`, taints, tolerations
4. ✅ Learn Secret, ServiceAccount, and ConfigMap

#### 💻 Project: **Secure To-Do API App**

* Deploy a REST API with Secrets for DB credentials
* Assign a custom `ServiceAccount` to the pod
* Use RoleBinding to restrict access by namespace

📂 Files to include:

* `api-deployment.yaml`
* `namespace.yaml`
* `secret.yaml`
* `role.yaml` and `rolebinding.yaml`

---

### 🗓️ Week 3 – **Cloud Native Ecosystem & Delivery**

> 🔍 *Goal: Learn about observability, Helm, GitOps, CNIs, CSIs*

#### 📘 Tasks:

1. ✅ Install and use **Helm** to deploy Prometheus + Grafana
2. ✅ Understand CRI/CNI/CSI through diagrams and examples
3. ✅ Learn basics of **GitOps** (ArgoCD or Flux overview)
4. ✅ Explore application metrics and observability patterns

#### 💻 Project: **Helm-ified Blog Monitoring System**

* Helm chart to deploy a sample blog (Ghost or WordPress)
* Deploy Prometheus and Grafana using Helm
* Add Grafana dashboard for pod resource usage

📂 Files to include:

* `helm/ghost/` (your custom chart or config)
* `values.yaml` for config
* Screenshots of dashboards

---

### 🗓️ Week 4 – **Mock Exam & Capstone Project**

> 🔍 *Goal: Revise, test knowledge, and build a complete cloud native app*

#### 📘 Tasks:

1. ✅ Review the entire CNCF KCNA curriculum
2. ✅ Take 2 full-length practice exams
3. ✅ Identify weak areas and revise
4. ✅ Learn about GitOps delivery via ArgoCD/Flux (basic CI/CD)

---

### 🏁 Capstone Project: **Cloud-Native Task Manager App**

> 🔧 Real-world CI/CD-ready Kubernetes project

* Deploy a frontend (React/HTML) + backend (Node/Django)
* Use **Ingress** with NGINX for public access
* Secure the app with **Secrets**, use **PVCs** for DB
* Enable metrics with **Prometheus** and **Grafana**
* Use **Helm** or a simple **GitOps** setup to deploy

📂 Project structure:

```
task-manager/
├── frontend/
├── backend/
├── k8s/
│   ├── deployment.yaml
│   ├── service.yaml
│   ├── ingress.yaml
│   ├── configmap.yaml
│   ├── secret.yaml
│   └── pvc.yaml
├── helm/
└── README.md
```

---

## 🏗️ Bonus Project Ideas

| Project Idea                 | Concepts Covered               |
| ---------------------------- | ------------------------------ |
| URL Shortener on K8s         | Service, Deployment, ConfigMap |
| Node.js Chat App             | StatefulSet, Volumes           |
| GitHub Actions CI/CD for K8s | GitOps, CI/CD                  |
| K8s Cost Dashboard           | Prometheus, Grafana            |
| E-commerce Microservices     | Ingress, Namespace, RBAC       |

---

