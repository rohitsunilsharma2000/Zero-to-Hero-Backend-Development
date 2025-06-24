
---

# 🧭 **CKS Learning Roadmap (5 Weeks)**

> 🎯 Goal: Become a production-ready Kubernetes security expert
> 📦 Prerequisite: Must have valid CKA (passed before or currently certified)

---

## 🗓️ Week 1 – Cluster & System Hardening

> 🔐 *Focus: Secure the control plane, kubelet, and node OS*

### ✅ Topics:

* kube-apiserver flags: `--authorization-mode`, `--audit-log-path`
* etcd security: encryption, TLS, etcdctl backup
* kubelet protection: `--read-only-port=0`, `--authorization-mode=Webhook`
* Linux hardening: AppArmor, seccomp profiles
* CIS benchmarks: kube-bench

### 🔨 Tasks:

* Harden `kubelet` and `kube-apiserver`
* Apply seccomp profile to a pod
* Use `kube-bench` to scan a node

📦 Tooling: `kube-bench`, `AppArmor`, `auditd`, `etcdctl`

---

## 🗓️ Week 2 – Workload & Pod Security

> 🧱 *Focus: Lock down application behavior and reduce blast radius*

### ✅ Topics:

* Pod Security Standards (Restricted, Baseline, Privileged)
* RunAsNonRoot, readOnlyRootFilesystem, Linux capabilities
* PodSecurityAdmission vs. PodSecurityPolicy (deprecated)
* Namespace-level pod security enforcement

### 🔨 Tasks:

* Create a PSP-like restricted namespace (PSA: `restricted`)
* Deploy pods with restricted securityContext
* Block privileged pods and allow only signed workloads

📦 Tooling: `kubectl`, `opa/gatekeeper`, `Kyverno` (optional)

---

## 🗓️ Week 3 – Supply Chain & Image Security

> 📦 *Focus: Secure containers, registries, and CI/CD artifacts*

### ✅ Topics:

* Minimal base images (distroless, Alpine)
* Image scanners: `kube-linter`, `trivy`, `kubesec`
* Signing and verifying images (cosign, Notary)
* SBOM awareness (Syft, Grype)

### 🔨 Tasks:

* Scan app image with Trivy
* Sign an image using cosign and verify it
* Enforce image repository whitelist in Gatekeeper/Kyverno

📦 Tooling: `trivy`, `cosign`, `Syft`, `kubesec`, `opa`

---

## 🗓️ Week 4 – Networking, Access, RBAC Hardening

> 🔐 *Focus: Secure API access, RBAC roles, and traffic control*

### ✅ Topics:

* RBAC: least privilege, verbs, resources, ServiceAccounts
* Admission controllers (Validating/MutatingWebhook)
* TLS secrets, encryptionConfig, secret rotation
* NetworkPolicies (deny-all, namespace-based access)

### 🔨 Tasks:

* Write a minimal Role + RoleBinding
* Encrypt secrets at rest using K8s `EncryptionConfiguration`
* Apply a deny-all NetworkPolicy, then selectively allow

📦 Tooling: `kubectl`, `openssl`, `opa`, `kube-apiserver flags`

---

## 🗓️ Week 5 – Runtime Threat Detection & Logging

> 📊 *Focus: Detect intrusions and analyze malicious behavior*

### ✅ Topics:

* Kubernetes audit logs
* Runtime detection with Falco or Tetragon
* Log forwarding and alerting
* Behavioral syscall detection (Falco rules)

### 🔨 Tasks:

* Install and configure **Falco**
* Simulate a pod escape and generate an alert
* Customize Falco rules for detecting `netcat`, `bash`

📦 Tooling: `Falco`, `sysdig`, `auditd`, `Promtail` (optional)

---

## 🧪 Exam Simulation Checklist

> Use this in **Week 5–6** for final prep:

* [ ] Configure `etcd` backup + TLS
* [ ] Harden `kube-apiserver` with audit policy
* [ ] Enforce PodSecurityAdmission
* [ ] Create restricted pod specs
* [ ] Scan and sign container images
* [ ] Apply NetworkPolicies
* [ ] Use `kubectl debug`, `audit.log`, `Falco`

---

## 📚 Tools You’ll Use Throughout

| Category           | Tools                               |
| ------------------ | ----------------------------------- |
| Scanning           | `trivy`, `kubesec`, `syft`, `grype` |
| Enforcement        | `Kyverno`, `OPA`, `Gatekeeper`      |
| Detection          | `Falco`, `auditd`, `sysdig`         |
| Hardening          | `kube-bench`, `etcdctl`, `seccomp`  |
| Admission/Webhooks | Validating/MutatingWebhooks         |

---

